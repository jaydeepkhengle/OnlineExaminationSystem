package myPackage;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import jdbc.MySQL;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import static myPackage.MainExamPageStudent.*;

public class PanelTestReviewStudent extends JPanel {

	private static final long serialVersionUID = 1L;
	public static JTextField txtTotalNumberOfQuestions;
	public static JTextField txtQuestionsAttempted;
	public static JTextField txtQuestionsUnattempted;

	/**
	 * Create the panel.
	 */
	public PanelTestReviewStudent() {
		setSize(448,232);
		setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Total Number of Questions :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(41, 26, 212, 21);
		add(lblNewLabel_2);
		
		txtTotalNumberOfQuestions = new JTextField();
		txtTotalNumberOfQuestions.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtTotalNumberOfQuestions.setBorder(null);
		txtTotalNumberOfQuestions.setBackground(new Color(240, 240, 240));
		txtTotalNumberOfQuestions.setColumns(10);
		txtTotalNumberOfQuestions.setBounds(302, 27, 73, 25);
		add(txtTotalNumberOfQuestions);
		
		JButton btnEndTest = new JButton("End Test");
		btnEndTest.setForeground(new Color(255, 255, 255));
		btnEndTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String testNameTemp = PanelDisplayActiveExamStudent.testNameRetrieved;
				String testName = "";

				for(int i=0;i<testNameTemp.length();i++){
					if(Character.isAlphabetic(testNameTemp.charAt(i))) {
						testName += testNameTemp.charAt(i);
					}
				}
				testName += "_results";
				
				MySQL mySql = new MySQL();
				int totalQuestionVisited = mySql.rowCount(testName)-1;
				if(totalQuestionVisited==numberOfQuestions) {
					if(JOptionPane.showConfirmDialog(null, "Do You Really to Want to End the Test ?", "End/Submit Test", JOptionPane.YES_NO_OPTION)==(JOptionPane.YES_OPTION)) {
						setMainExamPageVisbility(false);
						panelTestSubmittedStudent.setVisible(true);
						
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Kindly Visit all the Questions Before Submitting the Test", "End/Submit Test", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnEndTest.setBackground(new Color(255, 0, 0));
		btnEndTest.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEndTest.setBounds(241, 180, 108, 25);
		add(btnEndTest);
		
		JLabel lblNewLabel_2_1 = new JLabel("Questions Attempted :");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1.setBounds(41, 77, 224, 21);
		add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Unattempted Questions :");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_1.setBounds(41, 126, 224, 21);
		add(lblNewLabel_2_1_1);
		
		txtQuestionsAttempted = new JTextField();
		txtQuestionsAttempted.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtQuestionsAttempted.setBorder(null);
		txtQuestionsAttempted.setBackground(new Color(240, 240, 240));
		txtQuestionsAttempted.setColumns(10);
		txtQuestionsAttempted.setBounds(302, 78, 73, 25);
		add(txtQuestionsAttempted);
		
		txtQuestionsUnattempted = new JTextField();
		txtQuestionsUnattempted.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtQuestionsUnattempted.setBorder(null);
		txtQuestionsUnattempted.setBackground(new Color(240, 240, 240));
		txtQuestionsUnattempted.setColumns(10);
		txtQuestionsUnattempted.setBounds(302, 127, 73, 25);
		add(txtQuestionsUnattempted);
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(new Color(255, 255, 255));
		btnBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
				btnNotAnswered.setVisible(true);
				btnAnswered.setVisible(true);
				btnNotVisited.setVisible(true);
				btnBookmark.setVisible(true);
				btnSubmit.setVisible(true);
				
			}
			
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBack.setBackground(new Color(46, 61, 176));
		btnBack.setBounds(86, 180, 108, 25);
		add(btnBack);

	}
}
