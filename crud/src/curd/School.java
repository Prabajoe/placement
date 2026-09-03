package curd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class School {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/dummy2";
		String username="root";
		String password="root";
		String query="select * from student";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		Connection con=DriverManager.getConnection(url, username, password);
		      Statement stmt= con.createStatement();
		      ResultSet rs= stmt.executeQuery(query);
		      
		     while(rs.next()) {
		    	 System.out.println("name :"+rs.getString("name")+" "+"age :"+rs.getInt("age")+" "+"id :"+rs.getInt("id"));
		     };
		      
		      
		      
		      
		      System.out.println("Successfully connected");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
