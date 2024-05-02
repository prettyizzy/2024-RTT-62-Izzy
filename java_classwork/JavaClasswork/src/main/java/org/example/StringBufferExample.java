package org.example;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("filename.txt");
        sb.insert(0, "new_");

        // 0123456789012345
        // new_filename.txt

        System.out.println(sb);

        sb.replace(0, 4, "old_");

        // 0123456789012345
        // old_filename.txt

        System.out.println(sb);

        // replace will delete the items from 0 to 4 and then insert the string at position zero
        sb.replace(0, 4, "very_old_");

        // 012345678901245678901
        // very_old_filename.txt
        System.out.println(sb);

        // 0123456789012345678901
        // txt.emaelif_dlo_yrev
        sb.reverse();
        System.out.println(sb);

        sb.delete(0, 4);

    }
}
