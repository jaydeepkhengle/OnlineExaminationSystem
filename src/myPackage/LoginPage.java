package myPackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import jdbc.MySQL;

import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JTextField;
import javax.swing.JPasswordField;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;



public class LoginPage {

	private JFrame frmEducationCenter;
	public static JTextField txtUsername;
	private JPasswordField txtPassword;
	private boolean viewPass = false;
	private JButton btnRegister, btnLogin;
	private JLabel lblOr;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.frmEducationCenter.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEducationCenter = new JFrame();
		//frmEducationCenter.setIconImage(Toolkit.getDefaultToolkit().getImage(LoginPage.class.getResource("/ExamImages/v1033-a-06-c.jpg")));
		frmEducationCenter.getContentPane().setBackground(new Color(255, 255, 255));
		frmEducationCenter.getContentPane().setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(new Color(221, 230, 253));
		mainPanel.setBounds(264, 126, 990, 621);
		frmEducationCenter.getContentPane().add(mainPanel);
		mainPanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(LoginPage.class.getResource("/ExamImages/SideImage.jpg")));
		lblNewLabel_1.setBounds(450, 10, 530, 601);
		mainPanel.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(450, 10, 530, 601);
		mainPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Portal Login");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(137, 125, 185, 50);
		mainPanel.add(lblNewLabel_2);
		
		JPanel panelUsername = new JPanel();
		panelUsername.setBounds(26, 280, 400, 65);
		panelUsername.setBackground(new Color(255, 255, 255));
		mainPanel.add(panelUsername);
		panelUsername.setLayout(null);
		
		JPanel pnlUsername = new JPanel();
		pnlUsername.setBackground(new Color(111, 33, 173));
		pnlUsername.setBounds(0, 0, 15, 65);
		panelUsername.add(pnlUsername);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(LoginPage.class.getResource("/ExamImages/imgUserSmall.jpg")));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(25, 10, 45, 45);
		panelUsername.add(lblNewLabel_3);
		
		txtUsername = new JTextField();
		txtUsername.setForeground(new Color(128, 128, 128));
		txtUsername.setHorizontalAlignment(SwingConstants.LEFT);
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtUsername.setText("Username");
		
		txtUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtUsername.getText().equals("Username")) {
					txtUsername.setForeground(new Color(0, 0, 0));
					txtUsername.setText("");
				}else {
					txtUsername.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtUsername.getText().equals("")) {
					txtUsername.setForeground(new Color(128, 128, 128));
					txtUsername.setText("Username");
				}
			}
		});
		txtUsername.setBackground(new Color(255, 255, 255));
		txtUsername.setBorder(null);
		txtUsername.setBounds(94, 10, 296, 45);
		panelUsername.add(txtUsername);
		txtUsername.setColumns(10);
		
		JPanel panelPassword = new JPanel();
		panelPassword.setBackground(new Color(255, 255, 255));
		panelPassword.setBounds(26, 367, 400, 65);
		mainPanel.add(panelPassword);
		panelPassword.setLayout(null);
		
		JPanel pnlPassword = new JPanel();
		pnlPassword.setBackground(new Color(111, 33, 173));
		pnlPassword.setBounds(0,0,15,65);
		panelPassword.add(pnlPassword);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon(LoginPage.class.getResource("/ExamImages/imgPassSmall.jpg")));
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(25, 10, 45, 45);
		panelPassword.add(lblNewLabel_3_1);
		
		txtPassword = new JPasswordField();
		txtPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtPassword.getText().equals("Password")) {
					txtPassword.setForeground(new Color(0, 0, 0));
					txtPassword.setEchoChar('●');
					txtPassword.setText("");
				}else {
					txtPassword.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtPassword.getText().equals("")) {
					txtPassword.setForeground(new Color(128, 128, 128));
					txtPassword.setEchoChar((char)0);
					txtPassword.setText("Password");
				}
			}
		});
		txtPassword.setForeground(new Color(128, 128, 128));
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtPassword.setBackground(new Color(255, 255, 255));
		txtPassword.setBorder(null);
		txtPassword.setText("Password");
		txtPassword.setEchoChar((char)0);
		txtPassword.setBounds(95, 10, 257, 45);
		panelPassword.add(txtPassword);
		
		JLabel lblShowPass = new JLabel("");
		lblShowPass.setIcon(new ImageIcon(LoginPage.class.getResource("/ExamImages/ShowPassSmall.jpg")));
		lblShowPass.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowPass.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(viewPass) {
					txtPassword.setEchoChar('●');
					lblShowPass.setIcon(new ImageIcon(LoginPage.class.getResource("/ExamImages/ShowPassSmall.jpg")));
					viewPass = false;
				}else {
					txtPassword.setEchoChar('\u0000');
					
					lblShowPass.setIcon(new ImageIcon(LoginPage.class.getResource("/ExamImages/HidePassSmall.png")));
					viewPass = true;
				}
			}
		});
		
		lblShowPass.setBounds(360, 17, 30, 31);
		panelPassword.add(lblShowPass);
		
	    btnLogin = new JButton("Login");
		btnLogin.setForeground(new Color(0, 0, 0));
		btnLogin.setBounds(26, 467, 400, 42);
		mainPanel.add(btnLogin);
		btnLogin.setBackground(new Color(111, 33, 173));
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String userType = (String)comboBox.getSelectedItem();
				String loginName = txtUsername.getText();
				String password = txtPassword.getText();
				
				MySQL mySql = new MySQL();
				ResultSet result = mySql.logIn(loginName, password, userType);
				
				String dbPassword = null;
				String dbUsername = null;
				
				try {
					while(result.next()) {
						dbUsername = result.getString("username");
						dbPassword = result.getString("password");		
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				if(userType.equalsIgnoreCase("Admin")) {
					
					if(dbUsername!=null) {
						if(dbUsername.equals(loginName) && dbPassword.equals(password)) {
							HomePageAdmin.main(null);
						}
						else {
							JOptionPane.showMessageDialog(null, "Incorrect Username/Password", "Login Failure", JOptionPane.ERROR_MESSAGE);
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Invalid Data", "Login Failure", JOptionPane.ERROR_MESSAGE);
					}
					
				}
				else if(userType.equalsIgnoreCase("Student")) {
					
					if(dbUsername!=null) {
						if(dbUsername.equals(loginName) && dbPassword.equals(password)) {
							HomePageStudent.main(null);
						}
						else {
							JOptionPane.showMessageDialog(null, "Incorrect Username/Password", "Login Failure", JOptionPane.ERROR_MESSAGE);
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Invalid Data", "Login Failure", JOptionPane.ERROR_MESSAGE);
					}
					
				}
				
			
				
			}
		});
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(LoginPage.class.getResource("/ExamImages/SmallLogo.jpg")));
		lblNewLabel_4.setBounds(173, 20, 100, 100);
		mainPanel.add(lblNewLabel_4);
		
		comboBox = new JComboBox();
		comboBox.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(comboBox.getSelectedItem().equals("Student")) {
					System.out.println("In Student");
					btnRegister.setVisible(true);
					lblOr.setVisible(true);
					frmEducationCenter.revalidate();
					frmEducationCenter.repaint();
				}
				else {
					btnRegister.setVisible(false);
					lblOr.setVisible(false);
				}
			}
		});
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select User", "Student", "Admin"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(26, 218, 400, 34);
		mainPanel.add(comboBox);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 160));
		separator.setBounds(26, 185, 400, 2);
		mainPanel.add(separator);
		
		btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameRegisterStudent.main(null);
			}
		});
		btnRegister.setForeground(Color.BLACK);
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRegister.setBackground(new Color(111, 33, 173));
		btnRegister.setBounds(26, 555, 400, 42);
		mainPanel.add(btnRegister);
		btnRegister.setVisible(false);
		
		lblOr = new JLabel("OR");
		lblOr.setVisible(false);
		
		lblOr.setHorizontalAlignment(SwingConstants.CENTER);
		lblOr.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblOr.setBounds(165, 523, 108, 22);
		mainPanel.add(lblOr);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(LoginPage.class.getResource("/ExamImages/5556661.jpg")));
		lblNewLabel.setBounds(0, 0, 1522, 827);
		frmEducationCenter.getContentPane().add(lblNewLabel);
		
		
		frmEducationCenter.setTitle("Education Center");
		frmEducationCenter.setResizable(false);
		
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension dim = tool.getScreenSize();
		int width = dim.width;
		int height = dim.height;
		
		frmEducationCenter.setSize(width, height);
		frmEducationCenter.setLocationRelativeTo(null);
		frmEducationCenter.setResizable(false);
		
	}
}
