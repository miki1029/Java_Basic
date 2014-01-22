package chap22.collectionframework.set.treeset.comparable;

public class Person implements Comparable<Person> {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showData() {
		System.out.printf("%s %d \n", name, age);
	}
	
	public int compareTo(Person p) {
		if(age > p.age)
			return 1;
		else if(age < p.age)
			return -1;
		else
			return 0;
	}
}
