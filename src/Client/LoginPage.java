package Client;

import Server.Frame;
import Server.LoginResult;
import Server.LoginValidation;
import Server.UserSession;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class LoginPage extends javax.swing.JPanel {

    public LoginPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginForm = new javax.swing.JPanel();
        greetings = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        forgotPassword = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        showPassword = new javax.swing.JCheckBox();
        userNameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(236, 242, 255));
        setMaximumSize(new java.awt.Dimension(0, 0));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(1320, 650));

        loginForm.setBackground(new java.awt.Color(255, 255, 255));
        loginForm.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 0, 0, 0, new java.awt.Color(51, 102, 153)));
        loginForm.setPreferredSize(new java.awt.Dimension(418, 500));

        greetings.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        greetings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        greetings.setText("Welcome!");

        userName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userName.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 5, 1, 1, new java.awt.Color(51, 102, 153)));
        userName.setCaretColor(new java.awt.Color(51, 102, 153));

        password.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 5, 1, 1, new java.awt.Color(51, 102, 153)));

        loginButton.setBackground(new java.awt.Color(51, 102, 153));
        loginButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("LOGIN");
        loginButton.setFocusable(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        forgotPassword.setForeground(new java.awt.Color(51, 102, 153));
        forgotPassword.setText("Forgot password?");
        forgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPasswordMouseClicked(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Login Page/inventory-system-logo.png"))); // NOI18N

        showPassword.setBackground(new java.awt.Color(255, 255, 255));
        showPassword.setText("Show password");
        showPassword.setFocusable(false);
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });

        userNameLabel.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        userNameLabel.setText("Username");

        passwordLabel.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        passwordLabel.setText("Password");

        javax.swing.GroupLayout loginFormLayout = new javax.swing.GroupLayout(loginForm);
        loginForm.setLayout(loginFormLayout);
        loginFormLayout.setHorizontalGroup(
            loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFormLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(greetings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFormLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordLabel)
                    .addComponent(userNameLabel)
                    .addGroup(loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(userName, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(loginButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                        .addComponent(password, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(loginFormLayout.createSequentialGroup()
                            .addComponent(forgotPassword)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showPassword))))
                .addGap(40, 40, 40))
        );
        loginFormLayout.setVerticalGroup(
            loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFormLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(logo)
                .addGap(20, 20, 20)
                .addComponent(greetings)
                .addGap(20, 20, 20)
                .addComponent(userNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(forgotPassword)
                    .addComponent(showPassword))
                .addGap(12, 12, 12)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(452, 452, 452)
                .addComponent(loginForm, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(452, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(loginForm, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed

        String usernameText = userName.getText();
        String passwordText = password.getText();

        if (usernameText.equals("")) {
            JOptionPane.showMessageDialog(null, "Username is required.", "Error", JOptionPane.ERROR_MESSAGE);

        } else if (passwordText.equals("")) {
            JOptionPane.showMessageDialog(null, "Password is required.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            LoginValidation loginValidation = new LoginValidation();
            LoginResult result = loginValidation.validateLogin(usernameText, passwordText);

            boolean isValidUser = result.isValid();
            int userID = result.getUserID();
            String userType = result.getUserType();

            UserSession userManager = UserSession.getInstance();
            userManager.setUserID(userID);
            userManager.setUserType(userType);

            if (isValidUser) {
                if (userManager.getUserType().equals("Sales")) {
                    Frame frame = new Frame();
                    frame.viewFrame("Client.SalesInquiry", "Inventory System");
                    JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
                    currentFrame.dispose();
                } else if (userManager.getUserType().equals("Logistics")) {

                    Frame frame = new Frame();
                    frame.viewFrame("Client.Logistics", "Inventory System");
                    JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
                    currentFrame.dispose();
                } else {
                    Frame frame = new Frame();
                    frame.viewFrame("Client.Dashboard", "Inventory System");
                    JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
                    currentFrame.dispose();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Invalid credentials. Check your username and password.", "Login Form", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void forgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordMouseClicked
        Frame frame = new Frame();
        frame.viewFrame("Client.ForgotPassword", "Inventory System");
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.dispose();
    }//GEN-LAST:event_forgotPasswordMouseClicked

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        if (showPassword.isSelected()) {
            password.setEchoChar((char) 0);
        } else {
            password.setEchoChar('*');
        }
    }//GEN-LAST:event_showPasswordActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel forgotPassword;
    private javax.swing.JLabel greetings;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginForm;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JTextField userName;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}
