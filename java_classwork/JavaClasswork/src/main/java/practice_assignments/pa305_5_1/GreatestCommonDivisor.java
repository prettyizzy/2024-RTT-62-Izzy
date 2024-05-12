package practice_assignments.pa305_5_1;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int enterFirstNum = scanner.nextInt();

        System.out.print("Please enter the second number: ");
        int enterSecondNum = scanner.nextInt();

        int secondNumber = 0;
        int firstNumber = 0;

        if (enterFirstNum > enterSecondNum) {
            firstNumber = enterSecondNum;
            secondNumber = enterFirstNum % enterSecondNum;
            while (secondNumber != 0) {
                int placeholder = firstNumber;
                firstNumber = secondNumber;
                secondNumber = placeholder % secondNumber;
            }
        }  else if (enterFirstNum < enterSecondNum) {
            firstNumber = enterFirstNum;
            secondNumber = enterSecondNum % enterFirstNum;
            while (secondNumber != 0) {
                int placeholder = firstNumber;
                firstNumber = secondNumber;
                secondNumber = placeholder % secondNumber;
            }
        }

        System.out.println("The GCD of " + enterFirstNum + " and " + enterSecondNum + " is " + firstNumber + ".");




    }

}
