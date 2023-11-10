package Client;

import Server.Frame;
import java.awt.Color;
import java.awt.Font;
import java.text.NumberFormat;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;

public class Dashboard extends javax.swing.JPanel {
        Server.Queries query = new Server.Queries();
    public Dashboard() {
        initComponents();
        
        salesTable.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 14));
        salesTable.getTableHeader().setBackground(new Color(51,102,153));
        salesTable.getTableHeader().setForeground(new Color(255,255,255));
        salesTable.getTableHeader().setOpaque(false);
        salesTable.setRowHeight(50);
        
        logisticTable.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 14));
        logisticTable.getTableHeader().setBackground(new Color(51,102,153));
        logisticTable.getTableHeader().setForeground(new Color(255,255,255));
        logisticTable.getTableHeader().setOpaque(false);
        logisticTable.setRowHeight(50);
        
        int totalCount = query.getTotalInquiry();
        double totalSaleAmount = query.getTotalAmount();
        int totalStocksValue = query.getTotalStocks();
        double totalPriceValue = query.getTotallogisticAmount();
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        String formattedTotalSaleAmount = currencyFormat.format(totalSaleAmount);
        String formattedTotalPrice  = currencyFormat.format(totalPriceValue);
        totalInquiry.setText(String.valueOf(totalCount));
        totalSales.setText(String.valueOf( formattedTotalSaleAmount));
        totalStocks.setText(String.valueOf(totalStocksValue));
        totalPrice.setText(String.valueOf( formattedTotalPrice));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navigationBar = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        logoutButton = new javax.swing.JLabel();
        dashboardIcon = new javax.swing.JLabel();
        logisticIcon = new javax.swing.JLabel();
        salesInquiryIcon1 = new javax.swing.JLabel();
        userManagementIcon1 = new javax.swing.JLabel();
        logisticTableScrollPanel = new javax.swing.JScrollPane();
        logisticTable = new javax.swing.JTable();
        totalStocksDashboard = new javax.swing.JPanel();
        totalStocksLabel = new javax.swing.JLabel();
        totalStocks = new javax.swing.JLabel();
        totalPriceDashboard = new javax.swing.JPanel();
        totalPriceLabel = new javax.swing.JLabel();
        totalPrice = new javax.swing.JLabel();
        totalInquiryDashboard = new javax.swing.JPanel();
        totalInquiryLabel = new javax.swing.JLabel();
        totalInquiry = new javax.swing.JLabel();
        totalSalesDashboard = new javax.swing.JPanel();
        totalSalesLabel = new javax.swing.JLabel();
        totalSales = new javax.swing.JLabel();
        salesTableScrollPanel = new javax.swing.JScrollPane();
        salesTable = new javax.swing.JTable();

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

        dashboardIcon.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        dashboardIcon.setForeground(new java.awt.Color(255, 255, 255));
        dashboardIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Navigation Bar/dashboard.png"))); // NOI18N
        dashboardIcon.setText("DASHBOARD");
        dashboardIcon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        logisticIcon.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        logisticIcon.setForeground(new java.awt.Color(255, 255, 255));
        logisticIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Navigation Bar/logistics.png"))); // NOI18N
        logisticIcon.setText("LOGISTICS");
        logisticIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logisticIconMouseClicked(evt);
            }
        });

        salesInquiryIcon1.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        salesInquiryIcon1.setForeground(new java.awt.Color(255, 255, 255));
        salesInquiryIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Navigation Bar/sales-inquiry.png"))); // NOI18N
        salesInquiryIcon1.setText("SALES INQUIRY");
        salesInquiryIcon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesInquiryIcon1MouseClicked(evt);
            }
        });

        userManagementIcon1.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        userManagementIcon1.setForeground(new java.awt.Color(255, 255, 255));
        userManagementIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Navigation Bar/user-management.png"))); // NOI18N
        userManagementIcon1.setText("USER MANAGEMENT");
        userManagementIcon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userManagementIcon1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout navigationBarLayout = new javax.swing.GroupLayout(navigationBar);
        navigationBar.setLayout(navigationBarLayout);
        navigationBarLayout.setHorizontalGroup(
            navigationBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigationBarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(logo)
                .addGap(290, 290, 290)
                .addComponent(dashboardIcon)
                .addGap(20, 20, 20)
                .addComponent(userManagementIcon1)
                .addGap(20, 20, 20)
                .addComponent(salesInquiryIcon1)
                .addGap(20, 20, 20)
                .addComponent(logisticIcon)
                .addGap(290, 290, 290)
                .addComponent(logoutButton)
                .addGap(20, 20, 20))
        );
        navigationBarLayout.setVerticalGroup(
            navigationBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(navigationBarLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(navigationBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dashboardIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userManagementIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salesInquiryIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logisticIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        logisticTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Logistic User", "Number of Stock Handled", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        logisticTable.setFocusable(false);
        logisticTable.setGridColor(new java.awt.Color(255, 255, 255));
        logisticTable.setRowHeight(35);
        logisticTable.setRowMargin(2);
        logisticTable.getTableHeader().setReorderingAllowed(false);
        logisticTableScrollPanel.setViewportView(logisticTable);
        if (logisticTable.getColumnModel().getColumnCount() > 0) {
            logisticTable.getColumnModel().getColumn(0).setResizable(false);
            logisticTable.getColumnModel().getColumn(1).setResizable(false);
            logisticTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            logisticTable.getColumnModel().getColumn(2).setResizable(false);
        }

        totalStocksDashboard.setBackground(new java.awt.Color(255, 255, 255));

        totalStocksLabel.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        totalStocksLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalStocksLabel.setText("TOTAL STOCKS");

        totalStocks.setFont(new java.awt.Font("sansserif", 1, 40)); // NOI18N
        totalStocks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalStocks.setText("138");

        javax.swing.GroupLayout totalStocksDashboardLayout = new javax.swing.GroupLayout(totalStocksDashboard);
        totalStocksDashboard.setLayout(totalStocksDashboardLayout);
        totalStocksDashboardLayout.setHorizontalGroup(
            totalStocksDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalStocksDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(totalStocksDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalStocksLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(totalStocks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        totalStocksDashboardLayout.setVerticalGroup(
            totalStocksDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalStocksDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totalStocksLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalStocks, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        totalPriceDashboard.setBackground(new java.awt.Color(255, 255, 255));

        totalPriceLabel.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        totalPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalPriceLabel.setText("TOTAL PRICE");

        totalPrice.setFont(new java.awt.Font("sansserif", 1, 40)); // NOI18N
        totalPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalPrice.setText("10894.55");

        javax.swing.GroupLayout totalPriceDashboardLayout = new javax.swing.GroupLayout(totalPriceDashboard);
        totalPriceDashboard.setLayout(totalPriceDashboardLayout);
        totalPriceDashboardLayout.setHorizontalGroup(
            totalPriceDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalPriceDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(totalPriceDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                .addContainerGap())
        );
        totalPriceDashboardLayout.setVerticalGroup(
            totalPriceDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalPriceDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totalPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        totalInquiryDashboard.setBackground(new java.awt.Color(255, 255, 255));

        totalInquiryLabel.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        totalInquiryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalInquiryLabel.setText("TOTAL INQUIRY");

        totalInquiry.setFont(new java.awt.Font("sansserif", 1, 40)); // NOI18N
        totalInquiry.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalInquiry.setText("138");

        javax.swing.GroupLayout totalInquiryDashboardLayout = new javax.swing.GroupLayout(totalInquiryDashboard);
        totalInquiryDashboard.setLayout(totalInquiryDashboardLayout);
        totalInquiryDashboardLayout.setHorizontalGroup(
            totalInquiryDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalInquiryDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(totalInquiryDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalInquiryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(totalInquiry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        totalInquiryDashboardLayout.setVerticalGroup(
            totalInquiryDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalInquiryDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totalInquiryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalInquiry, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        totalSalesDashboard.setBackground(new java.awt.Color(255, 255, 255));

        totalSalesLabel.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        totalSalesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalSalesLabel.setText("TOTAL SALES");

        totalSales.setFont(new java.awt.Font("sansserif", 1, 40)); // NOI18N
        totalSales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalSales.setText("10894.55");

        javax.swing.GroupLayout totalSalesDashboardLayout = new javax.swing.GroupLayout(totalSalesDashboard);
        totalSalesDashboard.setLayout(totalSalesDashboardLayout);
        totalSalesDashboardLayout.setHorizontalGroup(
            totalSalesDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalSalesDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(totalSalesDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalSalesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalSales, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                .addContainerGap())
        );
        totalSalesDashboardLayout.setVerticalGroup(
            totalSalesDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalSalesDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totalSalesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalSales, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        salesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sales User", "Total Sales"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        salesTable.setFocusable(false);
        salesTable.setGridColor(new java.awt.Color(255, 255, 255));
        salesTable.setRowHeight(35);
        salesTable.setRowMargin(2);
        salesTable.getTableHeader().setReorderingAllowed(false);
        salesTableScrollPanel.setViewportView(salesTable);
        if (salesTable.getColumnModel().getColumnCount() > 0) {
            salesTable.getColumnModel().getColumn(0).setResizable(false);
            salesTable.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navigationBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(totalInquiryDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(totalSalesDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(salesTableScrollPanel))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(totalStocksDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(totalPriceDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(logisticTableScrollPanel))
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navigationBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logisticTableScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalStocksDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalPriceDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalInquiryDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalSalesDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(salesTableScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
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

    private void logisticIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logisticIconMouseClicked
        Frame frame = new Frame();
        frame.viewFrame("Client.Logistics", "Inventory System");
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.dispose();
    }//GEN-LAST:event_logisticIconMouseClicked

    private void salesInquiryIcon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesInquiryIcon1MouseClicked
        Frame frame = new Frame();
        frame.viewFrame("Client.SalesInquiry", "Inventory System");
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.dispose();
    }//GEN-LAST:event_salesInquiryIcon1MouseClicked

    private void userManagementIcon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userManagementIcon1MouseClicked
        Frame frame = new Frame();
        frame.viewFrame("Client.UserManagement", "Inventory System");
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.dispose();
    }//GEN-LAST:event_userManagementIcon1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dashboardIcon;
    private javax.swing.JLabel logisticIcon;
    private javax.swing.JTable logisticTable;
    private javax.swing.JScrollPane logisticTableScrollPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoutButton;
    private javax.swing.JPanel navigationBar;
    private javax.swing.JLabel salesInquiryIcon1;
    private javax.swing.JTable salesTable;
    private javax.swing.JScrollPane salesTableScrollPanel;
    private javax.swing.JLabel totalInquiry;
    private javax.swing.JPanel totalInquiryDashboard;
    private javax.swing.JLabel totalInquiryLabel;
    private javax.swing.JLabel totalPrice;
    private javax.swing.JPanel totalPriceDashboard;
    private javax.swing.JLabel totalPriceLabel;
    private javax.swing.JLabel totalSales;
    private javax.swing.JPanel totalSalesDashboard;
    private javax.swing.JLabel totalSalesLabel;
    private javax.swing.JLabel totalStocks;
    private javax.swing.JPanel totalStocksDashboard;
    private javax.swing.JLabel totalStocksLabel;
    private javax.swing.JLabel userManagementIcon1;
    // End of variables declaration//GEN-END:variables
}
