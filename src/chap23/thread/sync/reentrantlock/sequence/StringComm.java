package chap23.thread.sync.reentrantlock.sequence;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

public class StringComm {
	String newString;
	boolean isNewString = false;
	
	private final ReentrantLock entLock = new ReentrantLock();
	private final Condition readCond = entLock.newCondition();
	private final Condition writeCond = entLock.newCondition();
	
	public void setNewString(String news) {
		entLock.lock();
		try {
			if(isNewString == true)
				writeCond.await();
			newString = news;
			isNewString = true;
			readCond.signal();
		} catch(InterruptedException e) {
			e.printStackTrace();
		} finally {
			entLock.unlock();
		}
	}
	
	public String getNewString() {
		String retStr = null;
		
		entLock.lock();
		try {
			if(isNewString == false)
				readCond.await();
			retStr = newString;
			isNewString = false;
			writeCond.signal();
		} catch(InterruptedException e) {
			e.printStackTrace();
		} finally {
			entLock.unlock();
		}
		return retStr;
	}
}
