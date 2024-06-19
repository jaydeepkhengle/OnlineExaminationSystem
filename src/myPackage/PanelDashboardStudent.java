package myPackage;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;

public class PanelDashboardStudent extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PanelDashboardStudent() {
		setSize(1238, 653);
		setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Copyright 2023 @ EDUCATION CENTER");
		lblNewLabel_1.setBounds(450, 628, 337, 25);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1238, 47);
		panel.setBackground(new Color(46, 61, 176));
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dashboard");
		lblNewLabel.setBounds(530, 0, 178, 47);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 628, 1238, 25);
		panel_2.setBackground(new Color(46, 61, 176));
		add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(220, 20, 60), 5, true));
		panel_3.setBackground(new Color(255, 127, 80));
		panel_3.setBounds(122, 128, 249, 135);
		add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2_6 = new JLabel("● PASSING RATE ●");
		lblNewLabel_2_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_6.setBounds(37, 10, 174, 22);
		panel_3.add(lblNewLabel_2_6);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(255, 0, 0));
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(38, 38, 166, 8);
		panel_3.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2.setBounds(96, 60, 56, 27);
		lblNewLabel_2.setText("20%");
		panel_3.add(lblNewLabel_2);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBorder(new LineBorder(new Color(66, 102, 51), 5, true));
		panel_3_1.setBackground(new Color(60, 179, 113));
		panel_3_1.setBounds(493, 128, 249, 135);
		add(panel_3_1);
		panel_3_1.setLayout(null);
		
		JLabel lblNewLabel_2_6_1 = new JLabel("● PASSING RATE ●");
		lblNewLabel_2_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_6_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_6_1.setBounds(39, 10, 174, 22);
		panel_3_1.add(lblNewLabel_2_6_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(new Color(0, 128, 0));
		separator_1.setBounds(40, 38, 166, 8);
		panel_3_1.add(separator_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("20%");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2_1.setBounds(98, 60, 56, 27);
		panel_3_1.add(lblNewLabel_2_1);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBorder(new LineBorder(new Color(88, 142, 6), 5, true));
		panel_3_2.setBackground(new Color(127, 255, 0));
		panel_3_2.setBounds(306, 348, 249, 135);
		add(panel_3_2);
		panel_3_2.setLayout(null);
		
		JLabel lblNewLabel_2_6_3 = new JLabel("● PASSING RATE ●");
		lblNewLabel_2_6_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_6_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_6_3.setBounds(37, 10, 174, 22);
		panel_3_2.add(lblNewLabel_2_6_3);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLACK);
		separator_3.setBackground(new Color(0, 255, 0));
		separator_3.setBounds(38, 38, 166, 8);
		panel_3_2.add(separator_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("20%");
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2_3.setBounds(96, 60, 56, 27);
		panel_3_2.add(lblNewLabel_2_3);
		
		JPanel panel_3_3 = new JPanel();
		panel_3_3.setBorder(new LineBorder(new Color(36, 64, 115), 5, true));
		panel_3_3.setBackground(new Color(30, 144, 255));
		panel_3_3.setBounds(864, 128, 249, 135);
		add(panel_3_3);
		panel_3_3.setLayout(null);
		
		JLabel lblNewLabel_2_6_2 = new JLabel("● PASSING RATE ●");
		lblNewLabel_2_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_6_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_6_2.setBounds(35, 10, 174, 22);
		panel_3_3.add(lblNewLabel_2_6_2);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBackground(new Color(0, 0, 255));
		separator_2.setBounds(36, 38, 166, 8);
		panel_3_3.add(separator_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("20%");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2_2.setBounds(94, 60, 56, 27);
		panel_3_3.add(lblNewLabel_2_2);
		
		JPanel panel_3_3_1 = new JPanel();
		panel_3_3_1.setBorder(new LineBorder(new Color(174, 0, 174), 5, true));
		panel_3_3_1.setBackground(new Color(255, 128, 255));
		panel_3_3_1.setBounds(677, 348, 249, 135);
		add(panel_3_3_1);
		panel_3_3_1.setLayout(null);
		
		JLabel lblNewLabel_2_6_4 = new JLabel("● PASSING RATE ●");
		lblNewLabel_2_6_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_6_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_6_4.setBounds(36, 10, 174, 22);
		panel_3_3_1.add(lblNewLabel_2_6_4);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.BLACK);
		separator_4.setBackground(new Color(255, 0, 128));
		separator_4.setBounds(37, 38, 166, 8);
		panel_3_3_1.add(separator_4);
		
		JLabel lblNewLabel_2_4 = new JLabel("20%");
		lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2_4.setBounds(95, 60, 56, 27);
		panel_3_3_1.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(PanelDashboardStudent.class.getResource("/ExamImages/DashBoardPanelBack.jpg")));
		lblNewLabel_3.setBounds(0, 47, 1238, 581);
		add(lblNewLabel_3);

	}
}
