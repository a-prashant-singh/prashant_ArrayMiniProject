package com.mini.dao;

import com.mini.pojo.Customer;

public class CustomerDaoImpl implements CustomerDao{

	
	Customer [] clist=new Customer[100];
	Customer [] clist2=new Customer[100];

	int index=0;
	Customer c1;
	int id=101;
	
	@Override
	public boolean addCustomer(Customer c) 
	{
	if(c!=null)
		{
		c.setCid(id);
		clist[index]=c;
		index++;	
		id=id+3;
		return true;
		}
	else
		return false;
	}

	@Override
	public boolean updateCustomer(Customer c) {

		if(c!=null)
		{
			for(int i=0;i<clist.length;i++) {
				c1=clist[i];
				if(c1!=null) {
				if(c1.getCid()==c.getCid())
				{
					clist[i]=c;
					return true;
					
				}
			}
			}
		}
		
		return false;
	}

	@Override
	public boolean deleteCustomer(int cid) {

		for(int i=0;i<clist.length;i++)
		{
			c1=clist[i];
			if(c1!=null && c1.getCid()==cid) {
					clist[i]=null;
					return true;
				
			}
		}
		
		
		return false;
	}

	@Override
	public Customer showCustomerById(int cid) {
		for(int i=0;i<clist.length;i++)
		{
			c1=clist[i];
			if(c1!=null && c1.getCid()==cid) 
					return c1;
			
			}		return null;
	}

	@Override
	public Customer[] showCustomerByFirstName(String firstName) {

		clist2=new Customer[100];
		for(int i=0;i<clist.length;i++)
			
		{
			c1=clist[i];
			
			if(c1!=null && c1.getFirstName().equals(firstName))
			{
				clist2[i]=c1;
				
			}
		}
		
		
		return clist2;
	}

	@Override
	public Customer showCustomerByEmail(String email) {

		if(email!=null || email!="") {
			
		for(int i=0;i<clist.length;i++) {
			
			c1=clist[i];    //fetching each cutomer obejct stored in clistone at a time with for loop
			
		
			if(c1!=null)
			{
				// checking if object fetched has the same emailas the one recived from cutomer
			if(c1.getEmail().equals(email))  
				
				return c1;  
			
		}
		}
		}
		
		return null;
	}

	@Override
	public Customer[] showAllCustomer() {
		return clist;
	}

	
}
