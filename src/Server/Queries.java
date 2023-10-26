package Server;

import Database.DatabaseConnect;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

public class Queries {
    DatabaseConnect dbConn = new DatabaseConnect();
    Connection con = dbConn.checkConnection();
    
    public void addUser(String username, String password, String userType, String address, String email, String mobile, String firstName, String lastName){
        try{
        String query = "Insert into user(user_type,last_name,first_name,address,mobile_number,email_address,username,password)"+"VALUES(?,?,?,?,?,?,?,?)";
        PreparedStatement statement = con.prepareStatement(query);
        statement.setString(1,userType);
        statement.setString(2,lastName);
        statement.setString(3,firstName);
        statement.setString(4,address);
        statement.setString(5,mobile);
        statement.setString(6,email);
        statement.setString(7,username);
        statement.setString(8,password);
        
        statement.executeUpdate();
        statement.close();
        
        }catch(Exception error){
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE); 

        }
    }  
    
    public void deleteUser(int id){
        try{
            String query = "DELETE FROM user WHERE user_id = ?";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        }catch(Exception error){
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE); 
        }
    }
    
    public void updateUser(int id, String username, String password, String userType, String address, String email, String mobile, String firstName, String lastName){
        try{
            String query = "Update user set user_type=?,last_name=?,first_name=?,address=?,mobile_number=?,email_address=?,username=?,password=? WHERE user_id=?";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1,userType);
            statement.setString(2,lastName);
            statement.setString(3,firstName);
            statement.setString(4,address);
            statement.setString(5,mobile);
            statement.setString(6,email);
            statement.setString(7,username);
            statement.setString(8,password);
            statement.setInt(9,id);
            
            statement.executeUpdate();
            statement.close();
        }catch(Exception error){
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE); 
        }
    }
}
