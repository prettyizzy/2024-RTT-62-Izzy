package pa303_2_1;

public class DivisionOfInt {
    public static void main(String[] args) {
        // Write a program that declares two integer variables, assigns an integer to each, and divides the larger number by the smaller number.
        // Assign the result to a variable. Print out the result.
        int num1 = 30;
        int num2 = 5;

        int quotient1 = num1 / num2;
        System.out.println("The quotient of " + num1 + " and " + num2 + " is " + quotient1);

        // Now change the larger number to a decimal. What happens? What corrections are needed?
        double num3 = 30.2;  // the int needs to become a double
        int num4 = 5;

        double quotient2 =  num3 / num4; // the result ALSO needs to become a double
        System.out.println("The quotient of " + num3 + " and " + num4 + " is " + quotient2);
    }
}
