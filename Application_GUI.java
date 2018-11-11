import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class Application_GUI {



	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application_GUI window = new Application_GUI();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 
	 */
	public Application_GUI() {
		frame = new JFrame();



		JPanel left = new JPanel();
		left.setSize(400, 600);
		left.setBackground(Color.BLUE);
		left.setVisible(true);
		left.add(new JButton("Login"));

		JPanel right = new JPanel();
		right.setSize(400, 600);
		right.setBackground(Color.RED);
		right.setVisible(true);		
		right.add(new JButton("BUTTON NAME??"));


		JSplitPane splitPane = new JSplitPane();
		splitPane.setSize(500, 500);
		splitPane.setDividerSize(20);
		splitPane.setDividerLocation(350);
		splitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
		splitPane.setLeftComponent(right);
		splitPane.setRightComponent(left);



		frame.add(splitPane);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setSize(800, 800);
		frame.setVisible(true);	
	}

}
