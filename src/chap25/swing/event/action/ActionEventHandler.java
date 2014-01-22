package chap25.swing.event.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getActionCommand());
	}

}
