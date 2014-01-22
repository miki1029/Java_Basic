package chap20.wrapper.random;

import java.util.Random;

public class RandomNumberGenerator {
	public static void main(String[] args) {
		Random rand = new Random();
		
		for(int i=0; i<6; i++) {
			System.out.println(rand.nextInt(46));
		}
	}
}
