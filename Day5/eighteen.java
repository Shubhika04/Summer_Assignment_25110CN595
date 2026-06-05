import java.util.Scanner;
public class eighteen {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int digit, sum=0;
        int n1=n;

        while(n>0) {
        digit=n%10;

        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact = fact * i;
        }
        sum+=fact;
        n=n/10;
        }
        if (sum == n1) {
            System.out.println(n1+ " is a Strong Number.");
        } else {
            System.out.println(n1 + " is not a Strong Number.");
        }
 }}

