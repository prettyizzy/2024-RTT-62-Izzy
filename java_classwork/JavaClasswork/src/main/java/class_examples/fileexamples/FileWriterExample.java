package class_examples.fileexamples;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class FileWriterExample {
    public static void main(String[] args) {
        try {
            File output = new File("/Users/izzy/2024-RTT-62-Izzy/java_classwork/JavaClasswork/src/main/java/class_examples/fileexamples/output.txt");

            FileWriter fileWriter = new FileWriter(output, false);

            for (int count = 0; count < 10; count++) {
                fileWriter.write("Line (" + count + ") This is my first sentence writing to a file. \n");
            }

            fileWriter.flush();
        } catch (IOException e){
            e.printStackTrace();

        }
    }
}
