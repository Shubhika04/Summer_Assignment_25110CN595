import java.util.Scanner;

public class code89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("The 1st non-repeating character of the string is " + ch);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeating character present.");
        }

        sc.close();
    }
}