package chap23.thread.sync.error;

public class ThreadSyncError {
	public static void main(String[] args) {
		Increment inc = new Increment();
		IncThread it1 = new IncThread(inc);
		IncThread it2 = new IncThread(inc);
		IncThread it3 = new IncThread(inc);
		
		it1.start();
		it2.start();
		it3.start();
		
		try {
			it1.join();
			it2.join();
			it3.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(inc.getNum());
	}
}
