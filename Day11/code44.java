import java.util.Scanner;

public class code44 {    
    public static long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial of a negative number is not defined");
        } else {
            System.out.println("Factorial of " + n + " = " + factorial(n));
        }

        sc.close();
    }
}