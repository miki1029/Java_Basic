package chap24.fileio.instance;

import java.io.*;

public class ObjectSerializable {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Object_ser"));
		
		out.writeObject(new Circle(1, 1, 2.4));
		out.writeObject(new Circle(2, 2, 4.8));
		
		out.writeObject(new String("String implements Serializable"));
		out.close();
		
		// 인스턴스 복원
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Object_ser"));
		Circle c1 = (Circle)in.readObject();
		Circle c2 = (Circle)in.readObject();
		String message = (String)in.readObject();
		in.close();
		
		c1.showCircleInfo();
		c2.showCircleInfo();
		System.out.println(message);
	}
}
