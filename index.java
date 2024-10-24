// GRADING
{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int java, Hci, Networking;
        int totalMarks;
        double averageMarks;

        System.out.print("Enter the marks for java: ");
        java = input.nextInt();

        System.out.print("Enter the marks for Hci: ");
        Hci = input.nextInt();

        System.out.print("Enter the marks for Networking: ");
        Networking = input.nextInt();


        totalMarks = java + Hci + Networking ;
        averageMarks = totalMarks / 4.0;
        System.out.println("Average Marks: " + averageMarks);

        if (averageMarks >= 45 && averageMarks <= 50) {
            System.out.println("Grade: A");
        } else if (averageMarks >= 40 && averageMarks <= 44) {
            System.out.println("Grade: B");
        } else if (averageMarks >= 35 && averageMarks <= 39) {
            System.out.println("Grade: C");
        } else if (averageMarks >= 25 && averageMarks <= 34) {
            System.out.println("Grade: D");
        } else if (averageMarks >= 0 && averageMarks <= 24) {
            System.out.println("Grade: Fail");
        } else {
            System.out.println("Invalid marks entered.");
        }
        input.close();
    }
}

// EXAM MARKS
import java.util.Scanner;

public class ExamMarks{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter marks for Assignment 1: ");
        int asgnmnt1 = input.nextInt();

        System.out.println("Enter marks for Assignment 2: ");
        int asgnmnt2 = input.nextInt();

        System.out.println("Enter marks for CAT 1: ");
        int cat1 = input.nextInt();

        System.out.println("Enter marks for CAT 2: ");
        int cat2 = input.nextInt();


        int average = (asgnmnt1 + asgnmnt2 + cat1 + cat2) / 4;

        char grade;

        if (average >= 40 && average <= 50) {
            grade = 'A';
        } else if (average >= 30 && average <= 39) {
            grade = 'B';
        } else if (average >= 20 && average <= 29) {
            grade = 'C';
        } else if (average >= 10 && average <= 19) {
            grade = 'D';
        } else {
            grade = 'F'; // For fail
        }

        System.out.println("Coursework Average: " + average);
        System.out.println("Grade: " + grade);


        input.close();
    }
}

// SWITCH  JAVA
int day = 4;
switch (day) {
    case 1: System.out.println("Sunday"); break;
    case 2: System.out.println("Tuesday"); break;
    case 3: System.out.println("Wednesday"); break;
    case 4: System.out.println("Thursday"); break;
    case 5: System.out.println("Friday"); break;
    case 6: System.out.println("Saturday"); break;
    default: System.out.println("Unknown"); break;
}