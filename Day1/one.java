 import java.util.Scanner;

public class one {
public static void main(String []args){ 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int N = sc.nextInt();

        int sum = 0;
        int i=1;

        for ( i = 1; i <= N; i++) {
            sum += i;
        }

        System.out.println("Sum of first N natural number= " + sum);
    }
}




