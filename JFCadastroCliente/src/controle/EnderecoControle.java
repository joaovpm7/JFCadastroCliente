/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Endereco;
import util.BancoDados;

/**
 *
 * @author sala305b
 */
public class EnderecoControle {
    
    
    public static Boolean Inserir(Endereco e) {
        try {

            Connection conn = BancoDados.getConexao();
            String sql = "INSERT INTO endereco ";
            sql += " (logradouro, numero, bairro, ";
            sql += "cidade, uf, complemento, idcliente ) ";
            sql += " VALUES (?,?,?,?,?,?,?);";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, e.getLogradouro());
            ps.setString(2, e.getNumero());
            ps.setString(3, e.getBairro());
            ps.setString(4, e.getCidade());
            ps.setString(5, e.getUf());
            ps.setString(6, e.getComplemento());
            ps.setInt(7, e.getIdcliente());

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
