import java.util.Scanner;
public class fifteen {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int count=0,sum=0;
        int n1=n;
        
        //we'll first find the no. of digits.
        while(n>0) {
            count++;
            n=n/10;
        }
        int n2=n1;
        while(n1>0) {
            int rem= n1%10;
            sum+= (int) Math.pow(rem, count);
            n1=n1/10;
        }
        if(n2==sum){
            System.out.print(n2 + " is an armstrong number");
        }
        else{
            System.out.print(n2 + " is not an armstrong number");
    }
}}