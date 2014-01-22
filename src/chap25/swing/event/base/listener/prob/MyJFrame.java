package chap25.swing.event.base.listener.prob;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MyJFrame extends JFrame implements MouseListener {
	JButton btn1;
	JButton btn2;
	JButton btn3;
	
	public MyJFrame() {
		this("");
	}
	public MyJFrame(String name) {
		super(name);
		setBounds(120, 120, 400, 100);
		setLayout(new FlowLayout());
		addMouseListener(this);

		MouseListener listner = new MouseEventHandler();
		
		btn1 = new JButton("My Button");
		btn1.addMouseListener(listner);
		
		btn2 = new JButton("Your Button");
		btn2.addMouseListener(listner);
		
		btn3 = new JButton("Our Button");
		btn3.addMouseListener(listner);

		add(btn1);
		add(btn2);
		add(btn3);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("JFrame상에서 마우스 버튼 눌렸다 풀림");
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
