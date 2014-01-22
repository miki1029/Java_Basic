package chap23.thread.sync.method;

public class AddThread extends Thread {
	Calculator cal;
	
	public AddThread(Calculator cal) { this.cal=cal; }
	
	public void run() {
		System.out.println("1+2=" + cal.add(1,2));
		System.out.println("2+4=" + cal.add(2,4));
	}
}
