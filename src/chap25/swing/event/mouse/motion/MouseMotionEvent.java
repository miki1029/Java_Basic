package chap25.swing.event.mouse.motion;

import javax.swing.*;

public class MouseMotionEvent {
	public static void main(String[] args) {	// throws Exception
		JFrame frm = new JFrame("Mouse Motion");
		frm.setBounds(120, 120, 250, 150);
		frm.addMouseMotionListener(new MouseMotionHandler());
		
		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
