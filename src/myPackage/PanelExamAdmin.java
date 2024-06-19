package myPackage;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelExamAdmin extends JPanel {

	private static final long serialVersionUID = 1L;
   
	
	Toolkit tool;
	private final JLabel lblCopyrightseducation = new JLabel("Copyrights 2022 @Education Centre");
	private JTextField txtTestName;
	private JTextField txtTestCode;
	private JTextField txtMarks;
	private JTextField txtDuration;
	static JPanel panelBtnDeployTest, panelbtnAddQuestions, panelBtnBlank, panelbtnCreateTest;
	private PanelCreateNewTestAdmin panelCreateNewTestAdmin;
	private JPanel panelDeployTest;
	
	public PanelExamAdmin() {
		setBackground(new Color(255, 255, 255));
		setSize(1238,653);
		setLayout(null);
		
		 panelDeployTest = new JPanel();
		 panelDeployTest.setBorder(new LineBorder(new Color(0, 0, 0)));
		 panelDeployTest.setBackground(new Color(255, 255, 255));
		 panelDeployTest.setBounds(309, 163, 619, 327);
		 add(panelDeployTest);
		 panelDeployTest.setLayout(null);
		 panelDeployTest.setVisible(false);
		 
		 JLabel lblNewLabel = new JLabel("Select Test to Deploy : ");
		 lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 14));
		 lblNewLabel.setBounds(114, 41, 210, 32);
		 panelDeployTest.add(lblNewLabel);
		 
		 JComboBox comboBox = new JComboBox();
		 comboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		 comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Test"}));
		 comboBox.setBounds(328, 48, 167, 21);
		 panelDeployTest.add(comboBox);
		 
		 JSeparator separator = new JSeparator();
		 separator.setBounds(70, 79, 478, 2);
		 panelDeployTest.add(separator);
		 
		 JLabel lblNewLabel_2 = new JLabel("Test Name : ");
		 lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 14));
		 lblNewLabel_2.setBounds(44, 118, 105, 21);
		 panelDeployTest.add(lblNewLabel_2);
		 
		 txtTestName = new JTextField();
		 txtTestName.setBounds(161, 121, 124, 19);
		 panelDeployTest.add(txtTestName);
		 txtTestName.setColumns(10);
		 
		 JLabel lblNewLabel_2_1 = new JLabel("Test Code : ");
		 lblNewLabel_2_1.setFont(new Font("Arial Black", Font.PLAIN, 14));
		 lblNewLabel_2_1.setBounds(328, 118, 105, 21);
		 panelDeployTest.add(lblNewLabel_2_1);
		 
		 txtTestCode = new JTextField();
		 txtTestCode.setColumns(10);
		 txtTestCode.setBounds(445, 121, 124, 19);
		 panelDeployTest.add(txtTestCode);
		 
		 JLabel lblNewLabel_2_2 = new JLabel("Marks : ");
		 lblNewLabel_2_2.setFont(new Font("Arial Black", Font.PLAIN, 14));
		 lblNewLabel_2_2.setBounds(44, 179, 105, 21);
		 panelDeployTest.add(lblNewLabel_2_2);
		 
		 txtMarks = new JTextField();
		 txtMarks.setColumns(10);
		 txtMarks.setBounds(161, 182, 124, 19);
		 panelDeployTest.add(txtMarks);
		 
		 txtDuration = new JTextField();
		 txtDuration.setColumns(10);
		 txtDuration.setBounds(445, 182, 124, 19);
		 panelDeployTest.add(txtDuration);
		 
		 JLabel lblNewLabel_2_1_1 = new JLabel("Duration : ");
		 lblNewLabel_2_1_1.setFont(new Font("Arial Black", Font.PLAIN, 14));
		 lblNewLabel_2_1_1.setBounds(328, 179, 105, 21);
		 panelDeployTest.add(lblNewLabel_2_1_1);
		 
		 JButton btnDeploy = new JButton("Deploy");
		 btnDeploy.setBackground(new Color(0, 255, 0));
		 btnDeploy.setForeground(new Color(0, 0, 0));
		 btnDeploy.setFont(new Font("Tahoma", Font.BOLD, 12));
		 btnDeploy.setBounds(383, 250, 85, 32);
		 panelDeployTest.add(btnDeploy);
		 
		 JButton btnBack = new JButton("Back");
		 btnBack.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		
		 		panelDeployTest.setVisible(false);
		 		
		 		PanelExamAdmin.panelbtnCreateTest.setVisible(true);
				PanelExamAdmin.panelBtnDeployTest.setVisible(true);
				PanelExamAdmin.panelbtnAddQuestions.setVisible(true);
				PanelExamAdmin.panelBtnBlank.setVisible(true);
		 		
		 		
		 	}
		 });
		 btnBack.setFont(new Font("Tahoma", Font.BOLD, 12));
		 btnBack.setBackground(new Color(255, 0, 0));
		 btnBack.setBounds(149, 250, 85, 32);
		 panelDeployTest.add(btnBack);
		 
		 JSeparator separator_1 = new JSeparator();
		 separator_1.setBounds(70, 225, 478, 2);
		 panelDeployTest.add(separator_1);
		 
		 JLabel lblDeployTest_1 = new JLabel("Deploy Test");
		 lblDeployTest_1.setBounds(207, 0, 210, 32);
		 panelDeployTest.add(lblDeployTest_1);
		 lblDeployTest_1.setForeground(new Color(0, 0, 0));
		 lblDeployTest_1.setHorizontalAlignment(SwingConstants.CENTER);
		 lblDeployTest_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		
		panelbtnCreateTest = new JPanel();
		panelbtnCreateTest.setBackground(new Color(215, 0, 0));
		panelbtnCreateTest.setBounds(202, 130, 228, 102);
		add(panelbtnCreateTest);
		panelbtnCreateTest.setLayout(null);
		
		JLabel lblCreateTest = new JLabel("Create New Test");
		lblCreateTest.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				panelCreateNewTestAdmin.setVisible(true);
				
				panelbtnCreateTest.setVisible(false);
				panelbtnAddQuestions.setVisible(false);
				panelBtnDeployTest.setVisible(false);
				panelBtnBlank.setVisible(false);
				
			}
		});
		lblCreateTest.setForeground(new Color(255, 255, 255));
		lblCreateTest.setBackground(new Color(192, 192, 192));
		lblCreateTest.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblCreateTest.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreateTest.setBounds(10, 10, 208, 82);
		panelbtnCreateTest.add(lblCreateTest);
		
		panelBtnDeployTest = new JPanel();
		panelBtnDeployTest.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelDeployTest.setVisible(true);
				
				panelbtnCreateTest.setVisible(false);
				panelbtnAddQuestions.setVisible(false);
				panelBtnDeployTest.setVisible(false);
				panelBtnBlank.setVisible(false);
				
				
				
			}
		});
		panelBtnDeployTest.setBackground(new Color(215, 0, 0));
		panelBtnDeployTest.setLayout(null);
		panelBtnDeployTest.setBounds(757, 130, 228, 102);
		add(panelBtnDeployTest);
		
		JLabel lblDeployTest = new JLabel("Deploy Test");
		lblDeployTest.setForeground(new Color(255, 255, 255));
		lblDeployTest.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeployTest.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblDeployTest.setBounds(10, 10, 208, 82);
		panelBtnDeployTest.add(lblDeployTest);
		
		panelbtnAddQuestions = new JPanel();
		panelbtnAddQuestions.setBackground(new Color(215, 0, 0));
		panelbtnAddQuestions.setLayout(null);
		panelbtnAddQuestions.setBounds(202, 350, 228, 102);
		add(panelbtnAddQuestions);
		
		JLabel lblAddQuestion = new JLabel("Add Question");
		lblAddQuestion.setForeground(new Color(255, 255, 255));
		lblAddQuestion.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddQuestion.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblAddQuestion.setBounds(10, 10, 208, 82);
		panelbtnAddQuestions.add(lblAddQuestion);
		
		panelBtnBlank = new JPanel();
		panelBtnBlank.setBackground(new Color(215, 0, 0));
		panelBtnBlank.setLayout(null);
		panelBtnBlank.setBounds(757, 350, 228, 102);
		add(panelBtnBlank);
		
		JLabel lblNewLabel_3 = new JLabel("-----");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblNewLabel_3.setBounds(10, 10, 208, 82);
		panelBtnBlank.add(lblNewLabel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(46, 61, 176));
		panel_4.setBounds(0, 0, 1238, 47);
		add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Manage Test");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1.setBounds(505, 10, 228, 27);
		panel_4.add(lblNewLabel_1);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBackground(new Color(46, 61, 176));
		panel_4_1.setBounds(0, 628, 1238, 25);
		add(panel_4_1);
		panel_4_1.setLayout(null);
		lblCopyrightseducation.setFont(new Font("Dialog", Font.BOLD, 15));
		lblCopyrightseducation.setHorizontalAlignment(SwingConstants.CENTER);
		lblCopyrightseducation.setBounds(410, 0, 418, 25);
		panel_4_1.add(lblCopyrightseducation);
		lblCopyrightseducation.setForeground(new Color(255, 255, 255));
		
		panelCreateNewTestAdmin = new PanelCreateNewTestAdmin();
		add(panelCreateNewTestAdmin);
		panelCreateNewTestAdmin.setVisible(false);
		
		

		

	}
}
