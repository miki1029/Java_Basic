package chap24.fileio.instance;

import java.io.Serializable;

public class Point implements Serializable {
	int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
