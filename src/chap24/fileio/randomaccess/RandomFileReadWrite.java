package chap24.fileio.randomaccess;

import java.io.*;

public class RandomFileReadWrite {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("data_bin", "rw");
		System.out.println("Write..........");
		System.out.printf("현재 입출력 위치 : %d 바이트 \n", raf.getFilePointer());
		
		raf.writeInt(200);
		raf.writeInt(500);
		System.out.printf("현재 입출력 위치 : %d 바이트 \n", raf.getFilePointer());
		
		raf.writeDouble(48.65);
		raf.writeDouble(52.24);
		System.out.printf("현재 입출력 위치 : %d 바이트 \n", raf.getFilePointer());
		
		System.out.println("Read...........");
		raf.seek(0); // 맨 앞으로 이동
		System.out.printf("현재 입출력 위치 : %d 바이트 \n", raf.getFilePointer());

		System.out.println(raf.readInt());
		System.out.println(raf.readInt());
		System.out.printf("현재 입출력 위치 : %d 바이트 \n", raf.getFilePointer());

		System.out.println(raf.readDouble());
		System.out.println(raf.readDouble());
		System.out.printf("현재 입출력 위치 : %d 바이트 \n", raf.getFilePointer());
		
		raf.close();
		
		//////////////////////////////////////////////////////////////////////////////////
		// 문제 24-4
		//////////////////////////////////////////////////////////////////////////////////
		RandomAccessFile raf2 = new RandomAccessFile("data_bin", "r");
		raf2.seek(raf2.length()-8);
		System.out.println(raf2.readDouble());
		raf2.close();
	}
}
