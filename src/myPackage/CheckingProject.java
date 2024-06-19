package myPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class CheckingProject {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckingProject window = new CheckingProject();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CheckingProject() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelCustomQuestionSelection pn = new PanelCustomQuestionSelection();
		frame.add(pn);
		pn.setVisible(true);
		frame.setVisible(true);
		
		
		
	}

}
