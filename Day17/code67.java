import java.util.Scanner;

public class code67 {
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
        int[] intersection = new int[n1 + n2];
        int k = 0;
// intersection means to store  unique elements that are common to both the arrays
        for (int i = 0; i < n1; i++) {
            boolean existInSecond = false;
            boolean added = false;

            for (int j = 0; j < n2; j++) {
                if (a[i] == b[j]) {
                    existInSecond = true;
                    break;
                }
            }
            for (int j = 0; j < k; j++) {
                if (a[i] == intersection[j]) {
                    added = true;
                    break;
                }
            }
            if (existInSecond && !added) {
                intersection[k++] = a[i];
            }
        }
        System.out.println("Intersection of first and second arrays: ");
        for (int i = 0; i < k; i++) {
            System.out.print(intersection[i] + " ");
        }
        sc.close();

    }
}
      
