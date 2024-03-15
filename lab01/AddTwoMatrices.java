import java.util.Scanner;

public class AddTwoMatrices {
    public AddTwoMatrices() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Input the number of rows: ");
        int var2 = var1.nextInt();
        System.out.println("Input the number of colums: ");
        int var3 = var1.nextInt();
        double[][] var4 = new double[var2][var3];
        double[][] var5 = new double[var2][var3];
        double[][] var6 = new double[var2][var3];
        System.out.println("Input the elements of matrix A:");

        int var7;
        int var8;
        for(var7 = 0; var7 < var2; ++var7) {
            for(var8 = 0; var8 < var3; ++var8) {
                var4[var7][var8] = var1.nextDouble();
            }
        }

        System.out.println("Input the element of matrix B: ");

        for(var7 = 0; var7 < var2; ++var7) {
            for(var8 = 0; var8 < var3; ++var8) {
                var5[var7][var8] = var1.nextDouble();
            }
        }

        System.out.println("The sum of two matrices: ");

        for(var7 = 0; var7 < var2; ++var7) {
            for(var8 = 0; var8 < var3; ++var8) {
                var6[var7][var8] = var4[var7][var8] + var5[var7][var8];
            }
        }

        for(var7 = 0; var7 < var2; ++var7) {
            for(var8 = 0; var8 < var3; ++var8) {
                System.out.print(var6[var7][var8] + " ");
            }

            System.out.println();
        }

        var1.close();
    }
}
