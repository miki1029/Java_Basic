package chap25.swing.event.mouse.base;

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
		System.out.println("마우스 버튼 눌림");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스 버튼 풀림");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("커서 버튼 위 진입");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("커서 버튼 위 탈출");
	}

}
