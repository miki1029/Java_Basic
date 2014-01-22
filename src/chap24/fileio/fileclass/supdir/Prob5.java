package chap24.fileio.fileclass.supdir;

import java.io.File;

public class Prob5 {
	public static void main(String[] args) {
		File dir = new File(System.getProperty("user.dir"));
		File[] list = dir.listFiles();
		System.out.println(dir.getName() + "의 정보");
		for(int i=0; i<list.length; i++) {
			if(list[i].getName().startsWith("."))
				continue;
			if(list[i].isDirectory())
				System.out.print("DIR\t");
			else
				System.out.print("FILE\t");
			System.out.println(list[i].getName());
		}
		System.out.println();

		File parentDir = dir.getParentFile();
		File[] parentList = parentDir.listFiles();
		System.out.println(parentDir.getName() + "의 정보");
		for(int i=0; i<parentList.length; i++) {
			if(parentList[i].getName().startsWith("."))
				continue;
			if(parentList[i].isDirectory())
				System.out.print("DIR\t");
			else
				System.out.print("FILE\t");
			System.out.println(parentList[i].getName());
		}
	}
}
