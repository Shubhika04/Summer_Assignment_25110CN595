import java.util.Scanner;

class Employee {

    int empId;
    String name;
    String department;
    double salary;
    String doj;   // Date of Joining

    // Constructor
    Employee(int empId, String name, String department, double salary, String doj) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.doj = doj;
    }
}

public class code106 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee[] e = new Employee[100];

        int count = 0;
        int choice;

        do {
            System.out.println("\n----- Employee Management System -----");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    int empId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String department = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    sc.nextLine();

                    System.out.print("Enter Date of Joining (DOJ): ");
                    String doj = sc.nextLine();

                    // Creating Employee object and Calling Constructor
                    e[count] = new Employee(empId, name, department, salary, doj);

                    count++;

                    System.out.println("Employee Added Successfully.");
                    break;


                case 2:
                    if(count == 0) {
                        System.out.println("No Employee Records Found.");
                    }
                    else {
                        System.out.println("\nEmployee Records:");

                        for(int i = 0; i < count; i++) {

                            System.out.println("Employee ID --> " + e[i].empId);
                            System.out.println("Name        --> " + e[i].name);
                            System.out.println("Department  --> " + e[i].department);
                            System.out.println("Salary      --> " + e[i].salary);
                            System.out.println("DOJ         --> " + e[i].doj);
                            System.out.println("***************************");
                        }
                    }
                    break;


                case 3:
                    System.out.print("Enter the Employee ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for(int i = 0; i < count; i++) {

                        if(e[i].empId == searchId) {

                            System.out.println("Employee Found");

                            System.out.println("Employee ID --> " + e[i].empId);
                            System.out.println("Name        --> " + e[i].name);
                            System.out.println("Department  --> " + e[i].department);
                            System.out.println("Salary      --> " + e[i].salary);
                            System.out.println("DOJ         --> " + e[i].doj);

                            found = true;
                            break;
                        }
                    }

                    if(!found) {
                        System.out.println("Employee Record Not Found.");
                    }

                    break;


                case 4:
                    System.out.println("Thank You!");
                    break;


                default:
                    System.out.println("Invalid Choice.");
            }

        } while(choice != 4);

        sc.close();
    }
}