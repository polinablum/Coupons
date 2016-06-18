package com.coupons.dao;


	import java.util.*;

	import com.coupons.beans.*;

	public interface CompanyDao {
		public long createCompany(Company company);
		
		public void removeCompany(long id);
		public void removeCompany(String compName);
		public void removeCompany(Company company);
		
		public void updateCompany(Company company);
		
		public Company getCompany(long id);
		
		public Set<Company> getAllCompanies();
		
		public Set<Coupon> getCoupons();
		
		public boolean login(String compName, String password);
		
	}

