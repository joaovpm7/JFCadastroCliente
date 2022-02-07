/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Telefone;
import util.BancoDados;

/**
 *
 * @author sala305b
 */
public class TelefoneControle {

    public static Boolean Inserir(Telefone tel) {
        try {

            Connection conn = BancoDados.getConexao();
            String sql = "INSERT INTO telefone ";
            sql += " (ddd, numtel, idcliente) ";
            sql += " VALUES (?,?,?);";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tel.getDdd());
            ps.setString(2, tel.getTelefone());
            ps.setInt(3, tel.getIdcliente());

            int qtd = ps.executeUpdate();

            if (qtd > 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }

    }

    public static Telefone Procurar(int id) {
        try {

            Connection conn = BancoDados.getConexao();
            String sql = "SELECT * FROM telefone "
                    + "WHERE idcliente = ? ;";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            final ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                Telefone t = new Telefone();
                t.setDdd(rs.getString("ddd"));
                t.setTelefone(rs.getString("numtel"));
                t.setIdcliente(rs.getInt("idcliente"));

                return t;

            } else {
                return null;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static List<Telefone> ListarTodosID(int id) {

        try {

            Connection conn = BancoDados.getConexao();
            String sql = "SELECT * FROM telefone; ";

            PreparedStatement ps = conn.prepareStatement(sql);

            List<Telefone> ListaTelefones = new ArrayList();

            final ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Telefone t = new Telefone();

                t.setIdtelefone(rs.getInt("id"));
                t.setDdd(rs.getString("ddd"));
                t.setTelefone(rs.getString("numtel"));
                t.setIdcliente(rs.getInt("idcliente"));

                ListaTelefones.add(t);
            }

            return ListaTelefones;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static Boolean Apagar(int id) {
        try {

            Connection conn = BancoDados.getConexao();
            String sql = "DELETE FROM telefone ";
            sql += " WHERE id = ? ; ";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            int qtd = ps.executeUpdate();

            if (qtd > 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }

    }

}
