import java.util.Scanner;

public class code43 {
    public static int countFactors(int a) {
        int c=0;
        for(int i=1; i<=a; i++) {
            if(a%i==0) {
                c++;    
            }
        } return c;
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        if (n <= 1) {
            System.out.println(n + " is not a Prime Number");
        } else {

        int count = countFactors(n);
        if(count==2) {  
                System.out.println(n + " is a Prime Number");
        }
        else  {
            System.out.println(n + " is not a Prime Number");

        }
        }
        sc.close();
    }
}