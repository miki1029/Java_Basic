package chap22.collectionframework.set.treeset.comparator;

import java.util.Comparator;

public class StrLenComparator implements Comparator<String> {
	public int compare(String str1, String str2) {
		return str1.length() - str2.length();
	}
}
