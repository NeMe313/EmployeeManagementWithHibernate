package hibernateassignment2;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class Main {

    public static void main(String[] args) {

        try {

            UIManager.setLookAndFeel(new MetalLookAndFeel());

            EmployeeApp mainWindow = new EmployeeApp();
            mainWindow.setVisible(true);
            mainWindow.centerFrame();

        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
