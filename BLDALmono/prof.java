package BLDALmono;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class prof {
	public void insert(String pno, String pfname, String plname, String pbdate, String degree, String paddress,
			String ptleno) {
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
		  
		  Statement stmt_insert_into_prof = null; 
		  stmt_insert_into_prof = connection.createStatement(); 
		  String query = "INSERT into prof Values("+pno+", "+pfname+", "+plname+", "+pbdate+", "+degree+", "+paddress+", "+ptelno+")"; 
		  stmt_insert_into_prof.executeUpdate(query);
		  connection.close();
		  stmt_insert_into_prof.close();


	}

	public void update(String pno, String pfname, String plname, String pbdate, String degree, String paddress,
			String ptleno) {
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
		  
		  Statement stmt_update_prof = null; 
		  stmt_update_prof = connection.createStatement(); 
		  String query = "Update prof set pfname="+pfname+", plname="+plname+", pbdate="+pbdate+", paddress="+paddress+", ptelno="+ptelno+" where pno="+pno+""; 
		  stmt_update_prof.executeUpdate(query);
		  connection.close();
		  stmt_update_prof.close();


	}

	public void delete(String pno) {
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
		  
		  Statement stmt_delete_from_prof = null; 
		  stmt_delete_from_prof = connection.createStatement(); 
		  String query = "delete from course where pno="+pno+"";
		  stmt_delete_from_prof.executeUpdate(query);
		  connection.close();
		  stmt_delete_from_prof.close();

	}
	
	public ResultSet select() {
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
		  
		  Statement stmt_select_prof = null; 
		  stmt_select_prof = connection.createStatement(); 
		  String query = " SELECT * FROM prof";
		  ResultSet rs = stmt_select_prof.executeQuery(query);
		  connection.close();
		  stmt_select_prof.close();
		  return rs;

	}
}
