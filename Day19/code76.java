import java.util.Scanner;

public class code76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the square matrix: ");
        int n = sc.nextInt();

        int[][] a = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int s1 = 0;
        int s2 = 0;

        for (int i = 0; i < n; i++) {
            s1 += a[i][i];
            s2 += a[i][n - 1 - i];
        }

        System.out.println("Sum of main diagonal elements = " + s1);
        System.out.println("Sum of off diagonal elements = " + s2);

        sc.close();
    }
}