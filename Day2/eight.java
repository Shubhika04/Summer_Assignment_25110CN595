import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
   

        int rev=0,rem;
        int n1=n;
        while(n>0) {
           rem=n%10;
           rev= rev*10+rem;
           n=n/10;
        }
        if(n1==rev) {
        System.out.println(n1 + " is a palindrome number");
        }
        else{
         System.out.println(n1 + " is not a palindrome number");   
        }
}
}