package class_examples;

public class ForLoopExample {
    public static void main(String[] args) {
        for (int count = 6; count <= 10; ) {
            for (int d = 0; d < 5; d++) {
                System.out.println("The count is " + count + "." + d);
            }
            if((count % 2) == 0) {
                System.out.println("This is an even number");
            }
        }
    }
}
