import java.util.Scanner;

public class InputFromKeyBoard {

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("What's your name?");
        String var2 = var1.nextLine();
        System.out.println("How old are you?");
        int var3 = var1.nextInt();
        System.out.println("How tall are you (m)?");
        double var4 = var1.nextDouble();
        System.out.println("Mr/Mrs. " + var2 + ", " + var3 + " years old. Your height is " + var4 + " meters.");
        var1.close();
    }
}