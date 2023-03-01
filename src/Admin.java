import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Admin implements PostgreSqlDBControlInterface {
    public Connection connection;
    boolean isConnectionEstablished = false;
    Admin(String url, String user, String password){
        try {
            connection = connect(url, user, password);
            isConnectionEstablished = true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            isConnectionEstablished = false;
        }
    }

    public void addFilm(String name, String genre, Integer dur) {
        String query = "INSERT INTO films(name, duration, genre, uuid) VALUES(?, ?, ?, ?)";

        try {
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, name);
            pst.setInt(2, dur);
            pst.setString(3, genre);
            pst.setInt(4, 3);
            pst.executeUpdate();

        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(Admin.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }
}
