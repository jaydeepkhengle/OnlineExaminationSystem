package myPackage;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelTestSubmittedStudent extends JPanel {

	private static final long serialVersionUID = 1L;
	private Toolkit tool;

	/**
	 * Create the panel.
	 */
	public PanelTestSubmittedStudent() {
		
		setBackground(new Color(255, 255, 255));
		tool = Toolkit.getDefaultToolkit();
		Dimension dim = tool.getScreenSize();
		int width = dim.width;
		int height = dim.height;
		
		setSize(1536, 821);
		setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(46, 61, 176));
		panel_4.setBounds(0, 83, 1536, 42);
		add(panel_4);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBackground(new Color(46, 61, 176));
		panel_4_1.setBounds(0, 796, 1536, 25);
		add(panel_4_1);
		
		JLabel lblCopyrightseducation = new JLabel("Copyrights 2022 @Education Centre");
		lblCopyrightseducation.setHorizontalAlignment(SwingConstants.CENTER);
		lblCopyrightseducation.setForeground(Color.WHITE);
		lblCopyrightseducation.setFont(new Font("Dialog", Font.BOLD, 15));
		lblCopyrightseducation.setBounds(562, 0, 418, 25);
		panel_4_1.add(lblCopyrightseducation);
		
		JPanel panelTitle = new JPanel();
		panelTitle.setLayout(null);
		panelTitle.setBackground(new Color(0, 128, 255));
		panelTitle.setBounds(0, 0, 1536, 80);
		add(panelTitle);
		
		JLabel lblExamUniversity = new JLabel("N Infinity Info Solutions");
		lblExamUniversity.setHorizontalAlignment(SwingConstants.CENTER);
		lblExamUniversity.setForeground(new Color(255, 255, 255));
		lblExamUniversity.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblExamUniversity.setBounds(396, 0, 743, 80);
		panelTitle.add(lblExamUniversity);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Ashish Mandke\\OneDrive\\Desktop\\green-check-mark-icon-tick-symbol-in-green-color-illustration-free-vector.jpg"));
		lblNewLabel.setBounds(593, 168, 350, 249);
		add(lblNewLabel);
		
		JLabel lblThankYou = new JLabel("Thank You !");
		lblThankYou.setHorizontalAlignment(SwingConstants.CENTER);
		lblThankYou.setForeground(new Color(7, 141, 68));
		lblThankYou.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblThankYou.setBounds(396, 427, 743, 80);
		add(lblThankYou);
		
		JLabel lblTestHasBeen = new JLabel("Test has been Submitted Successfully");
		lblTestHasBeen.setHorizontalAlignment(SwingConstants.CENTER);
		lblTestHasBeen.setForeground(new Color(0, 0, 0));
		lblTestHasBeen.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblTestHasBeen.setBounds(396, 517, 743, 80);
		add(lblTestHasBeen);
		
		JLabel lblViewResult = new JLabel("<html><u>View Result</u></html>");
		lblViewResult.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblViewResult.setForeground(new Color(0, 0, 176));
			}
			public void mouseExited(MouseEvent e) {
				lblViewResult.setForeground(new Color(0, 0, 255));
			}
			public void mouseClicked(MouseEvent e) {
				lblViewResult.setForeground(new Color(0, 0, 176));
				setVisible(false);
				MainExamPageStudent.frame.setVisible(false);
				DisplayCurrentTestResultStudent.main(null);
			}
		});
		lblViewResult.setForeground(new Color(0, 0, 255));
		lblViewResult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblViewResult.setBounds(716, 590, 103, 34);
		add(lblViewResult);

	}
}
