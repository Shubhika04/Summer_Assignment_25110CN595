import java.util.Scanner;

public class code57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int i,j,temp;
        for(i=0,j=n-1; i<j; i++,j--) {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        System.out.println("The reversed array is: ");
        for(i=0; i<n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}