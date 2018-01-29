package generic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection 

{
	public String firstname = "";
	
	public void dbValidation (String input1) throws ClassNotFoundException, SQLException
	{		
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String username = "system";
		String password = "system";
		
		String query = "select ENAME from employee where ENAME = "+"'"+input1+"'";
		// System.out.println(query);
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, username, password);		
		// System.out.println("Connected");		
		ResultSet result = con.createStatement().executeQuery(query);
		
		while (result.next())
		{
			firstname = result.getString(1);
		}	
		
		System.out.println("Test");
		 
		
	}
	
	
	
	

}
