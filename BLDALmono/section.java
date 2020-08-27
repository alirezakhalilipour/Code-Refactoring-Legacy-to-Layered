package BLDALmono;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

//class section, including registration, update, delete and select operations
public class section {
	
	//register new sections into table section
	public void register_new_section(String secno, String cno, String pno, String examDate, int capacity) {
	      
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
		  Statement stmt_insert_into_section = null; 
		  stmt_insert_into_section = connection.createStatement(); 
		  String query = "INSERT into section Values("+secno+", "+cno+", "+pno+", "+examDate+", capacity +") ";
		  		
          //executing SQL command
		  stmt_insert_into_section.executeUpdate(query);
		  connection.close();
		  stmt_insert_into_section.close();

	}

	//update section records in table section
	public void update_section(String secno, String cno, String pno, String examDate, int capacity) {
		
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
		  Statement stmt_update_section = null; 
		  stmt_update_section = connection.createStatement(); 
		  String query = "Update section set cno="+cno+", pno="+pno+", examDate="+examDate+", capacity="+capacity+"";
		  
		  //executing SQL command
		  stmt_update_section.executeUpdate(query);
		  connection.close();
		  stmt_update_section.close();

	}
	
	//delete sections record from table section
	public void delete_from_section(String secno) {
		
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
		  Statement stmt_delete_from_sec = null; 
		  stmt_delete_from_sec = connection.createStatement(); 
		  String query = "delete from course where secno="+secno+"";

		  //executing SQL command
		  stmt_delete_from_sec.executeUpdate(query);
		  connection.close();
		  stmt_delete_from_sec.close();

	}
	
	//select section information from table section
	public ResultSet select_from_section() {
		
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
		  Statement stmt_select_sec = null; 
		  stmt_select_sec = connection.createStatement(); 
		  String query = "SELECT * FROM section";
		  
		  //executing SQL command
		  ResultSet rs = stmt_select_sec.executeQuery(query);
		  connection.close();
		  stmt_select_sec.close();
		  return rs;

	}
}
