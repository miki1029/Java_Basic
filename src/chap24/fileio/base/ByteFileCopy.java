package chap24.fileio.base;

import java.io.*;

public class ByteFileCopy {
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("org");
		OutputStream out = new FileOutputStream("cpy");
		
		int copyByte=0;
		int bData;
		
		while(true) {
			bData = in.read();
			if(bData == -1)
				break;
			
			out.write(bData);
			copyByte++;
		}
		
		in.close();
		out.close();
		System.out.println("복사된 바이트 크기 " + copyByte);
	}
}
