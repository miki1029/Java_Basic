package chap24.fileio.instance.except;

import java.io.*;

public class TransientMembers {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Personal_ser"));
		
		PersonalInfo info = new PersonalInfo("John", "baby", 3, 42);
		info.showCircleInfo();
		out.writeObject(info);
		out.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Personal_ser"));
		
		PersonalInfo recovInfo = (PersonalInfo)in.readObject();
		in.close();
		
		recovInfo.showCircleInfo();
	}
}
