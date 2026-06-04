import java.util.Scanner;

public class ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
         System.out.print("Enter the last number: ");
        int n2 = sc.nextInt();
        System.out.println("Prime numbers in the given range: ");
        for(int i=n1;i<=n2;i++){
        if (i<2) {
            continue;
        }
        int isprime=0;
        for(int j=2;j<i;j++) {
         if(i%j==0){
            isprime=1;
            break;
         }
        }
        if(isprime==0) {
            System.out.println(i + " ");
        } 
       }
      }
     }