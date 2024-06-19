package myPackage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.swing.border.LineBorder;

import jdbc.MySQL;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import static myPackage.PanelTestReviewStudent.*;

public class MainExamPageStudent {

	public static JFrame frame;
	private PanelTestReviewStudent panelTestReviewStudent;
	public static JLabel txtCurrentUserName;
	public static JPanel panelOption1, panelOption2, panelOption3, panelOption4;
	private JTextField txtSubject;
	public static int numberOfQuestions;
	private int[]randomQuestions;
	private Random random;
	private MySQL mySql = new MySQL();
	private JLabel txtOption1, txtOption2, txtOption3, txtOption4;
	private String optionSelected, currentQuestion, optionSelectedForColor;
	public static JButton btnClear;
	private String questionNum, questionCursor;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn10;
	private JButton btn11;
	private JButton btn12;
	private JButton btn13;
	private JButton btn14;
	private JButton btn15;
	private JButton btn16;
	private JButton btn17;
	private JButton btn18;
	private JButton btn19;
	private JButton btn20;
	private JButton btn21;
	private JButton btn22;
	private JButton btn23;
	private JButton btn24;
	private JButton btn25;
	private JButton btn26;
	private JButton btn27;
	private JButton btn28;
	private JButton btn30;
	private JButton btn31;
	private JButton btn32;
	private JButton btn33;
	private JButton btn34;
	private JButton btn35;
	private JButton btn36;
	private JButton btn37;
	private JButton btn38;
	private JButton btn39;
	private JButton btn40;
	private JButton btn41;
	private JButton btn42;
	private JButton btn43;
	private JButton btn44;
	private JButton btn45;
	private JButton btn46;
	private JButton btn47;
	private JButton btn48;
	private JButton btn29;
	private JButton btn49;
	private JButton btn50;
	private JTextPane txtQuestion;
	public static JPanel panelQuestions;
	public static JButton btnSubmit;
	public static JButton 	btnNotVisited;
	public static JButton btnNotAnswered;
	public static JButton btnBookmark;
	public static JButton btnAnswered;
	public static PanelTestSubmittedStudent panelTestSubmittedStudent;
	public static Component[] panelQuestionsComponents;
	public static JButton btnPrevious;
	public static JButton btnSaveNext;
	private static JButton btnBookmark_1;
	private String duration;
	private int seconds;
	private int minutes;
	private Timer timer;
	public static JLabel txtTimer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainExamPageStudent window = new MainExamPageStudent();
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
	public MainExamPageStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(202, 223, 255));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension dim = tool.getScreenSize();
		int width = dim.width;
		int height = dim.height;
		frame.setSize(width, height);
		frame.getContentPane().setLayout(null);
		System.out.println(width);

		MySQL mySql = new MySQL();
		ResultSet result = mySql.loadActiveTest(Integer.parseInt(PanelDisplayActiveExamStudent.txtTestCode.getText()));

		try {
			while(result.next()) {
				numberOfQuestions = Integer.parseInt(result.getString("number_of_questions"));
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		randomQuestions = new int[numberOfQuestions];
		for(int i=1;i<=numberOfQuestions;i++) {
			randomQuestions[i-1]=i;
		}

		int max = numberOfQuestions-1;
		int min = 1;
		int temp = 0;
		random = new Random();
		int randomIndex = 0;

		for(int i=0;i<randomQuestions.length-1;i++) {
			min = i+1;
			randomIndex = random.nextInt((max-min)+1)+min;
			temp = randomQuestions[i];
			randomQuestions[i] = randomQuestions[randomIndex];
			randomQuestions[randomIndex] = temp;
		}

		for(int x : randomQuestions) {
			System.out.print(x + " ");
		}

		panelOption1 = new JPanel();
		panelOption1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelOption1.setBorder(new LineBorder(Color.BLACK, 2));

			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelOption1.setBorder(new LineBorder(Color.BLACK, 1));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				optionClicked(panelOption1);
				optionSelected = "A";

			}
		});

		panelTestSubmittedStudent = new PanelTestSubmittedStudent();
		panelTestSubmittedStudent.setBounds(0, 0, 1536, 821);
		frame.getContentPane().add(panelTestSubmittedStudent);
		panelTestSubmittedStudent.setVisible(false);
		panelOption1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelOption1.setBackground(new Color(202, 223, 255));

		panelOption1.setBounds(66, 297, 962, 58);
		frame.getContentPane().add(panelOption1);
		panelOption1.setLayout(null);

		txtOption1 = new JLabel("New label");
		txtOption1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtOption1.setBounds(10, 10, 942, 38);
		panelOption1.add(txtOption1);

		JPanel panelTitle = new JPanel();
		panelTitle.setBackground(new Color(0, 128, 255));
		panelTitle.setBounds(0, 0, 1522, 80);
		frame.getContentPane().add(panelTitle);
		panelTitle.setLayout(null);

		JLabel lblExamUniversity = new JLabel("● N Infinity Info Solutions ●");
		lblExamUniversity.setHorizontalAlignment(SwingConstants.CENTER);
		lblExamUniversity.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblExamUniversity.setForeground(new Color(0, 0, 0));
		lblExamUniversity.setBounds(389, 10, 743, 31);
		panelTitle.add(lblExamUniversity);

		JLabel lblExamType = new JLabel("End Sem Exam 2022-23 If You want to take the exam then Go ahead");
		lblExamType.setHorizontalAlignment(SwingConstants.CENTER);
		lblExamType.setForeground(new Color(255, 255, 255));
		lblExamType.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblExamType.setBounds(288, 55, 945, 19);
		panelTitle.add(lblExamType);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(389, 45, 743, 2);
		panelTitle.add(separator_1);

		panelQuestions = new JPanel();
		panelQuestions.setBounds(1060, 120, 464, 711);
		frame.getContentPane().add(panelQuestions);

		panelTestReviewStudent = new PanelTestReviewStudent();
		panelTestReviewStudent.setLocation(7, 479);
		panelQuestions.add(panelTestReviewStudent);
		panelTestReviewStudent.setVisible(false);


		btn1 = new JButton("1");
		btn1.setBounds(7, 75, 50, 50);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("1");
				questionCursor = "1";

			}
		});
		btn1.setVisible(false);
		panelQuestions.setLayout(null);
		btn1.setForeground(new Color(0, 0, 0));
		btn1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btn1.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn1);

		btn2 = new JButton("2");
		btn2.setBounds(64, 75, 50, 50);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("2");
				questionCursor = "2";

			}
		});
		btn2.setVisible(false);
		btn2.setForeground(new Color(0, 0, 0));
		btn2.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn2.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn2);

		btn3 = new JButton("3");
		btn3.setBounds(121, 75, 50, 50);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("3");
				questionCursor = "3";

			}
		});
		btn3.setVisible(false);
		btn3.setForeground(new Color(0, 0, 0));
		btn3.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn3.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn3);

		btn4 = new JButton("4");
		btn4.setBounds(178, 75, 50, 50);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("4");
				questionCursor = "4";
			}
		});
		btn4.setVisible(false);
		btn4.setForeground(new Color(0, 0, 0));
		btn4.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn4.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn4);

		btn5 = new JButton("5");
		btn5.setBounds(235, 75, 50, 50);
		btn5.setVisible(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("5");
				questionCursor = "5";
			}
		});
		btn5.setForeground(new Color(0, 0, 0));
		btn5.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn5.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn5);

		btn6 = new JButton("6");
		btn6.setBounds(292, 75, 50, 50);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("6");
				questionCursor = "6";
			}
		});
		btn6.setVisible(false);
		btn6.setForeground(new Color(0, 0, 0));
		btn6.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn6.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn6);

		btn7 = new JButton("7");
		btn7.setBounds(349, 75, 50, 50);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("7");
				questionCursor = "7";
			}
		});
		btn7.setVisible(false);
		btn7.setForeground(new Color(0, 0, 0));
		btn7.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn7.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn7);

		btn8 = new JButton("8");
		btn8.setBounds(406, 75, 50, 50);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("8");
				questionCursor = "8";
			}
		});
		btn8.setVisible(false);
		btn8.setForeground(new Color(0, 0, 0));
		btn8.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn8.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn8);

		btn9 = new JButton("9");
		btn9.setBounds(7, 129, 50, 50);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("9");
				questionCursor = "9";
			}
		});
		btn9.setVisible(false);
		btn9.setForeground(new Color(0, 0, 0));
		btn9.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn9.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn9);

		btn10 = new JButton("10");
		btn10.setBounds(64, 129, 50, 50);
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("10");
				questionCursor = "10";
			}
		});
		btn10.setVisible(false);
		btn10.setForeground(new Color(0, 0, 0));
		btn10.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn10.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn10);

		btn11 = new JButton("11");
		btn11.setBounds(121, 129, 50, 50);
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("11");
				questionCursor = "11";
			}
		});
		btn11.setVisible(false);
		btn11.setForeground(new Color(0, 0, 0));
		btn11.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn11.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn11);

		btn12 = new JButton("12");
		btn12.setBounds(178, 129, 50, 50);
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("12");
				questionCursor = "12";
			}
		});
		btn12.setVisible(false);
		btn12.setForeground(new Color(0, 0, 0));
		btn12.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn12.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn12);

		btn13 = new JButton("13");
		btn13.setBounds(235, 129, 50, 50);
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("13");
				questionCursor = "13";
			}
		});
		btn13.setVisible(false);
		btn13.setForeground(new Color(0, 0, 0));
		btn13.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn13.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn13);

		btn14 = new JButton("14");
		btn14.setBounds(292, 129, 50, 50);
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("14");
				questionCursor = "14";
			}
		});
		btn14.setVisible(false);
		btn14.setForeground(new Color(0, 0, 0));
		btn14.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn14.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn14);

		btn15 = new JButton("15");
		btn15.setBounds(349, 129, 50, 50);
		btn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("15");
				questionCursor = "15";
			}
		});
		btn15.setVisible(false);
		btn15.setForeground(new Color(0, 0, 0));
		btn15.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn15.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn15);

		btn16 = new JButton("16");
		btn16.setBounds(406, 129, 50, 50);
		btn16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("16");
				questionCursor = "16";
			}
		});
		btn16.setVisible(false);
		btn16.setForeground(new Color(0, 0, 0));
		btn16.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn16.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn16);

		btn17 = new JButton("17");
		btn17.setBounds(7, 183, 50, 50);
		btn17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("17");
				questionCursor = "17";
			}
		});
		btn17.setVisible(false);
		btn17.setForeground(new Color(0, 0, 0));
		btn17.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn17.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn17);

		btn18 = new JButton("18");
		btn18.setBounds(64, 183, 50, 50);
		btn18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("18");
				questionCursor = "18";
			}
		});
		btn18.setVisible(false);
		btn18.setForeground(new Color(0, 0, 0));
		btn18.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn18.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn18);

		btn19 = new JButton("19");
		btn19.setBounds(121, 183, 50, 50);
		btn19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("19");
				questionCursor = "19";
			}
		});
		btn19.setVisible(false);
		btn19.setForeground(new Color(0, 0, 0));
		btn19.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn19.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn19);

		btn20 = new JButton("20");
		btn20.setBounds(178, 183, 50, 50);
		btn20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("20");
				questionCursor = "20";
			}
		});
		btn20.setVisible(false);
		btn20.setForeground(new Color(0, 0, 0));
		btn20.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn20.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn20);

		btn21 = new JButton("21");
		btn21.setBounds(235, 183, 50, 50);
		btn21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("21");
				questionCursor = "21";
			}
		});
		btn21.setVisible(false);
		btn21.setForeground(new Color(0, 0, 0));
		btn21.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn21.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn21);

		btn22 = new JButton("22");
		btn22.setBounds(292, 183, 50, 50);
		btn22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("22");
				questionCursor = "22";
			}
		});
		btn22.setVisible(false);
		btn22.setForeground(new Color(0, 0, 0));
		btn22.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn22.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn22);

		btn23 = new JButton("23");
		btn23.setBounds(349, 183, 50, 50);
		btn23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("23");
				questionCursor = "23";
			}
		});
		btn23.setVisible(false);
		btn23.setForeground(new Color(0, 0, 0));
		btn23.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn23.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn23);

		btn24 = new JButton("24");
		btn24.setBounds(406, 183, 50, 50);
		btn24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("24");
				questionCursor = "24";
			}
		});
		btn24.setVisible(false);
		btn24.setForeground(new Color(0, 0, 0));
		btn24.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn24.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn24);

		btn25 = new JButton("25");
		btn25.setBounds(7, 237, 50, 50);
		btn25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("25");
				questionCursor = "25";
			}
		});
		btn25.setVisible(false);
		btn25.setForeground(new Color(0, 0, 0));
		btn25.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn25.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn25);

		btn26 = new JButton("26");
		btn26.setBounds(64, 237, 50, 50);
		btn26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("26");
				questionCursor = "26";
			}
		});
		btn26.setVisible(false);
		btn26.setForeground(new Color(0, 0, 0));
		btn26.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn26.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn26);

		btn27 = new JButton("27");
		btn27.setBounds(121, 237, 50, 50);
		btn27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("27");
				questionCursor = "27";
			}
		});
		btn27.setVisible(false);
		btn27.setForeground(new Color(0, 0, 0));
		btn27.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn27.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn27);

		btn28 = new JButton("28");
		btn28.setBounds(178, 237, 50, 50);
		btn28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("28");
				questionCursor = "28";
			}
		});
		btn28.setVisible(false);
		btn28.setForeground(new Color(0, 0, 0));
		btn28.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn28.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn28);

		btn29 = new JButton("29");
		btn29.setBounds(235, 237, 50, 50);
		btn29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("29");
				questionCursor = "29";
			}
		});
		btn29.setVisible(false);
		btn29.setForeground(new Color(0, 0, 0));
		btn29.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn29.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn29);

		btn30 = new JButton("30");
		btn30.setBounds(292, 237, 50, 50);
		btn30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("30");
				questionCursor = "30";
			}
		});
		btn30.setVisible(false);
		btn30.setForeground(new Color(0, 0, 0));
		btn30.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn30.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn30);

		btn31 = new JButton("31");
		btn31.setBounds(349, 237, 50, 50);
		btn31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("31");
				questionCursor = "31";
			}
		});
		btn31.setVisible(false);
		btn31.setForeground(new Color(0, 0, 0));
		btn31.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn31.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn31);

		btn32 = new JButton("32");
		btn32.setBounds(406, 237, 50, 50);
		btn32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("32");
				questionCursor = "32";
			}
		});
		btn32.setVisible(false);
		btn32.setForeground(new Color(0, 0, 0));
		btn32.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn32.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn32);

		btn33 = new JButton("33");
		btn33.setBounds(7, 291, 50, 50);
		btn33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("33");
				questionCursor = "33";
			}
		});
		btn33.setVisible(false);
		btn33.setForeground(new Color(0, 0, 0));
		btn33.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn33.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn33);

		btn34 = new JButton("34");
		btn34.setBounds(64, 291, 50, 50);
		btn34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("34");
				questionCursor = "34";
			}
		});
		btn34.setVisible(false);
		btn34.setForeground(new Color(0, 0, 0));
		btn34.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn34.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn34);

		btn35 = new JButton("35");
		btn35.setBounds(121, 291, 50, 50);
		btn35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("35");
				questionCursor = "35";
			}
		});
		btn35.setVisible(false);
		btn35.setForeground(new Color(0, 0, 0));
		btn35.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn35.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn35);

		btn36 = new JButton("36");
		btn36.setBounds(178, 291, 50, 50);
		btn36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("36");
				questionCursor = "36";
			}
		});
		btn36.setVisible(false);
		btn36.setForeground(new Color(0, 0, 0));
		btn36.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn36.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn36);

		btn37 = new JButton("37");
		btn37.setBounds(235, 291, 50, 50);
		btn37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("37");
				questionCursor = "37";
			}
		});
		btn37.setVisible(false);
		btn37.setForeground(new Color(0, 0, 0));
		btn37.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn37.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn37);

		btn38 = new JButton("38");
		btn38.setBounds(292, 291, 50, 50);
		btn38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("38");
				questionCursor = "38";
			}
		});
		btn38.setVisible(false);
		btn38.setForeground(new Color(0, 0, 0));
		btn38.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn38.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn38);

		btn39 = new JButton("39");
		btn39.setBounds(349, 291, 50, 50);
		btn39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("39");
				questionCursor = "39";
			}
		});
		btn39.setVisible(false);
		btn39.setForeground(new Color(0, 0, 0));
		btn39.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn39.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn39);

		btn40 = new JButton("40");
		btn40.setBounds(406, 291, 50, 50);
		btn40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("40");
				questionCursor = "40";
			}
		});
		btn40.setVisible(false);
		btn40.setForeground(new Color(0, 0, 0));
		btn40.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn40.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn40);

		btn41 = new JButton("41");
		btn41.setBounds(7, 345, 50, 50);
		btn41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("41");
				questionCursor = "41";
			}
		});
		btn41.setVisible(false);
		btn41.setForeground(new Color(0, 0, 0));
		btn41.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn41.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn41);

		btn42 = new JButton("42");
		btn42.setBounds(64, 345, 50, 50);
		btn42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("42");
				questionCursor = "42";
			}
		});
		btn42.setVisible(false);
		btn42.setForeground(new Color(0, 0, 0));
		btn42.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn42.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn42);

		btn43 = new JButton("43");
		btn43.setBounds(121, 345, 50, 50);
		btn43.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("43");
				questionCursor = "43";
			}
		});
		btn43.setVisible(false);
		btn43.setForeground(new Color(0, 0, 0));
		btn43.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn43.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn43);

		btn44 = new JButton("44");
		btn44.setBounds(178, 345, 50, 50);
		btn44.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("44");
				questionCursor = "44";
			}
		});
		btn44.setVisible(false);
		btn44.setForeground(new Color(0, 0, 0));
		btn44.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn44.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn44);

		btn45 = new JButton("45");
		btn45.setBounds(235, 345, 50, 50);
		btn45.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("45");
				questionCursor = "45";
			}
		});
		btn45.setVisible(false);
		btn45.setForeground(new Color(0, 0, 0));
		btn45.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn45.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn45);

		btn46 = new JButton("46");
		btn46.setBounds(292, 345, 50, 50);
		btn46.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("46");
				questionCursor = "46";
			}
		});
		btn46.setVisible(false);
		btn46.setForeground(new Color(0, 0, 0));
		btn46.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn46.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn46);

		btn47 = new JButton("47");
		btn47.setBounds(349, 345, 50, 50);
		btn47.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("47");
				questionCursor = "47";
			}
		});
		btn47.setVisible(false);
		btn47.setForeground(new Color(0, 0, 0));
		btn47.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn47.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn47);

		btn48 = new JButton("48");
		btn48.setBounds(406, 345, 50, 50);
		btn48.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("48");
				questionCursor = "48";
			}
		});
		btn48.setVisible(false);
		btn48.setForeground(new Color(0, 0, 0));
		btn48.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn48.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn48);

		btn49 = new JButton("49");
		btn49.setBounds(7, 399, 50, 50);
		btn49.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("49");
				questionCursor = "49";
			}
		});
		btn49.setVisible(false);
		btn49.setForeground(new Color(0, 0, 0));
		btn49.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn49.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn49);

		btn50 = new JButton("50");
		btn50.setBounds(64, 399, 50, 50);
		btn50.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				questionManipulation("50");
				questionCursor = "50";
			}
		});
		btn50.setVisible(false);
		btn50.setForeground(new Color(0, 0, 0));
		btn50.setFont(new Font("Tahoma", Font.BOLD, 9));
		btn50.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btn50);

		if(numberOfQuestions>=1) {
			btn1.setVisible(true);
		}
		if(numberOfQuestions>=2) {
			btn2.setVisible(true);
		}
		if(numberOfQuestions>=3) {
			btn3.setVisible(true);
		}
		if(numberOfQuestions>=4) {
			btn4.setVisible(true);
		}
		if(numberOfQuestions>=5) {
			btn5.setVisible(true);
		}
		if(numberOfQuestions>=6) {
			btn6.setVisible(true);
		}
		if(numberOfQuestions>=7) {
			btn7.setVisible(true);
		}
		if(numberOfQuestions>=8) {
			btn8.setVisible(true);
		}
		if(numberOfQuestions>=9) {
			btn9.setVisible(true);
		}
		if(numberOfQuestions>=10) {
			btn10.setVisible(true);
		}
		if(numberOfQuestions>=11) {
			btn11.setVisible(true);
		}
		if(numberOfQuestions>=12) {
			btn12.setVisible(true);
		}
		if(numberOfQuestions>=13) {
			btn13.setVisible(true);
		}
		if(numberOfQuestions>=14) {
			btn14.setVisible(true);
		}
		if(numberOfQuestions>=15) {
			btn15.setVisible(true);
		}
		if(numberOfQuestions>=16) {
			btn16.setVisible(true);
		}
		if(numberOfQuestions>=17) {
			btn17.setVisible(true);
		}
		if(numberOfQuestions>=18) {
			btn18.setVisible(true);
		}
		if(numberOfQuestions>=19) {
			btn19.setVisible(true);
		}
		if(numberOfQuestions>=20) {
			btn20.setVisible(true);
		}
		if(numberOfQuestions>=21) {
			btn21.setVisible(true);
		}
		if(numberOfQuestions>=22) {
			btn22.setVisible(true);
		}
		if(numberOfQuestions>=23) {
			btn23.setVisible(true);
		}
		if(numberOfQuestions>=24) {
			btn24.setVisible(true);
		}
		if(numberOfQuestions>=25) {
			btn25.setVisible(true);
		}
		if(numberOfQuestions>=26) {
			btn26.setVisible(true);
		}
		if(numberOfQuestions>=27) {
			btn27.setVisible(true);
		}
		if(numberOfQuestions>=28) {
			btn28.setVisible(true);
		}
		if(numberOfQuestions>=29) {
			btn29.setVisible(true);
		}
		if(numberOfQuestions>=30) {
			btn30.setVisible(true);
		}
		if(numberOfQuestions>=31) {
			btn31.setVisible(true);
		}
		if(numberOfQuestions>=32) {
			btn32.setVisible(true);
		}
		if(numberOfQuestions>=33) {
			btn33.setVisible(true);
		}
		if(numberOfQuestions>=34) {
			btn34.setVisible(true);
		}
		if(numberOfQuestions>=35) {
			btn35.setVisible(true);
		}
		if(numberOfQuestions>=36) {
			btn36.setVisible(true);
		}
		if(numberOfQuestions>=37) {
			btn37.setVisible(true);
		}
		if(numberOfQuestions>=38) {
			btn38.setVisible(true);
		}
		if(numberOfQuestions>=39) {
			btn39.setVisible(true);
		}
		if(numberOfQuestions>=40) {
			btn40.setVisible(true);
		}
		if(numberOfQuestions>=41) {
			btn41.setVisible(true);
		}
		if(numberOfQuestions>=42) {
			btn42.setVisible(true);
		}
		if(numberOfQuestions>=43) {
			btn43.setVisible(true);
		}
		if(numberOfQuestions>=44) {
			btn44.setVisible(true);
		}
		if(numberOfQuestions>=45) {
			btn45.setVisible(true);
		}
		if(numberOfQuestions>=46) {
			btn46.setVisible(true);
		}
		if(numberOfQuestions>=47) {
			btn47.setVisible(true);
		}
		if(numberOfQuestions>=48) {
			btn48.setVisible(true);
		}
		if(numberOfQuestions>=49) {
			btn49.setVisible(true);
		}
		if(numberOfQuestions>=50) {
			btn50.setVisible(true);
		}

		JLabel lblNewLabel = new JLabel("Question Palette");
		lblNewLabel.setBounds(10, 10, 191, 32);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		panelQuestions.add(lblNewLabel);

		JLabel lblChooseAQuestion = new JLabel("Choose a Question");
		lblChooseAQuestion.setBounds(10, 46, 124, 19);
		lblChooseAQuestion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panelQuestions.add(lblChooseAQuestion);

		btnNotVisited = new JButton("");
		btnNotVisited.setBounds(16, 529, 44, 32);
		btnNotVisited.setBackground(new Color(240, 240, 240));
		panelQuestions.add(btnNotVisited);

		JLabel lblNewLabel_1 = new JLabel("Not Visited");
		lblNewLabel_1.setBounds(79, 527, 137, 32);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panelQuestions.add(lblNewLabel_1);

		btnNotAnswered = new JButton("");
		btnNotAnswered.setBounds(226, 529, 44, 32);
		btnNotAnswered.setBackground(new Color(255, 60, 60));
		panelQuestions.add(btnNotAnswered);

		JLabel lblNewLabel_1_2 = new JLabel("Not Answered");
		lblNewLabel_1_2.setBounds(295, 527, 137, 32);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panelQuestions.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_2_1 = new JLabel("Bookmark");
		lblNewLabel_1_2_1.setBounds(295, 585, 137, 32);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panelQuestions.add(lblNewLabel_1_2_1);

		btnBookmark = new JButton("");
		btnBookmark.setBounds(229, 587, 44, 32);
		btnBookmark.setBackground(new Color(0, 128, 255));
		panelQuestions.add(btnBookmark);

		JLabel lblNewLabel_1_1 = new JLabel("Answered");
		lblNewLabel_1_1.setBounds(76, 585, 137, 32);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panelQuestions.add(lblNewLabel_1_1);

		btnAnswered = new JButton("");
		btnAnswered.setBounds(16, 587, 44, 32);
		btnAnswered.setBackground(new Color(0, 172, 86));
		panelQuestions.add(btnAnswered);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 474, 422, 2);
		panelQuestions.add(separator);

		btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				btnNotAnswered.setVisible(false);
				btnAnswered.setVisible(false);
				btnNotVisited.setVisible(false);
				btnBookmark.setVisible(false);
				btnSubmit.setVisible(false);
				panelTestReviewStudent.setVisible(true);

				int numberOfQuestionsAttempted = mySql.getNumberOfQuestionAttempted();
				txtQuestionsAttempted.setText(numberOfQuestionsAttempted+"");
				txtQuestionsUnattempted.setText((numberOfQuestions-numberOfQuestionsAttempted)+"");
				txtTotalNumberOfQuestions.setText(numberOfQuestions+"");

			}

		});
		btnSubmit.setBounds(7, 655, 449, 46);
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSubmit.setBackground(new Color(255, 0, 0));
		panelQuestions.add(btnSubmit);
		btnSubmit.setVisible(false);

		JPanel panelSubtitle = new JPanel();
		panelSubtitle.setBackground(new Color(0, 0, 0));
		panelSubtitle.setBounds(0, 80, 1522, 40);
		frame.getContentPane().add(panelSubtitle);
		panelSubtitle.setLayout(null);

		JLabel lblSubject = new JLabel("Test Name : ");
		lblSubject.setForeground(Color.WHITE);
		lblSubject.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSubject.setBounds(10, 10, 105, 20);
		panelSubtitle.add(lblSubject);

		JLabel lblTime = new JLabel("Time Left :");
		lblTime.setForeground(Color.WHITE);
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTime.setBounds(1063, 0, 92, 40);
		panelSubtitle.add(lblTime);

		txtCurrentUserName = new JLabel();
		txtCurrentUserName.setText("Ashish Mandke");
		txtCurrentUserName.setIcon(new ImageIcon(MainExamPageStudent.class.getResource("/ExamImages/imgUserSmall.jpg")));
		txtCurrentUserName.setForeground(Color.WHITE);
		txtCurrentUserName.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtCurrentUserName.setBounds(1272, 0, 250, 40);
		panelSubtitle.add(txtCurrentUserName);

		txtSubject = new JTextField();
		txtSubject.setEditable(false);
		txtSubject.setBorder(null);
		txtSubject.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtSubject.setForeground(new Color(255, 255, 255));
		txtSubject.setBackground(new Color(0, 0, 0));
		txtSubject.setBounds(109, 11, 170, 20);
		panelSubtitle.add(txtSubject);
		txtSubject.setColumns(10);
		txtSubject.setText(PanelDisplayActiveExamStudent.txtTestName.getText() + " - " + PanelDisplayActiveExamStudent.txtTestCode.getText());
		
		txtTimer = new JLabel();
		txtTimer.setForeground(Color.WHITE);
		txtTimer.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtTimer.setBounds(1165, 0, 105, 40);
		panelSubtitle.add(txtTimer);

		panelOption2 = new JPanel();
		panelOption2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelOption2.setBorder(new LineBorder(Color.BLACK, 2));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelOption2.setBorder(new LineBorder(Color.BLACK, 1));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				optionClicked(panelOption2);
				optionSelected = "B";
			}
		});
		panelOption2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelOption2.setBackground(new Color(202, 223, 255));
		panelOption2.setBounds(66, 401, 962, 58);
		frame.getContentPane().add(panelOption2);
		panelOption2.setLayout(null);

		txtOption2 = new JLabel("New label");
		txtOption2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtOption2.setBounds(10, 10, 942, 38);
		panelOption2.add(txtOption2);

		panelOption3 = new JPanel();
		panelOption3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelOption3.setBorder(new LineBorder(Color.BLACK, 2));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelOption3.setBorder(new LineBorder(Color.BLACK, 1));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				optionClicked(panelOption3);
				optionSelected = "C";
			}
		});
		panelOption3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelOption3.setBackground(new Color(202, 223, 255));
		panelOption3.setBounds(66, 513, 962, 58);
		frame.getContentPane().add(panelOption3);
		panelOption3.setLayout(null);

		txtOption3 = new JLabel("New label");
		txtOption3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtOption3.setBounds(10, 10, 942, 38);
		panelOption3.add(txtOption3);

		panelOption4 = new JPanel();
		panelOption4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelOption4.setBorder(new LineBorder(Color.BLACK, 2));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelOption4.setBorder(new LineBorder(Color.BLACK, 1));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				optionClicked(panelOption4);
				optionSelected = "D";
			}
		});
		panelOption4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelOption4.setBackground(new Color(202, 223, 255));
		panelOption4.setBounds(66, 629, 962, 58);
		frame.getContentPane().add(panelOption4);
		panelOption4.setLayout(null);

		txtOption4 = new JLabel("New label");
		txtOption4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtOption4.setBounds(10, 10, 942, 38);
		panelOption4.add(txtOption4);

		btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(67, 738, 114, 31);
		frame.getContentPane().add(btnClear);
		btnClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panelOption1.setBackground(new Color(202, 223, 255));
				panelOption2.setBackground(new Color(202, 223, 255));
				panelOption3.setBackground(new Color(202, 223, 255));
				panelOption4.setBackground(new Color(202, 223, 255));
				JButton button = getButtonReference("btn"+questionCursor);
				button.setBackground(new Color(240, 240, 240));

				mySql.clearAnswer(currentQuestion);
			}

		});


		btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnName = "btn";

				if(Integer.parseInt(questionCursor)==0) {
					btnName += (Integer.parseInt(questionCursor));
				}
				else {
					btnName += (Integer.parseInt(questionCursor)-1);
				}



				System.out.println(questionCursor);
				System.out.println("Num of Q : " + numberOfQuestions + "-----------------");

				String prevQue = "btn" + (numberOfQuestions-1);


				JButton button = getButtonReference(btnName);
				System.out.println("---------------------------Before doClick of " + btnName);
				if(Integer.parseInt(questionCursor)==numberOfQuestions+1) {
					System.out.println("----------------------In If Block--------------------");
					getButtonReference(prevQue).doClick();

				}
				else {
					button.doClick();
				}
				System.out.println("---------------------------After doClick of " + btnName);

			}
		});
		btnPrevious.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPrevious.setBounds(725, 738, 114, 31);
		frame.getContentPane().add(btnPrevious);

		btnSaveNext = new JButton("Save & Next");
		btnSaveNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				saveAnswer();

				if(Integer.parseInt(questionCursor)<=numberOfQuestions) {
					String btnNameNext = "btn";
					String btnColor = "btn";
					if(Integer.parseInt(questionCursor)==50) {
						btnNameNext += (Integer.parseInt(questionCursor));
						btnColor += (Integer.parseInt(questionCursor));
					}
					else {
						btnNameNext += (Integer.parseInt(questionCursor)+1);
						btnColor += (Integer.parseInt(questionCursor));
					}

					JButton button = getButtonReference(btnNameNext);
					JButton buttonColor = getButtonReference(btnColor);

					buttonColor.setBackground(Color.RED);
					if(optionSelectedForColor!=null) {
						buttonColor.setBackground(new Color(0,172,86));
					}


					optionSelected = null;
					System.out.println("---------------------------Before doClick of " + btnNameNext);
					button.doClick();
					System.out.println("---------------------------After doClick of " + btnNameNext);
				}
			}
		});
		btnSaveNext.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSaveNext.setBounds(860, 738, 168, 31);
		frame.getContentPane().add(btnSaveNext);

		btnBookmark_1 = new JButton("Bookmark");
		btnBookmark_1.setForeground(new Color(255, 255, 255));
		btnBookmark_1.setBackground(new Color(0, 0, 198));
		btnBookmark_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBookmark_1.setBounds(538, 738, 155, 31);
		frame.getContentPane().add(btnBookmark_1);

		txtQuestion = new JTextPane();
		txtQuestion.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtQuestion.setText("1)  How many constructors are there in java ?");
		txtQuestion.setBackground(new Color(202, 223, 255));
		txtQuestion.setBounds(66, 184, 962, 94);
		frame.getContentPane().add(txtQuestion);
		
		ResultSet resultStudentDetails = mySql.getStudentDetails(LoginPage.txtUsername.getText());
		try {
			while(resultStudentDetails.next()) {
				txtCurrentUserName.setText(resultStudentDetails.getString("first_name") + " " + resultStudentDetails.getString("last_name"));
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		duration = "";
		for(int i=0;i<PanelDisplayActiveExamStudent.txtDuration.getText().length();i++) {
			if(Character.isDigit(PanelDisplayActiveExamStudent.txtDuration.getText().charAt(i))) {
				duration+=PanelDisplayActiveExamStudent.txtDuration.getText().charAt(i);
			}
		}
		seconds = 60;
		minutes = Integer.parseInt(duration)-1;
		
		timer = new Timer(1000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (seconds != 0) {
                    seconds--;
                } else {
                    if (minutes != 0) {
                        seconds = 59;
                        minutes--;
                    } else {
                        // Stop the timer when both minutes and seconds are zero
                        timer.stop();
                    }
                }
				String formattedMinutes = String.format("%02d", minutes);
                String formattedSeconds = String.format("%02d", seconds);
                if(Integer.parseInt(formattedMinutes)<10) {
                	txtTimer.setForeground(Color.RED);
                }
				txtTimer.setText(formattedMinutes + " : " + formattedSeconds);
				
			}
			
			
		});
		timer.start();
		System.out.println("Out of Timer");
		if(minutes==0 && seconds==0) {
			timer.setRepeats(false);
			timer.stop();
		}else {
			timer.setRepeats(true);
		}
	
		btn1.doClick();

		frame.setResizable(false);	
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowIconified(e);

				frame.setState(JFrame.NORMAL);
			}
		});
		//		frame.setDefaultCloseOperation(JFrame.Mi);
	}

	public void optionClicked(JPanel panel) {
		panelOption1.setBackground(new Color(202, 223, 255));
		panelOption2.setBackground(new Color(202, 223, 255));
		panelOption3.setBackground(new Color(202, 223, 255));
		panelOption4.setBackground(new Color(202, 223, 255));
		panelOption1.setBorder(new LineBorder(Color.BLACK, 1));
		panelOption2.setBorder(new LineBorder(Color.BLACK, 1));
		panelOption3.setBorder(new LineBorder(Color.BLACK, 1));
		panelOption4.setBorder(new LineBorder(Color.BLACK, 1));
		panel.setBorder(new LineBorder(Color.BLACK, 1));
		panel.setBackground(new Color(162, 199, 255));
		panel.revalidate();

	}

	public void saveAnswer() {
		ResultSet result = mySql.getSavedAnswers(currentQuestion);
		String questionNumber = null;
		try {
			while(result.next()) {
				questionNumber = result.getString("question_no");
				if(result.getString("answer")!=null ) {
					if(optionSelected!=null) {

					}else {
						optionSelected = result.getString("answer");
					}
				}
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(questionNumber!=null) {
			if(questionNumber.equalsIgnoreCase(questionNum)) {
				System.out.println(questionNum + "---------" + currentQuestion + "---------" + optionSelected);
				mySql.updateAnswers(Integer.parseInt(questionNum), currentQuestion, optionSelected);
			}
			else {
				mySql.saveAnswers(Integer.parseInt(questionNum), currentQuestion, optionSelected);
			}
		}
		else {
			System.out.println(questionNum + "---------" + currentQuestion + "---------" + optionSelected);
			mySql.saveAnswers(Integer.parseInt(questionNum), currentQuestion, optionSelected);
		}
		optionSelectedForColor = optionSelected;
		optionSelected = null;
	}

	public void clearOptions() {
		panelOption1.setBackground(new Color(202, 223, 255));
		panelOption2.setBackground(new Color(202, 223, 255));
		panelOption3.setBackground(new Color(202, 223, 255));
		panelOption4.setBackground(new Color(202, 223, 255));
	}

	public void questionManipulation(String n) {

		submitTestPanelVisibility();

		if(Integer.parseInt(n)<=numberOfQuestions) {

			submitButtonVisibility(btnSubmit, Integer.parseInt(n));
			MySQL database = new MySQL();
			System.out.println(n);
			questionNum = n;
			clearOptions();
			ResultSet resultSavedAnswers = database.checkSavedAnswer(Integer.parseInt(n));
			String option = null;

			try {
				if(resultSavedAnswers.next()) {

					option = resultSavedAnswers.getString("answer");

					if(option!=null) {
						if(option.equalsIgnoreCase("A")) {
							optionClicked(panelOption1);
						}
						else if(option.equalsIgnoreCase("B")) {
							optionClicked(panelOption2);
						}
						else if(option.equalsIgnoreCase("C")) {
							optionClicked(panelOption3);
						}
						else if(option.equalsIgnoreCase("D")) {
							optionClicked(panelOption4);
						}
					}

					ResultSet result = mySql.getJavaQuestion(randomQuestions[Integer.parseInt(n)-1]);
					try {
						while(result.next()) {
							txtQuestion.setText(n+") " + result.getString("Questions"));
							txtOption1.setText(result.getString("Option_A"));
							txtOption2.setText(result.getString("Option_B"));
							txtOption3.setText(result.getString("Option_C"));
							txtOption4.setText(result.getString("Option_D"));

							currentQuestion = result.getString("Questions");

						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
				else {

					ResultSet result = mySql.getJavaQuestion(randomQuestions[Integer.parseInt(n)-1]);
					try {
						while(result.next()) {
							txtQuestion.setText(n+") " + result.getString("Questions"));
							txtOption1.setText(result.getString("Option_A"));
							txtOption2.setText(result.getString("Option_B"));
							txtOption3.setText(result.getString("Option_C"));
							txtOption4.setText(result.getString("Option_D"));

							currentQuestion = result.getString("Questions");

						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			saveAnswer();
		}
	}
	

	public void changeButtonColorToRed(String n) {
		String btnName = "btn"+n;
		JButton button = getButtonReference(btnName);
		button.setBackground(Color.RED);
	}

	public void submitButtonVisibility(JButton button, int btnNumber) {
		if(btnNumber==numberOfQuestions) {
			button.setVisible(true);
		}
		else {
			button.setVisible(false);
		}
	}

	public void submitTestPanelVisibility() {

		panelTestReviewStudent.setVisible(false);
		btnNotAnswered.setVisible(true);
		btnAnswered.setVisible(true);
		btnNotVisited.setVisible(true);
		btnBookmark.setVisible(true);

	}

	public void checkQuestionVisited(JButton btn) {
		if(optionSelected.equals("A") || optionSelected.equals("B") || optionSelected.equals("C") || optionSelected.equals("D")) {
			btn.setBackground(new Color(0, 172, 86));
		}
		else {
			btn.setBackground(new Color(255, 60, 60));
		}
	}

	public static void setMainExamPageVisbility(boolean visible) {

		panelQuestionsComponents = panelQuestions.getComponents();
		for(Component compnent : panelQuestionsComponents) {
			compnent.setVisible(visible);
		}
		btnSaveNext.setVisible(visible);
		btnPrevious.setVisible(visible);
		btnBookmark_1.setVisible(visible);
		panelOption1.setVisible(visible);
		panelOption2.setVisible(visible);
		panelOption3.setVisible(visible);
		panelOption4.setVisible(visible);
		txtTimer.setVisible(visible);
		btnClear.setVisible(visible);
		


	}

	public JButton getButtonReference(String buttonName) {

		Map<String, JButton> buttonMap = new HashMap<>();
		buttonMap.put("btn1", btn1);
		buttonMap.put("btn2", btn2);
		buttonMap.put("btn3", btn3);
		buttonMap.put("btn4", btn4);
		buttonMap.put("btn5", btn5);
		buttonMap.put("btn6", btn6);
		buttonMap.put("btn7", btn7);
		buttonMap.put("btn8", btn8);
		buttonMap.put("btn9", btn9);
		buttonMap.put("btn10", btn10);
		buttonMap.put("btn11", btn11);
		buttonMap.put("btn12", btn12);
		buttonMap.put("btn13", btn13);
		buttonMap.put("btn14", btn14);
		buttonMap.put("btn15", btn15);
		buttonMap.put("btn16", btn16);
		buttonMap.put("btn17", btn17);
		buttonMap.put("btn18", btn18);
		buttonMap.put("btn19", btn19);
		buttonMap.put("btn20", btn20);
		buttonMap.put("btn21", btn21);
		buttonMap.put("btn22", btn22);
		buttonMap.put("btn23", btn23);
		buttonMap.put("btn24", btn24);
		buttonMap.put("btn25", btn25);
		buttonMap.put("btn26", btn26);
		buttonMap.put("btn27", btn27);
		buttonMap.put("btn28", btn28);
		buttonMap.put("btn29", btn29);
		buttonMap.put("btn30", btn30);
		buttonMap.put("btn31", btn31);
		buttonMap.put("btn32", btn32);
		buttonMap.put("btn33", btn33);
		buttonMap.put("btn34", btn34);
		buttonMap.put("btn35", btn35);
		buttonMap.put("btn36", btn36);
		buttonMap.put("btn37", btn37);
		buttonMap.put("btn38", btn38);
		buttonMap.put("btn39", btn39);
		buttonMap.put("btn40", btn40);
		buttonMap.put("btn41", btn41);
		buttonMap.put("btn42", btn42);
		buttonMap.put("btn43", btn43);
		buttonMap.put("btn44", btn44);
		buttonMap.put("btn45", btn45);
		buttonMap.put("btn46", btn46);
		buttonMap.put("btn47", btn47);
		buttonMap.put("btn48", btn48);
		buttonMap.put("btn49", btn49);
		buttonMap.put("btn50", btn50);

		JButton button = buttonMap.get(buttonName);

		return button;

	}
}
