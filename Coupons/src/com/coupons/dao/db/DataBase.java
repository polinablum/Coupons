package com.coupons.dao.db;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class DataBase {
		//TODO: Change function access modifier to package  
		public static Connection connectDataBase() throws ClassNotFoundException, SQLException {
			String dbDriver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/coupons";
			Class.forName(dbDriver);
			Connection con = DriverManager.getConnection(url,"root", "1234");
			return con;
		}
}
