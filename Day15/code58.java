import java.util.Scanner;

public class code58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // Store the first element
        int a1= a[0];
        
        // Shift all elements one position to the left
        for(int i=0; i<n-1; i++) {
            a[i] = a[i+1];
        }

        // Place the first element at the end
        a[n-1]=a1;

        System.out.println("Array after left rotation: ");
        for(int i=0; i<n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}