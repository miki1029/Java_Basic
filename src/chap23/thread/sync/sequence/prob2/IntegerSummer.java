package chap23.thread.sync.sequence.prob2;

public class IntegerSummer extends Thread {
	private IntegerComm comm;
	private int sum;
	
	public IntegerSummer(IntegerComm comm) {
		this.comm = comm;
	}
	
	public void run() {
		for(int i=0; i<5; i++)
			sum += comm.getNum();
		
		System.out.println("입력된 정수의 총 합 : " + sum);
	}
}
