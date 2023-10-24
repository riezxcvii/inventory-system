
import Server.Frame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class App {

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
//                ConnectDatabase db = new ConnectDatabase();
//                db.checkConnection();
//
//                if (db.isConnected == true) {
//                    Frame frame = new Frame();
//                    frame.viewFrame("Client.Admin.LoginPage", "Inventory System - Login Page");
//                } else {
//                    JOptionPane.showMessageDialog(null, "Error connecting to database.", "Connection failed.", JOptionPane.ERROR_MESSAGE);
//                }
                Frame frame = new Frame();
                frame.viewFrame("Client.Admin.LoginPage", "Inventory System - Login Page");
            }
        });
    }
}
