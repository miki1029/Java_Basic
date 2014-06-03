package chap25.swing.component.filedialog;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Button;
import javax.swing.JEditorPane;
import java.awt.Panel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.JMenuItem;
import java.awt.*;
import java.awt.geom.Point2D;

public class Swing_test_1 extends JDialog {
	/**
	 * Launch the application.
	 */
	ImagePanel imagePanel;

	public static void main(String[] args) {
		try {
			Swing_test_1 dialog = new Swing_test_1();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	/**
	 * Create the dialog.
	 */
	public Swing_test_1() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		{
			imagePanel = new ImagePanel();
			getContentPane().add(imagePanel, BorderLayout.CENTER);
		}
		{
			JMenuBar menuBar = new JMenuBar();
			setJMenuBar(menuBar);
			{
				JMenu mnFile = new JMenu("File");
				menuBar.add(mnFile);
				{
					JMenuItem mntmOpen = new JMenuItem("open");
					mntmOpen.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							JFileChooser fc = new JFileChooser();// 파일 다이얼로그를 호출
							int cm = fc.showOpenDialog(fc);// 파일 다이얼로그를 호출한다
							File file = fc.getSelectedFile();// 선택을 한 파일로 해준다
							imagePanel.setPath(file.toString());// 페널에 패스를 파일의
																// 이름으로 해준다
							imagePanel.repaint();// 이미지를 부르고 나서 다시 그려준다
						}

					});
					mnFile.add(mntmOpen);
				}
			}

		}
	}
}

class ImagePanel extends JPanel {
	Image image; // 이미지 객체 선언
	Toolkit toolkit = getToolkit(); // toolkit객체를 반환
	Point p = null; // x,y좌표에서의 위치를 나타낸다

	public ImagePanel() // 이미지이름을 받아온다.
	{
		p = new Point(0, 0); // x, y좌표를 0,0으로 초기화
	}

	void setPath(String path) {
		image = toolkit.getImage(path); // 이미지 객체 생성
	}

	public void paint(Graphics g) {
		g.clearRect(0, 0, getWidth(), getHeight()); // 화면에 있을지 모를 이미지를 지워준다
		if (image != null) // 이미지 객체가 null값이 아닌경우
		{
			g.drawImage(image, this.p.x, this.p.y, getWidth(), getHeight(),
					this);
			// 이미지 객체에 들어있는 이미지를 현재의 x, y좌표부터 윈도우의 크기까지 이미지를 보여준다
		}
	}
}
