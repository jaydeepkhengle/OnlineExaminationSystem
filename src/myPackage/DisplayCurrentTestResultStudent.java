package myPackage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import static myPackage.PanelDisplayActiveExamStudent.*;
import jdbc.MySQL;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class DisplayCurrentTestResultStudent {

	private JFrame frame;
	private JTextField txtName;
	private JTextField txtTestCode;
	private JTextField txtMarksObtained;
	private JTextField txtTestName;
	private JTextField txtDuration;
	private JTextField txtTotalMarks;
	MySQL mySql = new  MySQL();
	private int marksObtained;
	private JTextField lblPercentage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisplayCurrentTestResultStudent window = new DisplayCurrentTestResultStudent();
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
	public DisplayCurrentTestResultStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Toolkit tool=Toolkit.getDefaultToolkit();
		Dimension dim = tool.getScreenSize();
		int width = dim.width;
		int height = dim.height;
		frame.setBounds(0,0, width, height);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Review Result");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(675, 728, 181, 34);
		frame.getContentPane().add(btnNewButton);

		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(255, 255, 255));
		panel_2_1.setBounds(759, 296, 700, 327);
		frame.getContentPane().add(panel_2_1);
		panel_2_1.setLayout(null);



		lblPercentage = new JTextField("90");
		lblPercentage.setBorder(null);
		lblPercentage.setForeground(new Color(128, 128, 128));
		lblPercentage.setBackground(new Color(255, 255, 255));
		lblPercentage.setHorizontalAlignment(SwingConstants.CENTER);
		lblPercentage.setFont(new Font("Tahoma", Font.BOLD, 99));
		lblPercentage.setBounds(203, 77, 293, 172);
		panel_2_1.add(lblPercentage);
		lblPercentage.revalidate();


		JLabel lblNewLabel_2_2_1_1 = new JLabel("Your Score ...");
		lblNewLabel_2_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1_1.setBounds(235, 264, 230, 34);
		lblNewLabel_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		panel_2_1.add(lblNewLabel_2_2_1_1);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(203, 77, 293, 172);
		panel_2_1.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblPerformance = new JLabel();
		lblPerformance.setHorizontalAlignment(SwingConstants.CENTER);
		lblPerformance.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblPerformance.setBounds(171, 30, 357, 34);
		panel_2_1.add(lblPerformance);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(19, 98, 162));
		panel.setBounds(0, 10, 1522, 82);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("N Infinity Info Solutions");
		lblNewLabel.setBackground(new Color(11, 151, 210));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(0, 10, 1502, 62);
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 95, 1522, 39);
		frame.getContentPane().add(panel_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(55, 296,700, 327);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Name :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(39, 57, 124, 33);
		panel_2.add(lblNewLabel_2);

		txtName = new JTextField();
		txtName.setEditable(false);
		txtName.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtName.setBackground(new Color(255, 255, 255));
		txtName.setBorder(null);
		txtName.setColumns(10);
		txtName.setBounds(164, 60, 152, 29);
		panel_2.add(txtName);

		ResultSet resultStudentDetails = mySql.getStudentDetails(LoginPage.txtUsername.getText());
		try {
			while(resultStudentDetails.next()) {
				txtName.setText(resultStudentDetails.getString("first_name") + " " + resultStudentDetails.getString("last_name"));
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}


		JLabel lblNewLabel_2_2 = new JLabel("Test Code:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(39, 147, 124, 33);
		panel_2.add(lblNewLabel_2_2);

		JLabel lblNewLabel_2_3 = new JLabel("Marks Obt.:");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_3.setBounds(39, 237, 124, 33);
		panel_2.add(lblNewLabel_2_3);

		JLabel lblNewLabel_2_2_1 = new JLabel("Test Name:");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_2_1.setBounds(359, 57, 124, 33);
		panel_2.add(lblNewLabel_2_2_1);

		JLabel lblNewLabel_2_2_2 = new JLabel("Duration:");
		lblNewLabel_2_2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_2_2.setBounds(364, 147, 124, 33);
		panel_2.add(lblNewLabel_2_2_2);

		JLabel lblNewLabel_2_2_3 = new JLabel("Total Marks:");
		lblNewLabel_2_2_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_2_3.setBounds(359, 233, 124, 33);
		panel_2.add(lblNewLabel_2_2_3);

		txtTestCode = new JTextField();
		txtTestCode.setEditable(false);
		txtTestCode.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtTestCode.setColumns(10);
		txtTestCode.setBorder(null);
		txtTestCode.setBackground(new Color(255, 255, 255));
		txtTestCode.setBounds(164, 149, 152, 29);
		txtTestCode.setText(PanelDisplayActiveExamStudent.txtTestCode.getText());
		panel_2.add(txtTestCode);


		String testNameTemp = PanelDisplayActiveExamStudent.testNameRetrieved;
		String testName = "";

		for(int i=0;i<testNameTemp.length();i++){
			if(Character.isAlphabetic(testNameTemp.charAt(i))) {
				testName += testNameTemp.charAt(i);
			}
		}
		testName += "_results";

		ResultSet result = mySql.getTable(testName);
		try {
			while(result.next()) {
				if(result.getString("answer")!=null) {
					if(result.getString("answer").equalsIgnoreCase(result.getString("correctAnswer"))) {
						marksObtained++;
						System.out.println(marksObtained+"-------------------------------");
					}

				}
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(marksObtained+"-----------------");
		int totalMarks=Integer.parseInt(PanelDisplayActiveExamStudent.txtTotalMarks.getText());
		int numberofQuestion=MainExamPageStudent.numberOfQuestions;

		marksObtained = marksObtained*(totalMarks/numberofQuestion);

		System.out.println(marksObtained+"-----------------");
		System.out.println(numberofQuestion);
		System.out.println(totalMarks);

		txtMarksObtained = new JTextField();
		txtMarksObtained.setEditable(false);
		txtMarksObtained.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtMarksObtained.setColumns(10);
		txtMarksObtained.setBorder(null);
		txtMarksObtained.setBackground(new Color(255, 255, 255));
		txtMarksObtained.setBounds(164, 238, 152, 29);
		panel_2.add(txtMarksObtained);
		txtMarksObtained.setText(marksObtained+"");

		txtTestName = new JTextField();
		txtTestName.setEditable(false);
		txtTestName.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtTestName.setColumns(10);
		txtTestName.setBorder(null);
		txtTestName.setBackground(new Color(255, 255, 255));
		txtTestName.setBounds(510, 60, 152, 29);
		panel_2.add(txtTestName);
		txtTestName.setText(PanelDisplayActiveExamStudent.txtTestName.getText());

		txtDuration = new JTextField();
		txtDuration.setEditable(false);
		txtDuration.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtDuration.setColumns(10);
		txtDuration.setBorder(null);
		txtDuration.setBackground(new Color(255, 255, 255));
		txtDuration.setBounds(510, 149, 152, 29);
		txtDuration.setText(PanelDisplayActiveExamStudent.txtDuration.getText());
		panel_2.add(txtDuration);

		txtTotalMarks = new JTextField();
		txtTotalMarks.setEditable(false);
		txtTotalMarks.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtTotalMarks.setColumns(10);
		txtTotalMarks.setBorder(null);
		txtTotalMarks.setBackground(new Color(255, 255, 255));
		txtTotalMarks.setBounds(510, 238, 152, 29);
		txtTotalMarks.setText(PanelDisplayActiveExamStudent.txtTotalMarks.getText());
		panel_2.add(txtTotalMarks);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setIcon(new ImageIcon(DisplayCurrentTestResultStudent.class.getResource("/ExamImages/dark-blue.jpg")));
		lblNewLabel_1.setBounds(0, 133, 1522, 694);
		frame.getContentPane().add(lblNewLabel_1);
		System.out.println(marksObtained+"**************");
		System.out.println(totalMarks+"####################");
		double percentage = ((double)marksObtained/(double)totalMarks)*100;
		System.out.println("%-------------------"+percentage);
		lblPercentage.setText((int)percentage+"%");

		if(percentage>=80 && percentage<=100) {
			lblPerformance.setText("Excellent");
			lblPerformance.setForeground(Color.GREEN);
		}
		else if(percentage>=65 && percentage<=79) {
			lblPerformance.setText("Good");
			lblPerformance.setForeground(Color.GREEN);
		}
		else if(percentage>=50 && percentage<=64) {
			lblPerformance.setText("Average");
			lblPerformance.setForeground(Color.YELLOW);
		}
		else if(percentage<=49 && percentage>=0) {
			lblPerformance.setText("Poor");
			lblPerformance.setForeground(Color.RED);
		}


	}
}
