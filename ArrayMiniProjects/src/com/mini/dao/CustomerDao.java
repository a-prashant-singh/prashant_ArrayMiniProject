package com.mini.dao;

import com.mini.pojo.Customer;

public interface CustomerDao {


	public boolean addCustomer(Customer c);
	public boolean updateCustomer(Customer c);
	public boolean deleteCustomer(int cid);
	
	public Customer showCustomerById(int cid);
	public Customer[] showCustomerByFirstName(String firstName);
	public Customer showCustomerByEmail(String email);
	public Customer[] showAllCustomer();
	
	
	
	
	
}
