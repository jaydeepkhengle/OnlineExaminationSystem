package myPackage;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import jdbc.MySQL;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemListener;

public class PanelDisplayActiveExamStudent extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static  JTextField txtTestName;
	public static JTextField txtTestCode;
	public static  JTextField txtDuration;
	public static JTextField txtTotalMarks;
	private JTextField txtTotalQuestions;
	private ExamInstructionStudent examInstructionStudent;
	private JTextField txtSubject;
	public static String testNameRetrieved;


	/**
	 * Create the panel.
	 */
	public PanelDisplayActiveExamStudent() {
		setForeground(new Color(0, 0, 128));
		setBackground(new Color(255, 255, 255));
		setSize(1238, 653);
		setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(46, 61, 176));
		panel_1.setBounds(0, 0, 1238, 47);
		add(panel_1);
		
		JLabel lblExamSelect = new JLabel("Exam - Select Test");
		lblExamSelect.setHorizontalAlignment(SwingConstants.CENTER);
		lblExamSelect.setForeground(Color.WHITE);
		lblExamSelect.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblExamSelect.setBackground(Color.WHITE);
		lblExamSelect.setBounds(514, 0, 210, 47);
		panel_1.add(lblExamSelect);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(46, 61, 176));
		panel_1_1.setBounds(0, 628, 1238, 25);
		add(panel_1_1);
		
		JLabel lblNewLabel_2_5 = new JLabel("Copyrights 2022 @ EDUCATION CENTER");
		lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_5.setForeground(Color.WHITE);
		lblNewLabel_2_5.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_2_5.setBounds(442, 0, 353, 25);
		panel_1_1.add(lblNewLabel_2_5);
		
		JLabel lblSelect_1 = new JLabel("Select Test :");
		lblSelect_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblSelect_1.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblSelect_1.setBounds(47, 77, 145, 30);
		add(lblSelect_1);
		
		MySQL mySql = new MySQL();
		ResultSet result = mySql.getTable("active_exams");
		
		String[]activeExams = new String[1];
		activeExams[0] = "Select Test";
		
		try {
			while(result.next()) {
				activeExams = Arrays.copyOf(activeExams, activeExams.length+1);
				activeExams[activeExams.length-1] = result.getString("Test_Name") +  " -  " +result.getString("Test_Code"); 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JComboBox<Object> comboBoxUserType_1 = new JComboBox<Object>();
		comboBoxUserType_1.setForeground(new Color(0, 0, 128));
		comboBoxUserType_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				testNameRetrieved = (String)comboBoxUserType_1.getSelectedItem();
				System.out.println(testNameRetrieved);
				String testCode = "";
				for(int i=0;i<testNameRetrieved.length();i++) {
					if(Character.isDigit(testNameRetrieved.charAt(i))) {
						testCode += testNameRetrieved.charAt(i);
					}
				}
				System.out.println(testCode);
				MySQL mySql = new MySQL();
				ResultSet resultSet = mySql.loadActiveTest(Integer.parseInt(testCode));
				
				try {
					while(resultSet.next()) {
						txtTestName.setText(resultSet.getString("test_name").trim());
						txtTestCode.setText(resultSet.getString("test_code"));
						txtDuration.setText(resultSet.getString("duration") + " Minutes");
						txtTotalMarks.setText(resultSet.getString("Marks"));
						txtTotalQuestions.setText(resultSet.getString("Number_of_Questions"));
						txtSubject.setText(resultSet.getString("Subject").trim());
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		comboBoxUserType_1.setModel(new DefaultComboBoxModel(activeExams));
		comboBoxUserType_1.setSelectedIndex(0);
		comboBoxUserType_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		comboBoxUserType_1.setBackground(new Color(222, 222, 222));
		comboBoxUserType_1.setBounds(243, 82, 252, 27);
		add(comboBoxUserType_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(30, 130, 1176, 12);
		add(separator);
		
		JLabel lblSelect_1_1 = new JLabel("Test Code :");
		lblSelect_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblSelect_1_1.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblSelect_1_1.setBounds(573, 166, 145, 30);
		add(lblSelect_1_1);
		
		txtTestName = new JTextField();
		txtTestName.setBorder(null);
		txtTestName.setForeground(new Color(0, 0, 128));
		txtTestName.setEditable(false);
		txtTestName.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtTestName.setColumns(10);
		txtTestName.setBackground(new Color(255, 255, 255));
		txtTestName.setBounds(243, 169, 252, 27);
		add(txtTestName);
		
		JLabel lblSelect_1_1_1 = new JLabel("Test Name :");
		lblSelect_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblSelect_1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblSelect_1_1_1.setBounds(47, 166, 145, 30);
		add(lblSelect_1_1_1);
		
		txtTestCode = new JTextField();
		txtTestCode.setBorder(null);
		txtTestCode.setForeground(new Color(0, 0, 128));
		txtTestCode.setEditable(false);
		txtTestCode.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtTestCode.setColumns(10);
		txtTestCode.setBackground(new Color(255, 255, 255));
		txtTestCode.setBounds(819, 169, 252, 27);
		add(txtTestCode);
		
		JLabel lblSelect_1_1_1_1 = new JLabel("Duration :");
		lblSelect_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblSelect_1_1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblSelect_1_1_1_1.setBounds(47, 234, 145, 30);
		add(lblSelect_1_1_1_1);
		
		txtDuration = new JTextField();
		txtDuration.setBorder(null);
		txtDuration.setForeground(new Color(0, 0, 128));
		txtDuration.setEditable(false);
		txtDuration.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtDuration.setColumns(10);
		txtDuration.setBackground(new Color(255, 255, 255));
		txtDuration.setBounds(243, 234, 252, 27);
		add(txtDuration);
		
		JLabel lblSelect_1_1_1_1_1 = new JLabel("Total Marks :");
		lblSelect_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblSelect_1_1_1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblSelect_1_1_1_1_1.setBounds(573, 234, 145, 30);
		add(lblSelect_1_1_1_1_1);
		
		JLabel lblSelect_1_1_1_1_2 = new JLabel("Total Questions : ");
		lblSelect_1_1_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblSelect_1_1_1_1_2.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblSelect_1_1_1_1_2.setBounds(47, 309, 186, 30);
		add(lblSelect_1_1_1_1_2);
		
		JLabel lblSelect_1_1_1_1_1_1 = new JLabel("Subject :");
		lblSelect_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblSelect_1_1_1_1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblSelect_1_1_1_1_1_1.setBounds(573, 311, 145, 30);
		add(lblSelect_1_1_1_1_1_1);
		
		txtTotalMarks = new JTextField();
		txtTotalMarks.setBorder(null);
		txtTotalMarks.setForeground(new Color(0, 0, 128));
		txtTotalMarks.setEditable(false);
		txtTotalMarks.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtTotalMarks.setColumns(10);
		txtTotalMarks.setBackground(new Color(255, 255, 255));
		txtTotalMarks.setBounds(819, 237, 252, 27);
		add(txtTotalMarks);
		
		txtSubject = new JTextField();
		txtSubject.setBorder(null);
		txtSubject.setForeground(new Color(0, 0, 128));
		txtSubject.setEditable(false);
		txtSubject.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtSubject.setColumns(10);
		txtSubject.setBackground(new Color(255, 255, 255));
		txtSubject.setBounds(819, 314, 252, 27);
		add(txtSubject);
		
		txtTotalQuestions = new JTextField();
		txtTotalQuestions.setBorder(null);
		txtTotalQuestions.setForeground(new Color(0, 0, 128));
		txtTotalQuestions.setEditable(false);
		txtTotalQuestions.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtTotalQuestions.setColumns(10);
		txtTotalQuestions.setBackground(new Color(255, 255, 255));
		txtTotalQuestions.setBounds(243, 311, 252, 27);
		add(txtTotalQuestions);
		
		JButton btnStart = new JButton("Start Exam");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component [] component = getComponents();
				for(Component x : component ) {
					x.setVisible(false);
				}

				MySQL mySql = new MySQL();
				
				ResultSet resultSet = mySql.loadActiveTest(Integer.parseInt(txtTestCode.getText()));
				try {
					while(resultSet.next()) {
						ExamInstructionStudent.txtInstructions.setText(resultSet.getString("instructions"));;
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				examInstructionStudent.setVisible(true);
				
			}
		});
		btnStart.setForeground(Color.WHITE);
		btnStart.setFont(new Font("Arial Black", Font.PLAIN, 19));
		btnStart.setBackground(new Color(46, 61, 176));
		btnStart.setBounds(493, 551, 252, 33);
		add(btnStart);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(30, 518, 1176, 12);
		add(separator_1);
		
		examInstructionStudent = new ExamInstructionStudent();
		examInstructionStudent.txtInstructions.setSize(1104, 152);
		add(examInstructionStudent);
		examInstructionStudent.setVisible(false);
		
		

	}
}
