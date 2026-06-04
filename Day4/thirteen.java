 import java.util.Scanner;
public class thirteen {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of terms: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci series: ");
        int a=0, b=1, c;
        if(n>=1) {
            System.out.println(a + " ");
        } 
        if(n>=2) {
            System.out.println(b + " ");
        } 
        for(int i=0; i<n-2; i++) {
         c=a+b;
         a=b;
         b=c;
      
        System.out.println(c);
          }
    }
}