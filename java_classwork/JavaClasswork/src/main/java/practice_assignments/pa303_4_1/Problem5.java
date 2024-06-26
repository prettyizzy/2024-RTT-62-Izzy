package practice_assignments.pa303_4_1;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        // Write a program that uses if-else-if statements to print out grades A, B, C, D, F, according to the following criteria:
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: <60
        //Use the Scanner class to accept a number score from the user to determine the letter grade.
        // Print out “Score out of range” if the score is less than 0 or greater than 100.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your grade (as a whole number): ");
        int grade = scanner.nextInt();
        scanner.close();

        if (0 > grade || grade > 100) {
            System.out.println("Score out of range");
        }
        else if (grade >= 90) {
            System.out.println("You have an A!");
        }
        else if (grade >= 80) {
            System.out.println("You have an B!");
        }
        else if (grade >= 70) {
            System.out.println("You have an C!");
        }
        else if (grade >= 60) {
            System.out.println("You have an D!");
        }
        else if (grade < 60) {
            System.out.println("You have an F!");
        }

    }
}
