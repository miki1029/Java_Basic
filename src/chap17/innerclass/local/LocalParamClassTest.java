package chap17.innerclass.local;

class OuterClassFinal {
	private String myName;
	
	public OuterClassFinal(String name) {
		myName = name;
	}
	
	public Readable createLocalClassInst(final int instID) {
		// final만 가능(원본과 복사본의 값 불일치 현상 방지)
		class LocalClass implements Readable {
			public void read() {
				System.out.println("Outer inst name: " + myName);
				System.out.println("Local inst ID: " + instID);
			}
		}
		return new LocalClass();
	}
}

public class LocalParamClassTest {
	public static void main(String[] args) {
		OuterClassFinal out1 = new OuterClassFinal("First");
		Readable localInst1 = out1.createLocalClassInst(111);
		localInst1.read();
		
		OuterClassFinal out2 = new OuterClassFinal("Second");
		Readable localInst2 = out2.createLocalClassInst(222);
		localInst2.read();
	}
}
