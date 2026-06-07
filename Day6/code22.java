import java.util.Scanner;

public class code22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        int n = sc.nextInt();
        int i=0;
        int decimal=0;
        int n1=n;
        while(n>0) {
            int rem = n % 10;
            decimal+= (rem * ((int) Math.pow(2,i)));
            i++;
            n=n/10;
        }
        

        System.out.println("Decimal equivalent of " + n1 + " is " + decimal);

       

    }
}
