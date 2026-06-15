import java.util.Scanner;

public class code60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int j = 0;

        // Moving non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                a[j] = a[i];
                j++;
            }
        }

        // Filling remaining indices with zeroes
        while (j < n) {
            a[j] = 0;
            j++;
        }

        System.out.println("Array after moving zeroes to the end:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}