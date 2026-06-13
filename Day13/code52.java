import java.util.Scanner;

public class code52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int countEven=0;
        int countOdd=0;

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

            if(a[i]%2==0) {
                countEven++;
            }else{
                countOdd++;
            }
        }
         System.out.println("Number of even elements = " + countEven);
         System.out.println("Number of odd elements = " + countOdd);

        sc.close();
    }
}