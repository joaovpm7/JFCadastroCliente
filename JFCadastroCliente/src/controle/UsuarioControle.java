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
import util.BancoDados;

/**
 *
 * @author sala305b
 */
public class UsuarioControle {

    public int idusuario = 0;
    public Boolean ExisteUsuario(String nomeacesso,
            String passwordacesso) {

        try {
            Connection conn = BancoDados.getConexao();
            String sql = "SELECT * FROM usuario ";
            sql += " WHERE login = ? ";
            sql += " AND senha = ? ";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nomeacesso);
            ps.setString(2, passwordacesso);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int cod = rs.getInt("id");

                if (cod > 0) {
                    
                    this.idusuario = cod;
                    return true;
                }

            }
            return false;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }

    }

}
