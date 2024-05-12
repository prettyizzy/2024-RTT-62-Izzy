package class_examples;

import java.util.ArrayList;
import java.util.List;

public class ArrayExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        stringList.add("E");

        // we can use an old style for loop to move across this list (can be used if positions are required)
        for (int pos = 0; pos < stringList.size(); pos++) {
            System.out.println(stringList.get(pos));
        }

        // nice new for loop
        for (String element : stringList) {
            System.out.println(element);
            if (element.equals("Three")){
                continue; //will not print the line if it equal 3; does the next loop iteration
            }
            System.out.println(element);
        }
    }
}
