package chap25.swing.event.adapter;

import java.awt.event.*;
import javax.swing.*;

public class AdapterEventHandling {
	public static void main(String[] args) {
		JFrame frm = new JFrame("Mouse Motion");
		frm.setBounds(120, 120, 250, 150);
		// frm.addMouseListener(new MouseEventHandler());
		frm.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("마우스 클릭");
			}
		});

		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
/*
 * MouseListener -> MouseAdapter MouseMotionListener -> MouseMotionAdapter
 * WindowListener -> WindowAdapter
 */