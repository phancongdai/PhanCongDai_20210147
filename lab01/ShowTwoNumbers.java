import java.awt.Component;
import javax.swing.JOptionPane;

public class ShowTwoNumbers {
    public ShowTwoNumbers() {
    }

    public static void main(String[] var0) {
        String var3 = "You're just entered: ";
        String var1 = JOptionPane.showInputDialog((Component)null, "Please input the first number:", "Input the first numnber", 1);
        var3 = var3 + var1 + " and ";
        String var2 = JOptionPane.showInputDialog((Component)null, "Please input the second number: ", "Input the second number", 1);
        var3 = var3 + var2;
        JOptionPane.showMessageDialog((Component)null, var3, "Show two numbers", 1);
        System.exit(0);
    }
}
