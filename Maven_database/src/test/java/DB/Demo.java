package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) throws SQLException {
		
		//connect to mssql db
	     Connection connection = DriverManager.getConnection("jdbc:sql://DESKTOP-MP5P5GA//SQLEXPRESS/demo","username","password");
		
		//get the data from employees table of demo db
	   Statement statement = connection.createStatement();
	   ResultSet resultset = statement.executeQuery("Select * from employees where id=3;");
		
	   while(resultset.next()) 
	   {
		    System.out.println(resultset.getInt("id"));
			System.out.println(resultset.getString("name"));
			System.out.println(resultset.getString("location"));
			System.out.println(resultset.getInt("experience"));
	   }
	   
	   
	   connection.close();
	   
	  }

	
}
  