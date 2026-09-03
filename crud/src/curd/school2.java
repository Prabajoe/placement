package curd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class school2 {

	public static void main(String[] args) {

		String url="jdbc:mysql://localhost:3306/dummy2";
		String username="root";
		String password="root";
//		String query="insert into student value('Vijay','52','108')";
//		String query="delete from student where id='103'";
		String query="update student set age=19 where id=104";
		
      try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url, username , password);
		Statement stmt=con.createStatement();
		int row=stmt.executeUpdate(query);
		
		if(row>0) {
			System.out.println("Row is affected");
			
		}else {
			System.out.println("Row is not founded");
		}
		
		
	  } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }
		

	}

}
