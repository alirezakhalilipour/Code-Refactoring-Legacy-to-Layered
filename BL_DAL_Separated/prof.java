package BL_DAL_Separated;
import java.sql.ResultSet;

class CONNECTION extends Serializable {
	   String  DriverName; 
	   String  URL;
	   String  UserName;
	   String  Password;
	   }
class COMMAND extends Serializable {           
	 CONNECTION CON; 
	 String Query; 
	}

public class prof {

	public void insert(String pno, String pfname, String plname, String pbdate, String degree, String paddress,
			String ptleno) {
		  CONNECTION connection = new CONNECTION();
		  String driverName ="**********";//for Oracle
		  //Class.forName(driverName);

		  String serverName = "**********"; 
		  String portNumber = "**********"; 
		  String dbName = "***********";
		  String username = "***********"; 
		  String password = "*************";  
		  String url = "*************";  

		  connection.DriverName= driverName;
		  connection.URL= url;
		  connection.UserName= username;
		  connection.Password= password;

		  COMMAND stmt = new COMMAND();
		  stmt.CON = connection;
		  stmt.Query =  "INSERT into prof Values("+pno+", "+pfname+", "+plname+", "+pbdate+", "+degree+", "+paddress+", "+ptelno+")";
		  
		  DALClass dal;//separated
		  dal.INSERT(stmt);
		 

	}
	public void update(String pno, String pfname, String plname, String pbdate, String degree, String paddress,
			String ptleno) {
		  CONNECTION connection = new CONNECTION();
		  String driverName ="**********";//for Oracle
		  //Class.forName(driverName);

		  String serverName = "**********"; 
		  String portNumber = "**********"; 
		  String dbName = "***********";
		  String username = "***********"; 
		  String password = "*************";  
		  String url = "*************";  

		  
		  connection.DriverName= driverName;
		  connection.URL= url;
		  connection.UserName= username;
		  connection.Password= password;

		  COMMAND stmt = new COMMAND();
		  stmt.CON = connection;
		  stmt.Query ="Update prof set pfname="+pfname+", plname="+plname+", pbdate="+pbdate+", paddress="+paddress+", ptelno="+ptelno+" where pno="+pno+""; 

		  
		  DALClass dal;//separated
		  dal.UPDATE(stmt);
		 

	}
	void delete(String pno) {
		  CONNECTION connection = new CONNECTION();
		  String driverName ="**********";//for Oracle
		  //Class.forName(driverName);

		  String serverName = "**********"; 
		  String portNumber = "**********"; 
		  String dbName = "***********";
		  String username = "***********"; 
		  String password = "*************";  
		  String url = "*************";  
		  
		  connection.DriverName= driverName;
		  connection.URL= url;
		  connection.UserName= username;
		  connection.Password= password;

		  COMMAND stmt = new COMMAND();
		  stmt.CON = connection;
		  stmt.Query = "delete from prof where pno="+pno+""; 

		  
		  DALClass dal;//separated
		  dal.DELETE(stmt);
		 
	}
	public ResultSet select() {
		CONNECTION connection = new CONNECTION();
		  String driverName ="**********";//for Oracle
		  //Class.forName(driverName);

		  String serverName = "**********"; 
		  String portNumber = "**********"; 
		  String dbName = "***********";
		  String username = "***********"; 
		  String password = "*************";  
		  String url = "*************";  
		  
		  connection.DriverName= driverName;
		  connection.URL= url;
		  connection.UserName= username;
		  connection.Password= password;

		  COMMAND stmt = new COMMAND();
		  stmt.CON = connection;
		  stmt.Query = "select * from prof"; 

		  
		  DALClass dal;//separated
		  ResultSet rs;
		  rs=dal.SELECT(stmt);
		  return rs;
	}

}
