
import Server.Frame;
import Database.DatabaseConnect;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class App {

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                DatabaseConnect db = new DatabaseConnect();
                db.checkConnection();

                if (db.isConnected == true) {
                    Frame frame = new Frame();
                    frame.viewFrame("Client.Admin.LoginPage", "Inventory System");
                } else {
                    JOptionPane.showMessageDialog(null, "Error connecting to database.", "Database Connection", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
