package com.niit.alumni.dao;

import java.util.List;

import com.niit.alumni.model.UsrRole;


public interface UsrRoleDAO {
	public List<UsrRole> list();

	public UsrRole get(String id);
	
	public UsrRole getByName(String name);

	public void saveOrUpdate(UsrRole usrRole);

	public void delete(String id);
}
