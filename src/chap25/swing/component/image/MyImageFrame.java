package chap25.swing.component.image;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyImageFrame extends JFrame {

	// 멤버변수
	BufferedImage img = null;

	// 생성자
	public MyImageFrame() {
		this.setTitle("Image Load Test");

		try {
			img = ImageIO.read(new File("home.png"));

		} catch (IOException e) {
			e.printStackTrace();
		}
		add(new MyPanel());
		pack();
		setVisible(true);
	}

	// 멤버메소드

	// Inner Class 내부 클래스
	class MyPanel extends JPanel {

		@Override
		public void paint(Graphics g) {
			// super.paint(g);
			g.drawImage(img, 0, 0, null);
		}

		@Override
		public Dimension getPreferredSize() {
			if (img == null) {
				return new Dimension(100, 100);
			} else {
				return new Dimension(img.getWidth(), img.getHeight());
			}
		}
	}

	// 메인메소드
	public static void main(String[] args) {
		new MyImageFrame();
	}
}