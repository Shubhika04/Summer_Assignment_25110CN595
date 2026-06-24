import java.util.Scanner;

public class code92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int maxFreq = 0;
        char maxCh = ' ';

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count > maxFreq) {
                maxFreq = count;
                maxCh = str.charAt(i);
            }
        }

        System.out.println("Maximum occurring character is " + maxCh);
        System.out.println("Frequency: " + maxFreq);

        sc.close();
    }
}