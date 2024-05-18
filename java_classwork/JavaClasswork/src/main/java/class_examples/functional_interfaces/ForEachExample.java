package class_examples.functional_interfaces;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();

        names.add("Larry");
        names.add("Steve");
        names.add("Jessica");
        names.add("Conan");
        names.add("Ellen");

        names.forEach(name -> {
            System.out.println();

        });

        System.out.println("========================================================");

        // printing all names in the list with a for-each loop
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("==========================================================");

        // using lambda to remove items from the list
        names = names.stream().filter(name -> !name.startsWith("E")).collect(Collectors.toList());

        // print the list after the items are removed
        for (String name : names) {
            System.out.println(name);
        }
    }
    // count the number of names in the last
    //long count = names.stream().filter(name -> name.startsWith("J")).count();
    //System.out.println("names in list starting with J : " + count);
}
