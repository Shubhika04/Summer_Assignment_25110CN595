import java.util.Scanner;

public class code21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();
// another approach using string
        long binary=0;
        int n1= n;
        int place = 1;
        
        while (n > 0) {
            int rem = n % 2;
            binary = binary + rem * place;
            place = place * 10; 
            n = n / 2;
        }

        if (n1 == 0) {
            binary = 0;
        }

        System.out.println("Binary equivalent of " + n1 + " is " + binary);

       
    }
}