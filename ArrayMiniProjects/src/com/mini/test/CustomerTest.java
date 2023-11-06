package com.mini.test;

import java.util.Scanner;


import com.mini.dao.CustomerDaoImpl;
import com.mini.pojo.Customer;

public class CustomerTest{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	Customer c;
		CustomerDaoImpl cimpl=new CustomerDaoImpl();
		Customer[] clist;
		
		 int cid;
		 String firstName;
		 String lastName;
		 long contact;
		 String email;
		 String address;
		 String gender;
		 boolean flag, present=false,exit=false;
		 
		 String option;
		System.out.println("----------------Welcome to parshya.com---------------");
		
		do
		{
		System.out.println("\nPlease select one of the below given option by giving proper input");
		System.out.println("1--------------> Register");
		System.out.println("2--------------> Show my pofile");
		System.out.println("3--------------> Update my profile");
		System.out.println("4--------------> Delete my profile");
		System.out.println("5--------------> Show customer by id");
		System.out.println("6--------------> Show customer by First name");
		System.out.println("7--------------> Show All customer");
		System.out.println("8--------------> For exit");
 
		int choice=sc.nextInt();
		sc.nextLine();
		
		
		switch(choice)
		{
			case 1:
				System.out.println("Enter first name:- ");
				firstName=sc.nextLine();
				
				System.out.println("Enter surname:- ");
				lastName=sc.nextLine();
				
				System.out.println("Enter contact number:- ");
				contact=sc.nextLong();
				sc.nextLine();
								
				System.out.println("Enter email address:- ");
				email=sc.nextLine();
				
				System.out.println("Enter address:- ");
				address=sc.nextLine();
				
				System.out.println("Enter gender:- ");
				gender=sc.nextLine();
				
				c=new Customer();
				c.setAddress(address);
				c.setContact(contact);
				c.setEmail(email);
				c.setFirstName(firstName);				
				c.setLastName(lastName);
				c.setGender(gender);
				
			    flag=cimpl.addCustomer(c);
				
			    if(flag)
			        System.out.println("Your details added to database successfully!!!");
			    else
			    	System.out.println("Error while adding your details! please try again");
				
				break;
				
			case 2:
				System.out.println("Enter your eamilid:  ");
				email=sc.nextLine();
				
				
				c=cimpl.showCustomerByEmail(email);
				
				
				if(c==null)
					System.out.println("Please check the emailid given. we do not find profile with this email in our database");
				else
				{
					System.out.println("Your profile details...........");
					System.out.println(c);
				}
				
				break;
				
			case 3:
				System.out.println("Enter your eamilid:  ");
				email=sc.nextLine();
				
				
				c=cimpl.showCustomerByEmail(email);
				
				if(c==null)
					System.out.println("Please check the emailid given. we do not find profile with this email in our database");
				else
				{
					System.out.println("Your profile details...........");
					System.out.println(c);
					System.out.println("Are you sure you want to update this information? Enter yes or no accordinglly!!!");
					option=sc.nextLine();
					
					if(option.equals("yes")) {
						System.out.println("Enter first name:- ");
						firstName=sc.nextLine();
						
						System.out.println("Enter surname:- ");
						lastName=sc.nextLine();
						
						System.out.println("Enter ontact number:- ");
						contact=sc.nextLong();
						sc.nextLine();
										
						System.out.println("Enter email address:- ");
						email=sc.nextLine();
						
						System.out.println("Enter address:- ");
						address=sc.nextLine();
						
						System.out.println("Enter gender:- ");
						gender=sc.nextLine();
						
						c.setAddress(address);
						c.setContact(contact);
						c.setEmail(email);
						c.setFirstName(firstName);				
						c.setLastName(lastName);
						c.setGender(gender);
						
						flag=cimpl.updateCustomer(c);
						
						if(flag==true)
							System.out.println("Your details have been updated");
						else
							System.out.println("Error while updating");
											
					}
					else if(option.equals("no"))
						System.out.println("No problem! Thank you for being a part of our family!");
					else
						System.out.println("please give answer in yes or no only");
				}
				
				break;
				
			case 4:
				System.out.println("Enter your id number");
				cid=sc.nextInt();
				sc.nextLine();
				flag=cimpl.deleteCustomer(cid);
				if(flag)
					System.out.println("Customer deleted successfully!!!!!!");
				else
					System.out.println("Error while deleting cudtomer details...");
				break;
				
				
			case 5:
				System.out.println("Enter your id number");
				cid=sc.nextInt();
				sc.nextLine();
				c=cimpl.showCustomerById(cid);
				if(c==null)
				    System.out.println("Please check the id given by you!! No such profilr present in database");
				else
					System.out.println("Your details");
				    System.out.println(c);

				    break;
					
				case 6:
					System.out.println("Enter your First  name");
					firstName=sc.nextLine();
					clist = cimpl.showCustomerByFirstName(firstName);
					
					present=false;
					for(int i=0;i<clist.length;i++)
					{
						if(clist[i]!=null)
						{
							present=true;
							System.out.println(clist[i]);
							
						}
					}
					if(present==false)
					{
						System.out.println("please check the name given. no profile with this name found!!!!!!");
					}
					    break;
					    
					    
				 case 7:
					 clist=cimpl.showAllCustomer();
					 
					  present=false;
						for(int i=0;i<clist.length;i++)
						{
							if(clist[i]!=null)
							{
								present=true;
								System.out.println(clist[i]);
								
							}
						}
						if(present==false)
						{
							System.out.println("please check the name given. no profile with this name found!!!!!!");
						}
						    break;
			    case 8:
			    	
			       	if(exit=true)
			    		System.out.println("Thank you for visiting!!! See you soon");
						    	
					  break;
					  default:
						  System.out.println("choose valid option");
				
		}
		
	}while(exit==false);
	
}
}
	
