package chap23.thread.heap;

public class ThreadHeapMultiAccess {
	public static void main(String[] args) {
		Sum s = new Sum();
		AdderThread at1 = new AdderThread(s, 1, 50);
		AdderThread at2 = new AdderThread(s, 51, 100);
		at1.start();
		at2.start();
		
		try {
			at1.join();
			at2.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1~100까지의 합 : " + s.getNum()); // 동기화 하지 않았으므로 결과가 이상할 수도 있음
	}
}
