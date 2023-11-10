package Server;

import Database.DatabaseConnect;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Queries {

    DatabaseConnect dbConn = new DatabaseConnect();
    Connection con = dbConn.checkConnection();
    LocalDate currentDate = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    //===================================================================================================
    //CRUD of user
    
    public boolean addUser(String username, String password, String userType, String address, String email, String mobile, String firstName, String lastName) {
        try {
            String query = "Insert into user(user_type,last_name,first_name,address,mobile_number,email_address,username,password)" + "VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, userType);
            statement.setString(2, lastName);
            statement.setString(3, firstName);
            statement.setString(4, address);
            statement.setString(5, mobile);
            statement.setString(6, email);
            statement.setString(7, username);
            statement.setString(8, password);

            statement.executeUpdate();
            statement.close();
            return true;
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public List<UserData> getUserData(int ID, int salesLogisticsId, String userType) {
        List<UserData> userDataList = new ArrayList<>();
        String query;
        ResultSet result;

        try {
            if (ID == 0 && salesLogisticsId == 0 && userType.equals("")) {
                query = "SELECT * FROM user";
                PreparedStatement statement = con.prepareStatement(query);
                result = statement.executeQuery();
            } else if (ID != 0 && salesLogisticsId == 0 && userType.equals("")) {
                query = "SELECT * FROM user WHERE user_id = ?";
                PreparedStatement statement = con.prepareStatement(query);
                statement.setInt(1, ID);
                result = statement.executeQuery();
            } else if (ID == 0 && salesLogisticsId != 0 && !userType.equals("")) {
                query = "SELECT * FROM user WHERE user_type = ? and user_id !=?";
                PreparedStatement statement = con.prepareStatement(query);
                statement.setInt(2, salesLogisticsId);
                statement.setString(1, userType);
                result = statement.executeQuery();
            } else {
                query = "SELECT * FROM user WHERE user_type = ? and user_id !=?";
                PreparedStatement statement = con.prepareStatement(query);
                statement.setInt(1, salesLogisticsId);
                statement.setString(2, userType);
                result = statement.executeQuery();
            }
            
            while (result.next()) {
                UserData data = new UserData();

                data.setUserId(result.getInt(1));
                data.setType(result.getString(2));
                data.setUserName(result.getString(8));
                data.setLast(result.getString(3));
                data.setFirst(result.getString(4));
                data.setAddress(result.getString(5));
                data.setMobile(result.getString(6));
                data.setEmail(result.getString(7));
                data.setPass(result.getString(9));

                userDataList.add(data);
            }
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return userDataList;
    }

    public boolean deleteUser(int id) {
        try {
            String query = "DELETE FROM user WHERE user_id = ?";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
            return true;
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean updateUser(int id, String username, String password, String userType, String address, String email, String mobile, String firstName, String lastName) {
        try {
            String query = "Update user set user_type=?,last_name=?,first_name=?,address=?,mobile_number=?,email_address=?,username=?,password=? WHERE user_id=?";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, userType);
            statement.setString(2, lastName);
            statement.setString(3, firstName);
            statement.setString(4, address);
            statement.setString(5, mobile);
            statement.setString(6, email);
            statement.setString(7, username);
            statement.setString(8, password);
            statement.setInt(9, id);

            statement.executeUpdate();
            statement.close();
            return true;
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public UserData getUsername(String username, int id, String method) {
        PreparedStatement statement = null;
        UserData data = new UserData();
        
        try {
            String query;
            int count = 0;

            if (method.equals("add")) {
                query = "select COUNT(*) from user where username = ?";
                statement = con.prepareStatement(query);
                statement.setString(1, username);
            } else {
                query = "select COUNT(*) from user where username = ? and user_id != ?";
                statement = con.prepareStatement(query);
                statement.setString(1, username);
                statement.setInt(2, id);
            }

            ResultSet result = statement.executeQuery();
            
            if (result.next()) {
                count = result.getInt(1);
            }
            
            System.out.println(count);

            data.setPresent(count > 0);

            statement.close();
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return data;
    }

    public boolean updatePass(String username, String password) {
        try {
            String query = "update user set password = ? where username = ?";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, password);
            statement.setString(2, username);
            statement.executeUpdate();
            statement.close();
            return true;
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    //============================================================================================================
    //end of user
    
    //=============================================================================================================
    //CRUD of inquiry
    
    public boolean addInquiry(String date,
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
            int user_id) {
        try {
            String query = "Insert into sale(date,project_or_end_user,quantity,description,supplier,supplier_price,srp,remarks,date_accomplished,last_update,deadline,user_id)" + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, date);
            statement.setString(2, project);
            statement.setInt(3, quantity);
            statement.setString(4, description);
            statement.setString(5, supplier);
            statement.setDouble(6, supplier_price);
            statement.setDouble(7, srp);
            statement.setString(8, remarks);
            statement.setString(9, date_accomplished);
            statement.setString(10, last_update);
            statement.setString(11, deadline);
            statement.setInt(12, user_id);

            statement.executeUpdate();
            statement.close();
            return true;
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public List<InquiryData> getInquiryData(int ID, String idType) {
        List<InquiryData> inquiryDataList = new ArrayList<>();
        String query;

        try {
            if (idType.equals("user")) {
                query = "select * from sale where user_id = ?";
            } else {
                query = "select * from sale where sale_id = ?";
            }
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1, ID);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                InquiryData data = new InquiryData();

                data.setSalesId(result.getInt(1));
                data.setIDate(result.getDate(2));
                data.setIProject(result.getString(3));
                data.setIQuantity(result.getInt(4));
                data.setIDescription(result.getString(5));
                data.setISupplier(result.getString(6));
                data.setISupplierPrice(result.getDouble(7));
                data.setISrp(result.getDouble(8));
                data.setIRemarks(result.getString(9));
                data.setIDateAccomplished(result.getDate(10));
                data.setILastUpdate(result.getDate(11));
                data.setIDeadline(result.getDate(12));
                data.setUserID(result.getInt(13));

                inquiryDataList.add(data);
            }
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return inquiryDataList;
    }

    public boolean deleteInquiry(int id) {
        try {
            String query = "delete from sale where sale_id = ?";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
            return true;
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean updateInquiry(
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
            String deadline) {
        try {
            String query = "Update sale set date = ?,project_or_end_user=?,quantity=?,description=?,supplier=?,supplier_price=?,srp=?,remarks=?,date_accomplished=?,last_update=?,deadline=? where sale_id =?";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, date);
            statement.setString(2, project);
            statement.setInt(3, quantity);
            statement.setString(4, description);
            statement.setString(5, supplier);
            statement.setDouble(6, supplier_price);
            statement.setDouble(7, srp);
            statement.setString(8, remarks);
            statement.setString(9, date_accomplished);
            statement.setString(10, last_update);
            statement.setString(11, deadline);
            statement.setInt(12, sales_id);

            statement.executeUpdate();
            statement.close();
            return true;
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
    }
    
    public List<InquiryData> getReportData(String date1, String date2){
        List<InquiryData> reportDataList = new ArrayList();
        try{
            String query;
            PreparedStatement statement = null;
            String formattedDate = currentDate.format(formatter);
            if(date1.equals("") && date2.equals("")){
                    query = "SELECT sale.*, user.first_name, user.last_name " +
                        "FROM sale " +
                        "INNER JOIN user ON sale.user_id = user.user_id " +
                        "WHERE sale.date_added = ?";
                    statement = con.prepareStatement(query);
                    statement.setString(1, formattedDate);

            }else{
                    query = "SELECT sale.*, user.first_name, user.last_name " +
                        "FROM sale " +
                        "INNER JOIN user ON sale.user_id = user.user_id " +
                        "WHERE sale.date_added between ? and ?";
                    statement = con.prepareStatement(query);
                    statement.setString(1, date1);
                    statement.setString(2,date2);
            }
            ResultSet result = statement.executeQuery();
            
            while(result.next()){
                InquiryData data = new InquiryData();

                data.setSalesId(result.getInt(1));
                data.setIDate(result.getDate(2));
                data.setIProject(result.getString(3));
                data.setIQuantity(result.getInt(4));
                data.setIDescription(result.getString(5));
                data.setISupplier(result.getString(6));
                data.setISupplierPrice(result.getDouble(7));
                data.setISrp(result.getDouble(8));
                data.setIRemarks(result.getString(9));
                data.setIDateAccomplished(result.getDate(10));
                data.setILastUpdate(result.getDate(11));
                data.setIDeadline(result.getDate(12));
                data.setUserID(result.getInt(13));
                data.setLastName(result.getString("last_name"));
                data.setFirstName(result.getString("first_name"));

              reportDataList.add(data);
            }
            
        }catch(Exception error){
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
        }
       
        
        return reportDataList;
    }
    
    //=======================================================================================
    //End of Inquiry
    
    //=========================================================================================
    //CRUD of Logistics

    public boolean addLogistic(
            String productName,
            String pType,
            double pPrice,
            String dateReceived,
            String dateRelease,
            String euPoNumber,
            String poRefNumber,
            String brand,
            String pDesc,
            String model,
            String supplier,
            int quantity,
            String customer,
            String warranty,
            String warrantyCustomer,
            int userId) {
        try {
            String query = "insert into logistic (product_name,product_type,product_price,date_received,date_release,eu_po_number,po_ref_number,brand,description,model,supplier,quantity,customer,warranty,warranty_customer,user_id) " + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, productName);
            statement.setString(2, pType);
            statement.setDouble(3, pPrice);
            statement.setString(4, dateReceived);
            statement.setString(5, dateRelease);
            statement.setString(6, euPoNumber);
            statement.setString(7, poRefNumber);
            statement.setString(8, brand);
            statement.setString(9, pDesc);
            statement.setString(10, model);
            statement.setString(11, supplier);
            statement.setInt(12, quantity);
            statement.setString(13, customer);
            statement.setString(14, warranty);
            statement.setString(15, warrantyCustomer);
            statement.setInt(16, userId);

            statement.executeUpdate();
            statement.close();
            return true;
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public List<LogisticData> getLogisticData(int id, String userType) {
        List<LogisticData> logisticData = new ArrayList<>();
        String query;
        
        try {
            if (userType.equals("user")) {
                query = "select * from logistic where user_id = ?";
            } else {
                query = "select * from logistic where product_id = ?";
            }
            
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                LogisticData data = new LogisticData();
                data.setProductId(result.getInt(1));
                data.setName(result.getString(2));
                data.setType(result.getString(3));
                data.setPrice(result.getDouble(4));
                data.setDateReceived(result.getDate(5));
                data.setDateRelease(result.getDate(6));
                data.setEuPoNumber(result.getString(7));
                data.setPoRefNumber(result.getString(8));
                data.setBrand(result.getString(9));
                data.setPDesc(result.getString(10));
                data.setModel(result.getString(11));
                data.setSupplier(result.getString(12));
                data.setQuantity(result.getInt(13));
                data.setCustomer(result.getString(14));
                data.setWarranty(result.getString(15));
                data.setWarrantyCustomer(result.getString(16));
                data.setUserId(result.getInt(17));

                logisticData.add(data);
            }
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return logisticData;
    }

    public boolean updateLogistic(
            int productId,
            String productName,
            String pType,
            double pPrice,
            String dateReceived,
            String dateRelease,
            String euPoNumber,
            String poRefNumber,
            String brand,
            String pDesc,
            String model,
            String supplier,
            int quantity,
            String customer,
            String warranty,
            String warrantyCustomer
    ) {
        try {
            String query = "update logistic set product_name =?,product_type=?,product_price=?,date_received=?,date_release=?,eu_po_number=?,po_ref_number=?,brand=?,description=?,model=?,supplier=?,quantity=?,customer=?,warranty=?,warranty_customer=? where product_id = ?";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, productName);
            statement.setString(2, pType);
            statement.setDouble(3, pPrice);
            statement.setString(4, dateReceived);
            statement.setString(5, dateRelease);
            statement.setString(6, euPoNumber);
            statement.setString(7, poRefNumber);
            statement.setString(8, brand);
            statement.setString(9, pDesc);
            statement.setString(10, model);
            statement.setString(11, supplier);
            statement.setInt(12, quantity);
            statement.setString(13, customer);
            statement.setString(14, warranty);
            statement.setString(15, warrantyCustomer);
            statement.setInt(16, productId);

            statement.executeUpdate();
            statement.close();
            return true;
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean deleteLogistic(int productId) {
        try {
            String query = "delete from logistic where product_id = ?";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1, productId);

            statement.executeUpdate();
            statement.close();
            return true;
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public List<LogisticData> getLogisticReportData(String date1, String date2) {
        List<LogisticData> logisticData = new ArrayList<>();
        
        try {
            String query;
            PreparedStatement statement = null;
            String formattedDate = currentDate.format(formatter);
            if(date1.equals("") && date2.equals("")){
                    query = "SELECT logistic.*, user.first_name, user.last_name " +
                        "FROM logistic " +
                        "INNER JOIN user ON logistic.user_id = user.user_id " +
                        "WHERE logistic.date_added = ?";
                    statement = con.prepareStatement(query);
                    statement.setString(1, formattedDate);

            }else{
                    query = "SELECT logistic.*, user.first_name, user.last_name " +
                        "FROM logistic " +
                        "INNER JOIN user ON logistic.user_id = user.user_id " +
                        "WHERE logistic.date_added between ? and ?";
                    statement = con.prepareStatement(query);
                    statement.setString(1, date1);
                    statement.setString(2,date2);
            }
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                LogisticData data = new LogisticData();
                data.setProductId(result.getInt(1));
                data.setName(result.getString(2));
                data.setType(result.getString(3));
                data.setPrice(result.getDouble(4));
                data.setDateReceived(result.getDate(5));
                data.setDateRelease(result.getDate(6));
                data.setEuPoNumber(result.getString(7));
                data.setPoRefNumber(result.getString(8));
                data.setBrand(result.getString(9));
                data.setPDesc(result.getString(10));
                data.setModel(result.getString(11));
                data.setSupplier(result.getString(12));
                data.setQuantity(result.getInt(13));
                data.setCustomer(result.getString(14));
                data.setWarranty(result.getString(15));
                data.setWarrantyCustomer(result.getString(16));
                data.setUserId(result.getInt(17));
                data.setLastName(result.getString("last_name"));
                data.setFirstName(result.getString("first_name"));
                

                logisticData.add(data);
            }
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return logisticData;
    }
    
    //end of logistics
    //=====================================================================================================  
}
