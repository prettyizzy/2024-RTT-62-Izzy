package guided_labs.glab303_11_5.hashset_examples;

import java.util.HashSet;

public class ExampleOne { //class called  'exampleOne' is created
    public static void main(String[] args) { //main method
        HashSet<Integer> evenNumber = new HashSet<>(); //a hashset that holds integers called even numbers is createds
        // Using add() method
        evenNumber.add(2); // adds two to hashset
        evenNumber.add(4); // adds four to evenNumber
        evenNumber.add(6); // adds
        System.out.println("HashSet: " + evenNumber);

        HashSet<Integer> numbers = new HashSet<>(); // creates a new hashset called 'numbers'
        // Using addAll() method
        numbers.addAll(evenNumber); //adds evenNumber hashset to numbers
        numbers.add(5);
        System.out.println("New HashSet: " + numbers);
    }

}
