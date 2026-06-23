import java.util.Scanner;

public class code86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = scanner.nextLine();

        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println("Number of words in the string: " + count);

        scanner.close();
    }
}