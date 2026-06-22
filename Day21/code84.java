import java.util.Scanner;

public class code84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Uppercase String: " + str.toUpperCase());

        sc.close();
    }
}