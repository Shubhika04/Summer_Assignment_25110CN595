import java.util.Scanner;

public class code51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater than 0");
            sc.close();
            return;
        }

        int[] a = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int max = a[0];
        int min = a[0];

        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
               max = a[i];
            }

            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println("Largest element = " + max);
        System.out.println("Smallest element = " + min);

        sc.close();
    }
}