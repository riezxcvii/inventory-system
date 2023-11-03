package Client;

import Server.Frame;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Server.Queries;
import Server.UserData;
import java.util.List;

public class UserManagement extends javax.swing.JPanel {

    Queries query = new Queries();

    public void getData(int id) {

        Server.Queries qry = new Server.Queries();
        List<UserData> data = qry.getUserData(id, 0, "");
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();

        model.setRowCount(0);

        for (UserData item : data) {
            model.addRow(new Object[]{
                item.getUserId(),
                item.getType(),
                item.getUserName(),
                item.getLast(),
                item.getFirst(),
                item.getAddress(),
                item.getMobile(),
                item.getEmail()
            });
        }
    }

    public void clear() {
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
        getData(0);
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
        logoutButton = new javax.swing.JLabel();
        homeIcon = new javax.swing.JLabel();
        logisticIcon = new javax.swing.JLabel();
        salesInquiryIcon = new javax.swing.JLabel();
        userForm = new javax.swing.JPanel();
        firstName = new javax.swing.JTextField();
        userType = new javax.swing.JComboBox<>();
        lastName = new javax.swing.JTextField();
        mobileNumber = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        emailAddress = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        UserTableScrollPanel = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        clearButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        addButoon = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        userId = new javax.swing.JLabel();
        searchBox = new javax.swing.JTextField();
        searchButton = new javax.swing.JLabel();

        setBackground(new java.awt.Color(236, 242, 255));
        setMaximumSize(new java.awt.Dimension(0, 0));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(1320, 650));

        navigationBar.setBackground(new java.awt.Color(51, 102, 153));

        navigationBarTitle.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        navigationBarTitle.setForeground(new java.awt.Color(255, 255, 255));
        navigationBarTitle.setText("User Management");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Navigation Bar/inventory-system-logo.png"))); // NOI18N

        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Navigation Bar/logout.png"))); // NOI18N
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });

        homeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Navigation Bar/home.png"))); // NOI18N
        homeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeIconMouseClicked(evt);
            }
        });

        logisticIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Navigation Bar/logistics.png"))); // NOI18N
        logisticIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logisticIconMouseClicked(evt);
            }
        });

        salesInquiryIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Navigation Bar/sales-inquiry.png"))); // NOI18N
        salesInquiryIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesInquiryIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout navigationBarLayout = new javax.swing.GroupLayout(navigationBar);
        navigationBar.setLayout(navigationBarLayout);
        navigationBarLayout.setHorizontalGroup(
            navigationBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigationBarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(logo)
                .addGap(20, 20, 20)
                .addComponent(navigationBarTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salesInquiryIcon)
                .addGap(20, 20, 20)
                .addComponent(logisticIcon)
                .addGap(20, 20, 20)
                .addComponent(homeIcon)
                .addGap(20, 20, 20)
                .addComponent(logoutButton)
                .addGap(20, 20, 20))
        );
        navigationBarLayout.setVerticalGroup(
            navigationBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navigationBarLayout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addGroup(navigationBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(salesInquiryIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logisticIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(homeIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)))
            .addComponent(navigationBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        userForm.setBackground(new java.awt.Color(255, 255, 255));
        userForm.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray), null));

        firstName.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        userType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User Type", "Admin", "Sales", "Logistics" }));
        userType.setBorder(null);

        lastName.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        mobileNumber.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Mobile Number", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        address.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Address", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        emailAddress.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Email Address", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        username.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        password.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        javax.swing.GroupLayout userFormLayout = new javax.swing.GroupLayout(userForm);
        userForm.setLayout(userFormLayout);
        userFormLayout.setHorizontalGroup(
            userFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userFormLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(userFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(userFormLayout.createSequentialGroup()
                        .addComponent(emailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(userFormLayout.createSequentialGroup()
                        .addComponent(userType, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(userFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(userFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        userFormLayout.setVerticalGroup(
            userFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userFormLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(userFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(userFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(userType, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(30, 30, 30)
                .addGroup(userFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        userTable.setBackground(new java.awt.Color(238, 238, 238));
        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "User Type", "Username", "Last Name", "First Name", "Address", "Mobile Number", "Email Address"
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
            userTable.getColumnModel().getColumn(2).setResizable(false);
            userTable.getColumnModel().getColumn(3).setResizable(false);
            userTable.getColumnModel().getColumn(4).setResizable(false);
            userTable.getColumnModel().getColumn(5).setResizable(false);
            userTable.getColumnModel().getColumn(5).setPreferredWidth(130);
            userTable.getColumnModel().getColumn(6).setResizable(false);
            userTable.getColumnModel().getColumn(6).setPreferredWidth(130);
            userTable.getColumnModel().getColumn(7).setResizable(false);
            userTable.getColumnModel().getColumn(7).setPreferredWidth(130);
        }

        clearButton.setBackground(new java.awt.Color(51, 102, 153));
        clearButton.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Buttons/clear.png"))); // NOI18N
        clearButton.setText("CLEAR");
        clearButton.setBorder(null);
        clearButton.setFocusable(false);
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(51, 102, 153));
        updateButton.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Buttons/edit.png"))); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.setBorder(null);
        updateButton.setFocusable(false);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        addButoon.setBackground(new java.awt.Color(51, 102, 153));
        addButoon.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        addButoon.setForeground(new java.awt.Color(255, 255, 255));
        addButoon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Buttons/add.png"))); // NOI18N
        addButoon.setText("ADD");
        addButoon.setBorder(null);
        addButoon.setFocusable(false);
        addButoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButoonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(51, 102, 153));
        deleteButton.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Buttons/delete.png"))); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.setBorder(null);
        deleteButton.setFocusable(false);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        userId.setText("userId");

        searchBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 1, true));

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Search Bar/search.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navigationBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(searchButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserTableScrollPanel)
                            .addComponent(userId)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(userForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addButoon, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clearButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navigationBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(UserTableScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(addButoon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userId)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTableMouseClicked
        deleteButton.setEnabled(true);
        updateButton.setEnabled(true);
        addButoon.setEnabled(false);
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        int selectedRows = userTable.getSelectedRow();

        userId.setText(model.getValueAt(selectedRows, 0).toString());
        int id = Integer.parseInt(userId.getText());

        Server.Queries qry = new Server.Queries();
        List<UserData> data = qry.getUserData(id, 0, "");

        UserData item = data.get(0);
        String selectedItem = item.getType();
        userType.setSelectedItem(selectedItem);
        username.setText(item.getUserName());
        lastName.setText(item.getLast());
        firstName.setText(item.getFirst());
        address.setText(item.getAddress());
        mobileNumber.setText(item.getMobile());
        emailAddress.setText(item.getEmail());
        password.setText(item.getPass());
        userId.setText(String.valueOf(item.getUserId()));
    }//GEN-LAST:event_userTableMouseClicked

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int decision = JOptionPane.showConfirmDialog(new JFrame(), "Are you sure you want to delete?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (decision == JOptionPane.YES_OPTION) {
            int id = Integer.parseInt(userId.getText());
            boolean isDeleted = query.deleteUser(id);
            
            if(isDeleted){
                JOptionPane.showMessageDialog(new JFrame(), "User account deleted.", "Success", JOptionPane.INFORMATION_MESSAGE);
                getData(0);
                clear();
            }else{
                JOptionPane.showMessageDialog(null, "Server error.", "Error", JOptionPane.ERROR_MESSAGE);
            }
           
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void addButoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButoonActionPerformed
        String selectedItem = userType.getSelectedItem().toString();

        if (selectedItem.equals("User Type")) {
            JOptionPane.showMessageDialog(null, "Please select user type.", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (address.getText().equals("") || emailAddress.getText().equals("") || lastName.getText().equals("") || firstName.getText().equals("") || mobileNumber.getText().equals("") || username.getText().equals("") || password.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill out all the fields.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            
            boolean isAdded = query.addUser(username.getText(), password.getText(), selectedItem, address.getText(), emailAddress.getText(), mobileNumber.getText(), firstName.getText(), lastName.getText());
            if(isAdded){
                JOptionPane.showMessageDialog(new JFrame(), "New user added.", "Success", JOptionPane.INFORMATION_MESSAGE);
                getData(0);
                clear(); 
            }else{
                JOptionPane.showMessageDialog(null, "Server error.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_addButoonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String selectedItem = userType.getSelectedItem().toString();

        if (selectedItem.equals("User Type")) {
            JOptionPane.showMessageDialog(null, "Please select user type.", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (address.getText().equals("") || emailAddress.getText().equals("") || lastName.getText().equals("") || firstName.getText().equals("") || mobileNumber.getText().equals("") || username.getText().equals("") || password.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill out all the fields.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int id = Integer.parseInt(userId.getText());
            boolean isUpdated = query.updateUser(id, username.getText(), password.getText(), selectedItem, address.getText(), emailAddress.getText(), mobileNumber.getText(), firstName.getText(), lastName.getText());
            if(isUpdated){
                JOptionPane.showMessageDialog(new JFrame(), "User account updated.", "Success", JOptionPane.INFORMATION_MESSAGE);
                getData(0);
                clear();
            }else{
                JOptionPane.showMessageDialog(null, "Server error.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        int decision = JOptionPane.showConfirmDialog(new JFrame(), "Are you sure you want to logout?", "Confirmation", JOptionPane.YES_NO_OPTION);
      
        if (decision == JOptionPane.YES_OPTION) {
            Frame frame = new Frame();
            frame.viewFrame("Client.LoginPage", "Inventory System");
            JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            currentFrame.dispose();
        }
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void salesInquiryIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesInquiryIconMouseClicked
        Frame frame = new Frame();
        frame.viewFrame("Client.SalesInquiry", "Inventory System");
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.dispose();
    }//GEN-LAST:event_salesInquiryIconMouseClicked

    private void logisticIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logisticIconMouseClicked
        Frame frame = new Frame();
        frame.viewFrame("Client.Logistics", "Inventory System");
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.dispose();
    }//GEN-LAST:event_logisticIconMouseClicked

    private void homeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeIconMouseClicked
        Frame frame = new Frame();
        frame.viewFrame("Client.Dashboard", "Inventory System");
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.dispose();
    }//GEN-LAST:event_homeIconMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane UserTableScrollPanel;
    private javax.swing.JButton addButoon;
    private javax.swing.JTextField address;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField emailAddress;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JTextField lastName;
    private javax.swing.JLabel logisticIcon;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoutButton;
    private javax.swing.JTextField mobileNumber;
    private javax.swing.JPanel navigationBar;
    private javax.swing.JLabel navigationBarTitle;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel salesInquiryIcon;
    private javax.swing.JTextField searchBox;
    private javax.swing.JLabel searchButton;
    private javax.swing.JButton updateButton;
    private javax.swing.JPanel userForm;
    private javax.swing.JLabel userId;
    private javax.swing.JTable userTable;
    private javax.swing.JComboBox<String> userType;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
