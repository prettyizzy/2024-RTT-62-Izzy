package class_examples;

public class SBAPrac1 {

    public static void main(String[] args) {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // part 1 - create a for loop to print each character of the string s on its own line
        // you can use the s.charAt(pos) function
        for (int pos = 0; pos < s.length(); pos++) {
            System.out.println(s.charAt(pos));
        }
        /*
          A
          B
          C
          D
          E
          F
          G
          ...
         */

        // part 2
        // Given the following Strings convert them to integer values   Integer.valueOf()
        String ten = "10";
        String hundred = "100";

        System.out.println(Integer.valueOf(10));
        System.out.println(Integer.valueOf(100));

        // part 3
        // given an integer array find the sum of all the integers in the array
        int[] array = {2, 4, 5, 6, 7, 8, 10};
        int sum = 0;

        for (int num : array) {
            sum += num;
        }

        System.out.println(sum);

        // part 4
        // given the array of string covert them to numbers and print the sum
        String[] nums = {"2", "4", "5", "6", "7", "8", "10"};
        int stringSum = 0;
        for (String num : nums) {
            stringSum += Integer.parseInt(num);
        }

        System.out.println(stringSum);

    }
}