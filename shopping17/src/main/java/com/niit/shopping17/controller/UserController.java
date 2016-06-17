package com.niit.shopping17.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shopping17.dao.UserDAO;


@Controller
public class UserController {
	   @Autowired
	   private UserDAO userDAO;

	   @RequestMapping("/isValidUser")
	   public ModelAndView showmessage(@RequestParam(value="name") String name,
	    @RequestParam(value="password") String password)
	   	   {
	        System.out.println(" Inside User Controller");
	    	String message;
	    	if(userDAO.isValidUser(name,password))
	    	{
	    		message="Valid Credentials";
	        	ModelAndView mv = new ModelAndView("Success");
	 	 	   mv.addObject("message",message);
	 	 	   mv.addObject("name",name);
		 	   return mv;
	 		    	}
	    	else
	    	{
	    		message="Invalid Credentials";
	        	ModelAndView mv = new ModelAndView("False");
	 	 	   mv.addObject("message",message);
	 	 	   mv.addObject("name",name);
		 	   return mv;
	 		    	}
	 		    
	    }
}
