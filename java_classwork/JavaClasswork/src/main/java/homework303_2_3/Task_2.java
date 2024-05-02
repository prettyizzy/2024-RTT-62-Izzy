package homework303_2_3;

public class Task_2 {
    public static void main(String[] args){
        //Write a program that declares a variable x, and assigns 150 to it,
        // and prints out the binary string version of the number.
        int x = 150;

        // Now use the right shift operator (>>) to shift by 2 and assign the result to x.
        x = x >> 2;

        // Now print the value of x and the binary string.
        System.out.println("The value of x is: " + x);
        System.out.println("The binary string is: " + Integer.toBinaryString(x));
        // --------------------------------
        // Part A >> I anticipate that the decimal value of
        int a = 225;
        a = a >> 2;
        System.out.println("The decimal value of a is: " + a);
        System.out.println("The binary string is: " + Integer.toBinaryString(a));

        // Part B >> I anticipate that
        int b = 1555;
        b = b >> 2;
        System.out.println("The decimal value of b is: " + b);
        System.out.println("The binary string is: " + Integer.toBinaryString(b));

        // Part C >> I anticipate that c will be 37
        int c = 32456;
        c = c >> 2;
        System.out.println("The decimal value of c is: " + c);
        System.out.println("The binary string is: " + Integer.toBinaryString(c));

    }
}
