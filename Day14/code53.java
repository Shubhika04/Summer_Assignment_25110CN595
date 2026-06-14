import java.util.Scanner;

public class code53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int x = sc.nextInt();

        int i;
        for (i = 0; i < n; i++) {
            if(a[i]==x) {
                break;
            }
        }
        if (i < n) {
        System.out.println(x + " is found at position " + (i + 1));
        }
        else {
        System.out.println(x + " is not found");
        }
        sc.close();
    }
}