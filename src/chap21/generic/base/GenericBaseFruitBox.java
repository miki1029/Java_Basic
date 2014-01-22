package chap21.generic.base;

public class GenericBaseFruitBox {
	public static void main(String[] args) {
		FruitBox<Orange> orBox = new FruitBox<Orange>(new Orange(10));
		Orange org = orBox.pullOut();
		org.showSugarContent();
		
		FruitBox<Apple> apBox = new FruitBox<Apple>();
		apBox.store(new Apple(20));
		Apple app = apBox.pullOut();
		app.showAppleWeight();
	}
}
