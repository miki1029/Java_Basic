package chap22.collectionframework.set.treeset.comparable;

import java.util.TreeSet;
import java.util.Iterator;

public class PersonMain {
	public static void main(String[] args) {
		TreeSet<Person> sTree = new TreeSet<Person>();
		sTree.add(new Person("Lee", 24));
		sTree.add(new Person("Hong", 29));
		sTree.add(new Person("Choi", 21));
		
		Iterator<Person> itr = sTree.iterator();
		while(itr.hasNext())
			itr.next().showData();
	}
}
