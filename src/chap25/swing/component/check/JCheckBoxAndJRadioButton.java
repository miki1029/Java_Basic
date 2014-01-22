package chap25.swing.component.check;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JCheckBoxAndJRadioButton {
	public static void main(String[] args) {
		JFrame frm = new JFrame("Choice Component");
		frm.setBounds(120, 120, 200, 200);
		frm.setLayout(new GridLayout(0, 1));
		
		JCheckBox checkBox = new JCheckBox("Are you a programmer");

		JRadioButton rbtn1 = new JRadioButton("I like C");
		JRadioButton rbtn2 = new JRadioButton("I like C++");
		JRadioButton rbtn3 = new JRadioButton("I like Java", true);
		
		ButtonGroup bGroup = new ButtonGroup();		
		bGroup.add(rbtn1);
		bGroup.add(rbtn2);
		bGroup.add(rbtn3);
		
		checkBox.addItemListener(new CheckBoxHandler(rbtn1, rbtn2, rbtn3));
		frm.add(checkBox);
		frm.add(rbtn1);
		frm.add(rbtn2);
		frm.add(rbtn3);

		rbtn1.setEnabled(false);
		rbtn2.setEnabled(false);
		rbtn3.setEnabled(false);
		
		rbtn1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
					System.out.println("I like C too");
			}
		});
		rbtn2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
					System.out.println("I like C++ too");
			}
		});
		rbtn3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
					System.out.println("I like Java too");
			}
		});
		
		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
