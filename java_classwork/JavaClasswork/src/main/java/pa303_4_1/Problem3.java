package pa303_4_1;

public class Problem3 {
    public static void main(String[] args) {
        // Write a program that declares 1 integer variable x, and then assigns 15 to it.
        int x = 15;
        // Write an if-else-if statement that prints out “Less than 10” if x is less than 10;
        // “Between 10 and 20” if x is greater than 10 but less than 20, and
        // “Greater than or equal to 20” if x is greater than or equal to 20.
        if (x < 10){
            System.out.println("Less than 10");
        }
        else if ((10 < x) && (x < 20)){
            System.out.println("Between 10 and 20");
        }
        else if (x >= 20){
            System.out.println("Greater than or equal to 20");
        }

        // Change x to 50 and notice the result.
        x = 50;

        if (x < 10){
            System.out.println("Less than 10");
        }
        else if ((10 < x) && (x < 20)){
            System.out.println("Between 10 and 20");
        }
        else if (x >= 20){
            System.out.println("Greater than or equal to 20");
        }

    }
}
