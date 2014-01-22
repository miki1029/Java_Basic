package chap25.swing.component.combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextChangedHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if((e.getActionCommand()).compareTo("comboBoxEdited")==0)
			System.out.println("ComboBox Edited");
		else // comboBoxChanged
			System.out.println("ComboBox Changed");
	}

}
