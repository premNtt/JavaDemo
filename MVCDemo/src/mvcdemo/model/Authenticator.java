package mvcdemo.model;

import java.sql.*;


public class Authenticator extends MysqlConn{
	public String authenticate(String username,String password)  {
		String status = "failure";
		try {
			Connection con = MysqlConn.getConnection();	
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from tb_user");			
			while(rs.next()){  
				//System.out.println(rs.getString(2)+"  ");  
				if ((rs.getString(2).equalsIgnoreCase(username)) && (rs.getString(3).equals(password))) {
					status = "success";
					continue;
				} 	
			}
			con.close(); 
		} catch (Exception e) {
			System.out.println(e);
		}	
		return status;
	}
}
