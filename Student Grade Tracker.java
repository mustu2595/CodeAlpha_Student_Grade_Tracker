import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

 
        System.out.println("Enter student grades. Type -1 to finish:");
        while (true) {
            System.out.print("Enter grade: ");
            int grade = scanner.nextInt();
            if (grade == -1) {
                break;
            }
            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
            } else {
                grades.add(grade);
            }
        }

     
        if (grades.isEmpty()) {
            System.out.println("No grades were entered.");
        } else {
            double average = calculateAverage(grades);
            int highest = Collections.max(grades);
            int lowest = Collections.min(grades);

            System.out.println("\nGrade Summary:");
            System.out.println("Average grade: " + average);
            System.out.println("Highest grade: " + highest);
            System.out.println("Lowest grade: " + lowest);
        }
    }

    public static double calculateAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / (double) grades.size();
    }
}
