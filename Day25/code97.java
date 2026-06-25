import java.util.Scanner;

public class code97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dim of 1st array: ");
        int n1 = sc.nextInt();

        int[] a = new int[n1];

        System.out.println("Enter elements of 1st sorted array:");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter dim of 2nd array: ");
        int n2 = sc.nextInt();

        int[] b = new int[n2];

        System.out.println("Enter elements of 2nd sorted array:");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        int[] merge = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (a[i] < b[j]) {
                merge[k] = a[i];
                i++;
            }
            else {
                merge[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            merge[k] = a[i];
            i++;
            k++;
        }

        while (j < n2) {
            merge[k] = b[j];
            j++;
            k++;
        }

        System.out.println("Merged Array:");
        
        for (int num : merge) {
          System.out.print(num + " ");
        }

        sc.close();
    }
}