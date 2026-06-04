import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int product=1;
        int rem;
        while(n>0) {
        rem=n%10;
        product=product*rem;
        n=n/10;
    }
    System.out.println("The product of digits of the given number=" + product);

}
}