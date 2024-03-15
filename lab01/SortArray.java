import java.util.Arrays;
import java.util.Scanner;
class SortArray {
    //int num;
    //int []value = new int[100];
    //public SortArray(int num, int value[]) {
    //    this.num = num;
    //    for(int i=0; i<num; i++) {
    //        this.value[i] = value[i];
    //    }
    //}

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int v[] = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++) {
            v[i] = sc.nextInt();
            sum +=  v[i];
        }
        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                if(v[i]>v[j]) {
                    int tmp = v[i];
                    v[i] = v[j];
                    v[j] = tmp;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(v));
        System.out.print("Sum: "+sum+"\n");
        System.out.print("Average: "+(double)sum/n);
    }

}