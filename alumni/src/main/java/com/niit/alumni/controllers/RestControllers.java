package com.niit.alumni.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.google.gson.Gson;
import com.niit.alumni.dao.BlogDAO;
import com.niit.alumni.dao.ChatDAO;
import com.niit.alumni.dao.EventDAO;
import com.niit.alumni.dao.FriendsDAO;
import com.niit.alumni.dao.JobDAO;
import com.niit.alumni.dao.RoleDAO;
import com.niit.alumni.dao.UsrDAO;
import com.niit.alumni.dao.UsrRoleDAO;
import com.niit.alumni.model.Blog;
import com.niit.alumni.model.ChatMsg;
import com.niit.alumni.model.Event;
import com.niit.alumni.model.Friends;
import com.niit.alumni.model.Job;
import com.niit.alumni.model.Role;
import com.niit.alumni.model.Usr;
import com.niit.alumni.model.UsrRole;

@RestController
public class RestControllers {

@Autowired
BlogDAO blogDAO;

@Autowired
ChatDAO chatDAO;

@Autowired
EventDAO eventDAO;

@Autowired
FriendsDAO friendsDAO;

@Autowired
JobDAO jobDAO;

@Autowired
RoleDAO roleDAO;

@Autowired
UsrDAO usrDAO;

/*@Autowired
UsrRoleDAO usrRoleDAO;


*/

//-------------------Retrieve All Users--------------------------------------------------------

@GetMapping(value = "/usr")
public ResponseEntity<List<Usr>> listAllUsers() {
    List<Usr> users = usrDAO.list();
    if(users.isEmpty()){
        return new ResponseEntity<List<Usr>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
    }
    return new ResponseEntity<List<Usr>>(users, HttpStatus.OK);
}

//-------------------Create a User--------------------------------------------------------

//@PostMapping(value = "/user11")
@RequestMapping(value ="/user11", method = RequestMethod.POST)
public ResponseEntity<Void> createUser(@RequestBody Usr usr,    UriComponentsBuilder ucBuilder) {
    System.out.println("Creating User " + usr.getName());

  /*  if (usrDAO.isUserExist(usr)) {
        System.out.println("A User with name " + usr.getName() + " already exist");
        return new ResponseEntity<Void>(HttpStatus.CONFLICT);
    }*/

    usrDAO.saveOrUpdate(usr);

    HttpHeaders headers = new HttpHeaders();
    headers.setLocation(ucBuilder.path("/usr/{id}").buildAndExpand(usr.getId()).toUri());
    return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
}


//------------------- Update a User --------------------------------------------------------
 
@RequestMapping(value = "/usr/{id}", method = RequestMethod.PUT)
public ResponseEntity<Usr> updateUser(@PathVariable("id") String id, @RequestBody Usr user) {
    System.out.println("Updating User " + id);
     
    Usr currentUser = usrDAO.get(id);
     
    if (currentUser==null) {
        System.out.println("User with id " + id + " not found");
        return new ResponseEntity<Usr>(HttpStatus.NOT_FOUND);
    }

    currentUser.setName(user.getName());
    currentUser.setEmail(user.getEmail());
     
    usrDAO.saveOrUpdate(currentUser);
    return new ResponseEntity<Usr>(currentUser, HttpStatus.OK);
}


//-------------------Retrieve All Blogs--------------------------------------------------------

@GetMapping(value = "/blog")
public ResponseEntity<List<Blog>> listAllBlogs() {
	
 List <Blog> blogs = blogDAO.list();
	if(blogs.isEmpty()){
      return new ResponseEntity<List<Blog>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
  }
  return new ResponseEntity<List<Blog>>(blogs, HttpStatus.OK);
}

//-------------------Create a Blog--------------------------------------------------------
//@PostMapping(value = "/blog11")
@RequestMapping(value ="/blog11", method = RequestMethod.POST)
public ResponseEntity<Void> createBlog(@RequestBody Blog blog,    UriComponentsBuilder ucBuilder) {
  System.out.println("Creating Blog " + blog.getBlogName());
/*  if (usrDAO.isUserExist(usr)) {
      System.out.println("A User with name " + usr.getName() + " already exist");
      return new ResponseEntity<Void>(HttpStatus.CONFLICT);
  }*/
  blogDAO.saveOrUpdate(blog);
  HttpHeaders headers = new HttpHeaders();
  headers.setLocation(ucBuilder.path("/blog/{id}").buildAndExpand(blog.getId()).toUri());
  return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
}

/*@GetMapping("/blog")
public String getBlog()
{
	List<Blog> list=blogDAO.list();
	Gson bl=new Gson();
	String s=bl.toJson(list);
	return s;
}*/
//-------------------Retrieve All Events--------------------------------------------------------
@GetMapping(value = "/event")
public ResponseEntity<List<Event>> listAllEvents() {
  List<Event> events = eventDAO.list();
  if(events.isEmpty()){
      return new ResponseEntity<List<Event>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
  }
  return new ResponseEntity<List<Event>>(events, HttpStatus.OK);
}

//@PostMapping(value = "/user11")
@RequestMapping(value ="/event11", method = RequestMethod.POST)
public ResponseEntity<Void> createEvent(@RequestBody Event event,    UriComponentsBuilder ucBuilder) {
  System.out.println("Creating Event " + event.getName());

/*  if (usrDAO.isUserExist(usr)) {
      System.out.println("A User with name " + usr.getName() + " already exist");
      return new ResponseEntity<Void>(HttpStatus.CONFLICT);
  }*/
  eventDAO.saveOrUpdate(event);
  HttpHeaders headers = new HttpHeaders();
  headers.setLocation(ucBuilder.path("/event/{id}").buildAndExpand(event.getId()).toUri());
  return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
}
/*@GetMapping("/event")
public String getevent()
{
	List<Event> list=eventDAO.list();
	Gson ev= new Gson();
	String s=ev.toJson(list);
	return s;
}*/
@GetMapping("/chat")
public String getchat()
{
	List<ChatMsg> list=chatDAO.list();
	Gson ch=new Gson();
	String s=ch.toJson(list);
	return s;
}




@GetMapping("/friends")
public String getfriends()
{
	List<Friends> list=friendsDAO.list();
	Gson fr= new Gson();
	String s=fr.toJson(list);
	return s;
}
@GetMapping("/job")
public String getjob()
{
	List<Job> list=jobDAO.list();
	Gson jb= new Gson();
	String s=jb.toJson(list);
	return s;
}

@GetMapping("/role")
public String getRole()
{
	List<Role> list=roleDAO.list();
	Gson g=new Gson();
	String s=g.toJson(list);
	return s;
}

/*@GetMapping("/usr")
public String getUsr()
{
	List<Usr> list=usrDAO.list();
	Gson g=new Gson();
	String st=g.toJson(list);
	return st;
}*/

/*@GetMapping("/usrrole")
public String getUsrRole()
{
	List<UsrRole> list=usrRoleDAO.list();
	Gson ur=new Gson();
	String st=ur.toJson(list);
	return st;
}*/
}
