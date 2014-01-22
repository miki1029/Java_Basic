package chap21.generic.base;

public class FruitBox<T> {
	T item;
	public FruitBox() { }
	public FruitBox(T item) {
		this.item = item;
	}
	public void store(T item) {
		this.item = item;
	}
	public T pullOut() {
		return item;
	}
}
