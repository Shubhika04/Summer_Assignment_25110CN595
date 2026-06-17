import java.util.Scanner;

public class code66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int n1 = sc.nextInt();

        int[] a = new int[n1];

        System.out.println("Enter array elements of first array:");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the size of the second array: ");
        int n2 = sc.nextInt();

        int[] b = new int[n2];

        System.out.println("Enter array elements of second array:");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }
        int[] union = new int[n1 + n2];
        int k = 0;

        // To check the non-duplicate element from the 1st array and then store it in the union array
        for (int i = 0; i < n1; i++) {
            boolean found = false;

            for (int j = 0; j < k; j++) {
                if (a[i] == union[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                union[k++] = a[i];
            }
        }
        // To check the non-duplicate element from the 2nd array and then store it in the union array
        for (int i = 0; i < n2; i++) {
            boolean found = false;

            for (int j = 0; j < k; j++) {
                if (b[i] == union[j]) {
                    found = true;
                    break;
                }
            }
            if (found==false) {
                union[k++] = b[i];
            }
        }
        System.out.println("Union of first and second arrays:");
        for (int i = 0; i < k; i++) {
            System.out.print(union[i] + " ");
        }
        sc.close();
    }
}
    
