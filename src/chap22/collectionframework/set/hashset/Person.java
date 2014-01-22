package chap22.collectionframework.set.hashset;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + "(" + age + "세)";
	}
	
	public int hashCode() {
		return name.hashCode() + age%3;
	}
	
	public boolean equals(Object obj) {
		Person comp = (Person)obj;
		if(name.equals(comp.name) && age == comp.age)
			return true;
		else
			return false;
	}
}
