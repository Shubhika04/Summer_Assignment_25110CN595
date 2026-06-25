import java.util.Scanner;

public class code99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names to be sorted: ");
        int n = sc.nextInt();
        sc.nextLine();  // remove leftover Enter

        String[] names = new String[n];

        System.out.println("Enter names to be sorted:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        // Sorting names alphabetically
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        System.out.println("Names sorted in Alphabetical Order:");
       
        for (int i = 0; i < names.length; i++) {
          System.out.println(names[i]);
        }

        sc.close();
    }
}