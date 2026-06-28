import java.util.Scanner;

public class code103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== ATM SIMULATION SYSTEM =====");
        System.out.println("Please insert your ATM card...");
        System.out.println("Card detected successfully.\n");


        // Account Creation
        System.out.print("Enter Your Account Number: ");
        int accountNo = sc.nextInt();

        System.out.print("Set Your PIN: ");
        int pin = sc.nextInt();

        double balance = 10000.0;

        System.out.println("\nAccount Created Successfully!");
        System.out.println("Your Initial Balance is Rs." + balance);


        // Login section with max 3 Attempts
        int attempts = 3;
        boolean validLogin = false;

        while (attempts > 0) {
            System.out.println("\n** LOGIN **");

            System.out.print("Enter Account Number: ");
            int enteredAcc = sc.nextInt();

            System.out.print("Enter PIN: ");
            int enteredPin = sc.nextInt();

            if (enteredAcc == accountNo && enteredPin == pin) {
                validLogin = true;
                System.out.println("Login Successful!");
                System.out.println("Welcome to your account.");
                break;
            } 
            else {
                attempts--;
                System.out.println("Entered Account Number or PIN is invalid!");
                System.out.println("Attempts Remaining: " + attempts);
            }
        }

        if (!validLogin) {
            System.out.println("Maximum attempts exceeded. Transaction declined.");
            System.out.println("Please collect your card.");
            sc.close();
            return;
        }

        int choice;

        do {
            System.out.println("\n*** ATM MENU ***");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Fetching account details...");
                    System.out.println("Current Balance: Rs." + balance);
                    break;

                case 2:
                    System.out.println("\nPlease insert cash into the deposit slot.");
                    System.out.print("Enter Amount to Deposit: Rs.");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Amount Deposited Successfully.");
                        System.out.println("Your Updated Balance is Rs." + balance);
                    } 
                    else {
                        System.out.println("Invalid Amount!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Amount to Withdraw: Rs.");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= 0) {
                        System.out.println("Invalid Amount!");
                    } 
                    else if (withdraw <= balance) {
                        System.out.println("Processing your request...");
                        balance -= withdraw;
                        System.out.println("Please collect your cash.");
                        System.out.println("Remaining Balance: Rs." + balance);
                    } 
                    else {
                        System.out.println("Insufficient Balance!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using our ATM.");
                    System.out.println("Please collect your card.");
                    System.out.println("Have a nice day!");
                    break;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}