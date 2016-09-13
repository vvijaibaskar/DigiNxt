package com.niit.alumni.test;

import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.alumni.dao.BlogDAO;
import com.niit.alumni.model.Blog;


public class BlogTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.alumni");
		context.refresh();
		BlogDAO blogDAO = (BlogDAO)context.getBean("blogDAO");
		
/*	Blog bl =(Blog)context.getBean("blog");
	
	bl.setUserId("USR001");
	bl.setBlogName("Blog1");
	bl.setBlogDate(new Date());
	bl.setContents("This Blog 1 is about the DigiNxt Course which is a most successful course for NIIT");
	bl.setStatus('N');
	bl.setReason(" New. Yet to be published");
	blogDAO.saveOrUpdate(bl);
	


	Blog b2 =(Blog)context.getBean("blog");
	b2.setUserId("USR002");
	b2.setBlogName("Blog2");
	b2.setBlogDate(new Date());
	b2.setContents("This Blog 2 is about the DigiNxt Course which is a most successful course for NIIT");
	b2.setStatus('A');
	b2.setReason("Approved");
	blogDAO.saveOrUpdate(b2);*/
	
	Blog b3 =(Blog)context.getBean("blog");
	b3.setUserId("USR004");
	b3.setBlogName("Blog3");
	b3.setBlogDate(new Date());
	b3.setContents("This Blog 3 is about the DigiNxt Course which is a most successful course for NIIT");
	b3.setStatus('A');
	b3.setReason("Approved");
	blogDAO.saveOrUpdate(b3);

}
}
