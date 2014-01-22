package chap22.collectionframework.set.hashset;

public class SimpleNumber {
	int num;
	
	public SimpleNumber(int n) {
		num = n;
	}
	
	public String toString() {
		return String.valueOf(num);
	}
	
	public int hashCode() {
		return num % 3;
	}
	
	public boolean equals(Object obj) {
		SimpleNumber comp = (SimpleNumber)obj;
		if(comp.num == num)
			return true;
		else
			return false;
	}
}
