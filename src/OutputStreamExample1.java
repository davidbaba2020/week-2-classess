import java.io.*;

public class OutputStreamExample1 {



    //Byte array to read to before manipulating base on your need
    String data = "This is a line of text inside the file from java squad 12 the year 2022.";
    //OutputStream example
    OutputStream out = new FileOutputStream("src/resources/input2.txt");

    public OutputStreamExample1() throws FileNotFoundException {
    }


    public void ReadIntoFile (){
        // Converts the string into bytes
        byte[] dataBytes = data.getBytes();

        try {
        // Writes data to the output stream
            out.write(dataBytes);
            System.out.println("Data is written to the file.");
            closeStream();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    // Close the input stream
      public void closeStream() {
          try {
              out.close();
          } catch (IOException e) {
              e.getStackTrace();
          }
      }




}
