package com.niit.alumni.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.alumni.dao.JobDAO;
import com.niit.alumni.model.Job;


public class JobTest {

	public static void main(String[] args) 
	{
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	context.scan("com.niit.alumni");
	context.refresh();
	
	Job j =(Job)context.getBean("job");
	
	JobDAO jobDAO = (JobDAO)context.getBean("jobDAO");

	j.setId("J0002");
	j.setJobTitle("Java Programmer");
	j.setCompName("NIITLtd");
	j.setJobDesc("The programmer has to develop frontend and backend for NIIT website");
	j.setNoOfVacancies(5);
	j.setLocation("Bangalore");
	j.setExpReqd(2);
	j.setCompDesc("NIIT is giving training for students and developing software for more than 20 years");
	j.setContactNo("9999999999");
	j.setContactEmail("contact@niit.com");
	j.setWebSite("www.niit.com");
	jobDAO.saveOrUpdate(j);
	}
}
