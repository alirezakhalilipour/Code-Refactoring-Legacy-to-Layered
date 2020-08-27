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

//class course, including registration, update, delete and select operations
public class course {

	//register new courses into table course
	public void register_new_course(String cno, String cname, int unit, int type, int colgno) {
		//preparing connection
		  CONNECTION connection = new CONNECTION();
		  String driverName ="**********";//for Oracle
		  //Class.forName(driverName);

		  String serverName = "**********"; 
		  String portNumber = "**********"; 
		  String dbName = "**********";
		  String username = "**********"; 
		  String password = "**********";  
		  String url = "**********";  

		  connection.DriverName= driverName;
		  connection.URL= url;
		  connection.UserName= username;
		  connection.Password= password;

		  //preparing SQL command
		  COMMAND stmt = new COMMAND();
		  stmt.CON = connection;
		  stmt.Query = "INSERT into course Values("+cno+", "+cname+", "+ unit + " , "+ type + ", " + colgno +" )";
		  
		  //sending SQL command to DALClass
		  DALClass dal;//separated
		  dal.INSERT(stmt);
		 

	}
	
	//update course records in table course
	public void update_course(String cno, String cname, int unit, int type, int colgno) {
		  
		  //preparing connection
		  CONNECTION connection = new CONNECTION();
		  String driverName ="**********";//for Oracle
		  //Class.forName(driverName);

		  String serverName = "**********"; 
		  String portNumber = "**********"; 
		  String dbName = "**********";
		  String username = "**********"; 
		  String password = "**********";  
		  String url = "**********";  

		  
		  connection.DriverName= driverName;
		  connection.URL= url;
		  connection.UserName= username;
		  connection.Password= password;

		  //preparing SQL command
		  COMMAND stmt = new COMMAND();
		  stmt.CON = connection;
		  stmt.Query = "Update course set cname="+cname+", unit="+unit+", type="+type+", colgno="+colgno+""; 

		 //sending SQL command to DALClass
 		  DALClass dal;//separated
		  dal.UPDATE(stmt);
		 

	}
	
	//delete courses record from table course
	void delete_from_course(String cno) {
		
	      //preparing connection
		  CONNECTION connection = new CONNECTION();
		  String driverName ="**********";//for Oracle
		  //Class.forName(driverName);

		  String serverName = "**********"; 
		  String portNumber = "**********"; 
		  String dbName = "**********";
		  String username = "**********"; 
		  String password = "**********";  
		  String url = "**********";  
		  
		  connection.DriverName= driverName;
		  connection.URL= url;
		  connection.UserName= username;
		  connection.Password= password;

      	  //preparing SQL command
		  COMMAND stmt = new COMMAND();
		  stmt.CON = connection;
		  stmt.Query = "delete from course where cno="+cno+""; 

		  //sending SQL command to DALClass
		  DALClass dal;//separated
		  dal.DELETE(stmt);
		 
	}
	
	//select course information from table course
	public ResultSet select_from_course() {
		
		  //preparing connection
		  CONNECTION connection = new CONNECTION();
		  String driverName ="**********";//for Oracle
		  //Class.forName(driverName);

		  String serverName = "**********"; 
		  String portNumber = "**********"; 
		  String dbName = "**********";
		  String username = "**********"; 
		  String password = "**********";  
		  String url = "**********";  
		  
		  connection.DriverName= driverName;
		  connection.URL= url;
		  connection.UserName= username;
		  connection.Password= password;

		  //preparing SQL command
		  COMMAND stmt = new COMMAND();
		  stmt.CON = connection;
		  stmt.Query = "select * from course"; 

		  
		  //sending SQL command to DALClass
		  DALClass dal;//separated
		  ResultSet rs;
		  rs=dal.SELECT(stmt);
		  return rs;
	}

}
