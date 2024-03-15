import java.util.Scanner;

public class DrawingTriangle {
    public DrawingTriangle() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Input a number: ");
        int var2 = var1.nextInt();

        for(int var3 = 1; var3 <= var2; ++var3) {
            int var4;
            for(var4 = 1; var4 <= var2 - var3; ++var4) {
                System.out.print(" ");
            }

            for(var4 = 1; var4 <= 2 * var3 - 1; ++var4) {
                System.out.print("*");
            }

            System.out.println();
        }

        var1.close();
    }
}