package com.mini.pojo;

public class Customer {
	
	private int cid;
	private String firstName;
	private String lastName;
	private long contact;
	private String email;
	private String address;
	private String gender;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int cid, String firstName, String lastName, long contact, String email, String address,
			String gender) {
		super();
		this.cid = cid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = contact;
		this.email = email;
		this.address = address;
		this.gender = gender;
	}

	
	@Override
	public String toString() {
		return "\nid=" + cid + " \nfirstName=" + firstName + " \nlastName=" + lastName + " \ncontact=" + contact
				+ " \nemail=" + email + " \naddress=" + address + " \ngender=" + gender + "";
	}

	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	/*
	 *   Alt+shift+s
	 *   
	 *   generate cunstructor from superclass
	 *   generate constructor from field
	 *   generate toString
	 *   generate getter setter -----> select all ----> generate
	 *   
	 */
	
	
	

}
