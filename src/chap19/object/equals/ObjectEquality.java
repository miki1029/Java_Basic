package chap19.object.equals;

class IntNumber {
	int num;
	
	public IntNumber(int num) {
		this.num = num;
	}
	
	public boolean equals(Object obj) {
		if(this.num == ((IntNumber)obj).num)
			return true;
		else
			return false;
	}
}

public class ObjectEquality {
	public static void main(String[] args) {
		IntNumber num1 = new IntNumber(10);
		IntNumber num2 = new IntNumber(20);
		IntNumber num3 = new IntNumber(10);
		
		if(num1.equals(num2))
			System.out.println("num1 = num2");
		else
			System.out.println("num1 != num2");
		
		if(num1.equals(num3))
			System.out.println("num1 = num3");
		else
			System.out.println("num1 != num3");
	}
}
