package chap25.swing.component.image;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyImageFrame2 extends JFrame {

	BufferedImage img = null;

	// MyPanel panel;
	// 생성자
	public MyImageFrame2() {
		setTitle("Image Load Test");
		try {
			img = ImageIO.read(new File("home.png"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new MyPanel());
		pack();
		setVisible(true);
	}

	// 내부 클래스
	class MyPanel extends JPanel {
		@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			super.paint(g);
			g.drawImage(img, 0, 0, null);
		}

		public Dimension getPreferredSize() {
			if (img == null) {
				return new Dimension(100, 100);
			} else {
				return new Dimension(img.getWidth(null), img.getHeight(null));
			}
		}
	}

	public static void main(String[] args) {
		new MyImageFrame2();
	}

}