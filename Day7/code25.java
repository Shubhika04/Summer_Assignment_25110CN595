import java.util.Scanner;
    public class code25 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long result = factorial(n); //function calling

        System.out.println("Factorial of " + n + " is " + result);

        sc.close();
    }

    static long factorial(int n) {
        if (n == 0 || n == 1) {   // Base case
            return 1;
        }
        return n * factorial(n - 1); // Recursive call
    }
}