package class_examples;

import java.util.Arrays;

public class ArrayInsertFunction {
    public static int[] insert(int[] source, int insertPosition, int valueToInsert){
        // lets write some code to insert a 9 into the array at position 2
        // 1) create a new array of size + 1
        //System.out.println(Arrays.toString(source));
        int[] result = new int[source.length + 1];

        // 2) copy the first part of the array (before position 2) from the old to the new
        for (int pos = 0; pos < insertPosition; pos++) {
            result[pos] = source[pos];
        }

        // 3) actually insert the value we want in position 2
        result[insertPosition] = valueToInsert;

        // 4) copy over the rest of the array
        for (int pos = insertPosition; pos < source.length; pos++) {
            result[pos + 1] = source[pos];
        }

        return result;
    }

    public static int[] delete(int[] source, int deletedPosition) {
        int[] deleted = new int[source.length - 1];

        // 2) copy the first elements upto but not including the deleted position
        for (int pos = 0; pos < deletedPosition; pos++ ){
            deleted[pos] = source[pos];
        }

        // 3) copy the last elements into a pos 1 in the new array
        for (int pos = deletedPosition + 1; pos < source.length; pos++) {
            deleted[pos - 1] = source[pos];
        }

        return deleted;
    }

    // original implementation inserted a 9 at position 2
    public static void main(String[] args) {

        // original array
        // pos   01234
        // value 12345

        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));

        // array after inserting
        // pos   012345
        // value 129345

        // inserting 9  at position 2
        array = insert(array, 2, 9);
        System.out.println(Arrays.toString(array));

        // deleting 9 at position 4
        array = delete(array, 2);
        System.out.print(Arrays.toString(array));

    }

}

