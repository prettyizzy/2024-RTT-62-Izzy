package pa303_4_1;

public class Problem2 {
    public static void main(String[] args) {
        // Write a program that declares 1 integer variable x, and then assigns 7 to it.
        int x = 7;
        // Write an if-else statement that prints out “Less than 10” if x is less than 10, and “Greater than 10” if x is greater than 10.
        if (x < 10){
            System.out.println("Less than 10");
        }
        else if (x > 10) {
            System.out.println("Greater than 10");
        }
        else {
            System.out.println("This number is 10");
        }

        // Change x to 15 and notice the result.
        x = 15;
        if (x < 10){
            System.out.println("Less than 10");
        }
        else if (x > 10) {
            System.out.println("Greater than 10");
        }
        else {
            System.out.println("This number is 10");
        }
    }
}
