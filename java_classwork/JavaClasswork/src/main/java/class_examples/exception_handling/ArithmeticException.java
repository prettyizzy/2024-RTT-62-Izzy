package class_examples.exception_handling;

public class ArithmeticException {
    public static void main(String[] args) {
        try {
            int d = 0;
            int n = 5;
            // code that generates exception
            int divideByZero = n / d;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occur  => " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("This is the finally block");
        }
    }
}
