package chap24.fileio.osstring;

import java.io.*;

public class FileWriterStream {
	public static void main(String[] args) throws IOException {
		char ch1 = 'A';
		char ch2 = 'B';
		
		Writer out = new FileWriter("hyper");
		out.write(ch1);
		out.write(ch2);
		out.close();
	}
}
