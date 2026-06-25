import java.util.Scanner;

public class code96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String output = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean found = false;

            for (int j = 0; j < output.length(); j++) {
                if (output.charAt(j) == ch) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                output += ch;
            }
        }

        System.out.println(output);
        sc.close();
    }
}