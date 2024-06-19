package myPackage;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import jdbc.MySQL;

import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class ExamInstructionStudent extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private HomePageStudent homePageStudent;
	public static JTextArea txtInstructions;
	private JTextField txtTestCode;

	/**
	 * Create the panel.
	 */
	public ExamInstructionStudent() {
		setBackground(new Color(255, 255, 255));
		
		
		setSize(1238, 450);
		setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(46, 61, 176));
		panel_1.setBounds(0, 0, 1238, 47);
		add(panel_1);
		
		JLabel lblInstructions = new JLabel("Test Name");
		lblInstructions.setHorizontalAlignment(SwingConstants.CENTER);
		lblInstructions.setForeground(Color.WHITE);
		lblInstructions.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblInstructions.setBackground(Color.WHITE);
		lblInstructions.setBounds(514, 0, 210, 47);
		panel_1.add(lblInstructions);
		
		JLabel lblNewLabel = new JLabel("Instructions");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(451, 49, 335, 57);
		add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(50, 104, 1138, 2);
		add(separator);
		
		txtInstructions = new JTextArea();
//		txtInstructions.setText();
		txtInstructions.setEditable(false);
		txtInstructions.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtInstructions.setBounds(67, 125, 1104, 150);
		add(txtInstructions);
		
		JButton btnClear = new JButton("Take Test");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				HomePageStudent.frame.setVisible(false);
				MainExamPageStudent.main(null);	
				MySQL mySql = new MySQL();
				
				String testNameTemp = PanelDisplayActiveExamStudent.testNameRetrieved;
				String testName = "";

				for(int i=0;i<testNameTemp.length();i++){
					if(Character.isAlphabetic(testNameTemp.charAt(i))) {
						testName += testNameTemp.charAt(i);
					}
				}
				testName += "_results";
				
				mySql.deleteTheRows(testName);
			}
		});
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Arial Black", Font.PLAIN, 19));
		btnClear.setBackground(new Color(46, 61, 176));
		btnClear.setBounds(493, 394, 252, 33);
		add(btnClear);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(50, 375, 1138, 2);
		add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("Best of luck for your exam");
		lblNewLabel_1.setFont(new Font("Stencil", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(82, 324, 290, 41);
		add(lblNewLabel_1);

	}
}
