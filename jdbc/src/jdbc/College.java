package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class College {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/dummy2";
		String user="root";
		String password="root";
		String query="select * from student";

       try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url, user, password);
		
		Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery(query);
	
while(	rs.next()) {
	
	System.out.println("NAME :"+rs.getString("name")+" "+"AGE :"+rs.getInt("age")+" "+"ID :"+rs.getInt("id"));

}		
	
	
	
	
	   } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	   }
	}

}
