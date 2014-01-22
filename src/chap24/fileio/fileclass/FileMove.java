package chap24.fileio.fileclass;

import java.io.*;

// MyJava 폴더 만들고 my_bin 파일 만들고 시작
public class FileMove {
	public static void main(String[] args) throws IOException {
		File myFile = new File(File.separatorChar + "home" + File.separator + "miki29" + File.separator + "MyJava" + File.separator + "my_bin");
		if(!myFile.exists()) {
			System.out.println("원본 파일이 준비되어 있지 않습니다.");
			return;
		}
		
		File reDir = new File("/home/miki29/YourJava");
		reDir.mkdir();
		File reFile = new File(reDir, "my_bin");
		myFile.renameTo(reFile);
		if(reFile.exists()) {
			System.out.println("파일 이동에 성공하였습니다.");
		}
		else {
			System.out.println("파일 이동에 실패하였습니다.");
		}
	}
}
