package chap24.fileio.instance;

import java.io.*;

public class Circle implements Serializable {
	Point p;
	double rad;
	
	public Circle(int x, int y, double r) {
		p = new Point(x, y);
		rad = r;
	}
	
	public void showCircleInfo() {
		System.out.printf("[%d, %d] \n", p.x, p.y);
		System.out.println("rad : " + rad);
	}
}
