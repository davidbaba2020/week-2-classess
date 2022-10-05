import java.io.*;

public class InputStreamExample1 {


    //Byte array to read to before manipulating base on your need
    byte[] array = new byte[100];
    //InputStream example
    InputStream input = new FileInputStream("src/resources/input.txt");
    public InputStreamExample1() throws FileNotFoundException {
    }
    public Integer availableCharacters (){
        Integer returnedNumberOfBytes = null;
        try {
            returnedNumberOfBytes = input.available();
            closeStream();
        } catch (IOException e) {
            e.getStackTrace();
        }
        return returnedNumberOfBytes;
    }

    public String bytesOfCharactersInStream () {
        // Read byte from the input stream
        String data = null;
        try {
            input.read(array);

            // Convert byte array into string
            data = new String(array);
            closeStream();
        } catch (IOException e) {
            e.getStackTrace();
        }
        return data;
    }


    // Close the input stream
      public void closeStream() {
          try {
              input.close();
          } catch (IOException e) {
              e.getStackTrace();
          }
      }




}
