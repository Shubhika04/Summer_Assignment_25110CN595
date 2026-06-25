import java.util.Scanner;

public class code98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter 2nd string: ");
        String str2 = sc.nextLine();

        System.out.print("Common characters in strings: ");

        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);

            for (int j = 0; j < str2.length(); j++) {
                char ch2 = str2.charAt(j);

                if (ch1 == ch2) {
                    System.out.print(ch1 + " ");
                    break;
                }
            }
        }

        sc.close();
    }
}