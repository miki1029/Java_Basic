package chap25.swing.component.textarea;

import javax.swing.*;
import java.awt.event.*;

public class ButtonTextHandler implements ActionListener {
	JTextArea textArea;
	
	public ButtonTextHandler(JTextArea area) {
		textArea = area;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		textArea.setText("모두 지웠습니다. \n");
		textArea.append("원하는 내용 입력하세요. \n");
	}

}
