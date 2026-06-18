import java.util.Scanner;

public class code71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter sorted array elements :");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int x = sc.nextInt();

        int low = 0;
        int high = n - 1;
        int mid;
        boolean found = false;

        // Binary Search
        while (low <= high) {
            mid = (low + high) / 2;

            if (a[mid] == x) {
                found = true;
                System.out.println("Element is present at " + (mid + 1) + " position");
                break;
            } 
            else if (a[mid] > x) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }

        if (!found) {
            System.out.println("Unsuccessful Search");
        }

        sc.close();
    }
}

