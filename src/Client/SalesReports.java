package Client;

import Server.Frame;
import Server.InquiryData;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class SalesReports extends javax.swing.JPanel {
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public void getReportData(String date1, String date2){
        Server.Queries qry = new Server.Queries();
        List<InquiryData> data = qry.getReportData(date1, date2);
        
        TableColumnModel columnModel = salesInquiryTable.getColumnModel();
        TableColumn columnToHide = columnModel.getColumn(0);

        columnToHide.setMinWidth(0);
        columnToHide.setMaxWidth(0);
        columnToHide.setPreferredWidth(0);
        
        TableColumn columnToHide1 = columnModel.getColumn(2);

        columnToHide1.setMinWidth(0);
        columnToHide1.setMaxWidth(0);
        columnToHide1.setPreferredWidth(0);
        
        DefaultTableModel model = (DefaultTableModel) salesInquiryTable.getModel();
        model.setRowCount(0);
        for (InquiryData item : data) {
            model.addRow(new Object[]{
                item.getUserID(),
                item.getFirstName() +" " + item.getlastName(),
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
            });
        }
    }
    
    public SalesReports() {
        initComponents();

        salesInquiryTable.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 13));
        salesInquiryTable.getTableHeader().setBackground(new Color(51, 102, 153));
        salesInquiryTable.getTableHeader().setForeground(new Color(255, 255, 255));
        salesInquiryTable.getTableHeader().setOpaque(false);
        salesInquiryTable.setRowHeight(35);
        
        getReportData("","");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navigationBar = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        logoutButton = new javax.swing.JLabel();
        layerPanel = new javax.swing.JPanel();
        moduleTitle = new javax.swing.JLabel();
        salesInquiryTableScrollPanel = new javax.swing.JScrollPane();
        salesInquiryTable = new javax.swing.JTable();
        printButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        filterButton = new javax.swing.JLabel();
        toDate = new com.toedter.calendar.JDateChooser();
        toDateLabel = new javax.swing.JLabel();
        fromDate = new com.toedter.calendar.JDateChooser();
        fromDateLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(236, 242, 255));
        setMaximumSize(new java.awt.Dimension(0, 0));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(1320, 650));

        navigationBar.setBackground(new java.awt.Color(51, 102, 153));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Navigation Bar/inventory-system-logo.png"))); // NOI18N

        logoutButton.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Navigation Bar/logout.png"))); // NOI18N
        logoutButton.setText("LOGOUT");
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });

        layerPanel.setBackground(new java.awt.Color(51, 102, 153));

        moduleTitle.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        moduleTitle.setForeground(new java.awt.Color(255, 255, 255));
        moduleTitle.setText("Sales Reports");

        javax.swing.GroupLayout layerPanelLayout = new javax.swing.GroupLayout(layerPanel);
        layerPanel.setLayout(layerPanelLayout);
        layerPanelLayout.setHorizontalGroup(
            layerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(moduleTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layerPanelLayout.setVerticalGroup(
            layerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(moduleTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout navigationBarLayout = new javax.swing.GroupLayout(navigationBar);
        navigationBar.setLayout(navigationBarLayout);
        navigationBarLayout.setHorizontalGroup(
            navigationBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigationBarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(logo)
                .addGap(9, 9, 9)
                .addComponent(layerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addGap(21, 21, 21))
        );
        navigationBarLayout.setVerticalGroup(
            navigationBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigationBarLayout.createSequentialGroup()
                .addGroup(navigationBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(layerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        salesInquiryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sales User ID", "Sales User", "Sales ID", "Date", "Project / End User", "Quantity", "Description", "Supplier", "Price", "SRP", "Remarks", "Date Accomplished", "Last Update", "Deadline"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        salesInquiryTable.setFocusable(false);
        salesInquiryTable.setGridColor(new java.awt.Color(255, 255, 255));
        salesInquiryTable.setRowHeight(35);
        salesInquiryTable.setRowMargin(2);
        salesInquiryTable.getTableHeader().setReorderingAllowed(false);
        salesInquiryTableScrollPanel.setViewportView(salesInquiryTable);
        if (salesInquiryTable.getColumnModel().getColumnCount() > 0) {
            salesInquiryTable.getColumnModel().getColumn(0).setResizable(false);
            salesInquiryTable.getColumnModel().getColumn(1).setResizable(false);
            salesInquiryTable.getColumnModel().getColumn(2).setResizable(false);
            salesInquiryTable.getColumnModel().getColumn(2).setPreferredWidth(60);
            salesInquiryTable.getColumnModel().getColumn(3).setResizable(false);
            salesInquiryTable.getColumnModel().getColumn(4).setResizable(false);
            salesInquiryTable.getColumnModel().getColumn(4).setPreferredWidth(120);
            salesInquiryTable.getColumnModel().getColumn(5).setResizable(false);
            salesInquiryTable.getColumnModel().getColumn(5).setPreferredWidth(60);
            salesInquiryTable.getColumnModel().getColumn(6).setResizable(false);
            salesInquiryTable.getColumnModel().getColumn(6).setPreferredWidth(100);
            salesInquiryTable.getColumnModel().getColumn(7).setResizable(false);
            salesInquiryTable.getColumnModel().getColumn(7).setPreferredWidth(100);
            salesInquiryTable.getColumnModel().getColumn(8).setResizable(false);
            salesInquiryTable.getColumnModel().getColumn(8).setPreferredWidth(40);
            salesInquiryTable.getColumnModel().getColumn(9).setResizable(false);
            salesInquiryTable.getColumnModel().getColumn(9).setPreferredWidth(40);
            salesInquiryTable.getColumnModel().getColumn(10).setResizable(false);
            salesInquiryTable.getColumnModel().getColumn(10).setPreferredWidth(100);
            salesInquiryTable.getColumnModel().getColumn(11).setResizable(false);
            salesInquiryTable.getColumnModel().getColumn(11).setPreferredWidth(120);
            salesInquiryTable.getColumnModel().getColumn(12).setResizable(false);
            salesInquiryTable.getColumnModel().getColumn(13).setResizable(false);
        }

        printButton.setBackground(new java.awt.Color(51, 102, 153));
        printButton.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        printButton.setForeground(new java.awt.Color(255, 255, 255));
        printButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Buttons/print.png"))); // NOI18N
        printButton.setText("PRINT");
        printButton.setBorder(null);
        printButton.setFocusable(false);
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(51, 102, 153));
        backButton.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Buttons/back.png"))); // NOI18N
        backButton.setText("BACK");
        backButton.setBorder(null);
        backButton.setFocusable(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        filterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Reports/filter-check.png"))); // NOI18N
        filterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filterButtonMouseClicked(evt);
            }
        });

        toDateLabel.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        toDateLabel.setText("To");

        fromDateLabel.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        fromDateLabel.setText("From");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navigationBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(fromDateLabel)
                        .addGap(10, 10, 10)
                        .addComponent(fromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(toDateLabel)
                        .addGap(10, 10, 10)
                        .addComponent(toDate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(filterButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(salesInquiryTableScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navigationBar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(filterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(toDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(toDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fromDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fromDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(salesInquiryTableScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        int decision = JOptionPane.showConfirmDialog(new JFrame(), "Are you sure you want to logout?", "Confirmation", JOptionPane.YES_NO_OPTION);

        if (decision == JOptionPane.YES_OPTION) {
            Frame frame = new Frame();
            frame.viewFrame("Client.LoginPage", "Inventory System");
            JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            currentFrame.dispose();
        }
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed

    }//GEN-LAST:event_printButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        Frame frame = new Frame();
        frame.viewFrame("Client.SalesInquiry", "Inventory System");
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void filterButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filterButtonMouseClicked
    String startDate, endDate;
    if(fromDate.getDate() == null && toDate.getDate()==null){
        startDate ="";
        endDate="";
        getReportData(startDate,endDate);
    }else if(fromDate.getDate()==null || toDate.getDate()==null){
        JOptionPane.showMessageDialog(null, "Please select specific date range.", "Error", JOptionPane.ERROR_MESSAGE);
    }else{
        startDate = sdf.format(fromDate.getDate());
        endDate =sdf.format(toDate.getDate());
        getReportData(startDate,endDate);
    }
    }//GEN-LAST:event_filterButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel filterButton;
    private com.toedter.calendar.JDateChooser fromDate;
    private javax.swing.JLabel fromDateLabel;
    private javax.swing.JPanel layerPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoutButton;
    private javax.swing.JLabel moduleTitle;
    private javax.swing.JPanel navigationBar;
    private javax.swing.JButton printButton;
    private javax.swing.JTable salesInquiryTable;
    private javax.swing.JScrollPane salesInquiryTableScrollPanel;
    private com.toedter.calendar.JDateChooser toDate;
    private javax.swing.JLabel toDateLabel;
    // End of variables declaration//GEN-END:variables
}
