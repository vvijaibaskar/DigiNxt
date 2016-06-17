package com.niit.shopping17.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
	public boolean isValidUser(String userName,String password)
	{
		System.out.println("Inside DAO");
		if(userName.equals("NIIT") && password.equals("NIIT@123"))
		{
			System.out.println("True");
			return true;
		}
		else
		{
			System.out.println("False");
			return false;
		}
	}

}