import java.util.Scanner;

public class code70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // Selection Sort
        for(int i = 0; i < a.length-1; i++) {
            int smallest = i;
            for(int j = i + 1; j < a.length; j++) {
                if(a[smallest] > a[j]) {
                    smallest = j;
                }
            }
            int temp = a[smallest];
            a[smallest] = a[i];
            a[i] = temp;
        }
        System.out.println("Sorted Array:");
        
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
         }
         sc.close();

    }
}
