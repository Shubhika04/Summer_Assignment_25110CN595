import java.util.Scanner;

public class twenty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Edge case handling
        if (n <= 1) {
            System.out.println(n + " has no prime factors.");
            sc.close();}
        else{
        int prime = 0;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) { 
                //i is a factor 

                boolean isprime = true;

                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        isprime = false;
                        break;
                    }
                }

                if (isprime) {
                    prime = i;
                }
            }
        }
       
        System.out.println("The largest prime factor of " + n + " is " + prime);
    }}
}