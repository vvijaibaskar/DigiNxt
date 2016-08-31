package com.niit.alumni.dao;

import java.util.List;

import com.niit.alumni.model.Event;


public interface EventDAO {

	public List<Event> list();

	public Event get(String id);
	
	public void saveOrUpdate(Event event);

	public void delete(String id);

}
