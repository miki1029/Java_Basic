package chap23.thread.priority;

public class MessageSendingThread extends Thread {
	String message;
	
	public MessageSendingThread(String str, int prio) {
		message = str;
		setPriority(prio);
	}
	
	public void run() {
		for(int i=0; i<1000000; i++) {
			System.out.println(message + "(" + getPriority() + ")");
			
			try {
				sleep(1);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
