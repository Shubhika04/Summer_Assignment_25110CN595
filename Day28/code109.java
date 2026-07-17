import java.util.Scanner;

class Book {

    int bookId;
    String bookName;
    String author;
    boolean issued;

    Book(int bookId, String bookName, String author) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.issued = false;
    }

    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);

        if (issued)
            System.out.println("Status: Issued");
        else
            System.out.println("Status: Available");

        System.out.println("----------------------");
    }
}

public class code109 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Book books[] = new Book[100];

        int count = 0;

        while (true) {

            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch(choice) {

                case 1:

                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Book Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    books[count] = new Book(id, name, author);
                    count++;

                    System.out.println("Book Added Successfully");

                    break;


                case 2:

                    if(count == 0) {
                        System.out.println("No Books Available");
                    }
                    else {
                        for(int i = 0; i < count; i++) {
                            books[i].display();
                        }
                    }

                    break;


                case 3:

                    System.out.print("Enter Book ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for(int i = 0; i < count; i++) {

                        if(books[i].bookId == searchId) {
                            books[i].display();
                            found = true;
                            break;
                        }
                    }

                    if(!found)
                        System.out.println("Book Not Found");

                    break;


                case 4:

                    System.out.print("Enter Book ID to Issue: ");
                    int issueId = sc.nextInt();

                    boolean issue = false;

                    for(int i = 0; i < count; i++) {

                        if(books[i].bookId == issueId) {

                            if(!books[i].issued) {
                                books[i].issued = true;
                                System.out.println("Book Issued Successfully");
                            }
                            else {
                                System.out.println("Book Already Issued");
                            }

                            issue = true;
                            break;
                        }
                    }

                    if(!issue)
                        System.out.println("Book Not Found");

                    break;


                case 5:

                    System.out.print("Enter Book ID to Return: ");
                    int returnId = sc.nextInt();

                    boolean returned = false;

                    for(int i = 0; i < count; i++) {

                        if(books[i].bookId == returnId) {

                            books[i].issued = false;
                            System.out.println("Book Returned Successfully");

                            returned = true;
                            break;
                        }
                    }

                    if(!returned)
                        System.out.println("Book Not Found");

                    break;


                case 6:

                    System.out.println("Thank You!");
                    System.exit(0);


                default:

                    System.out.println("Invalid Choice");

            }
        }
    }
}