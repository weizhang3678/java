package javastudy.yf.lab.minesweeper;

import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

class Main extends JFrame { 

	private static int SIZEX = 16;
	private static int SIZEY = 30;

	public Main() {
		setTitle("MineSweeper"); // set title
		setSize(SIZEY * 60, (SIZEX + 1) * 60); // set size
		setLocation(20, 10); // set location
		setResizable(false); // set size non-modifiable
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // set close mode
		getContentPane().setLayout(new GridLayout(SIZEX + 1, SIZEY, 5, 5)); // set layout is GridLayout

		Panel GamePanel = new Panel(this); // create a Grids
		addWindowListener // override windows closing event
		(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				GamePanel.SaveTimeRecord(); // save records
				System.exit(0);
			}
		});
		this.setVisible(true); // show this window
	}

	public static void main(String args[]) {
		JFrame.setDefaultLookAndFeelDecorated(true); // set look and feel
		new Main();
	}
}
