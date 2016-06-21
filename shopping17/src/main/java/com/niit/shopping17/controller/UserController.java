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
	    	String message;
	    	ModelAndView mv;
	    	if(userDAO.isValidUser(name,password))
	    	{
	    		message="Valid Credentials";
	            mv = new ModelAndView("adminHome");
	     	}
	    	else
	    	{
	    		message="Invalid Credentials";
	        	mv = new ModelAndView("login");
	 		}
	 	 	   mv.addObject("message",message);
	 	 	   mv.addObject("name",name);
		 	   return mv;
	 		    
	    }
}
