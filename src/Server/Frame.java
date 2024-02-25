package Server;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame {

    public void viewFrame(String className, String title) {
        try {
            JFrame frame = new JFrame(title);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Class<?> clazz = Class.forName(className);
            Object loginPanel = clazz.getDeclaredConstructor().newInstance();

            if (loginPanel instanceof JPanel) {
                JPanel panel = (JPanel) loginPanel;
                panel.setPreferredSize(new Dimension(1200, 600));

                frame.getContentPane().add(panel);
                frame.pack();

                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                int screenWidth = screenSize.width;
                int screenHeight = screenSize.height;

                int xPos = (screenWidth - frame.getWidth()) / 2;
                int yPos = (screenHeight - frame.getHeight()) / 3;

                frame.setLocation(xPos, yPos);

                frame.setVisible(true);
            } else {
                System.out.println("Class specified is not a JPanel.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
