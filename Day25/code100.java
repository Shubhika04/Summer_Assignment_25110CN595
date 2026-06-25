import java.util.Scanner;

public class code100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine() + " ";

        String[] words = new String[50]; 
        int count = 0;
        String word = "";

        // Extracting each word from the sentence 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                word += ch;
            }
            else {
                words[count] = word;
                count++;
                word = "";
            }
        }

        // Sort by length
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (words[i].length() > words[j].length()) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        System.out.println("Words sorted by length:");

        for (int i = 0; i < count; i++) {
            System.out.println(words[i]);
        }

        sc.close();
    }
}