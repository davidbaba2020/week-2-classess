package resources.examples;

import java.io.FileWriter;
import java.io.Writer;

public class WriterClassWriteContent1 {

    public static void main(String args[]) {

        String data = "This is the data in the output file2";

        try {
            // Creates a Writer using FileWriter
            Writer output = new FileWriter("src/resources/write.txt");


            // Writes string to the file
            output.write(data);

            // Closes the writer
            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}