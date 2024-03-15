import java.util.Scanner;

public class CheckValidDay {
    public CheckValidDay() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Input the year:");
        int var2 = var1.nextInt();
        var1.nextLine();
        System.out.println("Input the month:");
        String var3 = var1.nextLine();
        int var5 = 0;
        boolean var4;
        if (var2 % 4 != 0 && (var2 % 100 != 0 || var2 % 400 == 0)) {
            var4 = false;
        } else {
            var4 = true;
        }

        String[] var6 = new String[]{"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] var7 = new String[]{"Jan.", "Feb.", "Mar.", "Apr.", "May", "June", "July", "Aug.", "Sept.", "Oct.", "Nov.", "Dec."};
        String[] var8 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] var9 = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};

        for(int var10 = 0; var10 <= 11; ++var10) {
            if (var3.equals(var6[var10]) || var3.equals(var7[var10]) || var3.equals(var8[var10]) || var3.equals(var9[var10])) {
                var5 = var10 + 1;
                break;
            }
        }

        switch (var5) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The number of days is: 31");
                break;
            case 2:
                if (var4) {
                    System.out.println("The number of days is: 29");
                } else {
                    System.out.println("The number of days is: 28");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("The number of days is: 30");
        }

        var1.close();
    }
}
