package com.niit.alumni.test;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.alumni.dao.EventDAO;
import com.niit.alumni.model.Event;

public class EventTest {

			public static void main(String[] args) {
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
			context.scan("com.niit.alumni");
			context.refresh();

			EventDAO eventDAO = (EventDAO)context.getBean("eventDAO");

			Event e1 =(Event)context.getBean("event");
			e1.setId("EV0001");
			e1.setName("Independence Day Celebration");

			String dat="08/15/2016";
			long date=new SimpleDateFormat("MM/dd/yyyy").parse(dat,new ParsePosition(0)).getTime();
			java.sql.Date dbDate=new java.sql.Date(date);

			e1.setEventDate(dbDate);
			e1.setVenue("JayaNagar NIIT Center");
			e1.setDescription("Independence Day Celebration at NIIT Jayanagar at 8:00AM, Flag Hoisting followed by cultural events");
			eventDAO.saveOrUpdate(e1);
		
			e1.setId("EV0002");
			e1.setName("Interview Preparation");
			
			String dat1="08/20/2016";
			long date1=new SimpleDateFormat("MM/dd/yyyy").parse(dat1,new ParsePosition(0)).getTime();
			java.sql.Date dbDate1=new java.sql.Date(date1);
			
			e1.setEventDate(dbDate1);
			e1.setVenue("Malleswaram NIIT Center");
			e1.setDescription("Interview grooming session at NIIT Malleswaram at 9:00AM");
			eventDAO.saveOrUpdate(e1);
	}

}
