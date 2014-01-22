package chap25.swing.component.check;

import javax.swing.*;
import java.awt.event.*;

public class CheckBoxHandler implements ItemListener {
	JRadioButton btn1;
	JRadioButton btn2;
	JRadioButton btn3;
	
	public CheckBoxHandler(JRadioButton b1, JRadioButton b2, JRadioButton b3) {
		btn1 = b1;
		btn2 = b2;
		btn3 = b3;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getStateChange() == ItemEvent.SELECTED) {
			btn1.setEnabled(true);
			btn2.setEnabled(true);
			btn3.setEnabled(true);
		}
		else {		// ItemEvent.DESELECTED
			btn1.setEnabled(false);
			btn2.setEnabled(false);
			btn3.setEnabled(false);
		}
	}

}
