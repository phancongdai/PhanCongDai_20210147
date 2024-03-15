import java.awt.Component;
import javax.swing.JOptionPane;

public class ChoosingOption {
    public ChoosingOption() {
    }

    public static void main(String[] var0) {
        int var1 = JOptionPane.showConfirmDialog((Component)null, "Do you want to change to the first class ticket?");
        JOptionPane.showMessageDialog((Component)null, "You've chosen: " + (var1 == 0 ? "Yes" : "No"));
        System.exit(0);
    }
}

