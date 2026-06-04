import java.util.Scanner;

public class sixteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
         System.out.print("Enter the last number: ");
        int b = sc.nextInt();
        System.out.println("Armstrong numbers in the given range: ");
  
        for(int i=a;i<=b;i++) {
        int n=i;
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
        if(sum== n2) {
            System.out.println(n2);
        }

        }}}
