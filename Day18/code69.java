import java.util.Scanner;

public class code69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // Bubble Sort, ascending order
        for(int i=0; i<a.length-1; i++) {
            for(int j=0; j<a.length-i-1; j++) {
                if(a[j] > a[j+1]) {                   
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("The Sorted Array is: ");
        
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
