import java.util.Scanner;

public class code64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array after removing duplicates: ");
        
        for(int i=0;i<n;i++) {
            boolean duplicate = false;
            // To check whether the current element is a duplicate
            for(int j=0; j<i; j++) {
                if(a[i]==a[j]) {
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate) {
                System.out.print(a[i] + " ");
            }
        }
        sc.close();
    }
}