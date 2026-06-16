// To find missing no. in the array
import java.util.Scanner;

public class code61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: "); // array length = n - 1 because one no. is missing
        int n = sc.nextInt();

        int[] a = new int[n - 1];
        
        int realSum = 0;
        System.out.println("Enter " + (n-1) + " array elements: ");
        for ( int i = 0; i < n - 1; i++ ) {
            a[i] = sc.nextInt();
            realSum += a[i];
        }
        int expectedSum =  n * (n + 1) / 2;
        int missing = expectedSum - realSum; // This gives the missing number

        System.out.println("The missing number in the array is " + missing);

        sc.close();
        
    }
}