package class_examples.fileexamples;

import java.io.*;
import java.io.FileReader;

public class FileReaderExample {
    public static void main(String[] args) throws Exception {

        File input = new File("output.txt");
        FileReader reader = new FileReader(input);
        BufferedReader br = new BufferedReader(reader);

        String line = br.readLine(); //will read an entire line until it gets to a new line character
        while (line != null) {
            System.out.println(line);
            line = br.readLine();
        }


    }
}
