import java.util.Scanner;
public class code24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int x = sc.nextInt();
         System.out.print("Enter the exponent: ");
        int n = sc.nextInt();
        long result=1;

        for(int i=1;i<=n;i++) {
        result=result*x;
        }
        System.out.println(x + "^" + n + " = " + result);
    }   
}
