import org.jetbrains.annotations.NotNull;

import java.sql.*;

public interface PostgreSqlDBControlInterface {
    public default Connection connect(String url, String user, String password) throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public default Integer getUUID(String tableName, @NotNull Connection connection){
        String SQL = "SELECT uuid FROM " + tableName;
        int count = 0;

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            rs.next();
            count = rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return count;
    }
}
