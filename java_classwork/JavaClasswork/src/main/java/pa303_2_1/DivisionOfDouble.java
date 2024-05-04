package pa303_2_1;

public class DivisionOfDouble {
    public static void main(String[] args) {
        // Write a program that declares two double variables, assigns a number to each, and divides the larger by the smaller number.
        // Assign the result to a variable. Print out the result.

        double num1 = 17.4;
        double num2 = 1.5;

        double quotientDouble = num1 / num2;
        System.out.println("The quotient of " + num1 + " and " + num2 + " is " + quotientDouble);

        // Now, cast the result to an integer. Print out the result again.
        int quotientInt = (int) quotientDouble;
        System.out.println("The quotient of " + num1 + " and " + num2 + " as an integer is " + quotientInt);

    }
}
