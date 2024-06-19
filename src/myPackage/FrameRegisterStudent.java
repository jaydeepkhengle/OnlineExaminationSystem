package myPackage;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import jdbc.MySQL;

public class FrameRegisterStudent {

	private JFrame frame;
	private JTextField txtFirstName, txtUsername, txtPassword, txtLastName, txtEmailId, txtMobile, txtQualification, txtAddress, txtState, txtCity, txtPincode;
	private String username, password, firstName, lastName, mobile, emailId, gender, qualification, address, state, city, pincode, preferredLanguage;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameRegisterStudent window = new FrameRegisterStudent();
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
	public FrameRegisterStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		frame.setBackground(new Color(255, 255, 255));
		frame.setSize(1238,653);
		frame.getContentPane().setLayout(null);
		
		txtFirstName = new JTextField();
		txtFirstName.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtFirstName.setColumns(10);
		txtFirstName.setBackground(new Color(222, 222, 222));
		txtFirstName.setBounds(211, 173, 252, 27);
		frame.getContentPane().add(txtFirstName);
		
		JLabel lblName1 = new JLabel("First Name : ");
		lblName1.setHorizontalAlignment(SwingConstants.LEFT);
		lblName1.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblName1.setBounds(50, 170, 138, 30);
		frame.getContentPane().add(lblName1);
		
		JLabel lblUid = new JLabel("Username :");
		lblUid.setHorizontalAlignment(SwingConstants.LEFT);
		lblUid.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblUid.setBounds(50, 77, 125, 30);
		frame.getContentPane().add(lblUid);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtUsername.setColumns(10);
		txtUsername.setBackground(new Color(222, 222, 222));
		txtUsername.setBounds(211, 80, 252, 27);
		frame.getContentPane().add(txtUsername);
		
		JLabel lblPassword = new JLabel("Password : ");
		lblPassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassword.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblPassword.setBounds(521, 77, 146, 30);
		frame.getContentPane().add(lblPassword);
		
		txtPassword = new JTextField();
		txtPassword.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtPassword.setColumns(10);
		txtPassword.setBackground(new Color(222, 222, 222));
		txtPassword.setBounds(677, 80, 252, 27);
		frame.getContentPane().add(txtPassword);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(37, 141, 1157, 10);
		frame.getContentPane().add(separator);
		
		JLabel lblName1_1 = new JLabel("Last Name : ");
		lblName1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblName1_1.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblName1_1.setBounds(646, 170, 138, 30);
		frame.getContentPane().add(lblName1_1);
		
		txtLastName = new JTextField();
		txtLastName.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtLastName.setColumns(10);
		txtLastName.setBackground(new Color(222, 222, 222));
		txtLastName.setBounds(824, 173, 252, 27);
		frame.getContentPane().add(txtLastName);
		
		JLabel lblEmailId = new JLabel("Email Id :");
		lblEmailId.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmailId.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblEmailId.setBounds(50, 236, 138, 30);
		frame.getContentPane().add(lblEmailId);
		
		txtEmailId = new JTextField();
		txtEmailId.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtEmailId.setColumns(10);
		txtEmailId.setBackground(new Color(222, 222, 222));
		txtEmailId.setBounds(211, 239, 252, 27);
		frame.getContentPane().add(txtEmailId);
		
		JLabel lblName1_1_1 = new JLabel("Mobile :");
		lblName1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblName1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblName1_1_1.setBounds(646, 236, 138, 30);
		frame.getContentPane().add(lblName1_1_1);
		
		txtMobile = new JTextField();
		txtMobile.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtMobile.setColumns(10);
		txtMobile.setBackground(new Color(222, 222, 222));
		txtMobile.setBounds(824, 236, 252, 27);
		frame.getContentPane().add(txtMobile);
		
		JLabel lblGender = new JLabel("Gender :");
		lblGender.setHorizontalAlignment(SwingConstants.LEFT);
		lblGender.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblGender.setBounds(50, 302, 138, 30);
		frame.getContentPane().add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		buttonGroup.add(rdbtnMale);
		rdbtnMale.setFont(new Font("Arial Black", Font.PLAIN, 14));
		rdbtnMale.setBackground(Color.WHITE);
		rdbtnMale.setBounds(211, 311, 65, 21);
		frame.getContentPane().add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setFont(new Font("Arial Black", Font.PLAIN, 14));
		rdbtnFemale.setBackground(Color.WHITE);
		rdbtnFemale.setBounds(278, 311, 87, 21);
		frame.getContentPane().add(rdbtnFemale);
		
		JRadioButton rdbtnNotToSay = new JRadioButton("Not To Say");
		buttonGroup.add(rdbtnNotToSay);
		rdbtnNotToSay.setFont(new Font("Arial Black", Font.PLAIN, 14));
		rdbtnNotToSay.setBackground(Color.WHITE);
		rdbtnNotToSay.setBounds(361, 311, 111, 21);
		frame.getContentPane().add(rdbtnNotToSay);
		
		JLabel lblDegree = new JLabel("Qualification :");
		lblDegree.setHorizontalAlignment(SwingConstants.LEFT);
		lblDegree.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblDegree.setBounds(646, 302, 155, 30);
		frame.getContentPane().add(lblDegree);
		
		txtQualification = new JTextField();
		txtQualification.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtQualification.setColumns(10);
		txtQualification.setBackground(new Color(222, 222, 222));
		txtQualification.setBounds(824, 302, 252, 27);
		frame.getContentPane().add(txtQualification);
		
		JLabel lblAddress = new JLabel("Address :");
		lblAddress.setHorizontalAlignment(SwingConstants.LEFT);
		lblAddress.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblAddress.setBounds(50, 368, 138, 30);
		frame.getContentPane().add(lblAddress);
		
		txtAddress = new JTextField();
		txtAddress.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtAddress.setColumns(10);
		txtAddress.setBackground(new Color(222, 222, 222));
		txtAddress.setBounds(211, 371, 252, 27);
		frame.getContentPane().add(txtAddress);
		
		JLabel lblState = new JLabel("State :");
		lblState.setHorizontalAlignment(SwingConstants.LEFT);
		lblState.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblState.setBounds(646, 368, 138, 30);
		frame.getContentPane().add(lblState);
		
		txtState = new JTextField();
		txtState.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtState.setColumns(10);
		txtState.setBackground(new Color(222, 222, 222));
		txtState.setBounds(824, 371, 252, 27);
		frame.getContentPane().add(txtState);
		
		JLabel lblCity = new JLabel("City :");
		lblCity.setHorizontalAlignment(SwingConstants.LEFT);
		lblCity.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblCity.setBounds(50, 434, 138, 30);
		frame.getContentPane().add(lblCity);
		
		txtCity = new JTextField();
		txtCity.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtCity.setColumns(10);
		txtCity.setBackground(new Color(222, 222, 222));
		txtCity.setBounds(211, 437, 252, 27);
		frame.getContentPane().add(txtCity);
		
		JLabel lblPincode = new JLabel("Pincode :");
		lblPincode.setHorizontalAlignment(SwingConstants.LEFT);
		lblPincode.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblPincode.setBounds(646, 434, 138, 30);
		frame.getContentPane().add(lblPincode);
		
		txtPincode = new JTextField();
		txtPincode.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtPincode.setColumns(10);
		txtPincode.setBackground(new Color(222, 222, 222));
		txtPincode.setBounds(824, 434, 252, 27);
		frame.getContentPane().add(txtPincode);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
				
			}
		});
		btnClose.setForeground(Color.WHITE);
		btnClose.setFont(new Font("Arial Black", Font.PLAIN, 19));
		btnClose.setBackground(new Color(46, 61, 176));
		btnClose.setBounds(124, 559, 252, 33);
		frame.getContentPane().add(btnClose);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Arial Black", Font.PLAIN, 19));
		btnClear.setBackground(new Color(46, 61, 176));
		btnClear.setBounds(480, 559, 252, 33);
		frame.getContentPane().add(btnClear);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(JOptionPane.showConfirmDialog(null, "Do You Want To Submit", "Student Registration", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
					username = txtUsername.getText();
					password = txtPassword.getText();
					firstName = txtFirstName.getText().toUpperCase();
					lastName = txtLastName.getText().toUpperCase();
					emailId = txtEmailId.getText().toLowerCase();
					mobile = txtMobile.getText().toUpperCase();
					address = txtAddress.getText().toUpperCase();
					qualification = txtQualification.getText().toUpperCase();
					state = txtState.getText().toUpperCase();
					city = txtCity.getText().toUpperCase();
					pincode = txtPincode.getText().toUpperCase();
					preferredLanguage = (String)comboBox.getSelectedItem();
					
					if(rdbtnMale.isSelected()) {
						gender = rdbtnMale.getLabel();
					}
					else if (rdbtnFemale.isSelected()) {
						gender = rdbtnFemale.getLabel();
					}
					else if(rdbtnNotToSay.isSelected()) {
						gender = rdbtnNotToSay.getLabel();
					}
					
					MySQL mySql = new MySQL();
					mySql.registerStudent(username, password, firstName, lastName, emailId, mobile, gender, qualification, address, state, city, pincode, preferredLanguage);
				}
				
				
			}
		});
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Arial Black", Font.PLAIN, 19));
		btnSubmit.setBackground(new Color(46, 61, 176));
		btnSubmit.setBounds(841, 559, 252, 33);
		frame.getContentPane().add(btnSubmit);
		
		JLabel lblPreferredLanguage = new JLabel("Preferred Language :");
		lblPreferredLanguage.setHorizontalAlignment(SwingConstants.LEFT);
		lblPreferredLanguage.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblPreferredLanguage.setBounds(314, 490, 245, 30);
		frame.getContentPane().add(lblPreferredLanguage);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial Black", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"C++", "Java", "Python"}));
		comboBox.setBounds(573, 494, 252, 30);
		frame.getContentPane().add(comboBox);
		
		JLabel lblAdminRegistration = new JLabel("Student Registration");
		lblAdminRegistration.setBounds(445, 0, 251, 47);
		frame.getContentPane().add(lblAdminRegistration);
		lblAdminRegistration.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminRegistration.setForeground(new Color(0, 0, 0));
		lblAdminRegistration.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblAdminRegistration.setBackground(Color.WHITE);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(37, 40, 1157, 10);
		frame.getContentPane().add(separator_1);
		
		frame.setLocationRelativeTo(null);
	}

}
