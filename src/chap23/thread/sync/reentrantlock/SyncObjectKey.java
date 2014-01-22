package chap23.thread.sync.reentrantlock;

public class SyncObjectKey {
	public static void main(String[] args) {
		IHaveTwoNum numInst = new IHaveTwoNum();

		AccessThread at1 = new AccessThread(numInst);
		AccessThread at2 = new AccessThread(numInst);
		
		at1.start();
		at2.start();
		
		try {
			at1.join();
			at2.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		numInst.showAllNums();
	}
}
