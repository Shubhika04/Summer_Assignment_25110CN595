import java.util.Scanner;

public class code115 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = "";
        int choice;

        do {
            System.out.println("\n*** STRING OPERATIONS SYSTEM ***");
            System.out.println("1. Enter String");
            System.out.println("2. Display String");
            System.out.println("3. Find Length");
            System.out.println("4. Convert to Uppercase");
            System.out.println("5. Convert to Lowercase");
            System.out.println("6. Reverse String");
            System.out.println("7. Check Palindrome");
            System.out.println("8. Search Character");
            System.out.println("9. Replace Character");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter a string: ");
                    str = sc.nextLine();
                    break;

                case 2:
                    System.out.println("String: " + str);
                    break;

                case 3:
                    System.out.println("Length = " + str.length());
                    break;

                case 4:
                    System.out.println("Uppercase: " + str.toUpperCase());
                    break;

                case 5:
                    System.out.println("Lowercase: " + str.toLowerCase());
                    break;

                case 6:
                    String rev = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        rev = rev + str.charAt(i);
                    }
                    System.out.println("Reversed String is " + rev);
                    break;

                case 7:
                    String reverse = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        reverse = reverse + str.charAt(i);
                    }

                    if (str.equals(reverse)) {
                        System.out.println("String is Palindrome!");
                    } else {
                        System.out.println("String is not Palindrome!");
                    }
                    break;

                case 8:
                    System.out.print("Enter character to search: ");
                    char ch = sc.next().charAt(0);

                    int found = 0;

                    for (int i = 0; i < str.length(); i++) {
                        if (str.charAt(i) == ch) {
                            System.out.println("Character found at index " + i);
                            found = 1;
                        }
                    }

                    if (found == 0) {
                        System.out.println("Character not found.");
                    }
                    break;

                case 9:
                    System.out.print("Enter character to replace: ");
                    char oldChar = sc.next().charAt(0);

                    System.out.print("Enter new character: ");
                    char newChar = sc.next().charAt(0);

                    str = str.replace(oldChar, newChar);
                    System.out.println("Updated String: " + str);
                    break;

                case 10:
                    System.out.println("Thank You for using String Operating System! ");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 10);

        sc.close();
    }
}