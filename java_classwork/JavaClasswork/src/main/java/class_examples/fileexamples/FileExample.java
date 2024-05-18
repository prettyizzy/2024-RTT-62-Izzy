package class_examples.fileexamples;

import java.io.File;

public class FileExample {

    public static void main(String[] args) {

        // .. means to go up one directory form where you are
        // . means the current directory where I am right now

        File f = new File(".");
        System.out.println(f.getAbsolutePath());

        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(" is a directory");
            if (file.isDirectory()) {

            } else {
                System.out.println(" is a file");
            }
        }
    }
}
