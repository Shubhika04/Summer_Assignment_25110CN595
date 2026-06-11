import java.util.Scanner;

public class code42 {
    public static int max(int a, int b) {
        int result = (a > b ? a : b);
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        
        System.out.println("Maximum = " + max(n1, n2));

        sc.close();
    }
}