import java.util.Scanner;
public class code41 {
    public static int sum(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        int result = sum(n1, n2);

        System.out.println( n1 + " + " + n2 + " = " + result);

         sc.close();
    }
}