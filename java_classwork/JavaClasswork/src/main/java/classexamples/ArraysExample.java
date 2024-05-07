package classexamples;

import java.util.List;

public class ArraysExample {
        public static void main(String[] args) {
            double[] dArray = new double[10];

            //this is also a valid way of creating a new array
            //not that it is on two lines
            //first, create the var; second, creats the new array in memory
            int[] iArray;
            iArray = new int[20];

            // this gets used a bit from tiem to time
            // the compilr will see this and create an array of string with size of 3 and puts the
            // 3 values in the array
            String[] constants = {"String1", "String2", "String3"};
            for (String constant : constants) {
                System.out.println(constant);
            }

            // this is the same as doing
            String[] c1 = new String[3];
            c1[0] = "String1";
            c1[1] = "String2";
            c1[2] = "String3";

            // this also works for other data types
            int[] intConstants = {1, 2, 3, 4, 5};

            int x = intConstants.length;

            String s = new String("New String");
            s.length();

            // thi si s99% of what you will use in the future
           // List<Double>



            String[] sArray = new String[20];

           // String s = new String("New String");

           // sArray[0] = 9

        }
}
