import java.util.Scanner;

public class code114 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int size = 0;
        int choice;

        do {
            System.out.println("\n==== ARRAY OPERATIONS MENU ====");
            System.out.println("1. Create Array");
            System.out.println("2. Display Array");
            System.out.println("3. Insert Element");
            System.out.println("4. Search Element");
            System.out.println("5. Update Element");
            System.out.println("6. Delete Element");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                // Create Array
                case 1:
                    System.out.print("Enter number of elements: ");
                    size = sc.nextInt();

                    if (size > arr.length) {
                        System.out.println("Array size exceeds limit.");
                        size = 0;
                        break;
                    }

                    System.out.println("Enter array elements:");
                    for (int i = 0; i < size; i++) {
                        arr[i] = sc.nextInt();
                    }

                    System.out.println("Array created successfully.");
                    break;


                // Display Array
                case 2:
                    if (size == 0) {
                        System.out.println("Array is empty.");
                    } 
                    else {
                        System.out.println("Array Elements:");
                        for (int i = 0; i < size; i++) {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                    }
                    break;


                // Insert Element at any index
                case 3:
                    if (size == arr.length) {
                        System.out.println("Array is full.");
                    } 
                    else {
                        System.out.print("Enter index to insert: ");
                        int index = sc.nextInt();

                        if (index >= 0 && index <= size) {

                            System.out.print("Enter element: ");
                            int element = sc.nextInt();

                            // Shift elements to the right
                            for (int i = size; i > index; i--) {
                                arr[i] = arr[i - 1];
                            }

                            arr[index] = element;
                            size++;

                            System.out.println("Element inserted successfully.");
                        } 
                        else {
                            System.out.println("Invalid index.");
                        }
                    }
                    break;


                // Search Element
                case 4:
                    if (size == 0) {
                        System.out.println("Array is empty.");
                    } 
                    else {
                        System.out.print("Enter element to search: ");
                        int search = sc.nextInt();

                        boolean found = false;
                        
                        // linear search
                        for (int i = 0; i < size; i++) {
                            if (arr[i] == search) {
                                System.out.println("Element found at index " + i);
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Element not found.");
                        }
                    }
                    break;


                // Update Element
                case 5:
                    if (size == 0) {
                        System.out.println("Array is empty.");
                    } 
                    else {
                        System.out.print("Enter index to update: ");
                        int index = sc.nextInt();

                        if (index >= 0 && index < size) {

                            System.out.print("Enter new value: ");
                            arr[index] = sc.nextInt();

                            System.out.println("Element updated successfully.");
                        } 
                        else {
                            System.out.println("Invalid index.");
                        }
                    }
                    break;


                // Delete Element
                case 6:
                    if (size == 0) {
                        System.out.println("Array is empty.");
                    } 
                    else {
                        System.out.print("Enter index to delete: ");
                        int index = sc.nextInt();

                        if (index >= 0 && index < size) {

                            // Shift elements to left
                            for (int i = index; i < size - 1; i++) {
                                arr[i] = arr[i + 1];
                            }

                            size--;

                            System.out.println("Element deleted successfully.");
                        } 
                        else {
                            System.out.println("Invalid index.");
                        }
                    }
                    break;


                // Exit
                case 7:
                    System.out.println("Thank You for using Array Operating System!");
                    break;


                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 7);

        sc.close();
    }
}