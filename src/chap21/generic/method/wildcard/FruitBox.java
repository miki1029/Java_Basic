package chap21.generic.method.wildcard;

public class FruitBox<T> {
	T item;
	public void store(T item) {
		this.item = item;
	}
	public T pullOut() {
		return item;
	}
}
