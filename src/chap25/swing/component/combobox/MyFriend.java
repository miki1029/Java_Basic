package chap25.swing.component.combobox;

public class MyFriend {
	String name;
	int age;
	
	public MyFriend(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name;
	}
	public void showFriendInfo() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
	}
}
