package chap25.swing.component.text;

import javax.swing.*;
import java.awt.event.*;

public class PWHandler implements ActionListener {
	JTextField id;
	JPasswordField pw;

	public PWHandler(JTextField id, JPasswordField pw) {
		this.id = id;
		this.pw = pw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ID : " + id.getText());
		System.out.println("Password : " + new String(pw.getPassword()));
		id.setText("");
		pw.setText("");
	}

}
