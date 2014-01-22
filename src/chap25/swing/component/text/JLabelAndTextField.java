package chap25.swing.component.text;

import java.awt.*;
import javax.swing.*;

public class JLabelAndTextField {
	public static void main(String[] args) {
		JFrame frm = new JFrame("JLavel & JTextField");
		frm.setBounds(120, 120, 180, 80);
		frm.setLayout(new GridLayout(2, 2));
		
		JLabel idLabel = new JLabel("ID ", SwingConstants.RIGHT);
		JTextField idText = new JTextField(10);
		
		JLabel pwLabel = new JLabel("Password ", SwingConstants.RIGHT);
		JPasswordField pwText = new JPasswordField(10);
		
		pwText.addActionListener(new PWHandler(idText, pwText));
		
		frm.add(idLabel);
		frm.add(idText);
		frm.add(pwLabel);
		frm.add(pwText);
		
		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
