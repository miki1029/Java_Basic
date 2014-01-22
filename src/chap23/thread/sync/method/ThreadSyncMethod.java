package chap23.thread.sync.method;

public class ThreadSyncMethod {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		AddThread at = new AddThread(cal);
		MinThread mt = new MinThread(cal);
		
		at.start();
		mt.start();
		
		try {
			at.join();
			mt.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		cal.showOpCnt();
	}
}
