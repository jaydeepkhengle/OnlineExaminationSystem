package myPackage;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PanelViewResult extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtTestName;
	private JTextField txtTestCode;
	private JTextField txtDuration;
	private JTextField textField_3;
	private JTextField txtMarksObt;
	private JTextField txtTotalMarks;

	/**
	 * Create the panel.
	 */
	public PanelViewResult() {
		setSize(619, 327);
		setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Test Name : ");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(26, 37, 105, 21);
		add(lblNewLabel_2);
		
		txtTestName = new JTextField();
		txtTestName.setColumns(10);
		txtTestName.setBounds(141, 40, 124, 19);
		add(txtTestName);
		
		JLabel lblNewLabel_2_1 = new JLabel("Test Code : ");
		lblNewLabel_2_1.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(319, 36, 105, 21);
		add(lblNewLabel_2_1);
		
		txtTestCode = new JTextField();
		txtTestCode.setColumns(10);
		txtTestCode.setBounds(434, 39, 124, 19);
		add(txtTestCode);
		
		JLabel lblNewLabel_2_2 = new JLabel("Duration : ");
		lblNewLabel_2_2.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNewLabel_2_2.setBounds(26, 111, 105, 21);
		add(lblNewLabel_2_2);
		
		txtDuration = new JTextField();
		txtDuration.setColumns(10);
		txtDuration.setBounds(141, 114, 124, 19);
		add(txtDuration);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(434, 114, 124, 19);
		add(textField_3);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Test Code : ");
		lblNewLabel_2_1_1.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNewLabel_2_1_1.setBounds(319, 111, 105, 21);
		add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("Marks Obt.:");
		lblNewLabel_2_3.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNewLabel_2_3.setBounds(26, 181, 105, 21);
		add(lblNewLabel_2_3);
		
		txtMarksObt = new JTextField();
		txtMarksObt.setColumns(10);
		txtMarksObt.setBounds(141, 184, 124, 19);
		add(txtMarksObt);
		
		JLabel lblNewLabel_2_4 = new JLabel("Total Marks:");
		lblNewLabel_2_4.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNewLabel_2_4.setBounds(319, 180, 105, 21);
		add(lblNewLabel_2_4);
		
		txtTotalMarks = new JTextField();
		txtTotalMarks.setColumns(10);
		txtTotalMarks.setBounds(434, 183, 124, 19);
		add(txtTotalMarks);
		
		JButton btnBackHome = new JButton("Back Home");
		btnBackHome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBackHome.setBounds(255, 271, 108, 33);
		add(btnBackHome);

	}

}
