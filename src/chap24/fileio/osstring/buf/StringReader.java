package chap24.fileio.osstring.buf;

import java.io.*;

public class StringReader {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("String"));
		
		String str;
		while(true) {
			str = in.readLine();
			if(str == null)
				break;
			
			System.out.println(str);
		}
		in.close();
	}
}
