package com.niit.alumni.dao;

import java.util.List;

import com.niit.alumni.model.Job;


public interface JobDAO {

	public List<Job> list();

	public Job get(String id);
	
	public Job getByName(String name);

	public void saveOrUpdate(Job job);

	public void delete(String id);
}
