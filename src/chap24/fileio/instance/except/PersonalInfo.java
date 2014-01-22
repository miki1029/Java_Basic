package chap24.fileio.instance.except;

import java.io.Serializable;

public class PersonalInfo implements Serializable {
	String name;
	transient String secretInfo;
	
	int age;
	transient int secretNum;
	
	public PersonalInfo(String name, String sInfo, int age, int sNum) {
		this.name = name;
		this.secretInfo = sInfo;
		this.age = age;
		this.secretNum = sNum;
	}
	
	public void showCircleInfo() {
		System.out.println("name : " + name);
		System.out.println("secret info : " + secretInfo);
		System.out.println("age : " + age);
		System.out.println("secret num : " + secretNum);
		System.out.println();
	}
}
