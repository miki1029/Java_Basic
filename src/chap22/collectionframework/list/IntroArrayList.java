package chap22.collectionframework.list;

import java.util.ArrayList;

public class IntroArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(new Integer(11));
		list.add(new Integer(22));
		list.add(new Integer(33));
		
		System.out.println("1차 참조");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.remove(0);
		System.out.println("2차 참조");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		///////////////////////////////////////////////////////////////////
		// 22-1
		///////////////////////////////////////////////////////////////////
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.ensureCapacity(500);
		list2.ensureCapacity(list2.size()*2);
		
	}
}
