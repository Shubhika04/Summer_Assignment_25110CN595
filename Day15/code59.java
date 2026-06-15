import java.util.Scanner;

public class code59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // Store the last element
        int last= a[n-1];

        // Shift all elements one position to the right
        for(int i=n-1; i>0; i--) {
            a[i] = a[i-1];
        }
        // Place the last element at the start
        a[0] = last;

        System.out.println("Array after right rotation: ");
        for(int i=0; i<n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();

    }
}