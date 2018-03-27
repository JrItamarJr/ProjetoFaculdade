package projeto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import projeto.conexao.conexaobd;

public class userd {

    public boolean CheckLogin(String user, String senha) {
        Connection con = conexaobd.getconnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {
            stmt = con.prepareStatement("SELECT 8 FROM login WHERE user = ? and senha = ?");

            stmt.setString(1, user);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {
                check = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(userd.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexaobd.getconnection();
        }
        return check;

    }

}
