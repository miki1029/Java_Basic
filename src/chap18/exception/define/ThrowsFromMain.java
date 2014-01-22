package chap18.exception.define;

import java.util.Scanner;

public class ThrowsFromMain {
	public static void main(String[] args) throws AgeInputException {
		System.out.print("나이를 입력하세요 : ");
		int age = readAge();
		System.out.println("당신은 " + age + "세 입니다.");
	}
	
	public static int readAge() throws AgeInputException {
		Scanner keyboard = new Scanner(System.in);
		int age = keyboard.nextInt();
		if(age<0) {
			AgeInputException except = new AgeInputException();
			throw except;
		}
		return age;
	}
}
