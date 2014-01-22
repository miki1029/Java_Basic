package chap21.generic.method.base;

public class IntroGenericMethod {
	public static void main(String[] args) {
		AAA aaa = new AAA();
		BBB bbb = new BBB();
		
		InstanceTypeShower shower = new InstanceTypeShower();
		shower.<AAA>showInstType(aaa);
		shower.showInstType(bbb); // <BBB> 생략가능
		shower.showPrintCnt();

		shower.<AAA, BBB>showInstType(aaa, bbb);
		shower.showInstType(aaa, bbb);
	}
}
