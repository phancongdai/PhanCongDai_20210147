import java.util.Scanner;

public class caculation {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Input the first number(Num1): ");
        String var2 = var1.nextLine();
        double var3 = Double.parseDouble(var2);
        System.out.println("Input the second number(Num2): ");
        String var5 = var1.nextLine();
        double var6 = Double.parseDouble(var5);
        System.out.println("Sum:" + (var6 + var3));
        double var8 = var3 - var6;
        System.out.println("Difference:" + Math.abs(var8));
        System.out.println("Product:" + var3 * var6);
        if (var3 == 0.0 && var6 == 0.0) {
            System.out.println("Division Num1/Num2 and Num2/Num1 do not exist");
        }

        if (var3 == 0.0 && var6 != 0.0) {
            System.out.println("Division Num1/Num2 = 0 and Division Num2/Num1 does not exist");
        }

        if (var3 != 0.0 && var6 == 0.0) {
            System.out.println("Division Num1/Num2 does not exist Division Num2/Num1 = 0");
        }

        if (var3 != 0.0 && var6 != 0.0) {
            System.out.println("Quotient: Num1/Num2 = " + var3 / var6 + " and Num2/Num1 = " + var6 / var3);
        }

        var1.close();
    }
}
