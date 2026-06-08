import java.util.Scanner;

public class code27 {

    // Recursive method to find sum of digits
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = sumOfdigits(n);

        System.out.println("Sum of digits of the entered number = " + sum);

        sc.close();
    }
    static int sumOfdigits(int n) {
        if (n == 0) {   // Base case
            return 0;
        }
        return ( (n % 10) + sumOfdigits(n / 10) );
    }
}