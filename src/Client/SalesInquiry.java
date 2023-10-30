package Client;

import Server.Frame;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import Database.DatabaseConnect;
import Server.UserSession;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class SalesInquiry extends javax.swing.JPanel {

    DatabaseConnect dbConnect = new DatabaseConnect();
    Connection con = dbConnect.checkConnection();
    
    Server.Queries qry = new Server.Queries();
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    
    UserSession session = UserSession.getInstance();
    
    int userID = session.getUserID();
    
    public void getInquiry(int id){
        try{
            
            TableColumnModel columnModel = salesInquiryTable.getColumnModel();
            TableColumn columnToHide = columnModel.getColumn(12);
            
            columnToHide.setMinWidth(0);
            columnToHide.setMaxWidth(0);
            columnToHide.setPreferredWidth(0);
            
            String query = "select * from sale where user_id = ?";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1,id);
            ResultSet result = statement.executeQuery();
            DefaultTableModel model = (DefaultTableModel) salesInquiryTable.getModel();

            model.setRowCount(0);
            
            while(result.next()){
                int salesId = result.getInt(1);
                String iDate = result.getString(2);
                String iproject = result.getString(3);
                int iQuantity = result.getInt(4);
                String iDescription = result.getString(5);
                String iSupplier = result.getString(6);
                double iSupplier_price = result.getDouble(7);
                double iSrp = result.getDouble(8);
                String iRemarks = result.getString(9);
                String iDate_accomplished = result.getString(10);
                String iLast_update = result.getString(11);
                String iDeadline = result.getString(12);
            
                
                model.addRow(new Object[]{salesId,iDate,iproject,iQuantity,iDescription,iSupplier,iSupplier_price,
                iSrp,iRemarks,iDate_accomplished,iLast_update,iDeadline,userID});
            }
        }catch(Exception error){
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);  
        }
    }
    
    public void clear(){
        Quantity.setText("");
        date.setDate(null);
        dateAccomplished.setDate(null);
        deadline.setDate(null);
        srp.setText("");
        supplier.setText("");
        supplierPrice.setText("");
        Quantity.setText("");
        lastUpdate.setDate(null);
        description.setText("");
        project.setText("");
        remarks.setText("");
        salesInquiryTable.getSelectionModel().clearSelection();
    }
    public void textFieldStatus(boolean status){
        dateAccomplished.setEnabled(status);
            deadline.setEnabled(status);
            srp.setEnabled(status);
            supplier.setEnabled(status);
            supplierPrice.setEnabled(status);
            Quantity.setEnabled(status);
            lastUpdate.setEnabled(status);
            remarks.setEnabled(status);
            clearButton.setEnabled(status);
            date.setEnabled(status);
            description.setEnabled(status);
            project.setEnabled(status);
        
    }
    
    public SalesInquiry() {
        initComponents();
        
        updateButton.setEnabled(false);
        deleteButton.setEnabled(false);
        salesId.setVisible(false);
        idOfUser.setVisible(false);
        
        if(!session.getUserType().equals("Admin")){
            homeIcon.setVisible(false);
        }
        try{
              if(session.getUserType().equals("Sales")){
         salesUser.addItem("My Inquiry");
        }
            String query = "SELECT * FROM user WHERE user_type = ? and user_id !=?";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1,"Sales");
            statement.setInt(2,userID);
            ResultSet result = statement.executeQuery();
            while(result.next()){
                int id = result.getInt("user_id");
                String first = result.getString("first_name");
                String last = result.getString("last_name");
                salesUser.addItem(id +" "+first + " " + last);  
            }
            statement.close();
        }catch(Exception error){
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        getInquiry(userID);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navigationBar = new javax.swing.JPanel();
        navigationBarTitle = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        userIcon = new javax.swing.JLabel();
        homeIcon = new javax.swing.JLabel();
        salesInquiryForm = new javax.swing.JPanel();
        project = new javax.swing.JTextField();
        Quantity = new javax.swing.JTextField();
        supplierPrice = new javax.swing.JTextField();
        supplier = new javax.swing.JTextField();
        remarks = new javax.swing.JTextField();
        description = new javax.swing.JTextField();
        srp = new javax.swing.JTextField();
        date = new com.toedter.calendar.JDateChooser();
        dateAccomplished = new com.toedter.calendar.JDateChooser();
        lastUpdate = new com.toedter.calendar.JDateChooser();
        deadline = new com.toedter.calendar.JDateChooser();
        salesId = new javax.swing.JLabel();
        idOfUser = new javax.swing.JLabel();
        salesInquiryTableScrollPanel = new javax.swing.JScrollPane();
        salesInquiryTable = new javax.swing.JTable();
        clearButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        addButoon = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        salesUser = new javax.swing.JComboBox<>();
        userDropdownIcon = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(236, 242, 255));
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(1000, 600));

        navigationBar.setBackground(new java.awt.Color(51, 102, 153));

        navigationBarTitle.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        navigationBarTitle.setForeground(new java.awt.Color(255, 255, 255));
        navigationBarTitle.setText("Sales Inquiry");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navigationBarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(homeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        salesInquiryForm.setBackground(new java.awt.Color(255, 255, 255));
        salesInquiryForm.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray), null));

        project.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Project", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        Quantity.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Quantity", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        supplierPrice.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Supplier Price", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        supplier.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Supplier", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        remarks.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Remarks", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        description.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Description", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        srp.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "SRP", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        date.setBackground(new java.awt.Color(255, 255, 255));
        date.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Date", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        dateAccomplished.setBackground(new java.awt.Color(255, 255, 255));
        dateAccomplished.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Date Accomplished", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        lastUpdate.setBackground(new java.awt.Color(255, 255, 255));
        lastUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Last Update", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        deadline.setBackground(new java.awt.Color(255, 255, 255));
        deadline.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Deadline", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        salesId.setText("jLabel1");

        idOfUser.setText("jLabel1");

        javax.swing.GroupLayout salesInquiryFormLayout = new javax.swing.GroupLayout(salesInquiryForm);
        salesInquiryForm.setLayout(salesInquiryFormLayout);
        salesInquiryFormLayout.setHorizontalGroup(
            salesInquiryFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salesInquiryFormLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(salesInquiryFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(supplier, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(date, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(dateAccomplished, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(salesInquiryFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(project, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(supplierPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(lastUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(salesInquiryFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Quantity, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(srp, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(deadline, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addGroup(salesInquiryFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(salesInquiryFormLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(salesInquiryFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(remarks, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(salesInquiryFormLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(salesId)
                        .addGap(32, 32, 32)
                        .addComponent(idOfUser)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        salesInquiryFormLayout.setVerticalGroup(
            salesInquiryFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salesInquiryFormLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(salesInquiryFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(salesInquiryFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(project, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(salesInquiryFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supplierPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(srp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(remarks, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(salesInquiryFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(salesInquiryFormLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(salesInquiryFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateAccomplished, javax.swing.GroupLayout.PREFERRED_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(lastUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(deadline, javax.swing.GroupLayout.PREFERRED_SIZE, 51, Short.MAX_VALUE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salesInquiryFormLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(salesInquiryFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salesId)
                            .addComponent(idOfUser))
                        .addGap(32, 32, 32))))
        );

        salesInquiryTable.setBackground(new java.awt.Color(238, 238, 238));
        salesInquiryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sales ID", "Date", "Project", "Quantity", "Description", "Supplier", "Price", "SRP", "Remarks", "ETA", "Last Update", "Deadline", "User ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        salesInquiryTable.getTableHeader().setReorderingAllowed(false);
        salesInquiryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesInquiryTableMouseClicked(evt);
            }
        });
        salesInquiryTableScrollPanel.setViewportView(salesInquiryTable);
        if (salesInquiryTable.getColumnModel().getColumnCount() > 0) {
            salesInquiryTable.getColumnModel().getColumn(0).setResizable(false);
            salesInquiryTable.getColumnModel().getColumn(0).setPreferredWidth(60);
            salesInquiryTable.getColumnModel().getColumn(1).setResizable(false);
            salesInquiryTable.getColumnModel().getColumn(2).setResizable(false);
            salesInquiryTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            salesInquiryTable.getColumnModel().getColumn(3).setResizable(false);
            salesInquiryTable.getColumnModel().getColumn(3).setPreferredWidth(60);
            salesInquiryTable.getColumnModel().getColumn(4).setResizable(false);
            salesInquiryTable.getColumnModel().getColumn(4).setPreferredWidth(100);
            salesInquiryTable.getColumnModel().getColumn(5).setResizable(false);
            salesInquiryTable.getColumnModel().getColumn(5).setPreferredWidth(100);
            salesInquiryTable.getColumnModel().getColumn(6).setResizable(false);
            salesInquiryTable.getColumnModel().getColumn(6).setPreferredWidth(40);
            salesInquiryTable.getColumnModel().getColumn(7).setResizable(false);
            salesInquiryTable.getColumnModel().getColumn(7).setPreferredWidth(40);
            salesInquiryTable.getColumnModel().getColumn(8).setResizable(false);
            salesInquiryTable.getColumnModel().getColumn(8).setPreferredWidth(100);
            salesInquiryTable.getColumnModel().getColumn(9).setResizable(false);
            salesInquiryTable.getColumnModel().getColumn(10).setResizable(false);
            salesInquiryTable.getColumnModel().getColumn(11).setResizable(false);
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

        salesUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Sales User" }));
        salesUser.setBorder(null);
        salesUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesUserActionPerformed(evt);
            }
        });

        userDropdownIcon.setBackground(new java.awt.Color(255, 255, 255));
        userDropdownIcon.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        userDropdownIcon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User Full Name", "Log out" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navigationBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(userDropdownIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(salesInquiryTableScrollPanel)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(salesInquiryForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(28, 28, 28)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(clearButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(updateButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addButoon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deleteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(salesUser, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navigationBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(userDropdownIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(salesUser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(salesInquiryTableScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addButoon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(salesInquiryForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void homeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeIconMouseClicked
        Frame frame = new Frame();
        frame.viewFrame("Client.Dashboard", "Inventory System");
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.dispose();
    }//GEN-LAST:event_homeIconMouseClicked

    private void salesUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesUserActionPerformed
        String selectedItem = salesUser.getSelectedItem().toString();
        if(selectedItem.equals("My Inquiry")){
            getInquiry(userID); 
            addButoon.setEnabled(true);
            clear();
            dateAccomplished.setEnabled(true);
            deadline.setEnabled(true);
            srp.setEnabled(true);
            supplier.setEnabled(true);
            supplierPrice.setEnabled(true);
            Quantity.setEnabled(true);
            lastUpdate.setEnabled(true);
            remarks.setEnabled(true);
            clearButton.setEnabled(true);
            date.setEnabled(true);
            description.setEnabled(true);
            project.setEnabled(true);
        }else{
               Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(selectedItem);

        if (matcher.find()) {
            String integerString = matcher.group();
            int intValue = Integer.parseInt(integerString);

            getInquiry(intValue);
        } else {
            // Handle the case where no integer was found in the selectedItem
        }
        }
     
    }//GEN-LAST:event_salesUserActionPerformed

    private void salesInquiryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesInquiryTableMouseClicked
      DefaultTableModel model = (DefaultTableModel) salesInquiryTable.getModel();
        int selectedRows = salesInquiryTable.getSelectedRow();

        salesId.setText(model.getValueAt(selectedRows, 0).toString());
        int id = Integer.parseInt(salesId.getText());
        addButoon.setEnabled(false);
        try{
           String query = "Select * from sale where sale_id = ?";
           PreparedStatement statement = con.prepareStatement(query);
           statement.setInt(1,id);
           ResultSet result = statement.executeQuery();
           if(result.next()){
               int userid = result.getInt("user_id");
               double dSrp = result.getDouble("srp");
               int qnty = result.getInt("quantity");
               double sprice = result.getDouble("supplier_price");
                Quantity.setText(result.getString("quantity"));
                date.setDate(result.getDate("date"));
                dateAccomplished.setDate(result.getDate("date_accomplished"));
                deadline.setDate(result.getDate("deadline"));
                srp.setText(String.valueOf(dSrp));
                supplier.setText(result.getString("supplier"));
                supplierPrice.setText(String.valueOf(sprice));
                Quantity.setText(String.valueOf(qnty));
                lastUpdate.setDate(result.getDate("last_update"));
                description.setText(result.getString("description"));
                project.setText(result.getString("project_or_end_user"));
                remarks.setText(result.getString("remarks"));
                idOfUser.setText(String.valueOf(userid));
                
                if(session.getUserType().equals("Admin")){
                    updateButton.setEnabled(true);
                    deleteButton.setEnabled(true);
                }else{
                    if(userID == userid){
                        updateButton.setEnabled(true);
                        dateAccomplished.setEnabled(false);
                        deadline.setEnabled(false);
                        srp.setEnabled(false);
                        supplier.setEnabled(false);
                        supplierPrice.setEnabled(false);
                        lastUpdate.setEnabled(false);
                        remarks.setEnabled(false);
                        clearButton.setEnabled(false);
                    }
                    else{
                       updateButton.setEnabled(false);
                       clearButton.setEnabled(false);
                       textFieldStatus(false);
                    }
                    
                }
           }
        }catch(Exception error){
            JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);  
        }
    }//GEN-LAST:event_salesInquiryTableMouseClicked

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int decision = JOptionPane.showConfirmDialog(new JFrame(), "Are you sure you want to delete?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (decision == JOptionPane.YES_OPTION) {
            int id = Integer.parseInt(salesId.getText());
            qry.deleteInquiry(id);
            JOptionPane.showMessageDialog(new JFrame(), "User Deleted", "Success", JOptionPane.INFORMATION_MESSAGE);
            int id1 = Integer.parseInt(idOfUser.getText());
            getInquiry(id1);       
            clear();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void addButoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButoonActionPerformed
       if(session.getUserType().equals("Admin")){
            JOptionPane.showMessageDialog(null, "You can't add Sales Inquiry", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            if(date.getDate()==null || dateAccomplished.getDate()==null||deadline.getDate()==null||lastUpdate.getDate()==null||
                Quantity.getText().equals("")||description.getText().equals("")||project.getText().equals("")||
                remarks.getText().equals("")||srp.getText().equals("")||supplier.getText().equals("")||supplierPrice.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please fill out all field.", "Error", JOptionPane.ERROR_MESSAGE);
            }else{

                try{
                    int quantityValue = Integer.parseInt(Quantity.getText());
                    try{
                        double srpValue = Double.parseDouble(srp.getText());
                        double supplierpriceValue = Double.parseDouble(supplierPrice.getText());

                        String fdate = sdf.format(date.getDate());
                        String fdateAccom = sdf.format(dateAccomplished.getDate());
                        String fdeadline = sdf.format(deadline.getDate());
                        String flastUpdate = sdf.format(lastUpdate.getDate());

                        qry.addInquiry(fdate,
                            project.getText(),
                            quantityValue,
                            description.getText(),
                            supplier.getText(),
                            supplierpriceValue,
                            srpValue,
                            remarks.getText(),
                            fdateAccom,
                            flastUpdate,
                            fdeadline,
                            userID);

                        JOptionPane.showMessageDialog(new JFrame(), "Inquiry Added", "Success", JOptionPane.INFORMATION_MESSAGE);
                            getInquiry(userID);
                        clear();

                    }catch(Exception error){
                        JOptionPane.showMessageDialog(null, "Prices must be a decimal or integer.", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                }catch(Exception error){
                    JOptionPane.showMessageDialog(null, "Quantity must be an integer.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        }
    }//GEN-LAST:event_addButoonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
      if(date.getDate()==null || dateAccomplished.getDate()==null||deadline.getDate()==null||lastUpdate.getDate()==null||
                Quantity.getText().equals("")||description.getText().equals("")||project.getText().equals("")||
                remarks.getText().equals("")||srp.getText().equals("")||supplier.getText().equals("")||supplierPrice.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please fill out all field.", "Error", JOptionPane.ERROR_MESSAGE);
            }else{

                try{
                    int quantityValue = Integer.parseInt(Quantity.getText());
                    try{
                        int id = Integer.parseInt(salesId.getText());
                        double srpValue = Double.parseDouble(srp.getText());
                        double supplierpriceValue = Double.parseDouble(supplierPrice.getText());

                        String fdate = sdf.format(date.getDate());
                        String fdateAccom = sdf.format(dateAccomplished.getDate());
                        String fdeadline = sdf.format(deadline.getDate());
                        String flastUpdate = sdf.format(lastUpdate.getDate());

                        qry.updateInquiry(
                            id,
                            fdate,
                            project.getText(),
                            quantityValue,
                            description.getText(),
                            supplier.getText(),
                            supplierpriceValue,
                            srpValue,
                            remarks.getText(),
                            fdateAccom,
                            flastUpdate,
                            fdeadline);
                        int id1 = Integer.parseInt(idOfUser.getText());
                        JOptionPane.showMessageDialog(new JFrame(), "Inquiry updated.", "Success", JOptionPane.INFORMATION_MESSAGE);
                        getInquiry(id1);
                        clear();
                        textFieldStatus(true);
                        

                    }catch(Exception error){
                        JOptionPane.showMessageDialog(null, "Prices must be a decimal or integer.", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                }catch(Exception error){
                    JOptionPane.showMessageDialog(null, "Quantity must be an integer.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clear();  
    }//GEN-LAST:event_clearButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Quantity;
    private javax.swing.JButton addButoon;
    private javax.swing.JButton clearButton;
    private com.toedter.calendar.JDateChooser date;
    private com.toedter.calendar.JDateChooser dateAccomplished;
    private com.toedter.calendar.JDateChooser deadline;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField description;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JLabel idOfUser;
    private com.toedter.calendar.JDateChooser lastUpdate;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel navigationBar;
    private javax.swing.JLabel navigationBarTitle;
    private javax.swing.JTextField project;
    private javax.swing.JTextField remarks;
    private javax.swing.JLabel salesId;
    private javax.swing.JPanel salesInquiryForm;
    private javax.swing.JTable salesInquiryTable;
    private javax.swing.JScrollPane salesInquiryTableScrollPanel;
    private javax.swing.JComboBox<String> salesUser;
    private javax.swing.JTextField srp;
    private javax.swing.JTextField supplier;
    private javax.swing.JTextField supplierPrice;
    private javax.swing.JButton updateButton;
    private javax.swing.JComboBox<String> userDropdownIcon;
    private javax.swing.JLabel userIcon;
    // End of variables declaration//GEN-END:variables
}
