package chap23.thread.sync.sequence.prob2;

public class IntegerComm {
	private int num;
	private boolean isNewNum;
	
	public IntegerComm() {
		num = 0;
		isNewNum = false;
	}
	
	public void setNum(int n) {
		synchronized(this) {
			if(isNewNum) {
				try {
					wait();
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			num = n;
			isNewNum = true;
			notify();
		}
	}
	
	public int getNum() {
		int retNum = 0;
		synchronized(this) {
		if(!isNewNum) {
				try {
					wait();
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			retNum = num;
			isNewNum = false;
			notify();
		}
		return retNum;
	}
}
