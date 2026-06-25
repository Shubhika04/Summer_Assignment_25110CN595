import java.util.Scanner;

public class code93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter 2nd string: ");
        String str2 = sc.nextLine();

        if (str1.length() == str2.length()) {
            String key = str1 + str1;

            if (key.contains(str2)) {
                System.out.println("Strings are rotations of each other.");
            }
            else {
                System.out.println("Strings are not rotations of each other.");
            }
        }
        else {
            System.out.println("Strings are not rotations of each other.");
        }

        sc.close();
    }
}