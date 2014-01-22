package chap23.thread.sync.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class IHaveTwoNum {
	int num1 = 0;
	int num2 = 0;

	private final ReentrantLock key1 = new ReentrantLock();
	private final ReentrantLock key2 = new ReentrantLock();
	
	public void addOneNum1() {
		key1.lock();
		try {
			num1 += 1;
		} finally {
			key1.unlock();
		}
	}
	
	public void addTwoNum1() {
		key1.lock();
		try {
			num1 += 2;
		} finally {
			key1.unlock();
		}
	}
	
	public void addOneNum2() {
		key2.lock();
		try {
			num2 += 1;
		} finally {
			key2.unlock();
		}
	}
	
	public void addTwoNum2() {
		key2.lock();
		try {
			num2 += 2;
		} finally {
			key2.unlock();
		}
	}
	
	public void showAllNums() {
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}
}
