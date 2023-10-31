package Server;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame {

    public void viewFrame(String className, String title) {
        try {
            JFrame frame = new JFrame(title);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            frame.setUndecorated(false);

            Class<?> clazz = Class.forName(className);
            Object loginPanel = clazz.getDeclaredConstructor().newInstance();

            if (loginPanel instanceof JPanel) {
                JPanel panel = (JPanel) loginPanel;

                frame.getContentPane().add(panel);

                frame.setVisible(true);
            } else {
                System.out.println("Class specified is not a JPanel.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
