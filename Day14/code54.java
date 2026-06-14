import java.util.Scanner;

public class code54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the element to find its frequency: ");
        int x = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                count++;
            }
        }

        System.out.println("Frequency of " + x + " = " + count);

        sc.close();
    }
}