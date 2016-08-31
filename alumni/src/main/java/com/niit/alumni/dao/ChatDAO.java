package com.niit.alumni.dao;

import java.util.List;

import com.niit.alumni.model.ChatMsg;


public interface ChatDAO {

	public List<ChatMsg> list();

	public ChatMsg get(String id);
	
	public void saveOrUpdate(ChatMsg chatMsg);

	public void delete(String id);
}
