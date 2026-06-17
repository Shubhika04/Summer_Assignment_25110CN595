import java.util.Scanner;

public class code65 {
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
        int[] merge = new int[ n1 + n2 ];
        
        for( int i = 0; i < n1; i++ ) {
            merge[i] = a[i];
        }
        for( int i = 0; i < n2; i++) {
            merge[ n1 + i ] = b[i];
        }
        System.out.println("Merged Array: ");
        
        for( int i = 0; i < merge.length; i++) {
            System.out.print( merge[i] + " ");
        }
        sc.close();
    }
}