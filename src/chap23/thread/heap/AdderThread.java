package chap23.thread.heap;

public class AdderThread extends Thread {
	Sum sumInst;
	int start, end;
	
	public AdderThread(Sum sum, int s, int e) {
		sumInst = sum;
		start = s;
		end = e;
	}
	
	public void run() {
		for(int i=start; i<=end; i++)
			sumInst.addNum(i);
	}
}
