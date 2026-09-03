package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo {

public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/dummy2";
		String user="root";
		String password="root";
		String query="update student set age=20 where id=102";

       try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url, user, password);
		
		Statement stmt=con.createStatement();
		
//		PreparedStatement ps=con.prepareStatement();
		
		int row=stmt.executeUpdate(query);
		
//		if(row>0) {
//			System.out.println("row inserted");
//		}
//		
		
		
//	
//while(	rs.next()) {
//	
//	System.out.println("NAME :"+rs.getString("name")+" "+"AGE :"+rs.getInt("age")+" "+"ID :"+rs.getInt("id"));
//
//}		
	
	
	
	
	   } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	   }
	}


}
