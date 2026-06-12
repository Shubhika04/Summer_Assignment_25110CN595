import java.util.Scanner;

public class code46 {

    public static boolean armstrong(int n) {
        int n1= n;
        int count = 0;
        int sum = 0;

        while (n > 0) {
            count++;
            n/= 10;
        }
        int n2= n1;
        while (n2 > 0) {
            int rem = n2 % 10;
            sum += (int) Math.pow(rem, count);
            n2 /= 10;
        }

        return sum == n1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (armstrong(n)) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }

        sc.close();
    }
}