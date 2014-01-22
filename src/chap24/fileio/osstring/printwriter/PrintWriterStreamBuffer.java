package chap24.fileio.osstring.printwriter;

import java.io.*;

public class PrintWriterStreamBuffer {
	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter(
				new BufferedWriter(new FileWriter("printf")));
		
		out.printf("제 나이는 %d살 입니다.", 24);
		out.println();
		
		out.println("저는 자바가 좋습니다.");
		out.print("IO 부분AA");
		out.close();
		
		BufferedReader in = new BufferedReader(new FileReader("printf"));
		
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
