import java.util.Scanner;

public class code55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        //bubble sort
        for(int i=0; i<a.length-1; i++) {
            for(int j=0; j<a.length-i-1; j++) {
                if(a[j] > a[j+1]) {
                    //swap
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        
        int secondLargest = a[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            if (a[i] != a[n - 1]) {
             secondLargest = a[i];
             break;
           }
        }

        System.out.println("The second largest element is " + secondLargest);
        sc.close();
    }
}