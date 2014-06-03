package chap25.swing.layout.grid;

import java.awt.*;
import javax.swing.*;

public class GridLayoutManager {
	public static void main(String[] args) {
		JFrame frm = new JFrame("GridLayout Test");
		frm.setBounds(120, 120, 300, 200);
		frm.setLayout(new GridLayout(3, 2, 2, 5));
		//frm.setLayout(new GridLayout(3, 2));

		frm.add(new JButton("One"));
		frm.add(new JButton("Two"));
		frm.add(new JButton("Three"));
		frm.add(new JButton("Four"));
		frm.add(new JButton("Five"));
		frm.add(new JButton("Six"));
		
		frm.setVisible(true);
	}
}
