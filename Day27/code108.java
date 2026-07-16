import java.util.Scanner;

class Student {

    int rollNo;
    String name;

    double physics;
    double chemistry;
    double maths;
    double english;
    double computerScience;

    double total;
    double percentage;

    String physicsGrade;
    String chemistryGrade;
    String mathsGrade;
    String englishGrade;
    String computerScienceGrade;

    String result;


    // Constructor
    Student(int rollNo, String name, double physics, double chemistry,
            double maths, double english, double computerScience) {

        this.rollNo = rollNo;
        this.name = name;

        this.physics = physics;
        this.chemistry = chemistry;
        this.maths = maths;
        this.english = english;
        this.computerScience = computerScience;


        // Calculate total and percentage
        this.total = physics + chemistry + maths + english + computerScience;
        this.percentage = total / 5;


        // Calculate subject grades
        this.physicsGrade = calculateGrade(physics);
        this.chemistryGrade = calculateGrade(chemistry);
        this.mathsGrade = calculateGrade(maths);
        this.englishGrade = calculateGrade(english);
        this.computerScienceGrade = calculateGrade(computerScience);


        // Calculate final result
        if (physics < 33 || chemistry < 33 || maths < 33 ||
            english < 33 || computerScience < 33) {

            this.result = "FAIL";
        }
        else {
            this.result = "PASS";
        }
    }


    // Method to calculate grade
    String calculateGrade(double marks) {

        if (marks >= 90)
            return "A+";

        else if (marks >= 80)
            return "A";

        else if (marks >= 70)
            return "B";

        else if (marks >= 60)
            return "C";

        else if (marks >= 33)
            return "D";

        else
            return "F";
    }
}


public class code108 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] s = new Student[100];

        int count = 0;
        int choice;


        do {

            System.out.println("\n----- Marksheet Generation System -----");
            System.out.println("1. Add Student");
            System.out.println("2. Display Marksheet");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();


            switch(choice) {


                case 1:

                    System.out.print("Enter Roll Number: ");
                    int rollNo = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();


                    System.out.print("Physics Marks: ");
                    double physics = sc.nextDouble();

                    System.out.print("Chemistry Marks: ");
                    double chemistry = sc.nextDouble();

                    System.out.print("Maths Marks: ");
                    double maths = sc.nextDouble();

                    System.out.print("English Marks: ");
                    double english = sc.nextDouble();

                    System.out.print("Computer Science Marks: ");
                    double computerScience = sc.nextDouble();


                    // Creating object and calling constructor
                    s[count] = new Student(rollNo, name, physics, chemistry,
                                           maths, english, computerScience);

                    count++;

                    System.out.println("Marksheet Generated Successfully.");
                    break;



                case 2:

                    if(count == 0) {

                        System.out.println("No Records Found.");

                    }
                    else {

                        for(int i = 0; i < count; i++) {

                            System.out.println("\n--------- MARKSHEET ---------");

                            System.out.println("Roll No : " + s[i].rollNo);
                            System.out.println("Name    : " + s[i].name);

                            System.out.println("\nSubject              Marks      Grade");

                            System.out.println("Physics              " + s[i].physics + "       " + s[i].physicsGrade);

                            System.out.println("Chemistry            " + s[i].chemistry + "       " + s[i].chemistryGrade);

                            System.out.println("Maths                " + s[i].maths + "       " + s[i].mathsGrade);

                            System.out.println("English              " + s[i].english + "       " + s[i].englishGrade);

                            System.out.println("Computer Science     " + s[i].computerScience + "       "  + s[i].computerScienceGrade);


                            System.out.println("\nTotal Marks : " + s[i].total + "/500");
                            System.out.println("Percentage  : " + s[i].percentage + "%");
                            System.out.println("Result      : " + s[i].result);

                            System.out.println("-----------------------------");
                        }
                    }

                    break;



                case 3:

                    System.out.print("Enter Roll Number to Search: ");
                    int searchRoll = sc.nextInt();

                    boolean found = false;


                    for(int i = 0; i < count; i++) {

                        if(s[i].rollNo == searchRoll) {

                            System.out.println("Student Found");
                            System.out.println("Name : " + s[i].name);
                            System.out.println("Total Marks : " + s[i].total + "/500");
                            System.out.println("Percentage  : " + s[i].percentage + "%");
                            System.out.println("Result      : " + s[i].result);

                            found = true;
                            break;
                        }
                    }


                    if(!found) {

                        System.out.println("Student Record Not Found.");

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