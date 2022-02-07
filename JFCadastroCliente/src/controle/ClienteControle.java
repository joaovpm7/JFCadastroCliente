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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import util.BancoDados;

/**
 *
 * @author sala305b
 */
public class ClienteControle {

    public static int Inserir(Cliente cli) {
        try {

            Connection conn = BancoDados.getConexao();
            String sql = "INSERT INTO cliente ";
            sql += " (nomerazao, dtnascimento, documento, tipodocumento,";
            sql += " sexo, email, idusuario ) ";
            sql += " VALUES (?,?,?,?,?,?,?);";

            PreparedStatement ps = conn.prepareStatement(sql,
                    Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, cli.getNomerazao());
            ps.setDate(2, cli.getDtnascimento());
            ps.setString(3, cli.getDocumento());
            ps.setString(4, cli.getTipodocumento());
            ps.setString(5, cli.getSexo());
            ps.setString(6, cli.getEmail());
            ps.setInt(7, cli.getIdusuario());

            int linhasafetadas = ps.executeUpdate();

            if (linhasafetadas > 0) {
                final ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    final int lastId = rs.getInt(1);

                    System.out.println("O numero do id é:"
                            + lastId);

                    return lastId;

                } else {
                    return 0;
                }
            } else {
                return 0;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return 0;
        }

    }

    public static Cliente Procurar(int id) {
        try {

            Connection conn = BancoDados.getConexao();
            String sql = "SELECT * FROM cliente "
                    + "WHERE id = ? ;";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            final ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                Cliente c = new Cliente();
                c.setDocumento(rs.getString("documento"));
                c.setTipodocumento(rs.getString("tipodocumento"));
                c.setDtnascimento(rs.getDate("datanasc"));
                c.setEmail(rs.getString("email"));
                c.setNomerazao(rs.getString("nome"));
                c.setSexo(rs.getString("sexo"));
                c.setId(rs.getInt("id"));
                c.setIdusuario(rs.getInt("idusuario"));

                return c;

            } else {
                return null;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static List<Cliente> ListarTodos() {

        try {

            Connection conn = BancoDados.getConexao();
            String sql = "SELECT * FROM cliente; ";

            PreparedStatement ps = conn.prepareStatement(sql);

            List<Cliente> ListaClientes = new ArrayList();

            final ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Cliente c = new Cliente();
                c.setDocumento(rs.getString("documento"));
                c.setTipodocumento(rs.getString("tipodocumento"));
                c.setDtnascimento(rs.getDate("datanasc"));
                c.setEmail(rs.getString("email"));
                c.setNomerazao(rs.getString("nome"));
                c.setSexo(rs.getString("sexo"));
                c.setId(rs.getInt("id"));
                c.setIdusuario(rs.getInt("idusuario"));

                ListaClientes.add(c);
            }

            return ListaClientes;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static Boolean Atualizar(Cliente cli) {

        return false;
    }

    public static Boolean Apagar(int id) {

        return false;
    }
}
