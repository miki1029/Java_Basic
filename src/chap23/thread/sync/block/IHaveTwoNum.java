package chap23.thread.sync.block;

public class IHaveTwoNum {
	int num1 = 0;
	int num2 = 0;
	
	Object key = new Object();
	//Object key2 = new Object();
	
	public void addOneNum1() {
		synchronized(this) {
			num1 += 1;
		}
	}
	public void addTwoNum1() {
		synchronized(this) {
			num1 += 2;
		}
	}

	public void addOneNum2() {
		synchronized(key) {
			num2 += 1;
		}
	}
	public void addTwoNum2() {
		synchronized(key) {
			num2 += 2;
		}
	}
	
	public void showAllNums() {
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}
}
