package chap25.swing.event.base.listener.prob;

import java.awt.event.*;
import javax.swing.*;

public class MouseEventHandler implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton button = (JButton)e.getComponent();
		button.setText("Clicked");
		System.out.println("Clicked Button" + e.getButton());
		System.out.println("마우스 버튼 눌렸다 풀림");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}

}
