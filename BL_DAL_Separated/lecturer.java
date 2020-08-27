package BL_DAL_Separated;
import java.sql.ResultSet;

//for packing connection properties
class CONNECTION extends Serializable {
	   String  DriverName; 
	   String  URL;
	   String  UserName;
	   String  Password;
	   }

//for packing connection and command properties
class COMMAND extends Serializable {           
	 CONNECTION CON; 
	 String Query; 
	}


//class lecturer, including registration, update, delete and select operations
public class lecturer {

	//register new sutdents into table lecturer
	public void register_new_lecturer(String pno, String pfname, String plname, String pbdate, String degree, String paddress,
			String ptleno) {
		
		
		  //preparing connection
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

     	  //preparing SQL command
		  COMMAND stmt = new COMMAND();
		  stmt.CON = connection;
		  stmt.Query =  "INSERT into lecturer Values("+pno+", "+pfname+", "+plname+", "+pbdate+", "+degree+", "+paddress+", "+ptelno+")";
		  
		  //sending SQL command to DALClass
		  DALClass dal;//separated
		  dal.INSERT(stmt);
		 
	}
	
	//update lecturer records in table lecturer
	public void update_lecturer(String pno, String pfname, String plname, String pbdate, String degree, String paddress,
			String ptleno) {
		
		  //preparing connection
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

		  //preparing SQL command
		  COMMAND stmt = new COMMAND();
		  stmt.CON = connection;
		  stmt.Query ="Update lecturer set pfname="+pfname+", plname="+plname+", pbdate="+pbdate+", paddress="+paddress+", ptelno="+ptelno+" where pno="+pno+""; 

		  //sending SQL command to DALClass
		  DALClass dal;//separated
		  dal.UPDATE(stmt);
		 
	}
	
	//delete lecturers record from table lecturer
	void delete_from_lecturer(String pno) {
		
		  //preparing connection
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

		  //preparing SQL command
		  COMMAND stmt = new COMMAND();
		  stmt.CON = connection;
		  stmt.Query = "delete from lecturer where pno="+pno+""; 

		  //sending SQL command to DALClass
		  DALClass dal;//separated
		  dal.DELETE(stmt);
		 
	}
	
	//select lecturer information from table lecturer
	public ResultSet select_from_lecturer() {
		
		  //preparing connection
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

		  //preparing SQL command
		  COMMAND stmt = new COMMAND();
		  stmt.CON = connection;
		  stmt.Query = "select * from lecturer"; 

		  //sending SQL command to DALClass
 		  DALClass dal;//separated
		  ResultSet rs;
		  rs=dal.SELECT(stmt);
		  return rs;
	}

}
