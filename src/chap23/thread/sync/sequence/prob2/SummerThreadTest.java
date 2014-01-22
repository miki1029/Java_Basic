package chap23.thread.sync.sequence.prob2;

import java.util.Scanner;

public class SummerThreadTest {
	public static void main(String[] args) {
		IntegerComm comm = new IntegerComm();
		IntegerSummer summer = new IntegerSummer(comm); // Thread
		
		summer.start();
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			comm.setNum(scan.nextInt());
		}
		/*
		try {
			summer.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}*/
	}
}
