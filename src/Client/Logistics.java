package Client;

import Server.Frame;
import Server.LogisticData;
import Server.UserData;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import Server.UserSession;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Logistics extends javax.swing.JPanel {
    
    Server.Queries qry = new Server.Queries();
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    
    UserSession session = UserSession.getInstance();
    int userID = session.getUserID();
    String userType = session.getUserType();
    
    public void getLogistic(int id) {
    Server.Queries qry = new Server.Queries();
    List<LogisticData> data = qry.getLogisticData(id,"user");

    DefaultTableModel model = (DefaultTableModel) logisticsTable.getModel();
    model.setRowCount(0);
    for (LogisticData item : data) {
        model.addRow(new Object[] {
           item.getProductId(),
           item.getName(),
           item.getType(),
           item.getPrice(),
           item.getDateReceived(),
           item.getDateRelease(),
           item.getEuPoNumber(),
           item.getPoRefNumber(),
           item.getBrand(),
           item.getPDesc(),
           item.getModel(),
           item.getSupplier(),
           item.getQuantity(),
           item.getCustomer(),
           item.getWarranty(),
           item.getWarrantyCustomer()
        });
    }
    }
    
    public void textFieldStatus(boolean status){
                
        dateReceived.setEnabled(status);
        dateRelease.setEnabled(status);
        brand.setEnabled(status);
        customer.setEnabled(status);
        eu_po.setEnabled(status);
        po_ref.setEnabled(status);
        productDescription.setEnabled(status);
        productName.setEnabled(status);
        productPrice.setEnabled(status);
        productType.setEnabled(status);
        quantity.setEnabled(status);
        supplier.setEnabled(status);
        warranty.setEnabled(status);
        warrantyCustomer.setEnabled(status);
        model1.setEnabled(status);
    }
    
    public void clear(){
        addButoon.setEnabled(true);
        brand.setText("");
        clearButton.setEnabled(true);
        customer.setText("");
        dateReceived.setDate(null);
        dateRelease.setDate(null);
        deleteButton.setEnabled(false);
        eu_po.setText("");
        model1.setText("");
        po_ref.setText("");
        productDescription.setText("");
        productName.setText("");
        productPrice.setText("");
        productType.setText("");
        quantity.setText("");
        supplier.setText("");
        updateButton.setEnabled(false);
        warranty.setText("");
        warrantyCustomer.setText("");
        logisticsTable.getSelectionModel().clearSelection();
    }

    public Logistics() {
        initComponents();
        
        if(!session.getUserType().equals("Admin")){
           homeIcon.setVisible(false);
           salesInquiryIcon.setVisible(false);
           userManagementIcon.setVisible(false);
        }
         
        productId.setVisible(false);
        idOfUser.setVisible(false);
        updateButton.setEnabled(false);
        deleteButton.setEnabled(false);
         
        if (session.getUserType().equals("Logistics")) {
            logisticUser.addItem("My Data");
        }
        
        Server.Queries qry = new Server.Queries();
        List<UserData> data = qry.getUserData(0, userID, "Logistics");

        for (UserData item : data) {
            int id = item.getUserId();
            String first = item.getFirst();
            String last = item.getLast();
            logisticUser.addItem(id + " " + first + " " + last);
        }
         
         getLogistic(userID);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navigationBar = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        logoutButton = new javax.swing.JLabel();
        navigationBarTitle = new javax.swing.JLabel();
        homeIcon = new javax.swing.JLabel();
        userManagementIcon = new javax.swing.JLabel();
        salesInquiryIcon = new javax.swing.JLabel();
        logisticsForm = new javax.swing.JPanel();
        productName = new javax.swing.JTextField();
        productType = new javax.swing.JTextField();
        model1 = new javax.swing.JTextField();
        brand = new javax.swing.JTextField();
        productPrice = new javax.swing.JTextField();
        dateReceived = new com.toedter.calendar.JDateChooser();
        eu_po = new javax.swing.JTextField();
        dateRelease = new com.toedter.calendar.JDateChooser();
        productDescription = new javax.swing.JTextField();
        po_ref = new javax.swing.JTextField();
        supplier = new javax.swing.JTextField();
        warranty = new javax.swing.JTextField();
        customer = new javax.swing.JTextField();
        warrantyCustomer = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        productId = new javax.swing.JLabel();
        idOfUser = new javax.swing.JLabel();
        logisticsTableScrollPanel = new javax.swing.JScrollPane();
        logisticsTable = new javax.swing.JTable();
        addButoon = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        logisticUser = new javax.swing.JComboBox<>();
        searchBox = new javax.swing.JTextField();
        searchButton = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(0, 0));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(1320, 650));

        navigationBar.setBackground(new java.awt.Color(51, 102, 153));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Navigation Bar/inventory-system-logo.png"))); // NOI18N

        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Navigation Bar/logout.png"))); // NOI18N
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });

        navigationBarTitle.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        navigationBarTitle.setForeground(new java.awt.Color(255, 255, 255));
        navigationBarTitle.setText("Logistics");

        homeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Navigation Bar/home.png"))); // NOI18N
        homeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeIconMouseClicked(evt);
            }
        });

        userManagementIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Navigation Bar/user-management.png"))); // NOI18N
        userManagementIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userManagementIconMouseClicked(evt);
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
                .addComponent(userManagementIcon)
                .addGap(20, 20, 20)
                .addComponent(salesInquiryIcon)
                .addGap(20, 20, 20)
                .addComponent(homeIcon)
                .addGap(20, 20, 20)
                .addComponent(logoutButton)
                .addGap(20, 20, 20))
        );
        navigationBarLayout.setVerticalGroup(
            navigationBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(navigationBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navigationBarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(navigationBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(homeIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(salesInquiryIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userManagementIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        logisticsForm.setBackground(new java.awt.Color(255, 255, 255));
        logisticsForm.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray), null));

        productName.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Product Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        productType.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Product Type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        model1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Model", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        brand.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Brand", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        productPrice.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Product Price", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        dateReceived.setBackground(new java.awt.Color(255, 255, 255));
        dateReceived.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Date Received", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        eu_po.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "EU_PO#", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        dateRelease.setBackground(new java.awt.Color(255, 255, 255));
        dateRelease.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Date Release", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        productDescription.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Product Description", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        po_ref.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "PO_REF#", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        supplier.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Supplier", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        warranty.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Warranty", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        customer.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Customer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        warrantyCustomer.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Warranty Customer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        quantity.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Quantity", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        productId.setText("jLabel1");

        idOfUser.setText("jLabel1");

        javax.swing.GroupLayout logisticsFormLayout = new javax.swing.GroupLayout(logisticsForm);
        logisticsForm.setLayout(logisticsFormLayout);
        logisticsFormLayout.setHorizontalGroup(
            logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logisticsFormLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(productName, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(eu_po)
                    .addComponent(supplier))
                .addGap(32, 32, 32)
                .addGroup(logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(productType, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(po_ref)
                    .addComponent(quantity))
                .addGap(32, 32, 32)
                .addGroup(logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(customer)
                    .addComponent(productPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(brand))
                .addGap(32, 32, 32)
                .addGroup(logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(warranty)
                    .addComponent(dateReceived, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(productDescription))
                .addGap(32, 32, 32)
                .addGroup(logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateRelease, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(model1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(warrantyCustomer))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logisticsFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productId)
                .addGap(39, 39, 39)
                .addComponent(idOfUser)
                .addGap(161, 161, 161))
        );
        logisticsFormLayout.setVerticalGroup(
            logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logisticsFormLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(productPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(productType, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dateReceived, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dateRelease, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eu_po, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(po_ref, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(model1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(warranty, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(warrantyCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productId)
                    .addComponent(idOfUser))
                .addGap(31, 31, 31))
        );

        logisticsTable.setBackground(new java.awt.Color(238, 238, 238));
        logisticsTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        logisticsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Logistics ID", "Name", "Type", "Price", "Received", "Release", "EU_PO", "PO_REF", "Brand", "Description", "Model", "Supplier", "Quantity", "Customer", "Warranty", "Wnty Customer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        logisticsTable.getTableHeader().setReorderingAllowed(false);
        logisticsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logisticsTableMouseClicked(evt);
            }
        });
        logisticsTableScrollPanel.setViewportView(logisticsTable);
        if (logisticsTable.getColumnModel().getColumnCount() > 0) {
            logisticsTable.getColumnModel().getColumn(0).setResizable(false);
            logisticsTable.getColumnModel().getColumn(1).setResizable(false);
            logisticsTable.getColumnModel().getColumn(2).setResizable(false);
            logisticsTable.getColumnModel().getColumn(2).setPreferredWidth(50);
            logisticsTable.getColumnModel().getColumn(3).setResizable(false);
            logisticsTable.getColumnModel().getColumn(3).setPreferredWidth(50);
            logisticsTable.getColumnModel().getColumn(4).setResizable(false);
            logisticsTable.getColumnModel().getColumn(5).setResizable(false);
            logisticsTable.getColumnModel().getColumn(6).setResizable(false);
            logisticsTable.getColumnModel().getColumn(6).setPreferredWidth(65);
            logisticsTable.getColumnModel().getColumn(7).setResizable(false);
            logisticsTable.getColumnModel().getColumn(7).setPreferredWidth(70);
            logisticsTable.getColumnModel().getColumn(8).setResizable(false);
            logisticsTable.getColumnModel().getColumn(8).setPreferredWidth(55);
            logisticsTable.getColumnModel().getColumn(9).setResizable(false);
            logisticsTable.getColumnModel().getColumn(9).setPreferredWidth(90);
            logisticsTable.getColumnModel().getColumn(10).setResizable(false);
            logisticsTable.getColumnModel().getColumn(10).setPreferredWidth(55);
            logisticsTable.getColumnModel().getColumn(11).setResizable(false);
            logisticsTable.getColumnModel().getColumn(11).setPreferredWidth(65);
            logisticsTable.getColumnModel().getColumn(12).setResizable(false);
            logisticsTable.getColumnModel().getColumn(12).setPreferredWidth(65);
            logisticsTable.getColumnModel().getColumn(13).setResizable(false);
            logisticsTable.getColumnModel().getColumn(14).setResizable(false);
            logisticsTable.getColumnModel().getColumn(14).setPreferredWidth(70);
            logisticsTable.getColumnModel().getColumn(15).setResizable(false);
            logisticsTable.getColumnModel().getColumn(15).setPreferredWidth(90);
        }

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

        logisticUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Logistic User" }));
        logisticUser.setBorder(null);
        logisticUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logisticUserActionPerformed(evt);
            }
        });

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
                        .addComponent(logisticUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(searchButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logisticsTableScrollPanel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(logisticsForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clearButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(updateButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addButoon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deleteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navigationBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logisticUser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(logisticsTableScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(addButoon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(logisticsForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void homeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeIconMouseClicked
        Frame frame = new Frame();
        frame.viewFrame("Client.Dashboard", "Inventory System");
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.dispose();
    }//GEN-LAST:event_homeIconMouseClicked

    private void addButoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButoonActionPerformed
        if(session.getUserType().equals("Admin")){
            JOptionPane.showMessageDialog(null, "You can't add logistics.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if(dateReceived.getDate()==null || dateRelease.getDate()==null||
                brand.getText().equals("")||customer.getText().equals("")||
                eu_po.getText().equals("")||
                model1.getText().equals("")||po_ref.getText().equals("")||
                supplier.getText().equals("")||productDescription.getText().equals("")||
                productName.getText().equals("")|| productPrice.getText().equals("") ||
                productType.getText().equals("") ||  quantity.getText().equals("") ||
                warranty.getText().equals("")||  warrantyCustomer.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please fill out all the fields.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {

                try{
                    int quantityValue = Integer.parseInt(quantity.getText());
                    
                    try{
                        double price= Double.parseDouble(productPrice.getText());

                        String receive = sdf.format(dateReceived.getDate());
                        String release = sdf.format(dateRelease.getDate());

                        boolean isAdded = qry.addLogistic(
                        productName.getText(),
                        productType.getText(),
                        price,
                        receive,
                        release,
                        eu_po.getText(),
                        po_ref.getText(),
                        brand.getText(),
                        productDescription.getText(),
                        model1.getText(),
                        supplier.getText(),
                        quantityValue,
                        customer.getText(),
                        warranty.getText(),
                        warrantyCustomer.getText(),
                        userID
                        );
                        if(isAdded){
                            JOptionPane.showMessageDialog(new JFrame(), "Logistic added.", "Success", JOptionPane.INFORMATION_MESSAGE);
                            getLogistic(userID);
                            clear();
                        }else{
                            JOptionPane.showMessageDialog(null, "Server error.", "Error", JOptionPane.ERROR_MESSAGE);JOptionPane.showMessageDialog(null, "Server error.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                       

                    }catch(Exception error){
                        JOptionPane.showMessageDialog(null, "Prices must be a decimal or an integer.", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                }catch(Exception error){
                    JOptionPane.showMessageDialog(null, "The quantity must be an integer.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        }
    }//GEN-LAST:event_addButoonActionPerformed

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

    private void logisticUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logisticUserActionPerformed
         String selectedItem = logisticUser.getSelectedItem().toString();
        if (selectedItem.equals("My Data")) {
            getLogistic(userID);
            addButoon.setEnabled(true);
            textFieldStatus(true);
            clear();
        } else {
            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(selectedItem);

            if (matcher.find()) {
                String integerString = matcher.group();
                int intValue = Integer.parseInt(integerString);

                getLogistic(intValue);
            } else {
                // Handle the case where no integer was found in the selectedItem
            }
        }
    }//GEN-LAST:event_logisticUserActionPerformed

    private void logisticsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logisticsTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) logisticsTable.getModel();
        int selectedRows = logisticsTable.getSelectedRow();

        productId.setText(model.getValueAt(selectedRows, 0).toString());
        int id = Integer.parseInt(productId.getText());

        addButoon.setEnabled(false);

        Server.Queries qry = new Server.Queries();
        List<LogisticData> data = qry.getLogisticData(id, "logistic");

        LogisticData item = data.get(0);
        int userid = item.getUserId();
        double price = item.getPrice();
        int qnty = item.getQuantity();
        dateReceived.setDate(item.getDateReceived());
        dateRelease.setDate(item.getDateRelease());
        brand.setText(item.getBrand());
        customer.setText(item.getCustomer());
        eu_po.setText(item.getEuPoNumber());
        po_ref.setText(item.getPoRefNumber());
        model1.setText(item.getModel());
        productDescription.setText(item.getPDesc());
        productName.setText(item.getName());
        productPrice.setText(String.valueOf(price));
        productType.setText(item.getType());
        quantity.setText(String.valueOf(qnty));
        supplier.setText(item.getSupplier());
        warranty.setText(item.getWarranty());
        warrantyCustomer.setText(item.getWarrantyCustomer());
        idOfUser.setText(String.valueOf(userid));

        if (session.getUserType().equals("Admin")) {
            updateButton.setEnabled(true);
            deleteButton.setEnabled(true);
        } else {
            if (userID == userid) {
                updateButton.setEnabled(true);
                clearButton.setEnabled(false);
            } else {
                updateButton.setEnabled(false);
                clearButton.setEnabled(false);
               textFieldStatus(false);
            }
        }
    }//GEN-LAST:event_logisticsTableMouseClicked

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
      int decision = JOptionPane.showConfirmDialog(new JFrame(), "Are you sure you want to delete?", "Confirmation", JOptionPane.YES_NO_OPTION);
      
        if (decision == JOptionPane.YES_OPTION) {
            int id = Integer.parseInt(productId.getText());
            boolean isDeleted = qry.deleteLogistic(id);
            if(isDeleted){
                JOptionPane.showMessageDialog(new JFrame(), "Logistic deleted.", "Success", JOptionPane.INFORMATION_MESSAGE);
                int id1 = Integer.parseInt(idOfUser.getText());
                getLogistic(id1);
                clear();
            }else{
                JOptionPane.showMessageDialog(null, "Server error.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if(dateReceived.getDate()==null || dateRelease.getDate()==null||
            brand.getText().equals("")||customer.getText().equals("")||
            eu_po.getText().equals("")||
            model1.getText().equals("")||po_ref.getText().equals("")||
            supplier.getText().equals("")||productDescription.getText().equals("")||
            productName.getText().equals("")|| productPrice.getText().equals("") ||
            productType.getText().equals("") ||  quantity.getText().equals("") ||
            warranty.getText().equals("")||  warrantyCustomer.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill out all the fields.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            try{
                int quantityValue = Integer.parseInt(quantity.getText());

                try{
                    double price= Double.parseDouble(productPrice.getText());

                    String receive = sdf.format(dateReceived.getDate());
                    String release = sdf.format(dateRelease.getDate());
                    int id = Integer.parseInt( productId.getText());

                    boolean isUpdated = qry.updateLogistic(
                    id,
                    productName.getText(),
                    productType.getText(),
                    price,
                    receive,
                    release,
                    eu_po.getText(),
                    po_ref.getText(),
                    brand.getText(),
                    productDescription.getText(),
                    model1.getText(),
                    supplier.getText(),
                    quantityValue,
                    customer.getText(),
                    warranty.getText(),
                    warrantyCustomer.getText()
                    );
                    if(isUpdated){
                        JOptionPane.showMessageDialog(new JFrame(), "Logistic updated.", "Success", JOptionPane.INFORMATION_MESSAGE);
                        int id1 = Integer.parseInt(idOfUser.getText());

                        if(userType.equals("Admin")){
                             getLogistic(id1);
                        }else{
                             getLogistic(userID);
                        }

                        clear();
                    }else{
                        JOptionPane.showMessageDialog(null, "Server error.", "Error", JOptionPane.ERROR_MESSAGE);
                    } 
                    

                } catch(Exception error){
                    JOptionPane.showMessageDialog(null, "Prices must be a decimal or an integer.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch(Exception error){
                JOptionPane.showMessageDialog(null, "The quantity must be an integer.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void userManagementIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userManagementIconMouseClicked
        Frame frame = new Frame();
        frame.viewFrame("Client.UserManagement", "Inventory System");
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.dispose();
    }//GEN-LAST:event_userManagementIconMouseClicked

    private void salesInquiryIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesInquiryIconMouseClicked
        Frame frame = new Frame();
        frame.viewFrame("Client.SalesInquiry", "Inventory System");
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.dispose();
    }//GEN-LAST:event_salesInquiryIconMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButoon;
    private javax.swing.JTextField brand;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField customer;
    private com.toedter.calendar.JDateChooser dateReceived;
    private com.toedter.calendar.JDateChooser dateRelease;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField eu_po;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JLabel idOfUser;
    private javax.swing.JComboBox<String> logisticUser;
    private javax.swing.JPanel logisticsForm;
    private javax.swing.JTable logisticsTable;
    private javax.swing.JScrollPane logisticsTableScrollPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoutButton;
    private javax.swing.JTextField model1;
    private javax.swing.JPanel navigationBar;
    private javax.swing.JLabel navigationBarTitle;
    private javax.swing.JTextField po_ref;
    private javax.swing.JTextField productDescription;
    private javax.swing.JLabel productId;
    private javax.swing.JTextField productName;
    private javax.swing.JTextField productPrice;
    private javax.swing.JTextField productType;
    private javax.swing.JTextField quantity;
    private javax.swing.JLabel salesInquiryIcon;
    private javax.swing.JTextField searchBox;
    private javax.swing.JLabel searchButton;
    private javax.swing.JTextField supplier;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel userManagementIcon;
    private javax.swing.JTextField warranty;
    private javax.swing.JTextField warrantyCustomer;
    // End of variables declaration//GEN-END:variables
}
