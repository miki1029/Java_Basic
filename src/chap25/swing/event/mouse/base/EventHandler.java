package chap25.swing.event.mouse.base;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventHandler {
	public static void main(String[] args) {
		JFrame	frm = new JFrame("First Swing");
		frm.setBounds(120, 120, 400, 100);
		frm.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("My Button");
		MouseListener listner = new MouseEventHandler();
		btn1.addMouseListener(listner);
		
		JButton btn2 = new JButton("Your Button");
		btn2.addMouseListener(listner);
		
		JButton btn3 = new JButton("Our Button");
		btn3.addMouseListener(listner);

		frm.add(btn1);
		frm.add(btn2);
		frm.add(btn3);
		frm.setVisible(true);
	}
}
