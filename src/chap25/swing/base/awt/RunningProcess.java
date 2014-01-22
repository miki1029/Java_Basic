package chap25.swing.base.awt;

import java.io.*;

//bin 폴더에서 java chap25.swing.base.awt.RunningProcess 실행
public class RunningProcess {
	public static void main(String[] args) throws IOException, InterruptedException {
		Process proc = Runtime.getRuntime().exec("java chap25.swing.base.awt.FirstAWT");
		proc.waitFor();
		
		if(proc.exitValue()==0)
			System.out.println("정상 종료");
		else
			System.out.println("비정상 종료");
	}
}
