package chap24.fileio.osstring.printwriter;

import java.io.*;

public class PrintWriterStream {
	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter(new FileWriter("printf"));
		
		out.printf("제 나이는 %d살 입니다.", 24);
		out.println();
		
		out.println("저는 자바가 좋습니다.");
		out.print("IO 부분");
		out.close();
	}
}
