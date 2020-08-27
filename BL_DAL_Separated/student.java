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

//class student, including enrollment, update, delete and select operations
public class student {

	//enrollment new sutdents into table student
	public void enrollment_new_student(String sno, String sfname, String slname, String sbdate, String saddress, String stleno) {
		  
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
		  stmt.Query = "INSERT into student Values("+sno+", "+sfname+", "+slname+", "+sbdate+", "+saddress+", "+stelno+")";
		  
		  //sending SQL command to DALClass
		  DALClass dal;//separated
		  dal.INSERT(stmt);
		 
	}
	
	//update student records in table student
	public void update_student(String sno, String sfname, String slname, String sbdate, String saddress, String stleno) {
		  
		
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
		  stmt.Query = "Update student set sfname="+sfname+", slname="+slname+", sbdate="+sbdate+", saddress="+saddress+", stelno="+stelno+" where sno="+sno+""; 

		  //sending SQL command to DALClass
		  DALClass dal;//separated
		  dal.UPDATE(stmt);
		 
	}
	
	//delete students record from table student
	void delete_from_student(String sno) {
		
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
		  stmt.Query = "delete from student where sno="+sno+""; 

		  //sending SQL command to DALClass
		  DALClass dal;//separated
		  dal.DELETE(stmt);
		 
	}
	
	//select student information from table student
	public ResultSet select_from_student() {
		
		
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
		  stmt.Query = "select * from student"; 

		  //sending SQL command to DALClass
		  DALClass dal;//separated
		  ResultSet rs;
		  rs=dal.SELECT(stmt);
		  return rs;
	}

}
