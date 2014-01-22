package chap23.thread.sync.reentrantlock.sequence;

public class StringWriter extends Thread {
	StringComm comm;
	
	public StringWriter(StringComm comm) {
		this.comm = comm;
	}
	
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("read string : " + comm.getNewString());
		}
	}
}
