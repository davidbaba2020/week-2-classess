import java.io.FileInputStream;

public class Main2 {

   public static void main(String args[]) {

      try {
         // Suppose, the input.txt file contains the following text
         // This is a line of text inside the file.
         FileInputStream input = new FileInputStream("src/resources/input.txt");

         // Skips the 5 bytes
         input.skip(10);
         System.out.println("Input stream after skipping 5 bytes:");

         // Reads the first byte
         int i = input.read();
         while (i != -1) {
            System.out.print((char) i);

            // Reads next byte from the file
            i = input.read();
         }

         // close() method
         input.close();
      } catch (Exception e) {
         e.getStackTrace();
      }
   }
}