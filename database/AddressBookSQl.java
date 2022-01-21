package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AddressBookSQl {
	
		public static Connection getConnection()
		{
	
	          Connection con = null;
	          String jdbcurl = "jdbc:mysql://localhost:3306/employee_roll";
	          String username="root";
      		  String passWord="Tanaybr7614";  
      		  try {   	  
      			  con=DriverManager.getConnection(jdbcurl, username,passWord);
	              } catch (Exception e) {
        	        e.printStackTrace();
                  }
                  return con;  
	}
}
