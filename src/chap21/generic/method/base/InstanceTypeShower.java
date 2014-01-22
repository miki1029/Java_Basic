package chap21.generic.method.base;

public class InstanceTypeShower {
	int showCnt = 0;
	
	public <T> void showInstType(T inst) {
		System.out.println(inst);
		showCnt++;
	}
	public <T, U> void showInstType(T inst1, U inst2) {
		System.out.println(inst1);
		System.out.println(inst2);
		showCnt++;
	}
	
	public void showPrintCnt() { System.out.println("Show count : " + showCnt); }
}
