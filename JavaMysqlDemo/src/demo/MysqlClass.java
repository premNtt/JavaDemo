package demo;

import java.sql.*;

//http://www.javatpoint.com/example-to-connect-to-the-mysql-database
public class MysqlClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Mysql connection");
		try{
			Class.forName("com.mysql.jdbc.Driver");
			//here sonoo is database name, root is username and password  
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from tb");			
			while(rs.next()){  
				System.out.println(rs.getString(1)+"  ");  
			}
			con.close();  			
		}catch(Exception e){
			System.out.print(e);			
		}
	}

}
