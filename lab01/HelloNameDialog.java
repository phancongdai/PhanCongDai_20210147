import java.awt.Component;
import javax.swing.JOptionPane;

public class HelloNameDialog {
    public HelloNameDialog() {
    }

    public static void main(String[] var0) {
        String var1 = JOptionPane.showInputDialog("Please enter your name:");
        JOptionPane.showMessageDialog((Component)null, "Hi " + var1 + " !");
        System.exit(0);
    }
}