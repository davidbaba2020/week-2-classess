import resources.Decadev;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        System.out.println("An example of OutputStream is: Hello world!");


        InputStreamExample1 input = new InputStreamExample1();
        OutputStreamExample1 output = new OutputStreamExample1();
//Number of bytes contained in file
//        System.out.println("The number of bytes in the file is: "+input.availableCharacters());

        //Content of file
//        System.out.println(input.bytesOfCharactersInStream());


        //Read into file method
//        output.ReadIntoFile();



        Decagon decagon = new Decagon();

        Decadev ben = new Decadev();
                ben.setName("Benjamin");
                ben.setScore(50);

        System.out.println(decagon.weeklyTask(ben));
    }
}