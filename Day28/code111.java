import java.util.Scanner;

class Ticket {

    int ticketId;
    String passengerName;
    String departure;
    String destination;
    double fare;
    boolean booked;

    // Constructor
    Ticket(int ticketId, String passengerName, String departure, String destination, double fare) {
        this.ticketId = ticketId;
        this.passengerName = passengerName;
        this.departure = departure;
        this.destination = destination;
        this.fare = fare;
        this.booked = true;
    }

    void display() {
        System.out.println("\n----- Ticket Details -----");
        System.out.println("Ticket ID    : " + ticketId);
        System.out.println("Passenger    : " + passengerName);
        System.out.println("Departure    : " + departure);
        System.out.println("Destination  : " + destination);
        System.out.println("Fare         : Rs." + fare);

        if(booked)
            System.out.println("Status       : Booked");
        else
            System.out.println("Status       : Cancelled");

        
    }
}

public class code111 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Ticket tickets[] = new Ticket[100];

        int count = 0;

        while(true) {

            System.out.println("\n===== Indian Ticket Booking System =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. Display All Tickets");
            System.out.println("3. Search Ticket");
            System.out.println("4. Cancel Ticket");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch(choice) {

                case 1:

                    if(count < 100) {

                        System.out.print("Enter Ticket ID: ");
                        int id = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Enter Passenger Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Departure: ");
                        String departure = sc.nextLine();

                        System.out.print("Enter Destination: ");
                        String destination = sc.nextLine();

                        System.out.print("Enter Fare: ");
                        double fare = sc.nextDouble();

                        tickets[count] = new Ticket(id, name, departure, destination, fare);

                        count++;

                        System.out.println("Ticket Booked Successfully.");
                    }
                    else {
                        System.out.println("Ticket Limit Reached.");
                    }

                    break;


                case 2:

                    if(count == 0) {
                        System.out.println("No Tickets Booked.");
                    }
                    else {

                        for(int i = 0; i < count; i++) {
                            tickets[i].display();
                        }
                    }

                    break;


                case 3:

                    System.out.print("Enter Ticket ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for(int i = 0; i < count; i++) {

                        if(tickets[i].ticketId == searchId) {

                            tickets[i].display();
                            found = true;
                            break;
                        }
                    }

                    if(!found) {
                        System.out.println("Ticket Not Found.");
                    }

                    break;


                case 4:

                    System.out.print("Enter Ticket ID to Cancel: ");
                    int cancelId = sc.nextInt();

                    boolean cancelled = false;

                    for(int i = 0; i < count; i++) {

                        if(tickets[i].ticketId == cancelId) {

                            if(tickets[i].booked) {

                                tickets[i].booked = false;
                                System.out.println("Ticket Cancelled Successfully.");

                            }
                            else {

                                System.out.println("Ticket Already Cancelled.");

                            }

                            cancelled = true;
                            break;
                        }
                    }

                    if(!cancelled) {
                        System.out.println("Ticket Not Found.");
                    }

                    break;


                case 5:

                    System.out.println("Thank You for using Indian Ticket Booking System.");
                    System.exit(0);


                default:

                    System.out.println("Invalid Choice.");

            }
        }
    }
}