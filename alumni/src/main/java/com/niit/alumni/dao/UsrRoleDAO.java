package com.niit.alumni.dao;

import java.util.List;

import com.niit.alumni.model.UsrRole;


public interface UsrRoleDAO {

	public List<UsrRole> list();

	public UsrRole get(int id);
	
	public void saveOrUpdate(UsrRole usrRole);

	public void delete(int id);
}
