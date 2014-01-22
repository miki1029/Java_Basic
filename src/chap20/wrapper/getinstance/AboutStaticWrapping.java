package chap20.wrapper.getinstance;

public class AboutStaticWrapping {
	public static void main(String[] args) {
		Integer iValue1 = new Integer(10);
		Integer iValue2 = new Integer(10);
		
		if(iValue1 == iValue2)
			System.out.println("동일 인스턴스");
		else
			System.out.println("다른 인스턴스");
		
		Integer iValue3 = Integer.valueOf(10);
		Integer iValue4 = Integer.valueOf(10);
		
		if(iValue3 == iValue4)
			System.out.println("동일 인스턴스");
		else
			System.out.println("다른 인스턴스");
		
	}
}
