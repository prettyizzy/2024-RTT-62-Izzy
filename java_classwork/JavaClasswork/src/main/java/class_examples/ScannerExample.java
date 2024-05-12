package class_examples;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // datatype: scanner
        // creates new Scanner object
        // system.in = scans from input

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
    }
}
