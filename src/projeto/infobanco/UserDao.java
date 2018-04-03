package projeto.infobanco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import projeto.conexao.ConexaoBD;

public class UserDao {

    public boolean CheckLogin(String user, String senha) {
        Connection con = ConexaoBD.getconnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {
            stmt = con.prepareStatement("SELECT * FROM login WHERE user = ? and senha = ?");

            stmt.setString(1, user);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {
                check = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoBD.getconnection();
        }
        return check;

    }

}
