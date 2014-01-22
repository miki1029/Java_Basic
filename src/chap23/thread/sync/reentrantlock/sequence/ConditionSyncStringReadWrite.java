package chap23.thread.sync.reentrantlock.sequence;

public class ConditionSyncStringReadWrite {
	public static void main(String[] args) {
		StringComm strComm = new StringComm();
		StringReader sr = new StringReader(strComm);
		StringWriter sw = new StringWriter(strComm);
		
		System.out.println("입출력 쓰레드의 실행...");
		sr.start();
		sw.start();
	}
}
