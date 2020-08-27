package BLDALmono;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

//class course, including registration, update, delete and select operations
public class course {
	
	//register new courses into table course
	public void register_new_course(String cno, String cname, int unit, int type, int colgno) {
		  
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
		  Statement stmt_insert_into_course = null; 
		  stmt_insert_into_course = connection.createStatement(); 
		  String query = "INSERT into course Values("+cno+", "+cname+", "+ unit + " , "+ type + ", " + colgno +" )"; 

		  //executing SQL command
		  stmt_insert_into_course.executeUpdate(query);
		  connection.close();
		  stmt_insert_into_course.close();

	}

	//update course records in table course
	public void update_course(String cno, String cname, int unit, int type, int colgno) {
		
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
		  Statement stmt_update_course = null; 
		  stmt_update_course = connection.createStatement(); 
		  String query = "Update course set cname="+cname+", unit="+unit+", type="+type+", colgno="+colgno+""; 
		  
		  
		  //executing SQL command
          stmt_update_course.executeUpdate(query);
		  connection.close();
		  stmt_update_course.close();

	}

	//delete course record from table course
	public void delete_from_course(String cno) {
		
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
		  Statement stmt_delete_from_course = null; 
		  stmt_delete_from_course = connection.createStatement(); 
		  String query = "delete from course where cno="+cno+"";
		  
		  //executing SQL command
		  stmt_delete_from_course.executeUpdate(query);
		  connection.close();
		  stmt_delete_from_course.close();

	}
	
	//select course information from table course
	public ResultSet select_from_course() {
		
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
		  Statement stmt_select_course = null; 
		  stmt_select_course = connection.createStatement(); 
		  String query1 = " SELECT * FROM course"; 
		  
		  //executing SQL command
		  ResultSet rs = stmt_select_course.executeQuery(query);
		  connection.close();
		  stmt_select_course.close();
		  return rs;

	}

}
