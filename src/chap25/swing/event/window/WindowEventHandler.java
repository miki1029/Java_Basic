package chap25.swing.event.window;

import javax.swing.*;
import java.awt.event.*;

public class WindowEventHandler implements WindowListener {
	String frameInfo;

	public WindowEventHandler(String info) {
		frameInfo = info;
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println(frameInfo + " windowOpened");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		JFrame frm = (JFrame)e.getWindow();
		frm.dispose(); // 프로그램 완전 종료. windowClosed가 호출됨.(완전 종료되면서)
		System.out.println(frameInfo + " windowClosing");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println(frameInfo + " windowClosed");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println(frameInfo + " windowIconified");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println(frameInfo + " windowDeiconified");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println(frameInfo + " windowActivated");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println(frameInfo + " windowDeactivated");
	}

}
