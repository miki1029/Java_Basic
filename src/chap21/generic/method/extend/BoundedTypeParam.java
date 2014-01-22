package chap21.generic.method.extend;

public class BoundedTypeParam {
	public static <T extends SimpleInterface> void showInstanceAncestor(T param) {
		param.showYourName();
	} // 자료형에 안전한 메소드의 예
	
	public static <T> void showInstanceName(T param) {
		((UpperClass)param).showYourAncestor();
	} // 자료형에 안전하지 못한 메소드의 예
	
	public static void main(String[] args) {
		AAA aaa = new AAA();
		BBB bbb = new BBB();
		
		showInstanceAncestor(aaa);
		showInstanceName(aaa);
		showInstanceAncestor(bbb);
		showInstanceName(bbb);
		
	}
}
