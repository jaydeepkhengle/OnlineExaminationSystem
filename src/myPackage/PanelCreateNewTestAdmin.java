package myPackage;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import jdbc.MySQL;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class PanelCreateNewTestAdmin extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtTestName;
	private JTextField txtNumberOfQuestions;
	private JTextField txtDuration;
	private JTextField txtMarks;
	private PanelCustomQuestionSelection panelCustomQuestionSelection;
	public static JRadioButton rdBtnRandomQuesSet,rdBtnCustomiseQuesSet;
	public static JComboBox comboBoxSubject;
	private JTextArea txtInstructions;
	private static Component[] components;
	private static PanelCreateNewTestAdmin panelCreateNewTestAdmin = new PanelCreateNewTestAdmin();
	

	public PanelCreateNewTestAdmin() {
		setBackground(new Color(255, 255, 255));
		setSize(1238,653);
		setLayout(null);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(46, 61, 176));
		panel_4.setBounds(0, 0, 1238, 47);
		add(panel_4);

		JLabel lblNewLabel_1 = new JLabel("Manage Test -  Create New Test");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(420, 10, 398, 27);
		panel_4.add(lblNewLabel_1);

		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBackground(new Color(46, 61, 176));
		panel_4_1.setBounds(0, 628, 1238, 25);
		add(panel_4_1);

		JLabel lblCopyrightseducation = new JLabel("Copyrights 2022 @Education Centre");
		lblCopyrightseducation.setBounds(410, 0, 418, 25);
		panel_4_1.add(lblCopyrightseducation);
		lblCopyrightseducation.setHorizontalAlignment(SwingConstants.CENTER);
		lblCopyrightseducation.setForeground(Color.WHITE);
		lblCopyrightseducation.setFont(new Font("Dialog", Font.BOLD, 15));

		JLabel lblTestName = new JLabel("Test Name : ");
		lblTestName.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblTestName.setBounds(41, 76, 134, 25);
		add(lblTestName);

		txtTestName = new JTextField();
		txtTestName.setBackground(new Color(192, 192, 192));
		txtTestName.setBounds(210, 76, 220, 25);
		add(txtTestName);
		txtTestName.setColumns(10);

		comboBoxSubject = new JComboBox();
		comboBoxSubject.setBackground(new Color(192, 192, 192));
		comboBoxSubject.setFont(new Font("Dialog", Font.BOLD, 19));
		comboBoxSubject.setModel(new DefaultComboBoxModel(new String[] {"Java\t\t\t\t\t", "Python", "C++"}));
		comboBoxSubject.setBounds(825, 75, 220, 27);
		add(comboBoxSubject);

		JLabel lblSubject = new JLabel("Subject : ");
		lblSubject.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblSubject.setBounds(648, 76, 134, 25);
		add(lblSubject);

		JLabel lblNumberOfQuestions = new JLabel("No. of Ques : ");
		lblNumberOfQuestions.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblNumberOfQuestions.setBounds(41, 142, 141, 25);
		add(lblNumberOfQuestions);

		txtNumberOfQuestions = new JTextField();
		txtNumberOfQuestions.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				txtInstructions.setText("1) Welcome to the Online of exam of Eduaction Center\r\n2) Exam has total " + txtNumberOfQuestions.getText() + " number of quetions\r\n3) Total duration of exam is " + txtDuration.getText() + " minutes\t\r\n4) No Negative Marking\r\n5) Test can be submitted only after first 15 minutes.");
			}
		});
		txtNumberOfQuestions.setColumns(10);
		txtNumberOfQuestions.setBackground(Color.LIGHT_GRAY);
		txtNumberOfQuestions.setBounds(210, 142, 220, 25);
		add(txtNumberOfQuestions);

		JLabel lblDuration = new JLabel("Duration : ");
		lblDuration.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblDuration.setBounds(648, 142, 134, 25);
		add(lblDuration);

		txtDuration = new JTextField();
		txtDuration.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				txtInstructions.setText("1) Welcome to the Online of exam of Eduaction Center\r\n2) Exam has total " + txtNumberOfQuestions.getText() + " number of quetions\r\n3) Total duration of exam is " + txtDuration.getText() + " minutes\t\r\n4) No Negative Marking\r\n5) Test can be submitted only after first 15 minutes.");
			}
		});
		txtDuration.setColumns(10);
		txtDuration.setBackground(Color.LIGHT_GRAY);
		txtDuration.setBounds(825, 142, 220, 25);
		add(txtDuration);

		rdBtnRandomQuesSet = new JRadioButton("Random Set");
		rdBtnRandomQuesSet.setFont(new Font("Dialog", Font.BOLD, 17));
		rdBtnRandomQuesSet.setBounds(211, 208, 125, 25);
		add(rdBtnRandomQuesSet);
		
		

		rdBtnCustomiseQuesSet = new JRadioButton("Custom Set");
		rdBtnCustomiseQuesSet.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				components = getComponents();
		        for (Component component : components) {
		            component.setVisible(false);
		        }
				panelCustomQuestionSelection.setVisible(true);
			}
		});
		rdBtnCustomiseQuesSet.setFont(new Font("Dialog", Font.BOLD, 17));
		rdBtnCustomiseQuesSet.setBounds(338, 208, 125, 25);
		add(rdBtnCustomiseQuesSet);

		JLabel lblQuesSet = new JLabel("Ques. Set : ");
		lblQuesSet.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblQuesSet.setBounds(41, 208, 134, 25);
		add(lblQuesSet);

		JLabel lblMarks = new JLabel("Marks : ");
		lblMarks.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblMarks.setBounds(648, 207, 141, 25);
		add(lblMarks);

		txtMarks = new JTextField();
		txtMarks.setColumns(10);
		txtMarks.setBackground(Color.LIGHT_GRAY);
		txtMarks.setBounds(825, 208, 220, 25);
		add(txtMarks);

		JLabel lblInstructions = new JLabel("Instructions : ");
		lblInstructions.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblInstructions.setBounds(41, 267, 154, 25);
		add(lblInstructions);

		txtInstructions = new JTextArea();
		txtInstructions.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				txtInstructions.setText("1) Welcome to the Online of exam of Eduaction Center\r\n2) Exam has total " + txtNumberOfQuestions.getText() + " number of quetions\r\n3) Total duration of exam is " + txtDuration.getText() + " minutes\t\r\n4) No Negative Marking\r\n5) Test can be submitted only after first 15 minutes.");
			}
		});
		txtInstructions.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtInstructions.setBackground(new Color(192, 192, 192));
		txtInstructions.setText("1) Welcome to the Online of exam of Eduaction Center\r\n2) Exam has total " + txtNumberOfQuestions.getText() + " number of quetions\r\n3) Total duration of exam is " + txtDuration.getText() + " minutes\t\r\n4) No Negative Marking\r\n5) Test can be submitted only after first 15 minutes.");
		txtInstructions.setBounds(210, 271, 835, 245);
		add(txtInstructions);

		JButton btnBack = new JButton("Back ");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);

				PanelExamAdmin.panelbtnCreateTest.setVisible(true);
				PanelExamAdmin.panelBtnDeployTest.setVisible(true);
				PanelExamAdmin.panelbtnAddQuestions.setVisible(true);
				PanelExamAdmin.panelBtnBlank.setVisible(true);	
			}
		});
		btnBack.setBackground(new Color(230, 0, 0));
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnBack.setBounds(250, 563, 112, 37);
		add(btnBack);

		JButton btnClear = new JButton("Clear");
		btnClear.setBackground(new Color(17, 89, 238));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClear.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnClear.setBounds(550, 563, 112, 37);
		add(btnClear);

		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(JOptionPane.showConfirmDialog(null, "Do You Want To Submit", "Submit Exam Details", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
					
					String testName = txtTestName.getText();
					String subject = (String)comboBoxSubject.getSelectedItem();
					String numberOfQuestions = txtNumberOfQuestions.getText();
					String marks = txtMarks.getText();
					String questionSet = null;
					String duration = txtDuration.getText();
					
					//Custom Set Disabled
					if(rdBtnRandomQuesSet.isSelected()) {
						questionSet = rdBtnRandomQuesSet.getLabel();
					}
					else if(rdBtnCustomiseQuesSet.isSelected()) {
						questionSet = rdBtnRandomQuesSet.getLabel();
					}	
					String instructions = txtInstructions.getText();
					
					MySQL mySql = new MySQL();
					int status = mySql.createExam(testName, subject, numberOfQuestions, duration, questionSet, marks, instructions);
					
					if(status==1) {
						JOptionPane.showMessageDialog(null, "Exam Created Successfully", "Exam Details", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null, "Exam Creation Failed", "Exam Details", JOptionPane.ERROR_MESSAGE);
					}
					
					
					
			
				}

			}
		});
		btnSave.setBackground(new Color(0, 255, 0));
		btnSave.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnSave.setBounds(850, 563, 112, 37);
		add(btnSave);
		
		panelCustomQuestionSelection = new PanelCustomQuestionSelection();
		add(panelCustomQuestionSelection);
		panelCustomQuestionSelection.setVisible(false);
		
	}
	public static void makeComponentsVisible(boolean Boolean) {
        for (Component component : components) {
            component.setVisible(true);
        }
	}
	
}
