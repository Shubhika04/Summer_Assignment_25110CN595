import java.util.Scanner;

class BankAccount {

    int accountNumber;
    String name;
    String ifscCode;
    double balance;

    // Constructor
    BankAccount(int accountNumber, String name, String ifscCode, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.ifscCode = ifscCode;
        this.balance = balance;
    }

    void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        }
        else {
            System.out.println("Invalid amount.");
        }
    }

    void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        }
        else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    void display() {
        System.out.println("\n---- Account Details ----");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + name);
        System.out.println("IFSC Code      : " + ifscCode);
        System.out.println("Balance        : Rs." + balance);
    }
}

public class code110 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array of BankAccount objects
        BankAccount[] accounts = new BankAccount[100];

        int count = 0;
        int choice;

        do {

            System.out.println("\n==== Bank Management System ====");
            System.out.println("1. Create Account");
            System.out.println("2. Display All Accounts");
            System.out.println("3. Search Account");
            System.out.println("4. Deposit Money");
            System.out.println("5. Withdraw Money");
            System.out.println("6. Check Balance");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    if(count < 100) {

                        System.out.print("Enter Account Number: ");
                        int accNo = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Enter Account Holder Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter IFSC Code: ");
                        String ifsc = sc.next();

                        System.out.print("Enter Initial Balance: ");
                        double balance = sc.nextDouble();

                        accounts[count] = new BankAccount(accNo, name, ifsc, balance);

                        count++;

                        System.out.println("Account created successfully.");
                    }
                    else {
                        System.out.println("Account limit reached.");
                    }

                    break;


                case 2:
                    if(count == 0) {
                        System.out.println("No accounts available.");
                    }
                    else {
                        for(int i = 0; i < count; i++) {
                            accounts[i].display();
                        }
                    }

                    break;


                case 3:
                    System.out.print("Enter Account Number to search: ");
                    int searchAcc = sc.nextInt();

                    boolean found = false;

                    for(int i = 0; i < count; i++) {

                        if(accounts[i].accountNumber == searchAcc) {
                            accounts[i].display();
                            found = true;
                            break;
                        }
                    }

                    if(!found) {
                        System.out.println("Account not found.");
                    }

                    break;


                case 4:
                    System.out.print("Enter Account Number: ");
                    int depositAcc = sc.nextInt();

                    found = false;

                    for(int i = 0; i < count; i++) {

                        if(accounts[i].accountNumber == depositAcc) {

                            System.out.print("Enter amount to deposit: ");
                            double amount = sc.nextDouble();

                            accounts[i].deposit(amount);

                            found = true;
                            break;
                        }
                    }

                    if(!found) {
                        System.out.println("Account not found.");
                    }

                    break;


                case 5:
                    System.out.print("Enter Account Number: ");
                    int withdrawAcc = sc.nextInt();

                    found = false;

                    for(int i = 0; i < count; i++) {

                        if(accounts[i].accountNumber == withdrawAcc) {

                            System.out.print("Enter amount to withdraw: ");
                            double amount = sc.nextDouble();

                            accounts[i].withdraw(amount);

                            found = true;
                            break;
                        }
                    }

                    if(!found) {
                        System.out.println("Account not found.");
                    }

                    break;


                case 6:
                    System.out.print("Enter Account Number: ");
                    int balanceAcc = sc.nextInt();

                    found = false;

                    for(int i = 0; i < count; i++) {

                        if(accounts[i].accountNumber == balanceAcc) {

                            System.out.println("Current Balance: Rs." + accounts[i].balance);

                            found = true;
                            break;
                        }
                    }

                    if(!found) {
                        System.out.println("Account not found.");
                    }

                    break;


                case 7:
                    System.out.println("Thank you for using Bank Management System.");
                    break;


                default:
                    System.out.println("Invalid choice.");
            }

        } while(choice != 7);


        sc.close();
    }
}