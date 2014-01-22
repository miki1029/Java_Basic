package chap25.swing.component.lookandfeel;

import java.awt.*;
import javax.swing.*;
import chap25.swing.component.combobox.*;

import java.util.Vector;

public class JComboBoxModel {
	public static void main(String[] args) {
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		JFrame frm = new JFrame("Choice Component");
		frm.setBounds(120, 120, 250, 120);
		frm.setLayout(new GridLayout(0, 2));
		
		Vector<MyFriend> friend = new Vector<MyFriend>();
		friend.add(new MyFriend("Yoon", 22));
		friend.add(new MyFriend("Hong", 23));
		friend.add(new MyFriend("Jung", 24));
		friend.add(new MyFriend("Kang", 25));
		
		JLabel label1 = new JLabel(" ComboBox");
		JComboBox cmbBox1 = new JComboBox(friend);
		cmbBox1.setMaximumRowCount(3);
		cmbBox1.addItemListener(new ChoiceHandler());
		
		JLabel label2 = new JLabel(" Editable ComboBox");
		JComboBox cmbBox2 = new JComboBox(friend);
		cmbBox2.setEditable(true);
		cmbBox2.addActionListener(new TextChangedHandler());

		frm.add(label1);
		frm.add(cmbBox1);
		frm.add(label2);
		frm.add(cmbBox2);
		
		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
