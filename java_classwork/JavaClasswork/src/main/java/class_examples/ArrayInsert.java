package class_examples;

public class ArrayInsert {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // original arrat
        // pos 01234
        // val 12345

        // array after inserting
        // pos 012345
        // val 129145

        // lets write some code to insert = 9 into the array at position 2
        // 1) create a new array of size + 1


        int[] insert = new int[array.length + 1];
        for (int pos = 0; pos < 2; pos++) {
            insert[pos] = array[pos];
        }

        // 2) copy the first part of the array (before position 2) from the old to the new
        for (int value : insert) {
            System.out.print(value);
        }

        // 3) actually insert the value we want in positio 2
        insert[2] = 9;

        // 4) copy over the rest of the array
        for (int pos = 2; pos < array.length; pos++) {
            insert[pos + 1] = array[pos];
        }

        for (int value : insert) {
            System.out.print(value);
        }
    }
}
