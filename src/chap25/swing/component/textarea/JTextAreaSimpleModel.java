package chap25.swing.component.textarea;

import java.awt.*;
import javax.swing.*;

public class JTextAreaSimpleModel {
	public static void main(String[] args) {
		JFrame frm = new JFrame("JTextArea");
		frm.setBounds(120, 120, 250, 270);
		frm.setLayout(new FlowLayout());
		
		JTextArea textArea = new JTextArea(10, 20);
		textArea.append("원하는 내용을 입력하세요. \n");
		textArea.setCaretPosition(textArea.getText().length());
		
		textArea.setLineWrap(true);			// 바꿔보기
		textArea.setWrapStyleWord(false);	// 바꿔보기
		
		JButton btn = new JButton("Clear");
		btn.addActionListener(new ButtonTextHandler(textArea));
		frm.add(textArea);
		frm.add(btn);
		
		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
