// To find pair with given sum
import java.util.Scanner;

public class code63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the sum: ");
        int sum = sc.nextInt();
        
        boolean found = false;

        for( int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(a[i] + a[j]  == sum) {
                    System.out.println("Required pairs are " + a[i] + " and " + a[j]);
                    found = true; 
                }
            }        
        }
        if(found==false) {
            System.out.println("No such pair found.");
        }
        sc.close();
    }
}