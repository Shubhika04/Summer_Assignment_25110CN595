import java.util.Scanner;

public class code50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int sum=0;
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum+=a[i];
        }     
        double avg= (double) sum/n;
        System.out.println("The sum of all the array elements is " + sum);
        System.out.println("The average of all the array elements is " + avg);
        sc.close();
    }
}