package homework;

public class Homework303_2_1 {
    public static void main(String[] args) {
        sumOfInt();
        sumOfDouble();
        sumOfIntAndDouble();
        divisionOfInt();
        divisionOfDouble();
        castingOfInts();
        constants();
        myCafe();
    }

    public static void sumOfInt() {
        // Write a program that declares two integer variables, assigns an integer to each, and adds them together.
        // Assign the sum to a variable. Print out the result.
        int num1 = 10;
        int num2 = 20;

        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }

    public static void sumOfDouble() {
        // Write a program that declares two double variables, assigns a number to each, and adds them together.
        // Assign the sum to a variable. Print out the result.
        double num1 = 24;
        double num2 = 76;

        double sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }

    public static void sumOfIntAndDouble() {
        // Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together.
        // Assign the sum to a variable.
        // Print out the result. What variable type must the sum be?

        int num1 = 5;
        double num2 = 7.5;

        double sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }

    public static void divisionOfInt() {
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

    public static void divisionOfDouble() {
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

    public static void castingOfInts() {
        // Write a program that declares two integer variables, x and y and assigns
        // the number 5 to x and the number 6 to y.
        int x = 5;
        int y = 6;

        // Declare a variable q and assign y/x to it and print q.
        double q = y/x;
        System.out.println("This is a double: " + q);

        // Now, cast y to a double and assign it to q. Print q again.
        q = (double) y;
        System.out.println("This is also a double: " + q);

    }

    public static void constants() {
        // Write a program that declares a named constant and uses it in a calculation. Print the result.
        int FIRST_CONSTANT = 89;
        int SECOND_CONSTANT = 99;

        int sum = FIRST_CONSTANT + SECOND_CONSTANT;
        System.out.println("The sum of " + FIRST_CONSTANT + " and " + SECOND_CONSTANT + " is " + sum);
    }

    public static void myCafe() {
        // Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
        final double SALES_TAX = 0.06;

        // Write a program where you create three variables that represent products at a cafe.
        // Assign prices to each product.
        double matchaLatte = 5.99;
        double flatWhite = 4.99;
        double americano = 3.99;

        // Create two more variables called subtotal and totalSale
        double subtotal = ((matchaLatte * 3) + (flatWhite * 4) + (americano * 2));
        double totalSale = subtotal + (subtotal * SALES_TAX);

        // Complete an “order” for three items of the first product,
        // four items of the second product, and two items of the third product.
        System.out.println("""
                |  ----  ORDER RECEIPT ----  |
                | MATCHA LATTE.....$5.99 x 3 |
                | FLAT WHITE.......$4.99 x 4 |
                | AMERICANO........$3.99 x 2 |
                -----------                  |""");
        System.out.println("| SUBTOTAL            " + subtotal + "  |");
        System.out.println("| SALES TAX           " + SALES_TAX + "   |");
        System.out.println("---------                    |");

        // Results formatted to two decimal places
        String formattedSale = String.format("%.2f", totalSale);
        System.out.println("| TOTAL SALE          " + formattedSale + "  |");

    }
}

