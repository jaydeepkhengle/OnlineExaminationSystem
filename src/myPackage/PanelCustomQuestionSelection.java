package myPackage;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import jdbc.MySQL;

import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class PanelCustomQuestionSelection extends JPanel {
	private JTable table;
	public PanelCreateNewTestAdmin panelCreateNewTestAdmin;

	/**
	 * Create the panel.
	 */
	public PanelCustomQuestionSelection() {
		setSize(1238, 653);
		setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1238, 47);
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(46, 61, 176));
		add(panel_1);

		JLabel lblAdminRegistration = new JLabel("Exam - Create New Exam - Custom Question Set");
		lblAdminRegistration.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminRegistration.setForeground(Color.WHITE);
		lblAdminRegistration.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblAdminRegistration.setBackground(Color.WHITE);
		lblAdminRegistration.setBounds(354, 0, 529, 47);
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

		JLabel lblNewLabel = new JLabel("Select the Questions you wish to appear in exam");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblNewLabel.setBounds(50, 72, 518, 25);
		add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(40, 158, 773, 407);
		add(scrollPane);

		table = new JTable();

		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Sr No", "Question"
				}
				));
		table.getColumnModel().getColumn(0).setPreferredWidth(38);
		table.getColumnModel().getColumn(1).setPreferredWidth(559);
		scrollPane.setViewportView(table);

		MySQL mySql = new MySQL();
		ResultSet result = mySql.displayQuestions("Java_Questions");

		DefaultTableModel model = new DefaultTableModel();
		String[]colmunNames = {"Sr No", "Question"};
		model.setColumnIdentifiers(colmunNames);

		try {
			while(result.next()) {

				model.addRow(new Object[] {

						result.getInt("S_No"),
						result.getString("Questions")

				});

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		table.setModel(model);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);


		try {
			result.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ListSelectionModel listModel = table.getSelectionModel();
		listModel.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub

				if(!listModel.isSelectionEmpty()) {
					int selectedRow = listModel.getMinSelectionIndex()+1;
					JOptionPane.showMessageDialog(null, "Selected Row : " + selectedRow, "Selection ", JOptionPane.INFORMATION_MESSAGE);
				}

			}
		});



		JLabel lblNoteNumber = new JLabel("Note : Number of question selected should not exceed maximum / total number of questions in test");
		lblNoteNumber.setForeground(new Color(255, 0, 0));
		lblNoteNumber.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		lblNoteNumber.setBounds(50, 107, 763, 25);
		add(lblNoteNumber);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(823, 158, 394, 448);
		add(panel);
		panel.setLayout(null);

		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 10, 45, 45);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.setBounds(65, 10, 45, 45);
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("1");
		btnNewButton_2.setBounds(120, 10, 45, 45);
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("1");
		btnNewButton_3.setBounds(175, 10, 45, 45);
		panel.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("1");
		btnNewButton_4.setBounds(230, 10, 45, 45);
		panel.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("1");
		btnNewButton_5.setBounds(285, 10, 45, 45);
		panel.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("1");
		btnNewButton_6.setBounds(340, 10, 45, 45);
		panel.add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("1");
		btnNewButton_7.setBounds(10, 65, 45, 45);
		panel.add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("1");
		btnNewButton_8.setBounds(65, 65, 45, 45);
		panel.add(btnNewButton_8);

		JButton btnNewButton_9 = new JButton("1");
		btnNewButton_9.setBounds(120, 65, 45, 45);
		panel.add(btnNewButton_9);

		JButton btnNewButton_10 = new JButton("1");
		btnNewButton_10.setBounds(175, 65, 45, 45);
		panel.add(btnNewButton_10);

		JButton btnNewButton_11 = new JButton("1");
		btnNewButton_11.setBounds(230, 65, 45, 45);
		panel.add(btnNewButton_11);

		JButton btnNewButton_12 = new JButton("1");
		btnNewButton_12.setBounds(285, 65, 45, 45);
		panel.add(btnNewButton_12);

		JButton btnNewButton_13 = new JButton("1");
		btnNewButton_13.setBounds(340, 65, 45, 45);
		panel.add(btnNewButton_13);

		JButton btnNewButton_14 = new JButton("1");
		btnNewButton_14.setBounds(10, 120, 45, 45);
		panel.add(btnNewButton_14);

		JButton btnNewButton_15 = new JButton("1");
		btnNewButton_15.setBounds(65, 120, 45, 45);
		panel.add(btnNewButton_15);

		JButton btnNewButton_16 = new JButton("1");
		btnNewButton_16.setBounds(120, 120, 45, 45);
		panel.add(btnNewButton_16);

		JButton btnNewButton_17 = new JButton("1");
		btnNewButton_17.setBounds(175, 120, 45, 45);
		panel.add(btnNewButton_17);

		JButton btnNewButton_18 = new JButton("1");
		btnNewButton_18.setBounds(230, 120, 45, 45);
		panel.add(btnNewButton_18);

		JButton btnNewButton_19 = new JButton("1");
		btnNewButton_19.setBounds(285, 120, 45, 45);
		panel.add(btnNewButton_19);

		JButton btnNewButton_20 = new JButton("1");
		btnNewButton_20.setBounds(340, 120, 45, 45);
		panel.add(btnNewButton_20);

		JButton btnNewButton_21 = new JButton("1");
		btnNewButton_21.setBounds(10, 175, 45, 45);
		panel.add(btnNewButton_21);

		JButton btnNewButton_22 = new JButton("1");
		btnNewButton_22.setBounds(65, 175, 45, 45);
		panel.add(btnNewButton_22);

		JButton btnNewButton_23 = new JButton("1");
		btnNewButton_23.setBounds(120, 175, 45, 45);
		panel.add(btnNewButton_23);

		JButton btnNewButton_24 = new JButton("1");
		btnNewButton_24.setBounds(175, 175, 45, 45);
		panel.add(btnNewButton_24);

		JButton btnNewButton_25 = new JButton("1");
		btnNewButton_25.setBounds(230, 175, 45, 45);
		panel.add(btnNewButton_25);

		JButton btnNewButton_26 = new JButton("1");
		btnNewButton_26.setBounds(285, 175, 45, 45);
		panel.add(btnNewButton_26);

		JButton btnNewButton_27 = new JButton("1");
		btnNewButton_27.setBounds(340, 175, 45, 45);
		panel.add(btnNewButton_27);

		JButton btnNewButton_28 = new JButton("1");
		btnNewButton_28.setBounds(10, 230, 45, 45);
		panel.add(btnNewButton_28);

		JButton btnNewButton_29 = new JButton("1");
		btnNewButton_29.setBounds(65, 230, 45, 45);
		panel.add(btnNewButton_29);

		JButton btnNewButton_30 = new JButton("1");
		btnNewButton_30.setBounds(120, 230, 45, 45);
		panel.add(btnNewButton_30);

		JButton btnNewButton_31 = new JButton("1");
		btnNewButton_31.setBounds(175, 230, 45, 45);
		panel.add(btnNewButton_31);

		JButton btnNewButton_32 = new JButton("1");
		btnNewButton_32.setBounds(230, 230, 45, 45);
		panel.add(btnNewButton_32);

		JButton btnNewButton_33 = new JButton("1");
		btnNewButton_33.setBounds(285, 230, 45, 45);
		panel.add(btnNewButton_33);

		JButton btnNewButton_34 = new JButton("1");
		btnNewButton_34.setBounds(340, 230, 45, 45);
		panel.add(btnNewButton_34);

		JButton btnNewButton_35 = new JButton("1");
		btnNewButton_35.setBounds(10, 285, 45, 45);
		panel.add(btnNewButton_35);

		JButton btnNewButton_36 = new JButton("1");
		btnNewButton_36.setBounds(65, 285, 45, 45);
		panel.add(btnNewButton_36);

		JButton btnNewButton_37 = new JButton("1");
		btnNewButton_37.setBounds(120, 285, 45, 45);
		panel.add(btnNewButton_37);

		JButton btnNewButton_38 = new JButton("1");
		btnNewButton_38.setBounds(175, 285, 45, 45);
		panel.add(btnNewButton_38);

		JButton btnNewButton_39 = new JButton("1");
		btnNewButton_39.setBounds(230, 285, 45, 45);
		panel.add(btnNewButton_39);

		JButton btnNewButton_40 = new JButton("1");
		btnNewButton_40.setBounds(285, 285, 45, 45);
		panel.add(btnNewButton_40);

		JButton btnNewButton_41 = new JButton("1");
		btnNewButton_41.setBounds(340, 285, 45, 45);
		panel.add(btnNewButton_41);

		JButton btnNewButton_42 = new JButton("1");
		btnNewButton_42.setBounds(10, 340, 45, 45);
		panel.add(btnNewButton_42);

		JButton btnNewButton_43 = new JButton("1");
		btnNewButton_43.setBounds(65, 340, 45, 45);
		panel.add(btnNewButton_43);

		JButton btnNewButton_44 = new JButton("1");
		btnNewButton_44.setBounds(120, 340, 45, 45);
		panel.add(btnNewButton_44);

		JButton btnNewButton_45 = new JButton("1");
		btnNewButton_45.setBounds(175, 340, 45, 45);
		panel.add(btnNewButton_45);

		JButton btnNewButton_46 = new JButton("1");
		btnNewButton_46.setBounds(230, 340, 45, 45);
		panel.add(btnNewButton_46);

		JButton btnNewButton_47 = new JButton("1");
		btnNewButton_47.setBounds(285, 340, 45, 45);
		panel.add(btnNewButton_47);

		JButton btnNewButton_48 = new JButton("1");
		btnNewButton_48.setBounds(340, 340, 45, 45);
		panel.add(btnNewButton_48);

		JButton btnNewButton_45_1 = new JButton("1");
		btnNewButton_45_1.setBounds(10, 395, 45, 45);
		panel.add(btnNewButton_45_1);

		JLabel lblNewLabel_1 = new JLabel("Questions Selected");
		lblNewLabel_1.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		lblNewLabel_1.setBounds(1012, 97, 147, 25);
		add(lblNewLabel_1);

		JButton btnNewButton_6_1_1 = new JButton("");
		btnNewButton_6_1_1.setBackground(new Color(255, 0, 0));
		btnNewButton_6_1_1.setBounds(1173, 123, 25, 25);
		add(btnNewButton_6_1_1);

		JLabel lblNewLabel_1_1 = new JLabel("Not Selected");
		lblNewLabel_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(1012, 123, 127, 25);
		add(lblNewLabel_1_1);

		JButton btnNewButton_6_1_1_1 = new JButton("");
		btnNewButton_6_1_1_1.setBackground(new Color(0, 255, 0));
		btnNewButton_6_1_1_1.setBounds(1173, 93, 25, 25);
		add(btnNewButton_6_1_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("Total Selected - ");
		lblNewLabel_1_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_1_2.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(1012, 69, 147, 25);
		add(lblNewLabel_1_2);

		JLabel lblNewLabel_2 = new JLabel("1");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(1173, 65, 25, 25);
		add(lblNewLabel_2);

		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Component [] component = getComponents();
				for(Component components : component) {
					components.setVisible(false);
				}
				PanelCreateNewTestAdmin.makeComponentsVisible(true);

			}
		});
		btnClose.setForeground(Color.WHITE);
		btnClose.setFont(new Font("Arial Black", Font.PLAIN, 17));
		btnClose.setBackground(new Color(46, 61, 176));
		btnClose.setBounds(337, 575, 210, 25);
		add(btnClose);


	}
}
