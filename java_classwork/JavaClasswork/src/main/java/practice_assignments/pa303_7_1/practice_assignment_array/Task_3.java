package practice_assignments.pa303_7_1.practice_assignment_array;

import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
        String[] arr = {"red", "green", "blue", "yellow"};
        System.out.println(arr.length);

        String[] newArr = arr.clone();
        System.out.println(Arrays.toString(newArr));
    }
}
