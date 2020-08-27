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

//class section, including registration, update, delete and select operations
public class section {

	//register new sections into table section
	public void register_new_section(String secno, String cno, String pno, String examDate, int capacity) {
		  
		
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
		  stmt.Query =  "INSERT into section Values("+secno+", "+cno+", "+pno+", "+examDate+", capacity +") ";
		  
          //sending SQL command to DALClass		  
          DALClass dal;//separated
		  dal.INSERT(stmt);
		 
	}
	
	//update section records in table section
	public void update_section(String secno, String cno, String pno, String examDate, int capacity) {
		
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
		  stmt.Query =  "Update section set cno="+cno+", pno="+pno+", examDate="+examDate+", capacity="+capacity+""; 

		  //sending SQL command to DALClass
		  DALClass dal;//separated
		  dal.UPDATE(stmt);
		 
	}
	
	//delete sections record from table section
	void delete_from_section(String secno) {
		
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
		  stmt.Query = "delete from section where secno="+secno+""; 

		 //sending SQL command to DALClass
		  DALClass dal;//separated
		  dal.DELETE(stmt);
		 
	}
	
	//select section information from table section
	public ResultSet select_from_section() {
		  
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
		  stmt.Query = "select * from section"; 

		  //sending SQL command to DALClass
		  DALClass dal;//separated
		  ResultSet rs;
		  rs=dal.SELECT(stmt);
		  return rs;
	}

}
