import java.util.Scanner;

public class code62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int maxFreq = 0;
        int maxFreqElement = a[0];

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }

            if (count > maxFreq) {
                maxFreq = count;
                maxFreqElement = a[i];
            }
        }

        System.out.println("Maximum frequency element is " + maxFreqElement + " with a frequency of " + maxFreq);
       

        sc.close();
    }
}