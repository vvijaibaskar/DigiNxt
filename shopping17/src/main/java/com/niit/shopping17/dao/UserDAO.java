package com.niit.shopping17.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
	public boolean isValidUser(String userName,String password)
	{
		System.out.println("Inside UserDAO");
		if(userName.equals("NIIT") && password.equals("NIIT@123"))
		{
			System.out.println("UserDAOTrue");
			return true;
		}
		else
		{
			System.out.println("UserDAOFalse");
			return false;
		}
	}

}