package myPackage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.EtchedBorder;

public class HomePageAdmin {

	private JFrame frame;
	private PanelDashboardAdmin panelDashboardAdmin;
	private JPanel panelMain; 
	private PanelRegisterAdmin panelRegisterAdmin;
	private PanelExamAdmin panelExamAdmin;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePageAdmin window = new HomePageAdmin();
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
	public HomePageAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(211, 153, 16));
		frame.getContentPane().setLayout(null);
		//		frame.setBounds(100, 100, 450, 300);
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension dim = tool.getScreenSize();
		int width = dim.width;
		int height = dim.height;


		frame.setSize(width, height);
		System.out.println(width+"<--width and height-->"+height);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panelMenu = new JPanel();
		panelMenu.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(122, 102, 10)));
		panelMenu.setBounds(10, 165, 254, 653);
		frame.getContentPane().add(panelMenu);

		panelMain = new JPanel();
		panelMain.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(72, 61, 139)));
		panelMain.setBounds(274, 165, 1238, 653);
		panelMain.setLayout(null);
		frame.getContentPane().add(panelMain);
		panelMain.setVisible(true);
		panelMenu.setLayout(null);

		JPanel panelBtnLogout = new JPanel();
		panelBtnLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null,"Do you want to exit?","Logout", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
					LoginPage.main(null);
				}

			}
		});
		panelBtnLogout.setLayout(null);
		panelBtnLogout.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(97, 65, 12), null));
		panelBtnLogout.setBackground(new Color(191, 129, 23));
		panelBtnLogout.setBounds(21, 551, 210, 55);
		panelMenu.add(panelBtnLogout);

		JLabel lblDashboard_1_3_1 = new JLabel("Logout");
		lblDashboard_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDashboard_1_3_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblDashboard_1_3_1.setBackground(new Color(221, 160, 221));
		lblDashboard_1_3_1.setBounds(0, 0, 207, 55);
		panelBtnLogout.add(lblDashboard_1_3_1);

		JPanel panelCreateTest = new JPanel();
		panelCreateTest.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelExamAdmin);
			}
		});
		panelCreateTest.setBounds(21, 248, 210, 55);
		panelCreateTest.setLayout(null);
		panelCreateTest.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(97, 65, 12), null));
		panelCreateTest.setBackground(new Color(191, 129, 23));
		panelMenu.add(panelCreateTest);

		JLabel lblDashboard_1_2 = new JLabel("Exam");
		lblDashboard_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDashboard_1_2.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblDashboard_1_2.setBackground(new Color(221, 160, 221));
		lblDashboard_1_2.setBounds(0, 0, 207, 55);
		panelCreateTest.add(lblDashboard_1_2);

		JPanel panelBtnStudentList = new JPanel();
		panelBtnStudentList.setBounds(21, 450, 210, 55);
		panelBtnStudentList.setLayout(null);
		panelBtnStudentList.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(97, 65, 12), null));
		panelBtnStudentList.setBackground(new Color(191, 129, 23));
		panelMenu.add(panelBtnStudentList);

		JLabel lblDashboard_1_4 = new JLabel("Student List");
		lblDashboard_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblDashboard_1_4.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblDashboard_1_4.setBackground(new Color(221, 160, 221));
		lblDashboard_1_4.setBounds(0, 0, 207, 55);
		panelBtnStudentList.add(lblDashboard_1_4);

		JPanel panelBtnRegistration = new JPanel();
		panelBtnRegistration.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelRegisterAdmin);

			}
		});
		panelBtnRegistration.setBounds(21, 147, 210, 55);
		panelBtnRegistration.setLayout(null);
		panelBtnRegistration.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(97, 65, 12), null));
		panelBtnRegistration.setBackground(new Color(191, 129, 23));
		panelMenu.add(panelBtnRegistration);

		JLabel lblDashboard_1_1 = new JLabel("Registration");
		lblDashboard_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDashboard_1_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblDashboard_1_1.setBackground(new Color(221, 160, 221));
		lblDashboard_1_1.setBounds(0, 0, 207, 55);
		panelBtnRegistration.add(lblDashboard_1_1);

		JPanel panelBtnResult = new JPanel();
		panelBtnResult.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		panelBtnResult.setBounds(21, 349, 210, 55);
		panelBtnResult.setLayout(null);
		panelBtnResult.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(97, 65, 12), null));
		panelBtnResult.setBackground(new Color(191, 129, 23));
		panelMenu.add(panelBtnResult);

		JLabel lblDashboard_1_3 = new JLabel("Result");
		lblDashboard_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblDashboard_1_3.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblDashboard_1_3.setBackground(new Color(221, 160, 221));
		lblDashboard_1_3.setBounds(0, 0, 207, 55);
		panelBtnResult.add(lblDashboard_1_3);

		JPanel panelBtnDashboard = new JPanel();
		panelBtnDashboard.setBounds(21, 50, 210, 55);
		panelMenu.add(panelBtnDashboard);
		panelBtnDashboard.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelDashboardAdmin);

			}
		});
		panelBtnDashboard.setLayout(null);
		panelBtnDashboard.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(97, 65, 12), null));
		panelBtnDashboard.setBackground(new Color(191, 129, 23));

		JLabel lblDashboard_1 = new JLabel("Dashboard");
		lblDashboard_1.setBounds(0, 0, 207, 55);
		panelBtnDashboard.add(lblDashboard_1);
		lblDashboard_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDashboard_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblDashboard_1.setBackground(new Color(221, 160, 221));

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(10, 47, 234, 596);
		lblNewLabel_3.setIcon(new ImageIcon(HomePageAdmin.class.getResource("/ExamImages/DashBoardPanelAdmin.jpg")));
		panelMenu.add(lblNewLabel_3);

		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(0, 0, 254, 47);
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(new Color(122, 102, 10));
		panelMenu.add(panel_1_2);

		JLabel lblProfile = new JLabel("Profile");
		lblProfile.setBounds(39, 10, 176, 37);
		panel_1_2.add(lblProfile);
		lblProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfile.setForeground(Color.WHITE);
		lblProfile.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblProfile.setBackground(Color.WHITE);



		JPanel panelTitle = new JPanel();
		panelTitle.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(122, 102, 10)));
		panelTitle.setBackground(new Color(255, 255, 255));
		panelTitle.setBounds(10, 7, 1502, 154);
		frame.getContentPane().add(panelTitle);
		panelTitle.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(HomePageAdmin.class.getResource("/ExamImages/TitlePanelAdmin.jpg")));
		lblNewLabel.setBounds(5, 5, 1492, 144);
		panelTitle.add(lblNewLabel);

		panelRegisterAdmin = new PanelRegisterAdmin();
		panelMain.add(panelRegisterAdmin);
		panelRegisterAdmin.setVisible(false);

		panelDashboardAdmin = new PanelDashboardAdmin();
		panelMain.add(panelDashboardAdmin);
		panelDashboardAdmin.setVisible(true);
		
		panelExamAdmin = new PanelExamAdmin();
		panelMain.add(panelExamAdmin);
		panelExamAdmin.setVisible(false);

		



	}
	public void menuClicked(JPanel selectedPanel) {
		panelDashboardAdmin.setVisible(false);
		panelRegisterAdmin.setVisible(false);
		panelExamAdmin.setVisible(false);
		selectedPanel.setVisible(true);


	}
}
