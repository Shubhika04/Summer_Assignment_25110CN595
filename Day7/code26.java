import java.util.Scanner;

public class code26 {

    // Recursive method to find Fibonacci number
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms in fibonacci series: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        sc.close();
    }
    static int fibonacci(int n) {
        if (n == 1) {   // Base case
            return 0;
        }
        if (n == 2) {   // Base case
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);  // Recursive call
    }
}