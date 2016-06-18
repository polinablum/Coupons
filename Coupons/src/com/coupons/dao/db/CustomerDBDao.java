package com.coupons.dao.db;


import java.util.*;
import java.sql.*;

import com.coupons.beans.Coupon;
import com.coupons.beans.Customer;
import com.coupons.dao.CustomerDao;
import com.coupons.exceptions.DaoException;

public class CustomerDBDao implements CustomerDao
{
	@Override
	public void createCustomer(Customer c) throws DaoException {
		// get connection from pool
		Connection con = null;
		try {
			con = getConnection();
		
			String sql = 
					"INSERT INTO customer (ID,CUST_NAME,PASSWORD)VALUES(?,?,?) ";
			PreparedStatement stat = con.prepareStatement(sql);
			
			stat.setLong(1, c.getId());
			stat.setString(2, c.getName());
			stat.setString(1, c.getPassword());
			
			stat.executeUpdate();
		} catch (SQLException e) {
			// Translation exception
			throw new DaoException("Something", e);
		}
		finally{
			// release connection to pool
			try {con.close();} catch (SQLException e) {}
		}
		

	}

	@Override
	public Customer getCustomer(long id) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCustomer(Customer c) throws DaoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCustomer(Customer c) throws DaoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Customer> getAllCustomers() throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}
	
	// A function that creates connection
	// TODO: Use the pool instead later on
	private Connection getConnection() throws SQLException
	{
		try {
			//String driverName = loadFromFIle();
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//get connection to the schema
		String url = "jdbc:mysql://localhost:3306/coupons";
				
		Connection con = 
				DriverManager.getConnection(url, 
						"root", "1234");
		return con;
				
	}

	@Override
	public void removeCustomer(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Coupon> getCoupons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean login(String custName, String password) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
