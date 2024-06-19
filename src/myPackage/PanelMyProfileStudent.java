package myPackage;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import jdbc.MySQL;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class PanelMyProfileStudent extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtFirstName;
	private JTextField txtEmailId;
	private JTextField txtGender;
	private JTextField txtAddress;
	private JTextField txtCity;
	private JTextField txtLastName;
	private JTextField txtMobile;
	private JTextField txtQualification;
	private JTextField txtState;
	private JTextField txtPincode;
	private PanelDashboardStudent panelDashboardStudent;

	/**
	 * Create the panel.
	 */
	public PanelMyProfileStudent() {
		setForeground(new Color(0, 0, 128));
		setBackground(new Color(255, 255, 255));
		setSize(1238,653);
		setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(46, 61, 176));
		panel_1.setBounds(0, 0, 1238, 47);
		add(panel_1);
		
		JLabel lblReuslts = new JLabel("My Profile");
		lblReuslts.setHorizontalAlignment(SwingConstants.CENTER);
		lblReuslts.setForeground(Color.WHITE);
		lblReuslts.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblReuslts.setBackground(Color.WHITE);
		lblReuslts.setBounds(514, 0, 210, 47);
		panel_1.add(lblReuslts);
		
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
		
		JLabel lblName1 = new JLabel("First Name : ");
		lblName1.setHorizontalAlignment(SwingConstants.LEFT);
		lblName1.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblName1.setBounds(57, 135, 138, 30);
		add(lblName1);
		
		txtFirstName = new JTextField();
		txtFirstName.setForeground(new Color(0, 0, 128));
		txtFirstName.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtFirstName.setColumns(10);
		txtFirstName.setBorder(null);
		txtFirstName.setBackground(Color.WHITE);
		txtFirstName.setBounds(218, 138, 252, 27);
		add(txtFirstName);
		
		JLabel lblEmailId = new JLabel("Email Id :");
		lblEmailId.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmailId.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblEmailId.setBounds(57, 201, 138, 30);
		add(lblEmailId);
		
		txtEmailId = new JTextField();
		txtEmailId.setForeground(new Color(0, 0, 128));
		txtEmailId.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtEmailId.setColumns(10);
		txtEmailId.setBorder(null);
		txtEmailId.setBackground(Color.WHITE);
		txtEmailId.setBounds(218, 204, 252, 27);
		add(txtEmailId);
		
		JLabel lblGender = new JLabel("Gender :");
		lblGender.setHorizontalAlignment(SwingConstants.LEFT);
		lblGender.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblGender.setBounds(57, 267, 138, 30);
		add(lblGender);
		
		txtGender = new JTextField();
		txtGender.setForeground(new Color(0, 0, 128));
		txtGender.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtGender.setColumns(10);
		txtGender.setBorder(null);
		txtGender.setBackground(Color.WHITE);
		txtGender.setBounds(218, 267, 252, 27);
		add(txtGender);
		
		JLabel lblAddress = new JLabel("Address :");
		lblAddress.setHorizontalAlignment(SwingConstants.LEFT);
		lblAddress.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblAddress.setBounds(57, 333, 138, 30);
		add(lblAddress);
		
		txtAddress = new JTextField();
		txtAddress.setForeground(new Color(0, 0, 128));
		txtAddress.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtAddress.setColumns(10);
		txtAddress.setBorder(null);
		txtAddress.setBackground(Color.WHITE);
		txtAddress.setBounds(218, 336, 252, 27);
		add(txtAddress);
		
		JLabel lblCity = new JLabel("City :");
		lblCity.setHorizontalAlignment(SwingConstants.LEFT);
		lblCity.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblCity.setBounds(57, 399, 138, 30);
		add(lblCity);
		
		txtCity = new JTextField();
		txtCity.setForeground(new Color(0, 0, 128));
		txtCity.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtCity.setColumns(10);
		txtCity.setBorder(null);
		txtCity.setBackground(Color.WHITE);
		txtCity.setBounds(218, 402, 252, 27);
		add(txtCity);
		
		JLabel lblName1_1 = new JLabel("Last Name : ");
		lblName1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblName1_1.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblName1_1.setBounds(653, 135, 138, 30);
		add(lblName1_1);
		
		txtLastName = new JTextField();
		txtLastName.setForeground(new Color(0, 0, 128));
		txtLastName.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtLastName.setColumns(10);
		txtLastName.setBorder(null);
		txtLastName.setBackground(Color.WHITE);
		txtLastName.setBounds(831, 138, 252, 27);
		add(txtLastName);
		
		txtMobile = new JTextField();
		txtMobile.setForeground(new Color(0, 0, 128));
		txtMobile.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtMobile.setColumns(10);
		txtMobile.setBorder(null);
		txtMobile.setBackground(Color.WHITE);
		txtMobile.setBounds(831, 201, 252, 27);
		add(txtMobile);
		
		txtQualification = new JTextField();
		txtQualification.setForeground(new Color(0, 0, 128));
		txtQualification.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtQualification.setColumns(10);
		txtQualification.setBorder(null);
		txtQualification.setBackground(Color.WHITE);
		txtQualification.setBounds(831, 267, 252, 27);
		add(txtQualification);
		
		txtState = new JTextField();
		txtState.setForeground(new Color(0, 0, 128));
		txtState.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtState.setColumns(10);
		txtState.setBorder(null);
		txtState.setBackground(Color.WHITE);
		txtState.setBounds(831, 336, 252, 27);
		add(txtState);
		
		txtPincode = new JTextField();
		txtPincode.setForeground(new Color(0, 0, 128));
		txtPincode.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtPincode.setColumns(10);
		txtPincode.setBorder(null);
		txtPincode.setBackground(Color.WHITE);
		txtPincode.setBounds(831, 402, 252, 27);
		add(txtPincode);
		
		JLabel lblPincode = new JLabel("Pincode :");
		lblPincode.setHorizontalAlignment(SwingConstants.LEFT);
		lblPincode.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblPincode.setBounds(653, 399, 138, 30);
		add(lblPincode);
		
		JLabel lblState = new JLabel("State :");
		lblState.setHorizontalAlignment(SwingConstants.LEFT);
		lblState.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblState.setBounds(653, 333, 138, 30);
		add(lblState);
		
		JLabel lblDegree = new JLabel("Qualification :");
		lblDegree.setHorizontalAlignment(SwingConstants.LEFT);
		lblDegree.setFont(new Font("Arial Black", Font.BOLD, 19));
		lblDegree.setBounds(653, 267, 155, 30);
		add(lblDegree);
		
		JLabel lblName1_1_1 = new JLabel("Mobile :");
		lblName1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblName1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblName1_1_1.setBounds(653, 201, 138, 30);
		add(lblName1_1_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(31, 98, 1176, 12);
		add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(31, 483, 1176, 12);
		add(separator_1);
		
		MySQL mySql = new MySQL();
		ResultSet result = mySql.getTable("student_details");
		
		try {
			while(result.next()) {
				txtFirstName.setText(result.getString("first_name"));
				txtLastName.setText(result.getString("last_name"));
				txtEmailId.setText(result.getNString("email_id"));
				txtMobile.setText(result.getString("Mobile"));
				txtGender.setText(result.getString("gender"));
				txtQualification.setText(result.getString("qualification"));
				txtAddress.setText(result.getString("address"));
				txtState.setText(result.getString("state"));
				txtCity.setText(result.getString("city"));
				txtPincode.setText(result.getString("pincode"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		panelDashboardStudent = new PanelDashboardStudent();
//		add(panelDashboardStudent);
//		panelDashboardStudent.setVisible(false);
		
		

	}
}
