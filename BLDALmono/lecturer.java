package BLDALmono;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

//class lecturer, including registration, update, delete and select operations
public class lecturer {
	
	//register new lecturer into table lecturer
	public void register_new_lecturer(String pno, String pfname, String plname, String pbdate, String degree, String paddress,
			String ptleno) {
		
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
		  Statement stmt_insert_into_lect = null; 
		  stmt_insert_into_lect = connection.createStatement(); 
		  String query = "INSERT into lecturer Values("+pno+", "+pfname+", "+plname+", "+pbdate+", "+degree+", "+paddress+", "+ptelno+")"; 
		  
		  //executing SQL command
		  stmt_insert_into_lect.executeUpdate(query);
		  connection.close();
		  stmt_insert_into_lect.close();

	}
	
	//update lecturer records in table lecturer
	public void update_lecturer(String pno, String pfname, String plname, String pbdate, String degree, String paddress,
			String ptleno) {
		
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
		  Statement stmt_update_lect = null; 
		  stmt_update_lect = connection.createStatement(); 
		  String query = "Update lecturer set pfname="+pfname+", plname="+plname+", pbdate="+pbdate+", paddress="+paddress+", ptelno="+ptelno+" where pno="+pno+""; 
		  
		  //executing SQL command
		  stmt_update_lect.executeUpdate(query);
		  connection.close();
		  stmt_update_lect.close();

	}
	
	//delete lecturers record from table lecturer
	public void delete_lecturer(String pno) {
		
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
		  Statement stmt_delete_from_lect = null; 
		  stmt_delete_from_lect = connection.createStatement(); 
		  String query = "delete from lecturer where pno="+pno+"";
		  
		  //executing SQL command
		  stmt_delete_from_lect.executeUpdate(query);
		  connection.close();
		  stmt_delete_from_lect.close();

	}
	
	//select lecturer information from table lecturer
	public ResultSet select_from_lecturer() {
		
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
		  Statement stmt_select_lect = null; 
		  stmt_select_lect = connection.createStatement(); 
		  String query = " SELECT * FROM lecturer";
		  
		  //executing SQL command
		  ResultSet rs = stmt_select_lect.executeQuery(query);
		  connection.close();
		  stmt_select_lect.close();
		  return rs;

	}
}
