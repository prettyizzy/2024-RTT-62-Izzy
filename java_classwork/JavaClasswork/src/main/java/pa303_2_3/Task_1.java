package pa303_2_3;

public class Task_1 {
    public static void main(String[] args) {
        /*
         * Write a program that declares an integer a variable x, assigns the value 2 to it,
         * and prints out the binary string version of the number ( Integer.toBinaryString(x) ).
         * Now, use the left shift operator (<<) to shift by 1 and assign the result to x.
         * Before printing the results, write a comment with the predicted decimal value and binary string.
         * Now, print out x in decimal form and in binary notation.
         * */

        int x = 2;
        System.out.println("Initial value in binary: " + Integer.toBinaryString(x));

        // Shifts x by one position or two bits; equivalent to 2 x 2; expected value is 4
        x = x << 1;
        System.out.println("Shifted decimal value of x: " + x);
        System.out.println("Shifted binary value of x: " + Integer.toBinaryString(x));

        // Part A
        int a = 9;
        System.out.println("Initial value of a: " + a);

        // Equivalent to 9 * 2; expected value is 18
        a = a << 1;
        System.out.println("Shifted decimal value of a: " + a);
        System.out.println("Shifted binary value of a: " + Integer.toBinaryString(x));

        // Part B
        int b = 17;
        System.out.println("Initial value of b: " + b);

        // Equivalent to
        b = b << 1;
        System.out.println("Shifted decimal value of b: " + b);
        System.out.println("Shifted binary value of b: " + Integer.toBinaryString(b));

        // Part C
        int c = 88;
        System.out.println("Initial value of c: " + c);

        // Equivalent to 88 * 2; expected decimal value is 176
        c = c << 1;
        System.out.println("Shifted decimal value of c: " + c);
        System.out.println("Shifted binary value of c: " + Integer.toBinaryString(c));
    }
}