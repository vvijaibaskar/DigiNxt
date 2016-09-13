package com.niit.alumni.dao;

import java.util.List;

import com.niit.alumni.model.Friends;


public interface FriendsDAO {

	public List<Friends> list();

	public Friends get(String id);
	
	public void saveOrUpdate(Friends friends);

	public void delete(String id);
}
