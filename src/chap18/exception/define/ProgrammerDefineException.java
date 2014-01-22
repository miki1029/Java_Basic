package chap18.exception.define;

import java.util.Scanner;

public class ProgrammerDefineException {
	public static void main(String[] args) {
		System.out.print("나이를 입력하세요 : ");
		
		try {
			int age = readAge();
			System.out.println("당신은 " + age + "세 입니다.");
		} catch(AgeInputException e) {
			System.out.println(e.getMessage());
		}
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
