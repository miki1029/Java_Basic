package chap22.collectionframework.set.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEqualityOne {
	public static void main(String[] args) {
		HashSet<SimpleNumber> hSet = new HashSet<SimpleNumber>();
		hSet.add(new SimpleNumber(10));
		hSet.add(new SimpleNumber(20));
		hSet.add(new SimpleNumber(20));
		// 다른 인스턴스이지만 저장값은 같음... 고민거리 -> hashCode(), equals() 오버라이딩으로 해결
		
		System.out.println("저장된 데이터 수 : " + hSet.size());
		
		Iterator<SimpleNumber> itr = hSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
