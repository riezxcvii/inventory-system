package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnect {

    private final String url = "jdbc:mysql://localhost/";
    private final String database = "inventory_system";
    private final String driver = "com.mysql.jdbc.driver";
    private final String username = "root";
    private final String password = "";
    private Connection con = null;
    public boolean isConnected;

    public Connection checkConnection() {

        try {
            con = DriverManager.getConnection(url + database, username, password);
            isConnected = true;

        } catch (SQLException e) {
            isConnected = false;
        }
        return con;
    }
}
