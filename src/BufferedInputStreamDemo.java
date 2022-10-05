// Java program to demonstrate working of BufferedInputStream
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

// Java program to demonstrate BufferedInputStream methods
class BufferedInputStreamDemo
{
	public static void main(String args[]) throws IOException
	{
		// attach the file to FileInputStream
		FileInputStream fin = new FileInputStream("src/resources/bufferFile1.txt");

		BufferedInputStream bin = new BufferedInputStream(fin);

		// illustrating available method
		System.out.println("Number of remaining bytes:" +
											bin.available());

		// illustrating skip method
		System.out.println("FileContents :");

		// read characters from FileInputStream and
		// write them
		int ch;
		while ((ch=bin.read()) != -1)
			System.out.print((char)ch);

	}
}
