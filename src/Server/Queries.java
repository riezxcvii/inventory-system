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
    
    public void addInquiry(String date, 
            String project,
            int quantity,
            String description,
            String supplier,
            double supplier_price,
            double srp,
            String remarks,
            String date_accomplished,
            String last_update,
            String deadline,
            int user_id){
        try{
            String query = "Insert into sale(date,project_or_end_user,quantity,description,supplier,supplier_price,srp,remarks,date_accomplished,last_update,deadline,user_id)"+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1,date);
            statement.setString(2,project);
            statement.setInt(3, quantity);
            statement.setString(4,description);
            statement.setString(5, supplier);
            statement.setDouble(6, supplier_price);
            statement.setDouble(7,srp);
            statement.setString(8,remarks);
            statement.setString(9,date_accomplished);
            statement.setString(10,last_update);
            statement.setString(11,deadline);
            statement.setInt(12,user_id);
            
            statement.executeUpdate();
            statement.close();
        }catch(Exception error){
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE); 
        }
    }
    
    public void deleteInquiry(int id){
        try{
            String query = "delete from sale where sale_id = ?";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
            
        }catch(Exception error){
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);   
        }
    }
    
    public void updateInquiry(
            int sales_id,
            String date, 
            String project,
            int quantity,
            String description,
            String supplier,
            double supplier_price,
            double srp,
            String remarks,
            String date_accomplished,
            String last_update,
            String deadline){
        
        try{
            String query = "Update sale set date = ?,project_or_end_user=?,quantity=?,description=?,supplier=?,supplier_price=?,srp=?,remarks=?,date_accomplished=?,last_update=?,deadline=? where sale_id =?";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1,date);
            statement.setString(2,project);
            statement.setInt(3, quantity);
            statement.setString(4,description);
            statement.setString(5, supplier);
            statement.setDouble(6, supplier_price);
            statement.setDouble(7,srp);
            statement.setString(8,remarks);
            statement.setString(9,date_accomplished);
            statement.setString(10,last_update);
            statement.setString(11,deadline);
            statement.setInt(12,sales_id);
            
            statement.executeUpdate();
            statement.close();
        }catch(Exception error){
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);   
        }
    }
}
