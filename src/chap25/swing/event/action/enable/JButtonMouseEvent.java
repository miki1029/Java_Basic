package chap25.swing.event.action.enable;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JButtonMouseEvent {
	public static void main(String[] args) {
		JFrame frm = new JFrame("JButton Disable");
		frm.setBounds(120, 120, 250, 150);
		frm.setLayout(new FlowLayout());
		
		MouseListener mouseHandler = new MouseEventHandler();
		JButton btn1 = new JButton("Button One");
		btn1.addMouseListener(mouseHandler);
		JButton btn2 = new JButton("Button Two");
		btn2.addMouseListener(mouseHandler);
		
		frm.add(btn1);
		frm.add(btn2);
		// false임에도 불구 마우스 이벤트 발생 -> 액션 이벤트 기반으로 처리해야 함
		btn1.setEnabled(false);
		
		frm.setVisible(true);
	}
}
