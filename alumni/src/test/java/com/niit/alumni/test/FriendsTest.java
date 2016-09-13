package com.niit.alumni.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.alumni.dao.FriendsDAO;
import com.niit.alumni.model.Friends;


public class FriendsTest {

public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.alumni");
		context.refresh();
		
	Friends fr =(Friends)context.getBean("friends");
	
	FriendsDAO friendsDAO = (FriendsDAO)context.getBean("friendsDAO");
	
	fr.setUsrId("Usr001");
	fr.setFriendId("Usr002");
	friendsDAO.saveOrUpdate(fr);
	
}
}
