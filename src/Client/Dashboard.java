package Client;

import Server.Frame;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import Server.UserSession;

public class Dashboard extends javax.swing.JPanel {

    public Dashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navigationBar = new javax.swing.JPanel();
        navigationBarTitle = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        logoutButton = new javax.swing.JLabel();
        userManagement = new javax.swing.JPanel();
        userManagementIcon = new javax.swing.JPanel();
        userManagementImage = new javax.swing.JLabel();
        userManagementButton = new javax.swing.JButton();
        salesInquiry = new javax.swing.JPanel();
        salesInquiryIcon = new javax.swing.JPanel();
        salesInquiryImage = new javax.swing.JLabel();
        salesInquiryButton = new javax.swing.JButton();
        logistics = new javax.swing.JPanel();
        logisticsIcon = new javax.swing.JPanel();
        logisticsImage = new javax.swing.JLabel();
        logisticsButton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(0, 0));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(1320, 650));

        navigationBar.setBackground(new java.awt.Color(51, 102, 153));

        navigationBarTitle.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        navigationBarTitle.setForeground(new java.awt.Color(255, 255, 255));
        navigationBarTitle.setText("Dashboard");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Navigation Bar/inventory-system-logo.png"))); // NOI18N

        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Navigation Bar/logout.png"))); // NOI18N
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
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
                .addComponent(logoutButton)
                .addGap(20, 20, 20))
        );
        navigationBarLayout.setVerticalGroup(
            navigationBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addComponent(navigationBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        userManagement.setBackground(new java.awt.Color(255, 255, 255));
        userManagement.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 102, 153)));

        userManagementIcon.setBackground(new java.awt.Color(51, 102, 153));

        userManagementImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Dashboard/add-user.png"))); // NOI18N

        javax.swing.GroupLayout userManagementIconLayout = new javax.swing.GroupLayout(userManagementIcon);
        userManagementIcon.setLayout(userManagementIconLayout);
        userManagementIconLayout.setHorizontalGroup(
            userManagementIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userManagementIconLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(userManagementImage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        userManagementIconLayout.setVerticalGroup(
            userManagementIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userManagementIconLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(userManagementImage)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        userManagementButton.setBackground(new java.awt.Color(51, 102, 153));
        userManagementButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userManagementButton.setForeground(new java.awt.Color(255, 255, 255));
        userManagementButton.setText("User Management");
        userManagementButton.setFocusPainted(false);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(userManagementButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        salesInquiry.setBackground(new java.awt.Color(255, 255, 255));
        salesInquiry.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 102, 153)));

        salesInquiryIcon.setBackground(new java.awt.Color(51, 102, 153));

        salesInquiryImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Dashboard/sales-inquiry.png"))); // NOI18N

        javax.swing.GroupLayout salesInquiryIconLayout = new javax.swing.GroupLayout(salesInquiryIcon);
        salesInquiryIcon.setLayout(salesInquiryIconLayout);
        salesInquiryIconLayout.setHorizontalGroup(
            salesInquiryIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salesInquiryIconLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(salesInquiryImage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        salesInquiryIconLayout.setVerticalGroup(
            salesInquiryIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salesInquiryIconLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(salesInquiryImage)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        salesInquiryButton.setBackground(new java.awt.Color(51, 102, 153));
        salesInquiryButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        salesInquiryButton.setForeground(new java.awt.Color(255, 255, 255));
        salesInquiryButton.setText("Sales Inquiry");
        salesInquiryButton.setFocusable(false);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salesInquiryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        logistics.setBackground(new java.awt.Color(255, 255, 255));
        logistics.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 102, 153)));

        logisticsIcon.setBackground(new java.awt.Color(51, 102, 153));

        logisticsImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Dashboard/logistics.png"))); // NOI18N

        javax.swing.GroupLayout logisticsIconLayout = new javax.swing.GroupLayout(logisticsIcon);
        logisticsIcon.setLayout(logisticsIconLayout);
        logisticsIconLayout.setHorizontalGroup(
            logisticsIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logisticsIconLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(logisticsImage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logisticsIconLayout.setVerticalGroup(
            logisticsIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logisticsIconLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(logisticsImage)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        logisticsButton.setBackground(new java.awt.Color(51, 102, 153));
        logisticsButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logisticsButton.setForeground(new java.awt.Color(255, 255, 255));
        logisticsButton.setText("Logistics");
        logisticsButton.setFocusable(false);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logisticsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(userManagement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(salesInquiry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(logistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
            .addComponent(navigationBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navigationBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(salesInquiry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logistics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userManagement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userManagementButtonActionPerformed
        Frame frame = new Frame();
        frame.viewFrame("Client.UserManagement", "Inventory System");
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.dispose();
    }//GEN-LAST:event_userManagementButtonActionPerformed

    private void salesInquiryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesInquiryButtonActionPerformed
        Frame frame = new Frame();
        frame.viewFrame("Client.SalesInquiry", "Inventory System");
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.dispose();
    }//GEN-LAST:event_salesInquiryButtonActionPerformed

    private void logisticsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logisticsButtonActionPerformed
        Frame frame = new Frame();
        frame.viewFrame("Client.Logistics", "Inventory System");
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.dispose();
    }//GEN-LAST:event_logisticsButtonActionPerformed

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        Frame frame = new Frame();
        frame.viewFrame("Client.LoginPage", "Inventory System");
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.dispose();
    }//GEN-LAST:event_logoutButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel logistics;
    private javax.swing.JButton logisticsButton;
    private javax.swing.JPanel logisticsIcon;
    private javax.swing.JLabel logisticsImage;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoutButton;
    private javax.swing.JPanel navigationBar;
    private javax.swing.JLabel navigationBarTitle;
    private javax.swing.JPanel salesInquiry;
    private javax.swing.JButton salesInquiryButton;
    private javax.swing.JPanel salesInquiryIcon;
    private javax.swing.JLabel salesInquiryImage;
    private javax.swing.JPanel userManagement;
    private javax.swing.JButton userManagementButton;
    private javax.swing.JPanel userManagementIcon;
    private javax.swing.JLabel userManagementImage;
    // End of variables declaration//GEN-END:variables
}
