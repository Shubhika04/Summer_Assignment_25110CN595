import java.util.Scanner;

public class nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int isprime=0;
        for(int i=2;i<n;i++) {
         if(n%i==0){
            isprime=1;
            break;
         }
        }
        if(isprime==1) {
            System.out.println("The given number is not prime");
        }
        else{
            System.out.println("The given number is prime"); 
        }
    }
}