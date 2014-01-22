package chap25.swing.event.adapter;

import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class MouseEventHandler extends MouseAdapter {
	public void mouseClicked(MouseEvent e) {
		System.out.println("마우스 클릭");
	}
}
