package myPackage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Component;

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

public class HomePageStudent {

	public static JFrame frame;
	private JPanel panelMain; 
	private PanelDisplayActiveExamStudent  panelDisplayActiveExamStudent;
	private PanelDashboardStudent panelDashboardStudent; 
	private PanelMyProfileStudent panelMyProfileStudent;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePageStudent window = new HomePageStudent();
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
	public HomePageStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(46, 61, 176));
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
		panelMenu.setBorder(new MatteBorder(0, 2, 2, 2, (Color) new Color(255, 255, 255)));
		panelMenu.setBackground(new Color(34, 47, 132));
		panelMenu.setBounds(10, 161, 254, 653);
		frame.getContentPane().add(panelMenu);
		panelMenu.setLayout(null);

		panelMain = new JPanel();
		panelMain.setBorder(null);
		panelMain.setBounds(274, 161, 1238, 653);
		panelMain.setLayout(null);
		frame.getContentPane().add(panelMain);
		panelMain.setVisible(true);

		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(new Color(46, 61, 176));
		panel_1_2.setBounds(10, 3, 234, 51);
		panelMenu.add(panel_1_2);

		JLabel lblProfile = new JLabel("Profile");
		lblProfile.setBounds(29, 5, 176, 37);
		panel_1_2.add(lblProfile);
		lblProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfile.setForeground(Color.WHITE);
		lblProfile.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblProfile.setBackground(Color.WHITE);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(10, 57, 234, 586);
		panelMenu.add(panel_2);
		panel_2.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(6, 8, 221, 55);
		panel_2.add(panel_1);
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelDashboardStudent);
				panel_1.setBackground(new Color(37, 51, 143));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_1.setBackground(new Color(85, 101, 210));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_1.setBackground(new Color(46, 61, 176));
			}
		});
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(52, 71, 203)));
		panel_1.setBackground(new Color(46, 61, 176));

		JLabel lblDashboard_1 = new JLabel("Dashboard");
		lblDashboard_1.setForeground(new Color(255, 255, 255));
		lblDashboard_1.setBounds(7, 10, 207, 35);
		panel_1.add(lblDashboard_1);
		lblDashboard_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDashboard_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblDashboard_1.setBackground(new Color(221, 160, 221));

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(6, 70, 221, 55);
		panel_2.add(panel_1_1);
		panel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelMyProfileStudent);
				panel_1_1.setBackground(new Color(37, 51, 143));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_1_1.setBackground(new Color(85, 101, 210));
			}
			public void mouseExited(MouseEvent e) {
				panel_1_1.setBackground(new Color(46, 61, 176));
			}
		});
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(52, 71, 203)));
		panel_1_1.setBackground(new Color(46, 61, 176));

		JLabel lblDashboard_1_1 = new JLabel("My Profile");
		lblDashboard_1_1.setForeground(new Color(255, 255, 255));
		lblDashboard_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDashboard_1_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblDashboard_1_1.setBackground(new Color(221, 160, 221));
		lblDashboard_1_1.setBounds(7, 10, 207, 35);
		panel_1_1.add(lblDashboard_1_1);

		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBounds(6, 132, 221, 55);
		panel_2.add(panel_1_3);
		panel_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelDisplayActiveExamStudent.setVisible(true);
				panel_1_3.setBackground(new Color(37, 51, 143));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_1_3.setBackground(new Color(85, 101, 210));
			}
			public void mouseExited(MouseEvent e) {
				panel_1_3.setBackground(new Color(46, 61, 176));
			}
		});
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(52, 71, 203)));
		panel_1_3.setBackground(new Color(46, 61, 176));
		
		JLabel lblDashboard_1_1_1 = new JLabel("Exam");
		lblDashboard_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDashboard_1_1_1.setForeground(Color.WHITE);
		lblDashboard_1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblDashboard_1_1_1.setBackground(new Color(221, 160, 221));
		lblDashboard_1_1_1.setBounds(7, 10, 207, 35);
		panel_1_3.add(lblDashboard_1_1_1);

		JPanel panel_1_4 = new JPanel();
		panel_1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_1_4.setBackground(new Color(85, 101, 210));
			}
			public void mouseExited(MouseEvent e) {
				panel_1_4.setBackground(new Color(46, 61, 176));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_1_4.setBackground(new Color(37, 51, 143));
			}
		});
		panel_1_4.setBounds(6, 194, 221, 55);
		panel_2.add(panel_1_4);
		panel_1_4.setLayout(null);
		panel_1_4.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(52, 71, 203)));
		panel_1_4.setBackground(new Color(46, 61, 176));

		JLabel lblDashboard_1_3 = new JLabel("Result");
		lblDashboard_1_3.setForeground(new Color(255, 255, 255));
		lblDashboard_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblDashboard_1_3.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblDashboard_1_3.setBackground(new Color(221, 160, 221));
		lblDashboard_1_3.setBounds(7, 10, 207, 35);
		panel_1_4.add(lblDashboard_1_3);

		JPanel panel_1_5 = new JPanel();
		panel_1_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_1_5.setBackground(new Color(85, 101, 210));
			}
			public void mouseExited(MouseEvent e) {
				panel_1_5.setBackground(new Color(46, 61, 176));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_1_5.setBackground(new Color(37, 51, 143));
				if(JOptionPane.showConfirmDialog(null, "Do You Want To Log Out ?", "Log Out ", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
					LoginPage.main(null);
				}
			}
		});
		panel_1_5.setBounds(6, 256, 221, 55);
		panel_2.add(panel_1_5);
		panel_1_5.setLayout(null);
		panel_1_5.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(52, 71, 203)));
		panel_1_5.setBackground(new Color(46, 61, 176));

		JLabel lblDashboard_1_4 = new JLabel("Log out");
		lblDashboard_1_4.setForeground(new Color(255, 255, 255));
		lblDashboard_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblDashboard_1_4.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblDashboard_1_4.setBackground(new Color(221, 160, 221));
		lblDashboard_1_4.setBounds(7, 10, 207, 35);
		panel_1_5.add(lblDashboard_1_4);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(8, 321, 218, 255);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(HomePageStudent.class.getResource("/ExamImages/HomePageMenuImage.png")));
		lblNewLabel_1.setBounds(0, 0, 218, 255);
		panel_3.add(lblNewLabel_1);



		JPanel panelTitle = new JPanel();
		panelTitle.setBorder(null);
		panelTitle.setBackground(new Color(255, 255, 255));
		panelTitle.setBounds(10, 7, 1502, 154);
		frame.getContentPane().add(panelTitle);
		panelTitle.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(HomePageStudent.class.getResource("/ExamImages/TitePanelStudent.jpg")));
		lblNewLabel.setBounds(2, 5, 1497, 144);
		panelTitle.add(lblNewLabel);


		panelDisplayActiveExamStudent = new PanelDisplayActiveExamStudent();
		panelMain.add(panelDisplayActiveExamStudent);
		panelDisplayActiveExamStudent.setVisible(false);

		panelDashboardStudent = new PanelDashboardStudent();
		panelMain.add(panelDashboardStudent);
		panelDashboardStudent.setVisible(true);

		panelMyProfileStudent = new PanelMyProfileStudent();
		panelMain.add(panelMyProfileStudent);
		panelMyProfileStudent.setVisible(false);

	}
	public void menuClicked(JPanel selectedPanel) {
		panelDisplayActiveExamStudent.setVisible(false);
		panelDashboardStudent.setVisible(false);
		panelMyProfileStudent.setVisible(false);
		selectedPanel.setVisible(true);

	}
}
