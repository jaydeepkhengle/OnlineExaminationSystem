package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

import javax.swing.JOptionPane;

import myPackage.PanelDisplayActiveExamStudent;

public class MySQL {

	private Connection con=MySQL.getConnection();
	int status;


	//Loading Driver & Establishing Connection With The Database
	public static Connection getConnection() {

		Connection con = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Problem In Loading Driver");
			e.printStackTrace();
		}

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/examportal","root","1234");
			System.out.println("Connection Estabslished Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Problem Establishing In Connection");
			e.printStackTrace();
		}

		return con;

	}

	//Admin_Registration
	public void registerAdmin(String username, String password, String firstName, String lastName, String emailId, String mobile, String gender, String qualification, String address, String state, String city, String pincode) {


		try {

			PreparedStatement pstmt = con.prepareStatement("insert into admin_details values(?,?,?,?,?,?,?,?,?,?,?,?,?)");

			pstmt.setInt(1, rowCount("admin_details"));
			pstmt.setString(2, username);
			pstmt.setString(3, password);
			pstmt.setString(4, firstName);
			pstmt.setString(5, lastName);
			pstmt.setString(6, emailId);
			pstmt.setString(7, mobile);
			pstmt.setString(8, gender);
			pstmt.setString(9, qualification);
			pstmt.setString(10, address);
			pstmt.setString(11, state);
			pstmt.setString(12, city);
			pstmt.setString(13, pincode);

			status = pstmt.executeUpdate();

			if(status==1) {
				System.out.println("Admin Registered Successfully");
				JOptionPane.showMessageDialog(null, "Registered Successfully", "Admin Registration", JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				System.out.println("Problem In Admin Registration");
				JOptionPane.showMessageDialog(null, "Registeration Failed", "Admin Registration", JOptionPane.INFORMATION_MESSAGE);
			}
			pstmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	//Student Registration
	public void registerStudent(String username, String password, String firstName, String lastName, String emailId, String mobile, String gender, String qualification, String address, String state, String city, String pincode, String preferredLanguage) {



		try {

			PreparedStatement pstmt = con.prepareStatement("insert into student_details values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

			pstmt.setInt(1, rowCount("student_details"));
			pstmt.setString(2, username);
			pstmt.setString(3, password);
			pstmt.setString(4, firstName);
			pstmt.setString(5, lastName);
			pstmt.setString(6, emailId);
			pstmt.setString(7, mobile);
			pstmt.setString(8, gender);
			pstmt.setString(9, qualification);
			pstmt.setString(10, address);
			pstmt.setString(11, state);
			pstmt.setString(12, city);
			pstmt.setString(13, pincode);
			pstmt.setString(14, preferredLanguage);

			status = pstmt.executeUpdate();

			if(status==1) {
				System.out.println("Student Registered Successfully");
				JOptionPane.showMessageDialog(null, "Registered Successfully", "Student Registration", JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				System.out.println("Problem In Student Registration");
				JOptionPane.showMessageDialog(null, "Registeration Failed", "Student Registration", JOptionPane.INFORMATION_MESSAGE);
			}
			pstmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	//Counting Number Of Rows In AdminDetails
	public int rowCount(String tableName) {

		int rowCount = 0;
		PreparedStatement pstmt = null;
		ResultSet result = null;


		try {

			pstmt = con.prepareStatement("select COUNT(*) as rowCount from " + tableName);
			result = pstmt.executeQuery();

			while(result.next()) {
				rowCount = result.getInt("rowCount");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rowCount+1;	
	}

	//Create Exam - Add all exam details from AdminSide for creation of exam
	public int createExam(String testName, String subject, String numberOfQuestions, String duration, String questionSet, String marks, String instructions) {


		PreparedStatement pstmt = null;
		int status = 0;

		try {
			pstmt = con.prepareStatement("insert into active_exams values (?,?,?,?,?,?,?,?,?,DEFAULT)");
			pstmt.setInt(1, rowCount("active_exams"));
			pstmt.setString(2, testName);
			pstmt.setInt(3, generateExamCode());
			pstmt.setString(4, subject);
			pstmt.setString(5, numberOfQuestions);
			pstmt.setString(6, duration);
			pstmt.setString(7, questionSet);
			pstmt.setString(8, marks);
			pstmt.setString(9, instructions);

			status = pstmt.executeUpdate();

			String resultTableName = "";

			for(int i=0;i<testName.length();i++) {
				if(Character.isAlphabetic(testName.charAt(i))) {
					resultTableName += testName.charAt(i);
				}
			}

			createResultTable(resultTableName + "_Results".trim());

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		if(status==1) {
			System.out.println("Exam Created Successfully");
		}
		else {
			System.out.println("Failure In Exam Creation");
		}


		return status;

	}

	//
	public void createResultTable(String tableName) {


		boolean status = false;

		try {
			PreparedStatement pstmt = con.prepareStatement("create table " + tableName + " (S_NO int primary key, question_no int, question varchar(200), answer varchar(10), correctAnswer varchar(10))");
			status = pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if(status) {
			System.out.println("Table Created Successfully");
		}
		else {
			System.out.println("Problem in table creation");
		}
	}

	//Generate 4 Digit Test Code
	public int generateExamCode() {

		Random random = new Random();
		String testCode = "";

		for(int i=0;i<4;i++) {
			testCode += random.nextInt((9-0)+1)+0;
		}

		return Integer.parseInt(testCode);
	}

	//Displaying Tuple For Passed Table Name
	public ResultSet displayQuestions(String tableName) {

		ResultSet result = null;

		PreparedStatement pstmt = null;

		try {
			pstmt = con.prepareStatement("select * from " + tableName);
			result = pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	//Validate User's Login Credentials
	public ResultSet logIn(String username, String password, String userType) {

		ResultSet result = null;

		PreparedStatement pstmt = null;

		if(userType.equalsIgnoreCase("Admin")) {
			System.out.println("In LogIn Admin");
			try {
				pstmt = con.prepareStatement("select * from admin_details where username = ?");
				pstmt.setString(1, username);
				//pstmt.setString(2, password);
				result = pstmt.executeQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(userType.equalsIgnoreCase("Student")) {
			System.out.println("In LogIn student");
			try {
				pstmt = con.prepareStatement("select * from student_details where username = ?");
				pstmt.setString(1, username);
				//pstmt.setString(2, password);
				result = pstmt.executeQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return result;
	}

	//Generic Method For Retrieving Row Of Any Table
	public ResultSet getTable(String tableName) {

		ResultSet result = null;


		try {
			PreparedStatement pstmt = con.prepareStatement("select * from " + tableName);
			result = pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	//For Loading Student's Information
	public ResultSet getStudentDetails(String username) {

		ResultSet result = null;


		try {
			PreparedStatement pstmt = con.prepareStatement("select * from student_details where username = ?");
			pstmt.setString(1, username);
			result = pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	//Loads all the information of selected active test based on the test code
	public ResultSet loadActiveTest(int testCode) {

		ResultSet result = null;


		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement("select * from active_exams where test_code = ?");
			pstmt.setInt(1, testCode);

			result = pstmt.executeQuery();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	//For Loading the question on the main exam page when button on Question palette is pressed
	public ResultSet getJavaQuestion(int questionNumber) {

		ResultSet result = null;


		try {
			PreparedStatement pstmt = con.prepareStatement("select * from java_questions where S_No = ? ");
			pstmt.setInt(1, questionNumber);
			result = pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	//Checks if the question is already answered or not
	public ResultSet checkSavedAnswer(int s_No) {

		System.out.println(s_No);
		ResultSet result = null;


		String testNameTemp = PanelDisplayActiveExamStudent.testNameRetrieved;
		String testName = "";

		for(int i=0;i<testNameTemp.length();i++){
			if(Character.isAlphabetic(testNameTemp.charAt(i))) {
				testName += testNameTemp.charAt(i);
			}
		}
		testName += "_results";

		try {
			PreparedStatement pstmt = con.prepareStatement("select * from " + testName + " where question_no = ?");
			pstmt.setInt(1, s_No);
			result = pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	public String getCorrectAnswerForJava(String question) {


		ResultSet result = null;

		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement("select answer from java_questions where questions = ?");
			pstmt.setString(1, question);
			result = pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String correctAnswer = null;
		try {
			while(result.next()) {
				correctAnswer = result.getString("Answer");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return correctAnswer;
	}

	//Save the answers clicked into temporary table
	public void saveAnswers(int questionNumber, String question, String answer) {

		ResultSet result = null;

		int status = 0;

		String testNameTemp = PanelDisplayActiveExamStudent.testNameRetrieved;
		String testName = "";

		for(int i=0;i<testNameTemp.length();i++){
			if(Character.isAlphabetic(testNameTemp.charAt(i))) {
				testName += testNameTemp.charAt(i);
			}
		}
		testName += "_results";

		try {
			PreparedStatement pstmt = con.prepareStatement("insert into " + testName + " values(?,?,?,?,?)");
			pstmt.setInt(1, rowCount(testName));
			pstmt.setInt(2, questionNumber);
			pstmt.setString(3, question);
			pstmt.setString(4, answer);
			pstmt.setString(5, getCorrectAnswerForJava(question));
			status = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if(status==1) {
			System.out.println("Answer Saved");
		}
		else {
			System.out.println("Problem In Saving Answer");
		}

	}

	//Update Answers into temporary table
	public void updateAnswers(int questionNumber, String question, String answer) {

		ResultSet result = null;

		int status = 0;

		String testNameTemp = PanelDisplayActiveExamStudent.testNameRetrieved;
		String testName = "";

		for(int i=0;i<testNameTemp.length();i++){
			if(Character.isAlphabetic(testNameTemp.charAt(i))) {
				testName += testNameTemp.charAt(i);
			}
		}
		testName += "_results";

		try {
			PreparedStatement pstmt = con.prepareStatement("update " + testName + " set answer = ? where question_no = ?");
			pstmt.setString(1, answer);
			pstmt.setInt(2, questionNumber);
			status = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if(status==1) {
			System.out.println("Answer updated");
		}
		else {
			System.out.println("Problem In updating Answer");
		}

	}

	//Retrieves answers from temporary table
	public ResultSet getSavedAnswers(String question) {

		ResultSet result = null;


		String testNameTemp = PanelDisplayActiveExamStudent.testNameRetrieved;
		String testName = "";

		for(int i=0;i<testNameTemp.length();i++){
			if(Character.isAlphabetic(testNameTemp.charAt(i))) {
				testName += testNameTemp.charAt(i);
			}
		}
		testName += "_results";

		try {
			PreparedStatement pstmt = con.prepareStatement("select * from " + testName + " where question = ?");
			pstmt.setString(1, question);
			result = pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;

	}

	//Clear the option by updating the answer to the null
	public void clearAnswer(String question) {


		int status=0;

		String testNameTemp = PanelDisplayActiveExamStudent.testNameRetrieved;
		String testName = "";

		for(int i=0;i<testNameTemp.length();i++){
			if(Character.isAlphabetic(testNameTemp.charAt(i))) {
				testName += testNameTemp.charAt(i);
			}
		}
		testName += "_results";

		try {
			PreparedStatement pstmt = con.prepareStatement("update " + testName + " set answer = null where question = ?");
			pstmt.setString(1, question);
			status = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if(status==1) {
			System.out.println("Answer Cleared Successfully");
		}
		else {
			System.out.println("Failed To Clear Answer");
		}

	}
	public void deleteTheRows(String tableName) {
		
		int status = 0;
		
		try {
			PreparedStatement pstmt = con.prepareStatement("TRUNCATE table " + tableName + "");
			status = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//Check attempted questions
	public int getNumberOfQuestionAttempted() {


		ResultSet result = null;

		String testNameTemp = PanelDisplayActiveExamStudent.testNameRetrieved;
		String testName = "";

		for(int i=0;i<testNameTemp.length();i++){
			if(Character.isAlphabetic(testNameTemp.charAt(i))) {
				testName += testNameTemp.charAt(i);
			}
		}
		testName += "_results";

		try {
			PreparedStatement pstmt = con.prepareStatement("select answer from " + testName + "");
			result = pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int count = 0;
		try {
			while(result.next()) {

				if(result.getString("answer")!=null) {
					count++;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;

	}

}

