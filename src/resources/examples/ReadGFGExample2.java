package resources.examples;// Java program to illustrate
// BufferedInputStream
// read(byte int int) method

import java.io.*;
public class ReadGFGExample2 {
	public static void main(String[] args) throws IOException {

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

		// Read number of bytes available
		int rem_byte = buffInputStr.available();

		// Byte array is declared
		byte[] barr = new byte[rem_byte];

		// Read byte into barr,
		// starts at offset 1,
		// 5 bytes to read
		buffInputStr.read(barr, 1, 5);

		// For each byte in barr
		for (byte b : barr) {
			if (b == (byte)0)
				b = (byte)'-';
			System.out.print((char)b);
		}
	}
}
