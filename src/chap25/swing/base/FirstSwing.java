package chap25.swing.base;

import java.awt.*;
import javax.swing.*;

// swing: 자바로만 구현된 GUI 패키지
public class FirstSwing {
	public static void main(String[] args) {
		JFrame frm = new JFrame("First Swing");
		frm.setBounds(120, 120, 400, 100);
		frm.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("My Button");
		JButton btn2 = new JButton("Your Button");
		JButton btn3 = new JButton("Our Button");
		
		frm.add(btn1);
		frm.add(btn2);
		frm.add(btn3);
		frm.setVisible(true);
	}
}
