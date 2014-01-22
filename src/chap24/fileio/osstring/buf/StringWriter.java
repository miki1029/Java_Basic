package chap24.fileio.osstring.buf;

import java.io.*;

public class StringWriter {
	public static void main(String[] args) throws IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter("String"));
		
		out.write("박지성");
		out.newLine();
		out.write("올 시즌");
		out.newLine();
		out.newLine();
		out.write("입력 완료");
		out.close();
		System.out.println("ok");
	}
}
