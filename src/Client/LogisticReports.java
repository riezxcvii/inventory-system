package Client;

import Server.Frame;
import Server.LogisticData;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.print.PrinterException;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class LogisticReports extends javax.swing.JPanel {
    
     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
     DecimalFormat currencyFormat = new DecimalFormat("#,##0.00");

    public void getLogisticReportData(String date1, String date2) {
        Server.Queries qry = new Server.Queries();
        List<LogisticData> data = qry.getLogisticReportData(date1, date2);
        
        TableColumnModel columnModel = logisticsTable.getColumnModel();
        TableColumn columnToHide = columnModel.getColumn(0);

        columnToHide.setMinWidth(0);
        columnToHide.setMaxWidth(0);
        columnToHide.setPreferredWidth(0);

        DefaultTableModel model = (DefaultTableModel) logisticsTable.getModel();
        model.setRowCount(0);
        for (LogisticData item : data) {
            String price = currencyFormat.format( item.getPrice());
            model.addRow(new Object[]{
                item.getProductId(),
                item.getFirstName() + " " + item.getlastName(),
                item.getName(),
                item.getType(),
                "₱"+price,
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

    
    public LogisticReports() {
        initComponents();

        logisticsTable.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 13));
        logisticsTable.getTableHeader().setBackground(new Color(51, 102, 153));
        logisticsTable.getTableHeader().setForeground(new Color(255, 255, 255));
        logisticsTable.getTableHeader().setOpaque(false);
        logisticsTable.setRowHeight(35);
        
        getLogisticReportData("", "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navigationBar = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        logoutButton = new javax.swing.JLabel();
        layerPanel = new javax.swing.JPanel();
        moduleTitle = new javax.swing.JLabel();
        logisticsTableScrollPanel = new javax.swing.JScrollPane();
        logisticsTable = new javax.swing.JTable();
        printButton = new javax.swing.JButton();
        filterButton = new javax.swing.JLabel();
        toDate = new com.toedter.calendar.JDateChooser();
        toDateLabel = new javax.swing.JLabel();
        fromDate = new com.toedter.calendar.JDateChooser();
        fromDateLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(0, 0));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(1200, 600));

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
        moduleTitle.setText("Logistic Reports");

        javax.swing.GroupLayout layerPanelLayout = new javax.swing.GroupLayout(layerPanel);
        layerPanel.setLayout(layerPanelLayout);
        layerPanelLayout.setHorizontalGroup(
            layerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(moduleTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );
        layerPanelLayout.setVerticalGroup(
            layerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(moduleTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout navigationBarLayout = new javax.swing.GroupLayout(navigationBar);
        navigationBar.setLayout(navigationBarLayout);
        navigationBarLayout.setHorizontalGroup(
            navigationBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navigationBarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
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
                .addGap(11, 11, 11)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(layerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        logisticsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Logistics ID", "Logistic User", "Name", "Type", "Price", "Received", "Release", "EU_PO", "PO_REF", "Brand", "Description", "Model", "Supplier", "Quantity", "Customer", "Warranty", "Wnty Customer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        logisticsTable.setFocusable(false);
        logisticsTable.setGridColor(new java.awt.Color(255, 255, 255));
        logisticsTable.setRowHeight(35);
        logisticsTable.setRowMargin(2);
        logisticsTable.getTableHeader().setReorderingAllowed(false);
        logisticsTableScrollPanel.setViewportView(logisticsTable);
        if (logisticsTable.getColumnModel().getColumnCount() > 0) {
            logisticsTable.getColumnModel().getColumn(0).setResizable(false);
            logisticsTable.getColumnModel().getColumn(1).setResizable(false);
            logisticsTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            logisticsTable.getColumnModel().getColumn(2).setResizable(false);
            logisticsTable.getColumnModel().getColumn(3).setResizable(false);
            logisticsTable.getColumnModel().getColumn(3).setPreferredWidth(50);
            logisticsTable.getColumnModel().getColumn(4).setResizable(false);
            logisticsTable.getColumnModel().getColumn(4).setPreferredWidth(50);
            logisticsTable.getColumnModel().getColumn(5).setResizable(false);
            logisticsTable.getColumnModel().getColumn(6).setResizable(false);
            logisticsTable.getColumnModel().getColumn(7).setResizable(false);
            logisticsTable.getColumnModel().getColumn(7).setPreferredWidth(65);
            logisticsTable.getColumnModel().getColumn(8).setResizable(false);
            logisticsTable.getColumnModel().getColumn(8).setPreferredWidth(70);
            logisticsTable.getColumnModel().getColumn(9).setResizable(false);
            logisticsTable.getColumnModel().getColumn(9).setPreferredWidth(55);
            logisticsTable.getColumnModel().getColumn(10).setResizable(false);
            logisticsTable.getColumnModel().getColumn(10).setPreferredWidth(90);
            logisticsTable.getColumnModel().getColumn(11).setResizable(false);
            logisticsTable.getColumnModel().getColumn(11).setPreferredWidth(55);
            logisticsTable.getColumnModel().getColumn(12).setResizable(false);
            logisticsTable.getColumnModel().getColumn(12).setPreferredWidth(65);
            logisticsTable.getColumnModel().getColumn(13).setResizable(false);
            logisticsTable.getColumnModel().getColumn(13).setPreferredWidth(65);
            logisticsTable.getColumnModel().getColumn(14).setResizable(false);
            logisticsTable.getColumnModel().getColumn(15).setResizable(false);
            logisticsTable.getColumnModel().getColumn(15).setPreferredWidth(70);
            logisticsTable.getColumnModel().getColumn(16).setResizable(false);
            logisticsTable.getColumnModel().getColumn(16).setPreferredWidth(110);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navigationBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(698, Short.MAX_VALUE)
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
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logisticsTableScrollPanel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navigationBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(filterButton, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(toDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(toDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fromDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fromDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(logisticsTableScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        if(logisticsTable.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Nothing to print.", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(fromDate.getDate()==null || toDate.getDate() == null){
            JOptionPane.showMessageDialog(null, "Please select specific date range.", "Error", JOptionPane.ERROR_MESSAGE);

        }
        else{
            int decision = JOptionPane.showConfirmDialog(new JFrame(), "The current data in table will be printed.\nAre you sure you want to print this data?", "Confirmation", JOptionPane.YES_NO_OPTION);

            if (decision == JOptionPane.YES_OPTION) {
                try {
                    Date from = fromDate.getDate();
                    Date to = toDate.getDate();
                    LocalDate dateFrom = from.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
                    LocalDate dateTo = to.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
                    String formattedDateFrom = dateFrom.format(formatter);
                    String formattedDateTo = dateTo.format(formatter);
                        String headerText = "Logistic from "+ formattedDateFrom + " to " + formattedDateTo;
                        MessageFormat header = new MessageFormat(headerText);         
                        MessageFormat footer=new MessageFormat("Page {0,number,integer}");

                        boolean complete = logisticsTable.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
                        if (complete) {
                            JOptionPane.showMessageDialog(null, "Printed successfully");
                        } else {
                            JOptionPane.showMessageDialog(null, "Printing cancelled");
                        }
                } catch (PrinterException pe) {
                    JOptionPane.showMessageDialog(null, "Printing failed: " + pe.getMessage());
                }
            }
        }
       
    }//GEN-LAST:event_printButtonActionPerformed

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        int decision = JOptionPane.showConfirmDialog(new JFrame(), "Are you sure you want to logout?", "Confirmation", JOptionPane.YES_NO_OPTION);

        if (decision == JOptionPane.YES_OPTION) {
            Frame frame = new Frame();
            frame.viewFrame("Client.LoginPage", "Inventory System");
            JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            currentFrame.dispose();
        }
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        Frame frame = new Frame();
        frame.viewFrame("Client.Logistics", "Inventory System");
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void filterButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filterButtonMouseClicked
        String startDate, endDate;
    if(fromDate.getDate() == null && toDate.getDate()==null){
        startDate ="";
        endDate="";
        getLogisticReportData(startDate,endDate);
    }else if(fromDate.getDate()==null || toDate.getDate()==null){
        JOptionPane.showMessageDialog(null, "Please select specific date range.", "Error", JOptionPane.ERROR_MESSAGE);
    }else{
        startDate = sdf.format(fromDate.getDate());
        endDate =sdf.format(toDate.getDate());
        getLogisticReportData(startDate,endDate);
    }
    }//GEN-LAST:event_filterButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel filterButton;
    private com.toedter.calendar.JDateChooser fromDate;
    private javax.swing.JLabel fromDateLabel;
    private javax.swing.JPanel layerPanel;
    private javax.swing.JTable logisticsTable;
    private javax.swing.JScrollPane logisticsTableScrollPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoutButton;
    private javax.swing.JLabel moduleTitle;
    private javax.swing.JPanel navigationBar;
    private javax.swing.JButton printButton;
    private com.toedter.calendar.JDateChooser toDate;
    private javax.swing.JLabel toDateLabel;
    // End of variables declaration//GEN-END:variables
}
