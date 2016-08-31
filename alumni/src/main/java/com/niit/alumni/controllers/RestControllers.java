package com.niit.alumni.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.niit.alumni.dao.RoleDAO;
import com.niit.alumni.dao.UsrDAO;
import com.niit.alumni.model.Role;
import com.niit.alumni.model.Usr;

@RestController
public class RestControllers {
@Autowired
UsrDAO usrDAO;

@Autowired
RoleDAO roleDAO;


@GetMapping("/usr")
public String getUsr()
{
	List<Usr> list=usrDAO.list();
	Gson g=new Gson();
	String st=g.toJson(list);
	return st;
}
	

@GetMapping("/role")
public String getRole()
{
	List<Role> list=roleDAO.list();
	Gson g=new Gson();
	String s=g.toJson(list);
	return s;
}
}
