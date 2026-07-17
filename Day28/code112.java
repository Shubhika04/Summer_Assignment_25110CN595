import java.util.Scanner;

class Contact {

    String name;
    String phoneNumber;
    String email;

    // Constructor
    Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    void display() {
        System.out.println("\n----- Contact Details -----");
        System.out.println("Name         : " + name);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Email        : " + email);
        System.out.println("---------------------------");
    }
}


public class code112 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Contact contacts[] = new Contact[100];

        int count = 0;

        while(true) {

            System.out.println("\n===== Contact Management System =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch(choice) {

                case 1:

                    if(count < 100) {

                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Phone Number: ");
                        String phone = sc.nextLine();

                        System.out.print("Enter Email: ");
                        String email = sc.nextLine();


                        contacts[count] = new Contact(name, phone, email);

                        count++;

                        System.out.println("Contact Added Successfully.");

                    }
                    else {
                        System.out.println("Contact Limit Reached.");
                    }

                    break;


                case 2:

                    if(count == 0) {

                        System.out.println("No Contacts Available.");

                    }
                    else {

                        for(int i = 0; i < count; i++) {

                            contacts[i].display();

                        }
                    }

                    break;


                case 3:

                    sc.nextLine();

                    System.out.print("Enter Phone Number to Search: ");
                    String searchPhone = sc.nextLine();

                    boolean found = false;


                    for(int i = 0; i < count; i++) {

                        if(contacts[i].phoneNumber.equals(searchPhone)) {

                            contacts[i].display();

                            found = true;

                            break;
                        }
                    }


                    if(!found) {

                        System.out.println("Contact Not Found.");

                    }

                    break;


                case 4:

                    sc.nextLine();

                    System.out.print("Enter Phone Number to Delete: ");
                    String deletePhone = sc.nextLine();

                    boolean deleted = false;


                    for(int i = 0; i < count; i++) {

                        if(contacts[i].phoneNumber.equals(deletePhone)) {


                            for(int j = i; j < count - 1; j++) {

                                contacts[j] = contacts[j + 1];

                            }


                            count--;

                            System.out.println("Contact Deleted Successfully.");

                            deleted = true;

                            break;
                        }
                    }


                    if(!deleted) {

                        System.out.println("Contact Not Found.");

                    }

                    break;


                case 5:

                    System.out.println("Thank You for using Contact Management System.");
                    System.exit(0);


                default:

                    System.out.println("Invalid Choice.");

            }
        }
    }
}