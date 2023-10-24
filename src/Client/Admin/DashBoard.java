
package Client.Admin;

public class Dashboard extends javax.swing.JPanel {

    public Dashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashboardPanel = new javax.swing.JPanel();
        navigationBar = new javax.swing.JPanel();
        navigationBarTitle = new javax.swing.JLabel();
        userManagement = new javax.swing.JPanel();
        userManagementIcon = new javax.swing.JPanel();
        userManagementButton = new javax.swing.JButton();
        salesInquiry = new javax.swing.JPanel();
        salesInquiryIcon = new javax.swing.JPanel();
        salesInquiryButton = new javax.swing.JButton();
        logistics = new javax.swing.JPanel();
        logisticsIcon = new javax.swing.JPanel();
        logisticsButton = new javax.swing.JButton();

        dashboardPanel.setBackground(new java.awt.Color(236, 242, 255));

        navigationBar.setBackground(new java.awt.Color(51, 102, 153));

        navigationBarTitle.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        navigationBarTitle.setForeground(new java.awt.Color(255, 255, 255));
        navigationBarTitle.setText("Inventory System - Dashboard");

        javax.swing.GroupLayout navigationBarLayout = new javax.swing.GroupLayout(navigationBar);
        navigationBar.setLayout(navigationBarLayout);
        navigationBarLayout.setHorizontalGroup(
            navigationBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigationBarLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(navigationBarTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        navigationBarLayout.setVerticalGroup(
            navigationBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navigationBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        userManagement.setBackground(new java.awt.Color(255, 255, 255));
        userManagement.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 102, 153)));

        userManagementIcon.setBackground(new java.awt.Color(51, 102, 153));

        javax.swing.GroupLayout userManagementIconLayout = new javax.swing.GroupLayout(userManagementIcon);
        userManagementIcon.setLayout(userManagementIconLayout);
        userManagementIconLayout.setHorizontalGroup(
            userManagementIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        userManagementIconLayout.setVerticalGroup(
            userManagementIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 114, Short.MAX_VALUE)
        );

        userManagementButton.setBackground(new java.awt.Color(51, 102, 153));
        userManagementButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userManagementButton.setForeground(new java.awt.Color(255, 255, 255));
        userManagementButton.setText("User Management");
        userManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userManagementButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userManagementLayout = new javax.swing.GroupLayout(userManagement);
        userManagement.setLayout(userManagementLayout);
        userManagementLayout.setHorizontalGroup(
            userManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userManagementLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(userManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userManagementIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userManagementButton, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        userManagementLayout.setVerticalGroup(
            userManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userManagementLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(userManagementIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(userManagementButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        salesInquiry.setBackground(new java.awt.Color(255, 255, 255));
        salesInquiry.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 102, 153)));

        salesInquiryIcon.setBackground(new java.awt.Color(51, 102, 153));

        javax.swing.GroupLayout salesInquiryIconLayout = new javax.swing.GroupLayout(salesInquiryIcon);
        salesInquiryIcon.setLayout(salesInquiryIconLayout);
        salesInquiryIconLayout.setHorizontalGroup(
            salesInquiryIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        salesInquiryIconLayout.setVerticalGroup(
            salesInquiryIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 114, Short.MAX_VALUE)
        );

        salesInquiryButton.setBackground(new java.awt.Color(51, 102, 153));
        salesInquiryButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        salesInquiryButton.setForeground(new java.awt.Color(255, 255, 255));
        salesInquiryButton.setText("Sales Inquiry");
        salesInquiryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesInquiryButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout salesInquiryLayout = new javax.swing.GroupLayout(salesInquiry);
        salesInquiry.setLayout(salesInquiryLayout);
        salesInquiryLayout.setHorizontalGroup(
            salesInquiryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salesInquiryLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(salesInquiryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(salesInquiryIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salesInquiryButton, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        salesInquiryLayout.setVerticalGroup(
            salesInquiryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salesInquiryLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(salesInquiryIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(salesInquiryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        logistics.setBackground(new java.awt.Color(255, 255, 255));
        logistics.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 102, 153)));

        logisticsIcon.setBackground(new java.awt.Color(51, 102, 153));

        javax.swing.GroupLayout logisticsIconLayout = new javax.swing.GroupLayout(logisticsIcon);
        logisticsIcon.setLayout(logisticsIconLayout);
        logisticsIconLayout.setHorizontalGroup(
            logisticsIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        logisticsIconLayout.setVerticalGroup(
            logisticsIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 114, Short.MAX_VALUE)
        );

        logisticsButton.setBackground(new java.awt.Color(51, 102, 153));
        logisticsButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logisticsButton.setForeground(new java.awt.Color(255, 255, 255));
        logisticsButton.setText("Logistics");
        logisticsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logisticsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout logisticsLayout = new javax.swing.GroupLayout(logistics);
        logistics.setLayout(logisticsLayout);
        logisticsLayout.setHorizontalGroup(
            logisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logisticsLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(logisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logisticsIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logisticsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        logisticsLayout.setVerticalGroup(
            logisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logisticsLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(logisticsIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(logisticsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(dashboardPanel);
        dashboardPanel.setLayout(dashboardPanelLayout);
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(userManagement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(salesInquiry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(logistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
            .addComponent(navigationBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dashboardPanelLayout.setVerticalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addComponent(navigationBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userManagement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salesInquiry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userManagementButtonActionPerformed
        
    }//GEN-LAST:event_userManagementButtonActionPerformed

    private void salesInquiryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesInquiryButtonActionPerformed
        
    }//GEN-LAST:event_salesInquiryButtonActionPerformed

    private void logisticsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logisticsButtonActionPerformed
        
    }//GEN-LAST:event_logisticsButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JPanel logistics;
    private javax.swing.JButton logisticsButton;
    private javax.swing.JPanel logisticsIcon;
    private javax.swing.JPanel navigationBar;
    private javax.swing.JLabel navigationBarTitle;
    private javax.swing.JPanel salesInquiry;
    private javax.swing.JButton salesInquiryButton;
    private javax.swing.JPanel salesInquiryIcon;
    private javax.swing.JPanel userManagement;
    private javax.swing.JButton userManagementButton;
    private javax.swing.JPanel userManagementIcon;
    // End of variables declaration//GEN-END:variables
}
