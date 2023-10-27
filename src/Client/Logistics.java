package Client;

import Server.Frame;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import Server.UserSession;

public class Logistics extends javax.swing.JPanel {
    
     UserSession session = UserSession.getInstance();

    public Logistics() {
        initComponents();
        
         if(!session.getUserType().equals("Admin")){
            homeIcon.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navigationBar = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        userIcon = new javax.swing.JLabel();
        navigationBarTitle = new javax.swing.JLabel();
        homeIcon = new javax.swing.JLabel();
        logisticsForm = new javax.swing.JPanel();
        productName = new javax.swing.JTextField();
        productType = new javax.swing.JTextField();
        model = new javax.swing.JTextField();
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
        addButoon = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        logisticsTableScrollPanel = new javax.swing.JScrollPane();
        logisticsTable = new javax.swing.JTable();
        logisticUser = new javax.swing.JComboBox<>();

        navigationBar.setBackground(new java.awt.Color(51, 102, 153));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Navigation Bar/inventory-system-logo.png"))); // NOI18N

        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Navigation Bar/user.png"))); // NOI18N

        navigationBarTitle.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        navigationBarTitle.setForeground(new java.awt.Color(255, 255, 255));
        navigationBarTitle.setText("Logistics");

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
            .addComponent(userIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(navigationBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navigationBarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(homeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        logisticsForm.setBackground(new java.awt.Color(255, 255, 255));
        logisticsForm.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray), null));

        productName.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Product Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        productType.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Product Type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        model.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Model", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

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

        javax.swing.GroupLayout logisticsFormLayout = new javax.swing.GroupLayout(logisticsForm);
        logisticsForm.setLayout(logisticsFormLayout);
        logisticsFormLayout.setHorizontalGroup(
            logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logisticsFormLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(eu_po, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(productType, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateReceived, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateRelease, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(logisticsFormLayout.createSequentialGroup()
                        .addGroup(logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(po_ref, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(warrantyCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(logisticsFormLayout.createSequentialGroup()
                                .addGroup(logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(customer, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(warranty, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(25, 25, 25))
        );
        logisticsFormLayout.setVerticalGroup(
            logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logisticsFormLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productType, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dateReceived, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dateRelease, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(warranty, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(logisticsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eu_po, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(po_ref, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(warrantyCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        addButoon.setBackground(new java.awt.Color(51, 102, 153));
        addButoon.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        addButoon.setForeground(new java.awt.Color(255, 255, 255));
        addButoon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Buttons/add.png"))); // NOI18N
        addButoon.setText("ADD");
        addButoon.setBorder(null);
        addButoon.setFocusable(false);

        deleteButton.setBackground(new java.awt.Color(51, 102, 153));
        deleteButton.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Buttons/delete.png"))); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.setBorder(null);
        deleteButton.setFocusable(false);

        updateButton.setBackground(new java.awt.Color(51, 102, 153));
        updateButton.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Buttons/edit.png"))); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.setBorder(null);
        updateButton.setFocusable(false);

        clearButton.setBackground(new java.awt.Color(51, 102, 153));
        clearButton.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Buttons/clear.png"))); // NOI18N
        clearButton.setText("CLEAR");
        clearButton.setBorder(null);
        clearButton.setFocusable(false);

        logisticsTable.setBackground(new java.awt.Color(238, 238, 238));
        logisticsTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        logisticsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Type", "Price", "Received", "Release", "EU_PO", "PO_REF", "Brand", "Description", "Model", "Supplier", "Quantity", "Customer", "Warranty", "Wnty Customer"
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
        logisticsTableScrollPanel.setViewportView(logisticsTable);
        if (logisticsTable.getColumnModel().getColumnCount() > 0) {
            logisticsTable.getColumnModel().getColumn(0).setResizable(false);
            logisticsTable.getColumnModel().getColumn(0).setPreferredWidth(30);
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

        logisticUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Logistic User", "Logistics 1" }));
        logisticUser.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navigationBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logisticUser, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logisticsTableScrollPanel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(logisticsForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clearButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(updateButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addButoon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deleteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navigationBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(logisticUser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(logisticsTableScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(addButoon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(logisticsForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void homeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeIconMouseClicked
        Frame frame = new Frame();
        frame.viewFrame("Client.Dashboard", "Inventory System");
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.dispose();
    }//GEN-LAST:event_homeIconMouseClicked

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
    private javax.swing.JComboBox<String> logisticUser;
    private javax.swing.JPanel logisticsForm;
    private javax.swing.JTable logisticsTable;
    private javax.swing.JScrollPane logisticsTableScrollPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField model;
    private javax.swing.JPanel navigationBar;
    private javax.swing.JLabel navigationBarTitle;
    private javax.swing.JTextField po_ref;
    private javax.swing.JTextField productDescription;
    private javax.swing.JTextField productName;
    private javax.swing.JTextField productPrice;
    private javax.swing.JTextField productType;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField supplier;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel userIcon;
    private javax.swing.JTextField warranty;
    private javax.swing.JTextField warrantyCustomer;
    // End of variables declaration//GEN-END:variables
}
