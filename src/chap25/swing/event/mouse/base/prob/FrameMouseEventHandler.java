package chap25.swing.event.mouse.base.prob;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

// MyJFrame에 포함시킴(필요없는 클래스)
public class FrameMouseEventHandler implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("JFrame상에서 마우스 버튼 눌렸다 풀림");

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
