package com.niit.alumni.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.alumni.dao.UsrRoleDAO;
import com.niit.alumni.model.UsrRole;


public class UsrRoleTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.alumni");
		context.refresh();
		
		UsrRole ur =(UsrRole)context.getBean("usrRole");
		
		UsrRoleDAO usrRoleDAO = (UsrRoleDAO)context.getBean("usrRoleDAO");
		ur.setUsrId("USR002");
		ur.setRoleId(301);

		usrRoleDAO.saveOrUpdate(ur);

	}

}
