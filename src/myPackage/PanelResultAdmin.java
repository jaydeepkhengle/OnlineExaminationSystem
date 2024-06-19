package myPackage;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class PanelResultAdmin extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panelAllResults;
	private JTextField txtEnterFirstName;
	private JTextField txtMobileNumber;
	private JPanel panelIndividualResults;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Create the panel.
	 */
	public PanelResultAdmin() {
		setBackground(new Color(255, 255, 255));
		setSize(1238, 653);
		setLayout(null);
		
		panelIndividualResults = new JPanel();
		panelIndividualResults.setBackground(new Color(255, 255, 255));
		panelIndividualResults.setBounds(10, 52, 1218, 574);
		add(panelIndividualResults);
		panelIndividualResults.setLayout(null);
		panelIndividualResults.setVisible(false);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(38, 89, 1156, 11);
		panelIndividualResults.add(separator_1);
		
		JComboBox<Object> comboBoxUserType_1 = new JComboBox<Object>();
		comboBoxUserType_1.setModel(new DefaultComboBoxModel(new String[] {"Not Selected"}));
		comboBoxUserType_1.setSelectedIndex(0);
		comboBoxUserType_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		comboBoxUserType_1.setBackground(new Color(222, 222, 222));
		comboBoxUserType_1.setBounds(214, 37, 252, 27);
		panelIndividualResults.add(comboBoxUserType_1);
		
		JLabel lblSelect_1 = new JLabel("Select Test :");
		lblSelect_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblSelect_1.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblSelect_1.setBounds(38, 33, 145, 30);
		panelIndividualResults.add(lblSelect_1);
		
		JButton btnLoadResults_1 = new JButton("Load Results");
		btnLoadResults_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLoadResults_1.setForeground(Color.WHITE);
		btnLoadResults_1.setFont(new Font("Arial Black", Font.PLAIN, 19));
		btnLoadResults_1.setBackground(new Color(46, 61, 176));
		btnLoadResults_1.setBounds(935, 35, 252, 27);
		panelIndividualResults.add(btnLoadResults_1);
		
		txtEnterFirstName = new JTextField();
		txtEnterFirstName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtEnterFirstName.getText().equalsIgnoreCase("First Name")) {
					txtEnterFirstName.setText("");
					txtEnterFirstName.setForeground(Color.BLACK);
				}
			}
			public void focusLost(FocusEvent e) {
				if(txtEnterFirstName.getText().equalsIgnoreCase("")) {
					txtEnterFirstName.setText("First Name");
					txtEnterFirstName.setForeground(new Color(183, 183, 183));
				}
			}
		});
		txtEnterFirstName.setForeground(new Color(183, 183, 183));
		txtEnterFirstName.setText("First Name");
		txtEnterFirstName.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtEnterFirstName.setColumns(10);
		txtEnterFirstName.setBackground(new Color(255, 255, 255));
		txtEnterFirstName.setBounds(498, 36, 170, 27);
		panelIndividualResults.add(txtEnterFirstName);
		
		txtMobileNumber = new JTextField();
		txtMobileNumber.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtMobileNumber.getText().equalsIgnoreCase("Mobile Number")) {
					txtMobileNumber.setText("");
					txtMobileNumber.setForeground(Color.BLACK);
				}
			}
			public void focusLost(FocusEvent e) {
				if(txtMobileNumber.getText().equalsIgnoreCase("")) {
					txtMobileNumber.setText("Mobile Number");
					txtMobileNumber.setForeground(new Color(183, 183, 183));
				}
			}
		});
		
		txtMobileNumber.setForeground(new Color(183, 183, 183));
		txtMobileNumber.setText("Mobile Number");
		txtMobileNumber.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtMobileNumber.setColumns(10);
		txtMobileNumber.setBackground(new Color(255, 255, 255));
		txtMobileNumber.setBounds(713, 36, 170, 27);
		panelIndividualResults.add(txtMobileNumber);
		
		JButton btnLoadResults_1_1 = new JButton("Back");
		btnLoadResults_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelIndividualResults.setVisible(false);
			}
		});
		btnLoadResults_1_1.setForeground(Color.WHITE);
		btnLoadResults_1_1.setFont(new Font("Arial Black", Font.PLAIN, 19));
		btnLoadResults_1_1.setBackground(new Color(46, 61, 176));
		btnLoadResults_1_1.setBounds(481, 526, 252, 27);
		panelIndividualResults.add(btnLoadResults_1_1);
		
		JLabel lblSelect_1_1 = new JLabel("Test Name :");
		lblSelect_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblSelect_1_1.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblSelect_1_1.setBounds(38, 121, 145, 30);
		panelIndividualResults.add(lblSelect_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial Black", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBackground(new Color(222, 222, 222));
		textField.setBounds(261, 124, 252, 27);
		panelIndividualResults.add(textField);
		
		JLabel lblSelect_1_1_1 = new JLabel("Test Code :");
		lblSelect_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblSelect_1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblSelect_1_1_1.setBounds(598, 121, 145, 30);
		panelIndividualResults.add(lblSelect_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(222, 222, 222));
		textField_1.setBounds(852, 124, 252, 27);
		panelIndividualResults.add(textField_1);
		
		JLabel lblSelect_1_1_2 = new JLabel("First Name : ");
		lblSelect_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblSelect_1_1_2.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblSelect_1_1_2.setBounds(38, 188, 145, 30);
		panelIndividualResults.add(lblSelect_1_1_2);
		
		JLabel lblSelect_1_1_2_1 = new JLabel("Last Name : ");
		lblSelect_1_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblSelect_1_1_2_1.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblSelect_1_1_2_1.setBounds(598, 188, 145, 30);
		panelIndividualResults.add(lblSelect_1_1_2_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial Black", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(222, 222, 222));
		textField_2.setBounds(852, 190, 252, 27);
		panelIndividualResults.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial Black", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(222, 222, 222));
		textField_3.setBounds(261, 190, 252, 27);
		panelIndividualResults.add(textField_3);
		
		JLabel lblSelect_1_1_2_2 = new JLabel("Duration :");
		lblSelect_1_1_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblSelect_1_1_2_2.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblSelect_1_1_2_2.setBounds(38, 258, 145, 30);
		panelIndividualResults.add(lblSelect_1_1_2_2);
		
		JLabel lblSelect_1_1_2_2_1 = new JLabel("Total Marks :");
		lblSelect_1_1_2_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblSelect_1_1_2_2_1.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblSelect_1_1_2_2_1.setBounds(598, 258, 145, 30);
		panelIndividualResults.add(lblSelect_1_1_2_2_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Arial Black", Font.PLAIN, 15));
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(222, 222, 222));
		textField_4.setBounds(261, 256, 252, 27);
		panelIndividualResults.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Arial Black", Font.PLAIN, 15));
		textField_5.setColumns(10);
		textField_5.setBackground(new Color(222, 222, 222));
		textField_5.setBounds(852, 256, 252, 27);
		panelIndividualResults.add(textField_5);
		
		JLabel lblSelect_1_1_2_2_2 = new JLabel("Start Time :");
		lblSelect_1_1_2_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblSelect_1_1_2_2_2.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblSelect_1_1_2_2_2.setBounds(38, 319, 145, 30);
		panelIndividualResults.add(lblSelect_1_1_2_2_2);
		
		JLabel lblSelect_1_1_2_2_3 = new JLabel("End Time :");
		lblSelect_1_1_2_2_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblSelect_1_1_2_2_3.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblSelect_1_1_2_2_3.setBounds(598, 328, 145, 30);
		panelIndividualResults.add(lblSelect_1_1_2_2_3);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Arial Black", Font.PLAIN, 15));
		textField_6.setColumns(10);
		textField_6.setBackground(new Color(222, 222, 222));
		textField_6.setBounds(261, 322, 252, 27);
		panelIndividualResults.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Arial Black", Font.PLAIN, 15));
		textField_7.setColumns(10);
		textField_7.setBackground(new Color(222, 222, 222));
		textField_7.setBounds(852, 322, 252, 27);
		panelIndividualResults.add(textField_7);
		
		JLabel lblSelect_1_1_2_2_2_1 = new JLabel("Total Questions :");
		lblSelect_1_1_2_2_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblSelect_1_1_2_2_2_1.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblSelect_1_1_2_2_2_1.setBounds(37, 390, 180, 30);
		panelIndividualResults.add(lblSelect_1_1_2_2_2_1);
		
		JLabel lblSelect_1_1_2_2_2_2 = new JLabel("Attempted Questions : ");
		lblSelect_1_1_2_2_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblSelect_1_1_2_2_2_2.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblSelect_1_1_2_2_2_2.setBounds(598, 390, 244, 30);
		panelIndividualResults.add(lblSelect_1_1_2_2_2_2);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Arial Black", Font.PLAIN, 15));
		textField_8.setColumns(10);
		textField_8.setBackground(new Color(222, 222, 222));
		textField_8.setBounds(261, 388, 252, 27);
		panelIndividualResults.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Arial Black", Font.PLAIN, 15));
		textField_9.setColumns(10);
		textField_9.setBackground(new Color(222, 222, 222));
		textField_9.setBounds(852, 390, 252, 27);
		panelIndividualResults.add(textField_9);
		
		JLabel lblSelect_1_1_2_2_2_1_1 = new JLabel("Marks Obtained :");
		lblSelect_1_1_2_2_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblSelect_1_1_2_2_2_1_1.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblSelect_1_1_2_2_2_1_1.setBounds(359, 454, 180, 30);
		panelIndividualResults.add(lblSelect_1_1_2_2_2_1_1);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Arial Black", Font.PLAIN, 15));
		textField_10.setColumns(10);
		textField_10.setBackground(new Color(222, 222, 222));
		textField_10.setBounds(590, 457, 252, 27);
		panelIndividualResults.add(textField_10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(255, 0, 0));
		panel_1.setBounds(0, 0, 1238, 47);
		add(panel_1);
		
		JLabel lblReuslts = new JLabel("Display Results");
		lblReuslts.setHorizontalAlignment(SwingConstants.CENTER);
		lblReuslts.setForeground(Color.WHITE);
		lblReuslts.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblReuslts.setBackground(Color.WHITE);
		lblReuslts.setBounds(514, 0, 210, 47);
		panel_1.add(lblReuslts);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(255, 0, 0));
		panel_1_1.setBounds(0, 628, 1238, 25);
		add(panel_1_1);
		
		JLabel lblNewLabel_2_5 = new JLabel("Copyrights 2022 @ EDUCATION CENTER");
		lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_5.setForeground(Color.WHITE);
		lblNewLabel_2_5.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_2_5.setBounds(442, 0, 353, 25);
		panel_1_1.add(lblNewLabel_2_5);
		
		panelAllResults = new JPanel();
		panelAllResults.setBackground(new Color(255, 255, 255));
		panelAllResults.setBounds(10, 52, 1218, 561);
		add(panelAllResults);
		panelAllResults.setVisible(false);
		panelAllResults.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(25, 87, 1156, 11);
		panelAllResults.add(separator);
		
		JComboBox<Object> comboBoxUserType = new JComboBox<Object>();
		comboBoxUserType.setBounds(222, 35, 252, 27);
		comboBoxUserType.setModel(new DefaultComboBoxModel(new String[] {"Not Selected"}));
		comboBoxUserType.setSelectedIndex(0);
		comboBoxUserType.setFont(new Font("Arial Black", Font.PLAIN, 15));
		comboBoxUserType.setBackground(new Color(222, 222, 222));
		panelAllResults.add(comboBoxUserType);
		
		JLabel lblSelect = new JLabel("Select Exam :");
		lblSelect.setBounds(51, 31, 145, 30);
		lblSelect.setHorizontalAlignment(SwingConstants.LEFT);
		lblSelect.setFont(new Font("Arial Black", Font.PLAIN, 19));
		panelAllResults.add(lblSelect);
		
		JButton btnLoadResults = new JButton("Load Results");
		btnLoadResults.setBounds(540, 35, 252, 27);
		btnLoadResults.setForeground(Color.WHITE);
		btnLoadResults.setFont(new Font("Arial Black", Font.PLAIN, 19));
		btnLoadResults.setBackground(new Color(46, 61, 176));
		panelAllResults.add(btnLoadResults);
		
		JButton btnLoadResults_1_1_1 = new JButton("Back");
		btnLoadResults_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAllResults.setVisible(false);
			}
		});
		btnLoadResults_1_1_1.setForeground(Color.WHITE);
		btnLoadResults_1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 19));
		btnLoadResults_1_1_1.setBackground(new Color(46, 61, 176));
		btnLoadResults_1_1_1.setBounds(25, 511, 252, 27);
		panelAllResults.add(btnLoadResults_1_1_1);
		
		JPanel panelBtnAllResults = new JPanel();
		panelBtnAllResults.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("In Mouse Clicked");
				panelAllResults.setVisible(true);
			}
		});
		panelBtnAllResults.setLayout(null);
		panelBtnAllResults.setBackground(new Color(46, 61, 176));
		panelBtnAllResults.setBounds(227, 230, 278, 146);
		add(panelBtnAllResults);
		
		JLabel lblApproved = new JLabel("Show All Results");
		lblApproved.setHorizontalAlignment(SwingConstants.CENTER);
		lblApproved.setForeground(Color.WHITE);
		lblApproved.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblApproved.setBounds(0, 24, 278, 98);
		panelBtnAllResults.add(lblApproved);
		
		JPanel panelBtnIndividualResults = new JPanel();
		panelBtnIndividualResults.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelIndividualResults.setVisible(true);
			}
		});
		panelBtnIndividualResults.setLayout(null);
		panelBtnIndividualResults.setBackground(new Color(46, 61, 176));
		panelBtnIndividualResults.setBounds(732, 230, 278, 146);
		add(panelBtnIndividualResults);
		
		JLabel lblApproved_1 = new JLabel("Individual Results");
		lblApproved_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblApproved_1.setForeground(Color.WHITE);
		lblApproved_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblApproved_1.setBounds(0, 32, 278, 81);
		panelBtnIndividualResults.add(lblApproved_1);

	}
}
