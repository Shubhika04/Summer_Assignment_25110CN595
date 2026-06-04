import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number: ");
    int n = sc.nextInt();
    int sum=0;
    int rem;
    while(n>0) {
       rem=n%10;
       sum+=rem;
       n=n/10;
    }
    System.out.println("The sum of digits of the given number=" + sum);

}
}