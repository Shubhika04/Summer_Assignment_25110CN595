import java.util.Scanner;

public class code23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to count its set bits : ");
        int num = sc.nextInt();
        
        // enter choice 1 to go for built-in method
        // enter choice 1 to go for user-defined method
         System.out.print("Enter the choice either 1 or 2 : ");
        int choice = sc.nextInt();
        
        if(choice==1) {
            System.out.println("The number of set bits in " + num + "= ");
            System.out.println(Integer.bitCount(num));
        }





       if(choice==2) {
        int count = 0;
        while (num != 0) {
            num = num & (num - 1);
            count++;
        }

        System.out.println("Number of set bits = " + count);}

        sc.close();
    }
}