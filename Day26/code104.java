import java.util.Scanner;

public class code104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;

        
        System.out.println("       QUIZ APPLICATION");
        System.out.println("=============================");
        
        // Candidate Details
        System.out.print("Name of the Candidate: ");
        String name = sc.nextLine();

        System.out.print("Age of the Candidate: ");
        int age = sc.nextInt();

        System.out.println("\nWelcome " + name + " (Age: " + age + ")");
        System.out.println("=================================");

        // Instructions for Quiz:
        System.out.println("INSTRUCTIONS:");
        System.out.println("1. For MCQ questions, enter a, b, c, or d.");
        System.out.println("2. For True/False questions:");
        System.out.println("   a = True");
        System.out.println("   b = False");
        System.out.println("3. Each question carries 1 mark.");
        System.out.println("No Negative Marking!\n");
        System.out.println("Attempt All the Questions Carefully.");
        System.out.println("Good Luck For the Quiz!");


        // Questions (4 MCQs + 6 True/False)
        String[] questions = {
            "Which company developed Java?",
            "Which symbol is used for single-line comment in Java?",
            "Which keyword is used to create an object in Java?",
            "Which loop guarantees to execute at least once?",
            "The Scanner class is used to take input in Java.",
            "Java supports Object-Oriented Programming.",
            "Comments are executed by the Java compiler.",
            "Pointers are used in Java.",
            "Java is a case-sensitive language.",
            "A String is nothing but a character array in Java."
        };

        // Options (True/False questions have only 2 options)
        String[][] options = {
            {"a) Apple", "b) Sun Microsystems", "c) Google", "d) Reliance"},
            {"a) /*", "b) #", "c) //", "d) :/"},
            {"a) class", "b) object", "c) new", "d) create"},
            {"a) for loop", "b) while loop", "c) do-while loop", "d) switch"},
            {"a) True", "b) False"},
            {"a) True", "b) False"},
            {"a) True", "b) False"},
            {"a) True", "b) False"},
            {"a) True", "b) False"},
            {"a) True", "b) False"}
        };

        // Correct answers
        char[] answers = {
            'b', 'c', 'c', 'c',  // For MCQs
            'a', 'a', 'b', 'b', 'a', 'b' // For True/False Questions
        };

        
       

        for (int i = 0; i < questions.length; i++) {

            System.out.println("Q" + (i + 1) + ") " + questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Your Answer: ");
            char yourAns = sc.next().charAt(0);

            if (yourAns == answers[i] || yourAns == Character.toUpperCase(answers[i])) {
                score++;
            }
        }

        // Result
        System.out.println("\n=================================");
        System.out.println("           RESULT");
        System.out.println("=================================");

        System.out.println("Your Name: " + name);
        System.out.println("Your Age: " + age);

        System.out.println("Your Score= " + score + " / 10");

        double percentage = (score * 100.0) / 10;
        System.out.println("Your Percentage= " + percentage + "%");

        if (score > 8) {
            System.out.println("Grade: A+ (Excellent)");
        } else if (score > 6) {
            System.out.println("Grade: A (Very Good)");
        } else if (score > 4) {
            System.out.println("Grade: B (Good)");
        } else if (score > 2) {
            System.out.println("Grade: C (Average)");
        } else {
            System.out.println("Grade: D (Poor)");
        }

        System.out.println("=================================");
        System.out.println("Thanks For Your Participation.");
        System.out.println("Good Luck For Your Future!");
        System.out.println("=================================");

        sc.close();
    }
}