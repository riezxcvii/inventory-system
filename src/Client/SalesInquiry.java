package Client;

import Server.Frame;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import Server.InquiryData;
import Server.UserData;
import Server.UserSession;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import Server.SearchInTable;

public class SalesInquiry extends javax.swing.JPanel {

    Server.Queries qry = new Server.Queries();

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    UserSession session = UserSession.getInstance();
    int userID = session.getUserID();

    public void getInquiry(int id) {
        Server.Queries qry = new Server.Queries();
        List<InquiryData> data = qry.getInquiryData(id, "user");

        TableColumnModel columnModel = salesInquiryTable.getColumnModel();
        TableColumn columnToHide = columnModel.getColumn(12);

        columnToHide.setMinWidth(0);
        columnToHide.setMaxWidth(0);
        columnToHide.setPreferredWidth(0);

        DefaultTableModel model = (DefaultTableModel) salesInquiryTable.getModel();
        model.setRowCount(0);
        for (InquiryData item : data) {
            model.addRow(new Object[]{
                item.getSalesId(),
                item.getIDate(),
                item.getIProject(),
                item.getIQuantity(),
                item.getIDescription(),
                item.getISupplier(),
                item.getISupplierPrice(),
                item.getISrp(),
                item.getIRemarks(),
                item.getIDateAccomplished(),
                item.getILastUpdate(),
                item.getIDeadline(),
                item.getUserID()
            });
        }
    }

    public void clear() {
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

    public void textFieldStatus(boolean status) {
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

        if (!session.getUserType().equals("Admin")) {
            homeIcon.setVisible(false);
            logisticIcon.setVisible(false);
            userManagementIcon.setVisible(false);
        }

        if (session.getUserType().equals("Sales")) {
            salesUser.addItem("My Inquiry");
        }else if(session.getUserType().equals("Admin")){
            salesUser.addItem("Select Sales User");
        }else{
            
        }
        
        Server.Queries qry = new Server.Queries();
        List<UserData> data = qry.getUserData(0, userID, "Sales");

        for (UserData item : data) {
            int id = item.getUserId();
            String first = item.getFirst();
            String last = item.getLast();
            salesUser.addItem(id + " " + first + " " + last);
        }

        getInquiry(userID);
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
        userManagementIcon = new javax.swing.JLabel();
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
        searchBox = new javax.swing.JTextField();
        searchButton = new javax.swing.JLabel();

        setBackground(new java.awt.Color(236, 242, 255));
        setMaximumSize(new java.awt.Dimension(0, 0));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(1320, 650));

        navigationBar.setBackground(new java.awt.Color(51, 102, 153));

        navigationBarTitle.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        navigationBarTitle.setForeground(new java.awt.Color(255, 255, 255));
        navigationBarTitle.setText("Sales Inquiry");

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

        userManagementIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Navigation Bar/user-management.png"))); // NOI18N
        userManagementIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userManagementIconMouseClicked(evt);
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
                .addComponent(logisticIcon)
                .addGap(20, 20, 20)
                .addComponent(homeIcon)
                .addGap(20, 20, 20)
                .addComponent(logoutButton)
                .addGap(20, 20, 20))
        );
        navigationBarLayout.setVerticalGroup(
            navigationBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addComponent(navigationBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navigationBarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(navigationBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userManagementIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logisticIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(homeIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)))
        );

        salesInquiryForm.setBackground(new java.awt.Color(255, 255, 255));
        salesInquiryForm.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray), null));

        project.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 2, true), "Project / End User", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

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
                .addGap(30, 30, 30)
                .addGroup(salesInquiryFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(supplier, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(dateAccomplished, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(salesInquiryFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(project)
                    .addComponent(supplierPrice)
                    .addComponent(lastUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(salesInquiryFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Quantity)
                    .addComponent(srp)
                    .addComponent(deadline, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(salesInquiryFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(salesInquiryFormLayout.createSequentialGroup()
                        .addComponent(salesId)
                        .addGap(18, 18, 18)
                        .addComponent(idOfUser))
                    .addComponent(description, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(remarks))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        salesInquiryFormLayout.setVerticalGroup(
            salesInquiryFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salesInquiryFormLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(salesInquiryFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(salesInquiryFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(project, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(salesInquiryFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supplierPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(srp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(remarks, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(salesInquiryFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(salesInquiryFormLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(salesInquiryFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateAccomplished, javax.swing.GroupLayout.PREFERRED_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(lastUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(deadline, javax.swing.GroupLayout.PREFERRED_SIZE, 45, Short.MAX_VALUE))
                        .addGap(30, 30, 30))
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
                "Sales ID", "Date", "Project / End User", "Quantity", "Description", "Supplier", "Price", "SRP", "Remarks", "Date Accomplished", "Last Update", "Deadline", "User ID"
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
            salesInquiryTable.getColumnModel().getColumn(9).setPreferredWidth(100);
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

        salesUser.setBorder(null);
        salesUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesUserActionPerformed(evt);
            }
        });

        searchBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 153), 1, true));
        searchBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBoxKeyReleased(evt);
            }
        });

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Search Bar/search.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(salesInquiryTableScrollPanel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(salesInquiryForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clearButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addButoon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(salesUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(searchButton)))
                .addGap(20, 20, 20))
            .addComponent(navigationBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navigationBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salesUser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(salesInquiryTableScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(addButoon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
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
        clear();
        updateButton.setEnabled(false);
        deleteButton.setEnabled(false);
        
        if (selectedItem.equals("My Inquiry") || selectedItem.equals("Select Sales User")) {
            getInquiry(userID);
            addButoon.setEnabled(true);
            textFieldStatus(true);
            clearButton.setEnabled(true);
        }else {
            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(selectedItem);

            if (matcher.find()) {
                String integerString = matcher.group();
                int intValue = Integer.parseInt(integerString);

                getInquiry(intValue);
                clearButton.setEnabled(false);
                addButoon.setEnabled(false);
                textFieldStatus(false);
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

        Server.Queries qry = new Server.Queries();
        List<InquiryData> data = qry.getInquiryData(id, "sale");

        InquiryData item = data.get(0);
        int userid = item.getUserID();
        double dSrp = item.getISrp();
        int qnty = item.getIQuantity();
        double sprice = item.getISupplierPrice();
        date.setDate(item.getIDate());
        dateAccomplished.setDate(item.getIDateAccomplished());
        deadline.setDate(item.getIDeadline());
        srp.setText(String.valueOf(dSrp));
        supplier.setText(item.getISupplier());
        supplierPrice.setText(String.valueOf(sprice));
        Quantity.setText(String.valueOf(qnty));
        lastUpdate.setDate(item.getILastUpdate());
        description.setText(item.getIDescription());
        project.setText(item.getIProject());
        remarks.setText(item.getIRemarks());
        idOfUser.setText(String.valueOf(userid));

        if (session.getUserType().equals("Admin")) {
            updateButton.setEnabled(true);
            deleteButton.setEnabled(true);
            textFieldStatus(true);
        } else {
            if (userID == userid) {
                textFieldStatus(true);
                addButoon.setEnabled(false);
                updateButton.setEnabled(true);
                dateAccomplished.setEnabled(false);
                deadline.setEnabled(false);
                srp.setEnabled(false);
                supplier.setEnabled(false);
                supplierPrice.setEnabled(false);
                lastUpdate.setEnabled(false);
                remarks.setEnabled(false);
                clearButton.setEnabled(false);
            } else {
                updateButton.setEnabled(false);
                clearButton.setEnabled(false);
                textFieldStatus(false);
            }
        }
    }//GEN-LAST:event_salesInquiryTableMouseClicked

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int decision = JOptionPane.showConfirmDialog(new JFrame(), "Are you sure you want to delete?", "Confirmation", JOptionPane.YES_NO_OPTION);
        
        if (decision == JOptionPane.YES_OPTION) {
            int id = Integer.parseInt(salesId.getText());
            boolean isDeleted = qry.deleteInquiry(id);
            if(isDeleted){
               JOptionPane.showMessageDialog(new JFrame(), "Sales inquiry deleted.", "Success", JOptionPane.INFORMATION_MESSAGE);
               int id1 = Integer.parseInt(idOfUser.getText());
               getInquiry(id1);
               clear();
            }else{
               JOptionPane.showMessageDialog(null, "Server error.", "Error", JOptionPane.ERROR_MESSAGE);
            }
           
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void addButoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButoonActionPerformed
        if (session.getUserType().equals("Admin")) {
            JOptionPane.showMessageDialog(null, "You can't add a sales inquiry.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (date.getDate() == null || dateAccomplished.getDate() == null || deadline.getDate() == null || lastUpdate.getDate() == null
                    || Quantity.getText().equals("") || description.getText().equals("") || project.getText().equals("")
                    || remarks.getText().equals("") || srp.getText().equals("") || supplier.getText().equals("") || supplierPrice.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill out all the fields.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {

                try {
                    int quantityValue = Integer.parseInt(Quantity.getText());
                    
                    try {
                        double srpValue = Double.parseDouble(srp.getText());
                        double supplierpriceValue = Double.parseDouble(supplierPrice.getText());

                        String fdate = sdf.format(date.getDate());
                        String fdateAccom = sdf.format(dateAccomplished.getDate());
                        String fdeadline = sdf.format(deadline.getDate());
                        String flastUpdate = sdf.format(lastUpdate.getDate());

                        boolean isAdded = qry.addInquiry(fdate,
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
                        if(isAdded){
                            JOptionPane.showMessageDialog(new JFrame(), "Inquiry added.", "Success", JOptionPane.INFORMATION_MESSAGE);
                            getInquiry(userID);
                            clear();
                        }else{
                            JOptionPane.showMessageDialog(null, "Server error.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        

                    } catch (Exception error) {
                        JOptionPane.showMessageDialog(null, "Prices must be a decimal or an integer.", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                } catch (Exception error) {
                    JOptionPane.showMessageDialog(null, "The quantity must be an integer.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        }
    }//GEN-LAST:event_addButoonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if (date.getDate() == null || dateAccomplished.getDate() == null || deadline.getDate() == null || lastUpdate.getDate() == null
                || Quantity.getText().equals("") || description.getText().equals("") || project.getText().equals("")
                || remarks.getText().equals("") || srp.getText().equals("") || supplier.getText().equals("") || supplierPrice.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill out all the fields.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            try {
                int quantityValue = Integer.parseInt(Quantity.getText());
                try {
                    int id = Integer.parseInt(salesId.getText());
                    double srpValue = Double.parseDouble(srp.getText());
                    double supplierpriceValue = Double.parseDouble(supplierPrice.getText());

                    String fdate = sdf.format(date.getDate());
                    String fdateAccom = sdf.format(dateAccomplished.getDate());
                    String fdeadline = sdf.format(deadline.getDate());
                    String flastUpdate = sdf.format(lastUpdate.getDate());

                    boolean isUpdated = qry.updateInquiry(
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
                    if(isUpdated){
                        int id1 = Integer.parseInt(idOfUser.getText());
                        JOptionPane.showMessageDialog(new JFrame(), "Sales inquiry updated.", "Success", JOptionPane.INFORMATION_MESSAGE);
                        getInquiry(id1);
                        clear();
                        textFieldStatus(true);
                    }else{
                        JOptionPane.showMessageDialog(null, "Server error.", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                } catch (Exception error) {
                    JOptionPane.showMessageDialog(null, "Prices must be a decimal or an integer.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (Exception error) {
                JOptionPane.showMessageDialog(null, "The quantity must be an integer.", "Error", JOptionPane.ERROR_MESSAGE);
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

    private void logisticIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logisticIconMouseClicked
        Frame frame = new Frame();
        frame.viewFrame("Client.Logistics", "Inventory System");
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.dispose();
    }//GEN-LAST:event_logisticIconMouseClicked

    private void userManagementIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userManagementIconMouseClicked
        Frame frame = new Frame();
        frame.viewFrame("Client.UserManagement", "Inventory System");
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.dispose();
    }//GEN-LAST:event_userManagementIconMouseClicked

    private void searchBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBoxKeyReleased
        SearchInTable search = new SearchInTable();
        String searchText = searchBox.getText();
        search.search(searchText, salesInquiryTable);
    }//GEN-LAST:event_searchBoxKeyReleased

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
    private javax.swing.JLabel logisticIcon;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoutButton;
    private javax.swing.JPanel navigationBar;
    private javax.swing.JLabel navigationBarTitle;
    private javax.swing.JTextField project;
    private javax.swing.JTextField remarks;
    private javax.swing.JLabel salesId;
    private javax.swing.JPanel salesInquiryForm;
    private javax.swing.JTable salesInquiryTable;
    private javax.swing.JScrollPane salesInquiryTableScrollPanel;
    private javax.swing.JComboBox<String> salesUser;
    private javax.swing.JTextField searchBox;
    private javax.swing.JLabel searchButton;
    private javax.swing.JTextField srp;
    private javax.swing.JTextField supplier;
    private javax.swing.JTextField supplierPrice;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel userManagementIcon;
    // End of variables declaration//GEN-END:variables
}
