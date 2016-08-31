package com.niit.alumni.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.alumni.dao.UsrDAO;
import com.niit.alumni.model.Usr;


public class UsrTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.alumni");
		context.refresh();
		
	Usr u =(Usr)context.getBean("usr");
	
	UsrDAO usrDAO = (UsrDAO)context.getBean("usrDAO");
	u.setId("USR001");
	u.setName("vijai");
	u.setPassword("vijai");
	u.setPhone("1122334455");
	u.setEmail("vijai@vijai.com");
	usrDAO.saveOrUpdate(u);

	
	Usr u2 =(Usr)context.getBean("usr");
	u2.setId("USR002");
	u2.setName("baskar");
	u2.setPassword("baskar");
	u2.setPhone("6622334455");
	u2.setEmail("baskar@vijai.com");
	usrDAO.saveOrUpdate(u2);
	
	Usr u3 =(Usr)context.getBean("usr");
	u3.setId("USR022");
	u3.setName("abc");
	u3.setPassword("abc");
	u3.setPhone("6622334455");
	u3.setEmail("abc@vijai.com");
	u3.setNiitRollNo("afdadf");
	u3.setYearOfJoin(2018);
	u3.setStatus('N');
	usrDAO.saveOrUpdate(u2);
	}

}
