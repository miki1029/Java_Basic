package chap24.fileio.fileclass;

import java.io.File;

public class ListFileDirectoryInfo {
	public static void main(String[] args) {
		File myDir = new File(File.separator + "home" + File.separator + "miki29");
		File[] list = myDir.listFiles();
		
		for(int i=0; i<list.length; i++) {
			if(list[i].getName().startsWith("."))
				continue;
			System.out.print(list[i].getName());
			if(list[i].isDirectory())
				System.out.println("\t \t DIR");
			else
				System.out.println("\t \t FILE");
		}
	}
}
