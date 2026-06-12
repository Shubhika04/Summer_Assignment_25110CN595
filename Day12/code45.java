 import java.util.Scanner;

public class code45 {    
    public static int reverse(int n) {
        int rev=0;
        while(n>0) {
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int n1=n;

        if(n1==reverse(n)) {
            System.out.println(n1 + " is a palindrome number.");
        }else {
            System.out.println(n1 + " is not a palindrome number.");
        }


        sc.close();
    }
} 
    

