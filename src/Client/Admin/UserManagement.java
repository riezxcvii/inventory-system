package Client.Admin;

import Server.Frame;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Server.Queries;

public class UserManagement extends javax.swing.JPanel {
    Queries query = new Queries();
    Server.Database.DatabaseConnect dbConn = new Server.Database.DatabaseConnect();
    Connection con = dbConn.checkConnection();
    
    public void getData(){
        
        try{
            String query = "SELECT * FROM user";
            PreparedStatement statement = con.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            DefaultTableModel model = (DefaultTableModel)userTable.getModel();
            
            model.setRowCount(0);
            while(result.next()){
                int id = result.getInt(1);
                String type = result.getString(2);
                String username = result.getString(8);
                String last = result.getString(3);
                String first = result.getString(4);
                String address = result.getString(5);
                String mobile = result.getString(6);
                String email = result.getString(7);
                
                model.addRow(new Object[]{id, type, username, last, first, address, mobile, email});
            }
        }
        catch(Exception error){
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void clear(){
        userType.setSelectedItem("User Type");
        address.setText("");
        emailAddress.setText("");
        firstName.setText("");
        lastName.setText("");
        mobileNumber.setText("");
        username.setText("");
        password.setText("");
        
        userTable.getSelectionModel().clearSelection();
        updateButton.setEnabled(false);
        deleteButton.setEnabled(false);
        addButoon.setEnabled(true);
    }
    
    public UserManagement() {
        initComponents();
        getData();
        userId.setVisible(false);
        updateButton.setEnabled(false);
        deleteButton.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navigationBar = new javax.swing.JPanel();
        navigationBarTitle = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        userIcon = new javax.swing.JLabel();
        homeIcon = new javax.swing.JLabel();
        userForm = new javax.swing.JPanel();
        formTitle = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        userType = new javax.swing.JComboBox<>();
        lastName = new javax.swing.JTextField();
        mobileNumber = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        emailAddress = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        userId = new javax.swing.JLabel();
        UserTableScrollPanel = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        clearButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        addButoon = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(236, 242, 255));
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(1000, 600));

        navigationBar.setBackground(new java.awt.Color(51, 102, 153));

        navigationBarTitle.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        navigationBarTitle.setForeground(new java.awt.Color(255, 255, 255));
        navigationBarTitle.setText("User Management");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Navigation Bar/inventory-system-logo.png"))); // NOI18N

        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Navigation Bar/user.png"))); // NOI18N

        homeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Navigation Bar/home.png"))); // NOI18N
        homeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout navigationBarLayout = new javax.swing.GroupLayout(navigationBar);
        navigationBar.setLayout(navigationBarLayout);
        navigationBarLayout.setHorizontalGroup(
            navigationBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigationBarLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(logo)
                .addGap(18, 18, 18)
                .addComponent(navigationBarTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 398, Short.MAX_VALUE)
                .addComponent(homeIcon)
                .addGap(18, 18, 18)
                .addComponent(userIcon)
                .addGap(28, 28, 28))
        );
        navigationBarLayout.setVerticalGroup(
            navigationBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addComponent(navigationBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(userIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(homeIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        userForm.setBackground(new java.awt.Color(255, 255, 255));
        userForm.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray), null));

        formTitle.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        formTitle.setText("USER FORM");

        firstName.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        userType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User Type", "Admin", "Sales", "Logistics" }));
        userType.setBorder(null);
        userType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTypeActionPerformed(evt);
            }
        });

        lastName.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        mobileNumber.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Mobile Number", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        address.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Address", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        emailAddress.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Email Address", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        username.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        password.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        userId.setText("jLabel1");

        javax.swing.GroupLayout userFormLayout = new javax.swing.GroupLayout(userForm);
        userForm.setLayout(userFormLayout);
        userFormLayout.setHorizontalGroup(
            userFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userFormLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(formTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(userFormLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(userFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(userType, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, userFormLayout.createSequentialGroup()
                            .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(14, 14, 14)
                            .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(address, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mobileNumber, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(emailAddress, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(userFormLayout.createSequentialGroup()
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(userFormLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(userId)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        userFormLayout.setVerticalGroup(
            userFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userFormLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(formTitle)
                .addGap(23, 23, 23)
                .addComponent(userType, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userId)
                .addContainerGap())
        );

        userTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TYPE", "USERNAME", "LAST NAME", "FIRST NAME", "ADDRESS", "MOBILE NUMBER", "EMAIL ADDRESS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userTable.getTableHeader().setReorderingAllowed(false);
        userTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTableMouseClicked(evt);
            }
        });
        UserTableScrollPanel.setViewportView(userTable);
        if (userTable.getColumnModel().getColumnCount() > 0) {
            userTable.getColumnModel().getColumn(0).setResizable(false);
            userTable.getColumnModel().getColumn(0).setPreferredWidth(30);
            userTable.getColumnModel().getColumn(1).setResizable(false);
            userTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            userTable.getColumnModel().getColumn(2).setResizable(false);
            userTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            userTable.getColumnModel().getColumn(3).setResizable(false);
            userTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            userTable.getColumnModel().getColumn(4).setResizable(false);
            userTable.getColumnModel().getColumn(4).setPreferredWidth(120);
            userTable.getColumnModel().getColumn(5).setResizable(false);
            userTable.getColumnModel().getColumn(5).setPreferredWidth(150);
            userTable.getColumnModel().getColumn(6).setResizable(false);
            userTable.getColumnModel().getColumn(6).setPreferredWidth(130);
            userTable.getColumnModel().getColumn(7).setResizable(false);
            userTable.getColumnModel().getColumn(7).setPreferredWidth(150);
        }

        clearButton.setBackground(new java.awt.Color(51, 102, 153));
        clearButton.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Buttons/clear.png"))); // NOI18N
        clearButton.setText("CLEAR");
        clearButton.setBorder(null);
        clearButton.setFocusable(false);
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButtonMouseClicked(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(51, 102, 153));
        updateButton.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Buttons/edit.png"))); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.setBorder(null);
        updateButton.setFocusable(false);
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateButtonMouseClicked(evt);
            }
        });

        addButoon.setBackground(new java.awt.Color(51, 102, 153));
        addButoon.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        addButoon.setForeground(new java.awt.Color(255, 255, 255));
        addButoon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Buttons/add.png"))); // NOI18N
        addButoon.setText("ADD");
        addButoon.setBorder(null);
        addButoon.setFocusable(false);
        addButoon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButoonMouseClicked(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(51, 102, 153));
        deleteButton.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Buttons/delete.png"))); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.setBorder(null);
        deleteButton.setFocusable(false);
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navigationBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addButoon, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(userForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(UserTableScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navigationBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UserTableScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(userForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addButoon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void homeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeIconMouseClicked
        Frame frame = new Frame();
        frame.viewFrame("Client.Admin.Dashboard", "Inventory System");
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.dispose();
    }//GEN-LAST:event_homeIconMouseClicked

    private void addButoonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButoonMouseClicked
        String selectedItem = userType.getSelectedItem().toString();
        if(selectedItem.equals("User Type")){
        JOptionPane.showMessageDialog(null, "Please select User Type.", "Error", JOptionPane.ERROR_MESSAGE); 
        }
        else if(address.getText().equals("") || emailAddress.getText().equals("") || lastName.getText().equals("")||firstName.getText().equals("")|| mobileNumber.getText().equals("")|| username.getText().equals("")||password.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Please fill out all field.", "Error", JOptionPane.ERROR_MESSAGE); 
       }else{

        query.addUser(username.getText(), password.getText(),selectedItem,address.getText(), emailAddress.getText(), mobileNumber.getText(), firstName.getText(), lastName.getText());
        JOptionPane.showMessageDialog(new JFrame(), "User Added", "Success", JOptionPane.INFORMATION_MESSAGE);
        getData();
        clear();
        }
    }//GEN-LAST:event_addButoonMouseClicked

    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseClicked
    clear();    
    }//GEN-LAST:event_clearButtonMouseClicked

    private void userTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTypeActionPerformed
   
    }//GEN-LAST:event_userTypeActionPerformed

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        int decision = JOptionPane.showConfirmDialog(new JFrame(), "Are you sure you want to delete?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if(decision == JOptionPane.YES_OPTION){
        int id = Integer.parseInt(userId.getText());
        query.deleteUser(id);
        JOptionPane.showMessageDialog(new JFrame(), "User Deleted", "Success", JOptionPane.INFORMATION_MESSAGE);
        getData();
        clear();
        }
    }//GEN-LAST:event_deleteButtonMouseClicked

    private void userTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTableMouseClicked
        deleteButton.setEnabled(true);
        updateButton.setEnabled(true);
        addButoon.setEnabled(false);
        DefaultTableModel model = (DefaultTableModel)userTable.getModel();
        int selectedRows = userTable.getSelectedRow();
        
        userId.setText(model.getValueAt(selectedRows,0).toString());
        int id=Integer.parseInt(userId.getText());
        
        try{
            String query = "SELECT * from user WHERE user_id =?";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            
            if(result.next()){
                String selectedItem = result.getString("user_type");
                userType.setSelectedItem(selectedItem);
                username.setText(result.getString("username"));
                lastName.setText(result.getString("last_name"));
                firstName.setText(result.getString("first_name"));
                address.setText(result.getString("address"));
                mobileNumber.setText(result.getString("mobile_number"));
                emailAddress.setText(result.getString("email_address"));
                password.setText(result.getString("password"));
                userId.setText(result.getString("user_id"));
            }
            statement.close();
        }catch(Exception error){
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE); 
        } 
    }//GEN-LAST:event_userTableMouseClicked

    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseClicked
        String selectedItem = userType.getSelectedItem().toString();
        if(selectedItem.equals("User Type")){
        JOptionPane.showMessageDialog(null, "Please select User Type.", "Error", JOptionPane.ERROR_MESSAGE); 
        }
        else if(address.getText().equals("") || emailAddress.getText().equals("") || lastName.getText().equals("")||firstName.getText().equals("")|| mobileNumber.getText().equals("")|| username.getText().equals("")||password.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Please fill out all field.", "Error", JOptionPane.ERROR_MESSAGE); 
       }else{
            int id = Integer.parseInt(userId.getText());
            query.updateUser(id, username.getText(), password.getText(),selectedItem,address.getText(), emailAddress.getText(), mobileNumber.getText(), firstName.getText(), lastName.getText());
            JOptionPane.showMessageDialog(new JFrame(), "User Updated", "Success", JOptionPane.INFORMATION_MESSAGE);
            getData();
            clear();
        }
    }//GEN-LAST:event_updateButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane UserTableScrollPanel;
    private javax.swing.JButton addButoon;
    private javax.swing.JTextField address;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField emailAddress;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel formTitle;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JTextField lastName;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField mobileNumber;
    private javax.swing.JPanel navigationBar;
    private javax.swing.JLabel navigationBarTitle;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton updateButton;
    private javax.swing.JPanel userForm;
    private javax.swing.JLabel userIcon;
    private javax.swing.JLabel userId;
    private javax.swing.JTable userTable;
    private javax.swing.JComboBox<String> userType;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
