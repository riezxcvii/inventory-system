package Client.Admin;

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

        setBackground(new java.awt.Color(236, 242, 255));
        setMinimumSize(new java.awt.Dimension(1000, 600));

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

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Login Page/inventory-system-logo.png"))); // NOI18N

        javax.swing.GroupLayout loginFormLayout = new javax.swing.GroupLayout(loginForm);
        loginForm.setLayout(loginFormLayout);
        loginFormLayout.setHorizontalGroup(
            loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFormLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(forgotPassword)
                    .addGroup(loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(userName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                        .addComponent(loginButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                        .addComponent(password, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(41, 41, 41))
            .addGroup(loginFormLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(greetings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        loginFormLayout.setVerticalGroup(
            loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFormLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(logo)
                .addGap(25, 25, 25)
                .addComponent(greetings)
                .addGap(25, 25, 25)
                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(forgotPassword)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(loginForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(291, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(loginForm, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        
        String usernameText = userName.getText();
        String passwordText = password.getText();

        if(usernameText.equals("")){
            JOptionPane.showMessageDialog(null, "Username is required.", "Error", JOptionPane.ERROR_MESSAGE);

        }
        else if(passwordText.equals("")){
            JOptionPane.showMessageDialog(null, "Password is required.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            LoginValidation loginValidation = new LoginValidation();
            LoginResult result = loginValidation.validateLogin(usernameText, passwordText);
           
            boolean isValidUser = result.isValid();
            int userID = result.getUserID();
            String userType = result.getUserType();

            UserSession userManager = UserSession.getInstance();
            userManager.setUserID(userID);
            userManager.setUserType(userType);

                if (isValidUser) {
                    Frame frame = new Frame();
                    frame.viewFrame("Client.Admin.Dashboard", "Inventory System");
                    JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
                    currentFrame.dispose();

                } else {
                    JOptionPane.showMessageDialog(null, "Invalid credentials. Check your username and password.", "Login Form", JOptionPane.ERROR_MESSAGE);
                }
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel forgotPassword;
    private javax.swing.JLabel greetings;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginForm;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
