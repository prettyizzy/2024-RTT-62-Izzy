package homework303_2_3;

public class Task_7 {
    public static void main(String[] args){
        // Write a program that declares two integer variables: x, and y, and then assigns 5 to x and 8 to y.
        int x = 5;
        int y = 8;
        // Create another variable sum and assign the value of ++x added to y, and print the result.
        int sum1 = ++x + y; //increments the sum and then calculates
        System.out.println(sum1); // Notice the value of the sum (should be 14).

        // Now change the increment operator to postfix (x++) and re-run the program
        int sum2 = x++ + y; // calculates the sum and then increments
        System.out.println(sum2);
    }
}
