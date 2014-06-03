package chap25.swing.event.window.exit;

import javax.swing.*;

public class SetDefaultCloseOperation {
	public static void main(String[] args) {	// throws Exception
		JFrame frmOne = new JFrame("Frame One");
		JFrame frmTwo = new JFrame("Frame Two");
		
		frmOne.setBounds(120, 120, 250, 150);
		frmTwo.setBounds(380, 120, 250, 150);

		frmOne.add(new JButton("Button One"));
		frmTwo.add(new JButton("Button Two"));
		
		
//		frmOne.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
//		frmTwo.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		frmOne.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // frm.dispose() 효과
		frmTwo.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); // System.exit(0) 효과
		
		frmOne.setVisible(true);
		frmTwo.setVisible(true);
	}
}
