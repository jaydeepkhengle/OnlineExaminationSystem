package myPackage;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import jdbc.MySQL;

import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class PanelRegisterAdmin extends JPanel {
	
	private JTextField txtFirstName, txtUsername, txtPassword, txtLastName, txtEmailId, txtMobile, txtQualification, txtAddress, txtState, txtCity, txtPincode;
	private String username, password, firstName, lastName, mobile, emailId, gender, qualification, address, state, city, pincode;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Create the panel.
	 */
	public PanelRegisterAdmin() {
		setBackground(new Color(255, 255, 255));
		setSize(1238,653);
		setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(46, 61, 176));
		panel_1.setBounds(0, 0, 1238, 47);
		add(panel_1);
		
		JLabel lblAdminRegistration = new JLabel("Admin Registration");
		lblAdminRegistration.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminRegistration.setForeground(Color.WHITE);
		lblAdminRegistration.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblAdminRegistration.setBackground(Color.WHITE);
		lblAdminRegistration.setBounds(514, 0, 210, 47);
		panel_1.add(lblAdminRegistration);
		
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
		
		txtFirstName = new JTextField();
		txtFirstName.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtFirstName.setColumns(10);
		txtFirstName.setBackground(new Color(222, 222, 222));
		txtFirstName.setBounds(211, 173, 252, 27);
		add(txtFirstName);
		
		JLabel lblName1 = new JLabel("First Name : ");
		lblName1.setHorizontalAlignment(SwingConstants.LEFT);
		lblName1.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblName1.setBounds(50, 170, 138, 30);
		add(lblName1);
		
		JLabel lblUid = new JLabel("Username :");
		lblUid.setHorizontalAlignment(SwingConstants.LEFT);
		lblUid.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblUid.setBounds(50, 77, 125, 30);
		add(lblUid);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtUsername.setColumns(10);
		txtUsername.setBackground(new Color(222, 222, 222));
		txtUsername.setBounds(211, 80, 252, 27);
		add(txtUsername);
		
		JLabel lblPassword = new JLabel("Password : ");
		lblPassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassword.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblPassword.setBounds(521, 77, 146, 30);
		add(lblPassword);
		
		txtPassword = new JTextField();
		txtPassword.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtPassword.setColumns(10);
		txtPassword.setBackground(new Color(222, 222, 222));
		txtPassword.setBounds(677, 80, 252, 27);
		add(txtPassword);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(37, 141, 1157, 10);
		add(separator);
		
		JLabel lblName1_1 = new JLabel("Last Name : ");
		lblName1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblName1_1.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblName1_1.setBounds(646, 170, 138, 30);
		add(lblName1_1);
		
		txtLastName = new JTextField();
		txtLastName.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtLastName.setColumns(10);
		txtLastName.setBackground(new Color(222, 222, 222));
		txtLastName.setBounds(824, 173, 252, 27);
		add(txtLastName);
		
		JLabel lblEmailId = new JLabel("Email Id :");
		lblEmailId.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmailId.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblEmailId.setBounds(50, 236, 138, 30);
		add(lblEmailId);
		
		txtEmailId = new JTextField();
		txtEmailId.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtEmailId.setColumns(10);
		txtEmailId.setBackground(new Color(222, 222, 222));
		txtEmailId.setBounds(211, 239, 252, 27);
		add(txtEmailId);
		
		JLabel lblName1_1_1 = new JLabel("Mobile :");
		lblName1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblName1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblName1_1_1.setBounds(646, 236, 138, 30);
		add(lblName1_1_1);
		
		txtMobile = new JTextField();
		txtMobile.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtMobile.setColumns(10);
		txtMobile.setBackground(new Color(222, 222, 222));
		txtMobile.setBounds(824, 236, 252, 27);
		add(txtMobile);
		
		JLabel lblGender = new JLabel("Gender :");
		lblGender.setHorizontalAlignment(SwingConstants.LEFT);
		lblGender.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblGender.setBounds(50, 302, 138, 30);
		add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		buttonGroup.add(rdbtnMale);
		rdbtnMale.setFont(new Font("Arial Black", Font.PLAIN, 14));
		rdbtnMale.setBackground(Color.WHITE);
		rdbtnMale.setBounds(211, 311, 65, 21);
		add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setFont(new Font("Arial Black", Font.PLAIN, 14));
		rdbtnFemale.setBackground(Color.WHITE);
		rdbtnFemale.setBounds(278, 311, 87, 21);
		add(rdbtnFemale);
		
		JRadioButton rdbtnNotToSay = new JRadioButton("Not To Say");
		buttonGroup.add(rdbtnNotToSay);
		rdbtnNotToSay.setFont(new Font("Arial Black", Font.PLAIN, 14));
		rdbtnNotToSay.setBackground(Color.WHITE);
		rdbtnNotToSay.setBounds(361, 311, 111, 21);
		add(rdbtnNotToSay);
		
		JLabel lblDegree = new JLabel("Qualification :");
		lblDegree.setHorizontalAlignment(SwingConstants.LEFT);
		lblDegree.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblDegree.setBounds(646, 302, 155, 30);
		add(lblDegree);
		
		txtQualification = new JTextField();
		txtQualification.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtQualification.setColumns(10);
		txtQualification.setBackground(new Color(222, 222, 222));
		txtQualification.setBounds(824, 302, 252, 27);
		add(txtQualification);
		
		JLabel lblAddress = new JLabel("Address :");
		lblAddress.setHorizontalAlignment(SwingConstants.LEFT);
		lblAddress.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblAddress.setBounds(50, 368, 138, 30);
		add(lblAddress);
		
		txtAddress = new JTextField();
		txtAddress.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtAddress.setColumns(10);
		txtAddress.setBackground(new Color(222, 222, 222));
		txtAddress.setBounds(211, 371, 252, 27);
		add(txtAddress);
		
		JLabel lblState = new JLabel("State :");
		lblState.setHorizontalAlignment(SwingConstants.LEFT);
		lblState.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblState.setBounds(646, 368, 138, 30);
		add(lblState);
		
		txtState = new JTextField();
		txtState.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtState.setColumns(10);
		txtState.setBackground(new Color(222, 222, 222));
		txtState.setBounds(824, 371, 252, 27);
		add(txtState);
		
		JLabel lblCity = new JLabel("City :");
		lblCity.setHorizontalAlignment(SwingConstants.LEFT);
		lblCity.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblCity.setBounds(50, 434, 138, 30);
		add(lblCity);
		
		txtCity = new JTextField();
		txtCity.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtCity.setColumns(10);
		txtCity.setBackground(new Color(222, 222, 222));
		txtCity.setBounds(211, 437, 252, 27);
		add(txtCity);
		
		JLabel lblPincode = new JLabel("Pincode :");
		lblPincode.setHorizontalAlignment(SwingConstants.LEFT);
		lblPincode.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblPincode.setBounds(646, 434, 138, 30);
		add(lblPincode);
		
		txtPincode = new JTextField();
		txtPincode.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtPincode.setColumns(10);
		txtPincode.setBackground(new Color(222, 222, 222));
		txtPincode.setBounds(824, 434, 252, 27);
		add(txtPincode);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnClose.setForeground(Color.WHITE);
		btnClose.setFont(new Font("Arial Black", Font.PLAIN, 19));
		btnClose.setBackground(new Color(46, 61, 176));
		btnClose.setBounds(129, 527, 252, 33);
		add(btnClose);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Arial Black", Font.PLAIN, 19));
		btnClear.setBackground(new Color(46, 61, 176));
		btnClear.setBounds(480, 527, 252, 33);
		add(btnClear);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(JOptionPane.showConfirmDialog(null, "Do You Want To Submit", "Admin Registration", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
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
					mySql.registerAdmin(username, password, firstName, lastName, emailId, mobile, gender, qualification, address, state, city, pincode);
				}
				
				
			}
		});
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Arial Black", Font.PLAIN, 19));
		btnSubmit.setBackground(new Color(46, 61, 176));
		btnSubmit.setBounds(837, 527, 252, 33);
		add(btnSubmit);

	}
}
