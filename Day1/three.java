import java.util.Scanner;

public class three {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int fact = 1;
        if (n==0) {
            System.out.println("the factorial of zero is 1 ");
        }
        else if (n<0){
            System.out.println("the factorial of a negative number doesn't exist");
        }
        else {
            for (int i = 1; i <= n; i++) {
            fact = fact * i;
            }

        System.out.println("Factorial of the given number= " + fact);
        }
    }
}

