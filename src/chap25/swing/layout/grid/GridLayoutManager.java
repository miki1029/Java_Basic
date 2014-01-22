package chap25.swing.layout.grid;

import java.awt.*;
import javax.swing.*;

public class GridLayoutManager {
	public static void main(String[] args) {
		JFrame frm = new JFrame("GridLayout Test");
		frm.setBounds(120, 120, 300, 200);
		frm.setLayout(new GridLayout(3, 2, 2, 5));
		//frm.setLayout(new GridLayout(3, 2));

		frm.add(new Button("One"));
		frm.add(new Button("Two"));
		frm.add(new Button("Three"));
		frm.add(new Button("Four"));
		frm.add(new Button("Five"));
		frm.add(new Button("Six"));
		
		frm.setVisible(true);
	}
}
