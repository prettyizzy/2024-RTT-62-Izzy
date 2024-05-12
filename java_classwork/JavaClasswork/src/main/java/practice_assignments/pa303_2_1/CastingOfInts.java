package practice_assignments.pa303_2_1;

public class CastingOfInts {
    public static void main(String[] args) {
        // Write a program that declares two integer variables, x and y and assigns
        // the number 5 to x and the number 6 to y.
        int x = 5;
        int y = 6;

        // Declare a variable q and assign y/x to it and print q.
        double q = y / x;
        System.out.println("This is a double: " + q);

        // Now, cast y to a double and assign it to q. Print q again.
        q = (double) y;
        System.out.println("This is also a double: " + q);

    }
}
