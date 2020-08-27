package BLDALmono;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

//class student, including enrollment, update, delete and select operations
public class student {
	
	//enrollment new sutdents into table student
	public void enrollment_new_student(String sno, String sfname, String slname, String sbdate, String saddress, String stleno) {
		
		  //preparing connection
		  String driverName = "oracle.jdbc.driver.OracleDriver"; // for Oracle
		  Class.forName(driverName);
		  String serverName = "**********"; 
		  String portNumber = "**********"; 
		  String dbName = ""; 
		  String username = "**********"; 
		  String password = "**********";  
		 
		  String url = "jdbc:oracle:thin:@" + serverName + ":" +   
		  portNumber + ":" + dbName; // for Oracle

		  Connection connection = DriverManager.getConnection(url, username, password);
		  
		  //preparing SQL command
		  Statement stmt_insert_into_stud = null; 
		  stmt_insert_into_stud = connection.createStatement(); 
		  String query = "INSERT into student Values("+sno+", "+sfname+", "+slname+", "+sbdate+", "+saddress+", "+stelno+")";
		  
		  //executing SQL command
		  stmt_insert_into_stud.executeUpdate(query);
		  connection.close();
		  stmt_insert_into_stud.close();

	}

	//update student records in table student
	public void update_student(String sno, String sfname, String slname, String sbdate, String saddress, String stleno) {
		
		 //preparing connection
		  String driverName = "oracle.jdbc.driver.OracleDriver"; // for Oracle
		  Class.forName(driverName);
		  String serverName = "**********"; 
		  String portNumber = "**********"; 
		  String dbName = ""; 
		  String username = "**********"; 
		  String password = "**********";  
		 
		  String url = "jdbc:oracle:thin:@" + serverName + ":" +   
		  portNumber + ":" + dbName; // for Oracle

		  Connection connection = DriverManager.getConnection(url, username, password);
		  
		  //preparing SQL command
		  Statement stmt_update_student = null; 
		  stmt_update_student = connection.createStatement(); 
		  String query = "Update student set sfname="+sfname+", slname="+slname+", sbdate="+sbdate+", saddress="+saddress+", stelno="+stelno+" where sno="+sno+"";
		  
		  //executing SQL command
		  stmt_update_student.executeUpdate(query);
		  connection.close();
		  stmt_update_student.close();

	}

	//delete students record from table student
	public void delete_from_student(String sno) {
		
		  //preparing connection
		  String driverName = "oracle.jdbc.driver.OracleDriver"; // for Oracle
		  Class.forName(driverName);
		  String serverName = "**********"; 
		  String portNumber = "**********"; 
		  String dbName = ""; 
		  String username = "**********"; 
		  String password = "**********";  
		 
		  String url = "jdbc:oracle:thin:@" + serverName + ":" +   
		  portNumber + ":" + dbName; // for Oracle

		  Connection connection = DriverManager.getConnection(url, username, password);
		  
		  //preparing SQL command
		  Statement stmt_delete_from_stud = null; 
		  stmt_delete_from_stud = connection.createStatement(); 
		  String query = "delete from student where sno="+sno+"";
		  
		  //executing SQL command
		  stmt_delete_from_stud.executeUpdate(query);
		  connection.close();
		  stmt_delete_from_stud.close();

	}
	
	//select student information from table student
	public ResultSet select_from_student() {
		
		  //preparing connection
		  String driverName = "oracle.jdbc.driver.OracleDriver"; // for Oracle
		  Class.forName(driverName);
		  String serverName = "**********"; 
		  String portNumber = "**********"; 
		  String dbName = ""; 
		  String username = "**********"; 
		  String password = "**********";  
		 
		  String url = "jdbc:oracle:thin:@" + serverName + ":" +   
		  portNumber + ":" + dbName; // for Oracle

		  Connection connection = DriverManager.getConnection(url, username, password);

		  //preparing SQL command
		  Statement stmt_select_std = null; 
		  stmt_select_std = connection.createStatement(); 
		  String query = " SELECT * FROM student";
		  
		  //executing SQL command
		  ResultSet rs = stmt_select_std.executeQuery(query);
		  connection.close();
		  stmt_select_std.close();
		  return rs;

	}
}
