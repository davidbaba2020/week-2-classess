import java.io.FileOutputStream;

public class Main3Out {
    public static void main(String[] args) {
        
        String data = "This is a line of text inside the file2.";

        try {
            FileOutputStream output = new FileOutputStream("src/resources/input2.txt");

            byte[] array = data.getBytes();

            // Writes byte to the file
            output.write(array);

            output.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }
}