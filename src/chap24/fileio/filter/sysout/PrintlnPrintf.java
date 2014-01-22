package chap24.fileio.filter.sysout;

import java.io.*;

public class PrintlnPrintf {
	public static void main(String[] args) throws IOException {
		MyInfo mInfo = new MyInfo("저는 자바 프로그래머입니다.");
		PrintStream out = new PrintStream("print");
		out.println("제 소개를 하겠습니다.");
		out.println(mInfo);
		out.printf("나이 %d, 몸무게 %dkg입니다.", 24, 72);
		out.close();
	}
}
