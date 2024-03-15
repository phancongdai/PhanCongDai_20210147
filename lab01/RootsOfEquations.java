import java.util.Scanner;

public class RootsOfEquations {
    public RootsOfEquations() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("The list:\n1.The first-degree equation (linear equation) with one variable\n2.The system of first-degree equations (linear system) with two variables\n3.The second-degree equation with one variable\n");

        int var2;
        do {
            System.out.println("Input your option: ");
            var2 = var1.nextInt();
            switch (var2) {
                case 1:
                    System.out.println("1.The first-degree equation (linear equation) with one variable (a*x + b = 0)\n");
                    System.out.println("Input a");
                    double var3 = var1.nextDouble();
                    System.out.println("Input b");
                    double var5 = var1.nextDouble();
                    double var7 = 0.0;
                    if (var3 == 0.0 && var5 == 0.0) {
                        System.out.println("The equation has infinite solution\n");
                    } else {
                        if (var3 == 0.0 && var5 != 0.0) {
                            System.out.println("The equation has no solution\n");
                        }

                        var7 = -var5 / var3;
                        if (var3 != 0.0 && var5 == 0.0) {
                            System.out.println("The equation has an unique x = " + var7);
                        }

                        if (var3 != 0.0 && var5 != 0.0) {
                            System.out.println("The equation has an unique solution x = " + var7);
                            System.out.println();
                        }
                    }
                    break;
                case 2:
                    System.out.println("2.The system of first-degree equations (linear system) with two variables (a11*x1 + a12*x2 = b1 and a21*x1 + a22*x2 = b2)");
                    System.out.println("Input a11");
                    double var9 = var1.nextDouble();
                    System.out.println("Input a12");
                    double var11 = var1.nextDouble();
                    System.out.println("Input b1");
                    double var13 = var1.nextDouble();
                    System.out.println("Input a21");
                    double var15 = var1.nextDouble();
                    System.out.println("Input a22");
                    double var17 = var1.nextDouble();
                    System.out.println("Input b2");
                    double var19 = var1.nextDouble();
                    double var21 = var9 * var17 - var11 * var15;
                    double var23 = var13 * var17 - var19 * var11;
                    double var25 = var9 * var19 - var15 * var13;
                    if (var21 == 0.0 && var23 == 0.0 && var25 == 0.0) {
                        System.out.println("The equations have infinite solutions\n");
                    } else {
                        if (var21 != 0.0 || var23 == 0.0 && var25 == 0.0) {
                            if (var21 != 0.0 && var23 != 0.0 && var25 != 0.0) {
                                System.out.println("The equations have one solution: x1 = " + var23 / var21 + " and x2 = " + var25 / var21);
                                System.out.println();
                            }
                            continue;
                        }

                        System.out.println("The equations have no solution\n");
                    }
                    break;
                case 3:
                    System.out.println("3.The second-degree equation with one variable (a*x^2 + b*x +c = 0)");
                    System.out.println("Input a");
                    double var27 = var1.nextDouble();
                    System.out.println("Input b");
                    double var29 = var1.nextDouble();
                    System.out.println("Input c");
                    double var31 = var1.nextDouble();
                    double var33 = 0.0;
                    if (var27 == 0.0) {
                        if (var29 == 0.0) {
                            if (var31 == 0.0) {
                                System.out.println("The equation has infinite solutions\n");
                            } else {
                                System.out.println("The equation has no solution\n");
                            }
                        } else if (var31 == 0.0) {
                            System.out.println("The equation has one soluton x = 0");
                        } else {
                            System.out.println("The equation has one soluton x = " + -var31 / var29);
                        }
                    } else {
                        var33 = var29 * var29 - 4.0 * var27 * var31;
                        if (var33 < 0.0) {
                            System.out.println("The equation has no solution\n");
                        } else if (var33 == 0.0) {
                            System.out.println("The equation has an unique solution x = " + -var29 / (2.0 * var27));
                        } else {
                            System.out.println("The equation has two solution x1 = " + (-var29 + Math.sqrt(var33)) / (2.0 * var27) + " and x2 = " + (-var29 - Math.sqrt(var33)) / (2.0 * var27));
                        }
                    }
            }
        } while(var2 <= 3);

        var1.close();
    }
}



