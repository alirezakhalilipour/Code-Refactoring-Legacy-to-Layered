package BL_DAL_Separated;

import java.sql.ResultSet;
import java.sql.Statement;

//for unpacking connection properties
class CONNECTION extends Serializable {
	   String  DriverName; 
	   String  URL;
	   String  UserName;
	   String  Password;
	     }

//for unpacking connection and command properties
class COMMAND extends Serializable {           
	 CONNECTION CON; 
	 String Query; 
	}

//extracted DAL layer
public class DALClass {
	public CachedRowSet SELECT(COMMAND CMD)
	 {

	//Resolving CMD and connection	
	Connection connection = DriverManager.getConnection(CMD.CON.DriverName, CMD.CON.url,CMD.CON.UserName, CMD.CON.Password);//open connection
	
	//Execute SELECT command
	Statement stmt_select = null; 
	stmt_select = connection.createStatement(); 
	String query = CMD.Query;
	CachedRowSet rs = stmt_select.executeQuery(query);
	connection.close();
	stmt_select.close();
    return rs;
	
	 }
	
	public void INSERT(COMMAND CMD)
	 {
		//Resolving CMD and connection
		Connection connection = DriverManager.getConnection(CMD.CON.DriverName, CMD.CON.url,CMD.CON.UserName, CMD.CON.Password);//open connection
		
		//Execute SELECT command
		Statement stmt_insert = null; 
		stmt_insert = connection.createStatement(); 
		String query = CMD.Query;
		stmt_insert.executeUpdate(query);
		connection.close();
		stmt_insert.close();
	 }
	
	public void UPDATE(COMMAND CMD)
	 {
		//Resolving CMD and connection
		Connection connection = DriverManager.getConnection(CMD.CON.DriverName, CMD.CON.url,CMD.CON.UserName, CMD.CON.Password);//open connection
				
		//Execute UPDATE command
		Statement stmt_update = null; 
		stmt_update = connection.createStatement(); 
		String query = CMD.Query;
		stmt_update.executeUpdate(query);
		connection.close();
		stmt_update.close();
	 }
	
	public void DELETE(COMMAND CMD)
	 {
		//Resolving CMD and connection
		Connection connection = DriverManager.getConnection(CMD.CON.DriverName, CMD.CON.url,CMD.CON.UserName, CMD.CON.Password);//open connection
					
		//Execute DELETE command
		Statement stmt_delet = null; 
		stmt_delet = connection.createStatement(); 
		String query = CMD.Query;
		stmt_delet.executeUpdate(query);
		connection.close();
		stmt_delet.close();
	 }
	

	}

