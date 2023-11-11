package Server;

import Server.LoginResult;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class LoginValidation {

    public LoginResult validateLogin(String username, String password) {
        // initialize the variables as empty
        boolean isValid = false;
        int userID = 0;
        String userType = null;

        try {
            // establish connection to MySQL database
            Database.DatabaseConnect dbConn = new Database.DatabaseConnect();
            Connection con = dbConn.checkConnection();

            String sql = "SELECT user_id, user_type FROM user WHERE BINARY username = ? AND BINARY password = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();

            // check if a matching user is found and retrieve the user_id and user role
            if (resultSet.next()) {
                userID = resultSet.getInt("user_id");
                userType = resultSet.getString("user_type");
                isValid = true;
            } else {
                isValid = false;
            }
            statement.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error retrieving data from the database.", "Login Form", JOptionPane.ERROR_MESSAGE);
        }
        // return a new LoginResult object with isValid, userID, and userRole
        return new LoginResult(isValid, userID, userType);
    }
}
