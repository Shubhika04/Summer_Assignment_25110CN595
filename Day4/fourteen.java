import java.util.Scanner;
public class fourteen {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the term's number: ");
        int n = sc.nextInt();
        System.out.println("nth fibonacci term= ");
         int a=0, b=1, c;
        if(n==1) {
            System.out.println(a);
        } 
        else if(n==2) {
            System.out.println(b);
        } 
        else{
        for(int i=3; i<=n; i++) {
         c=a+b;
         a=b;
         b=c;
        }
        System.out.println(b);
          
        }

 }
}
