import java.util.Scanner;

public class code28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        reverse(n);

        System.out.println("Reversed number = " + rev);

        sc.close();
    }
     static int rev = 0;

    
    static void reverse(int n) {
        if (n == 0) {   // Base case
            return;
        }

        rev = rev * 10 + (n % 10);
        reverse(n / 10);
    }
}