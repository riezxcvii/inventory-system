
import Client.Admin.LoginPage;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class App {

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {

//                MyConnection con = new MyConnection();
//                con.checkConnection();

//                if (con.isConnected == true) {
//                    LoginPage lg = new LoginPage();
//
//                    lg.setVisible(true);
//                   
//                } else {
//                    JOptionPane.showMessageDialog(null, "Error connecting to database.", "Connection failed.", JOptionPane.ERROR_MESSAGE);
//                }
                    LoginPage lg = new LoginPage();

                    lg.setVisible(true);
            }
        });
    }
}

