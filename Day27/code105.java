import java.util.Scanner;

class Student {

    int rollNo;
    String name;
    double cgpa;

    // Constructor
    Student(int rollNo, String name, double cgpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class code105 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] s = new Student[100];

        int count = 0;
        int choice;

        do {
            System.out.println("\n----- Student Record Management System -----");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Roll Number: ");
                    int rollNo = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter CGPA: ");
                    double cgpa = sc.nextDouble();

                    // Calling the constructor
                    s[count] = new Student(rollNo, name, cgpa);

                    count++;

                    System.out.println("Student Record Has Been Added Successfully.");
                    break;


                case 2:
                    if (count == 0) {
                        System.out.println("No Records Found.");
                    } 
                    else {
                        System.out.println("\nStudent Records:");

                        for (int i = 0; i < count; i++) {

                            System.out.println("Roll No --> " + s[i].rollNo);
                            System.out.println("Name    --> " + s[i].name);
                            System.out.println("CGPA    --> " + s[i].cgpa);
                            System.out.println("***********************");
                        }
                    }
                    break;


                case 3:
                    System.out.print("Enter the Roll Number to Search: ");
                    int searchRollNo = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (s[i].rollNo == searchRollNo) {

                            System.out.println("Student Found");
                            System.out.println("Roll No --> " + s[i].rollNo);
                            System.out.println("Name    --> " + s[i].name);
                            System.out.println("CGPA    --> " + s[i].cgpa);

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Record Not Found.");
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