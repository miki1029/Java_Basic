package chap22.collectionframework.set.treeset.comparator;

import java.util.TreeSet;
import java.util.Iterator;

public class IntroComparator {
	public static void main(String[] args) {
		TreeSet<String> tSet = new TreeSet<String>(new StrLenComparator());
		tSet.add("Orange");
		tSet.add("Apple");
		tSet.add("Dog");
		tSet.add("Individual");
		
		Iterator<String> itr = tSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		Iterator<String> dItr = tSet.descendingIterator();
		while(dItr.hasNext())
			System.out.println(dItr.next());
	}
}
