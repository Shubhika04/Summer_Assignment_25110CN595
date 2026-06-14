import java.util.Scanner;

public class code56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Duplicate elements are: ");
        boolean k=false;
        for(int i=0;i<n;i++) {
            for(int j=i+1; j<n; j++) {
                if(a[i]==a[j]) {
                    System.out.println(a[i] + " ");
                    k=true;
                    break;
                    
                }
            }
        }
        if(k==false) {
            System.out.println("No duplicate element found.");
        }
        sc.close();
    }
}