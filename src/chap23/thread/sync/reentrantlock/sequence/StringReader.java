package chap23.thread.sync.reentrantlock.sequence;

import java.util.Scanner;

public class StringReader extends Thread {
	StringComm comm;
	
	public StringReader(StringComm comm) {
		this.comm = comm;
	}
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		String readStr;
		
		for(int i=0; i<5; i++) {
			readStr = scan.nextLine();
			comm.setNewString(readStr);
		}
	}
}
