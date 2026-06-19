import java.util.Scanner;

public class code75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        int[][] b = new int[c][r]; 

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        // Transpose matrix
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                b[j][i] = a[i][j];
            }
        }

        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}