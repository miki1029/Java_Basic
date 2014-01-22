package chap25.swing.component.combobox;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceHandler implements ItemListener {

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getStateChange() == ItemEvent.SELECTED) {
			System.out.println("Selected...");
			((MyFriend)e.getItem()).showFriendInfo();
		}
		else {
			System.out.println("Deselected...");
			((MyFriend)e.getItem()).showFriendInfo();
		}
	}

}
