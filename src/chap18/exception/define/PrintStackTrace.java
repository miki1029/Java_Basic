package chap18.exception.define;

import java.util.Scanner;

public class PrintStackTrace {
	public static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		try {
			PersonalInfo readInfo = readPersonalInfo();
			readInfo.showPersonalInfo();
		} catch(AgeInputException e) {
			e.printStackTrace();
		} catch(NameLengthException e) {
			e.showWrongName();
			e.printStackTrace();
		}
	}
	
	public static PersonalInfo readPersonalInfo() throws AgeInputException, NameLengthException {
		String name = readName();
		int age = readAge();
		PersonalInfo pInfo = new PersonalInfo(name, age);
		return pInfo;
	}
	
	public static String readName() throws NameLengthException {
		System.out.print("이름 입력 : ");
		String name = keyboard.nextLine();
		if(name.length()<2)
			throw new NameLengthException(name);
		return name;
	}
	
	public static int readAge() throws AgeInputException {
		System.out.print("나이 입력 : ");
		int age = keyboard.nextInt();
		if(age<0)
			throw new AgeInputException();
		return age;
	}
}
