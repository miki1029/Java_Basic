package chap25.swing.component.scroll;

import java.awt.*;
import javax.swing.*;
import chap25.swing.component.textarea.ButtonTextHandler;

public class JTextAreaScrollAdded {
	public static void main(String[] args) {
		JFrame frm = new JFrame("JTextArea");
		frm.setBounds(120, 120, 250, 270);
		frm.setLayout(new FlowLayout());
		
		JTextArea textArea = new JTextArea(10, 20);
		textArea.append("원하는 내용을 입력하세요. \n");
		textArea.setCaretPosition(textArea.getText().length());
		
	//	textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		
		JButton btn = new JButton("Clear");
		btn.addActionListener(new ButtonTextHandler(textArea));
		
		JScrollPane simpleScroll = new JScrollPane(textArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		frm.add(simpleScroll);
		frm.add(btn);
		
		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
