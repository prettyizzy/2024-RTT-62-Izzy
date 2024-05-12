package class_examples;

import java.util.Arrays;
// goes through the array
// compares the two elements
// swaps them
public class ArrayBubbleSort { //note that the Bubble Sort algo is pretty inefficient
    public static void main(String[] args) {
        int[] array = {6, 0, 3, 5, 1, 10, 20, -1};
        boolean swapped;

        for(int outer = 0; outer < array.length ; outer++) {
            swapped = false;
            for(int pos = 0; pos < array.length - 1; pos++) {
                if (array[pos] > array[pos+1]) {
                    int temp = array[pos];
                    array[pos] = array[pos+1];
                    array[pos+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }

            System.out.println(Arrays.toString(array));
        }
    }
}
