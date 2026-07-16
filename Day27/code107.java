import java.util.Scanner;

class Employee {

    int empId;
    String name;
    String department;
    double basicSalary;
    double hra;
    double da;
    double netSalary;

    // Constructor
    Employee(int empId, String name, String department, double basicSalary) {

        this.empId = empId;
        this.name = name;
        this.department = department;
        this.basicSalary = basicSalary;

        // Salary Calculation
        this.hra = basicSalary * 0.20;
        this.da = basicSalary * 0.10;
        this.netSalary = basicSalary + hra + da;
    }
}

public class code107 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee[] e = new Employee[100];

        int count = 0;
        int choice;

        do {

            System.out.println("\n----- Salary Management System -----");
            System.out.println("1. Add Employee Salary");
            System.out.println("2. Display Salary Details");
            System.out.println("3. Search Employee Salary");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    if (count == e.length) {
                        System.out.println("Employee limit reached. Cannot add more records.");
                        break;
                    }

                    System.out.print("Enter Employee ID: ");
                    int empId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String department = sc.nextLine();

                    System.out.print("Enter Basic Salary: ");
                    double basicSalary = sc.nextDouble();
                    
                    // Creating Employee object and Calling Constructor
                    e[count] = new Employee(empId, name, department, basicSalary);
                    count++;

                    System.out.println("Salary Record Added Successfully.");
                    break;

                case 2:

                    if (count == 0) {

                        System.out.println("No Salary Records Found.");

                    } else {

                        System.out.println("\n----- Salary Details -----");

                        for (int i = 0; i < count; i++) {

                            System.out.println("Employee ID : " + e[i].empId);
                            System.out.println("Name        : " + e[i].name);
                            System.out.println("Department  : " + e[i].department);
                            System.out.printf("Basic Salary: %.2f\n", e[i].basicSalary);
                            System.out.printf("HRA         : %.2f\n", e[i].hra);
                            System.out.printf("DA          : %.2f\n", e[i].da);
                            System.out.printf("Net Salary  : %.2f\n", e[i].netSalary);
                            System.out.println("----------------------------");
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Employee ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (e[i].empId == searchId) {

                            System.out.println("\nEmployee Found");
                            System.out.println("Employee ID : " + e[i].empId);
                            System.out.println("Name        : " + e[i].name);
                            System.out.println("Department  : " + e[i].department);
                            System.out.printf("Basic Salary: %.2f\n", e[i].basicSalary);
                            System.out.printf("HRA         : %.2f\n", e[i].hra);
                            System.out.printf("DA          : %.2f\n", e[i].da);
                            System.out.printf("Net Salary  : %.2f\n", e[i].netSalary);

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Record Not Found.");
                    }

                    break;

                case 4:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}