package com.javatpoint.dao;

import com.javatpoint.bean.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class BookDao{
	
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

	public static int saveBook(Book b){
		int status = 0;
		try{
			Connection con = getConnection();
			PreparedStatement ps = con
					.prepareStatement("insert into book(bookname,author,released,country) values(?,?,?,?)");
			ps.setString(1, b.getBookname());
			ps.setString(2, b.getAuthor());
			ps.setString(3, b.getReleased());	
			ps.setString(4, b.getCountry());
			status = ps.executeUpdate();		
		}catch(Exception e){
			System.out.println(e);
		}
		return status;
	}
}
