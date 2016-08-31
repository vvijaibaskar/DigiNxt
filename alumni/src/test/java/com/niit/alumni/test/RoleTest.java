package com.niit.alumni.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.alumni.dao.RoleDAO;
import com.niit.alumni.model.Role;


public class RoleTest {

public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.alumni");
		context.refresh();
		
	Role r =(Role)context.getBean("role");
	
	RoleDAO roleDAO = (RoleDAO)context.getBean("roleDAO");
	
	r.setId(101);
	r.setName("ADMIN");
	r.setId(203);
	r.setName("USER");
	roleDAO.saveOrUpdate(r);
	
	
	
}
}
