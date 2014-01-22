package chap20.wrapper.random;

import java.util.Random;

public class PseudoRandom {
	public static void main(String[] args) { 
		Random rand = new Random(12); // seed를 12로 설정
		//rand.setSeed(System.currentTimeMillis()); // seed 바꾸기
		
		for(int i=0; i<6; i++) {
			System.out.println(rand.nextInt(46));
		}
	}
}
