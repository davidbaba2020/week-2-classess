package resources.examples;// Java program to illustrate
// BufferedInputStream read() method

import java.io.*;

public class ReadGFGExample1 {
	public static void main(String[] args)
		throws Exception
	{

		// Create input stream 'demo.txt'
		// for reading containing
		// text "GEEKSFORGEEKS"
		FileInputStream inputStream
			= new FileInputStream("src/resources/bufferFile1.txt");

		// Convert inputStream to
		// bufferedInputStream
		BufferedInputStream buffInputStr
			= new BufferedInputStream(
				inputStream);

		// Read until a single byte is available
		while (buffInputStr.available() > 0) {

			// Read the byte and
			// convert the integer to character
			char c = (char)buffInputStr.read();

			// Print the characters
			System.out.println("Char : " + c);
		}
	}
}
