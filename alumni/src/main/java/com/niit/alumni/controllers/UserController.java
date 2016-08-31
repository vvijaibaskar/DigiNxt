package com.niit.alumni.controllers;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.niit.alumni.dao.UsrDAO;
import com.niit.alumni.model.Usr;

@Controller
public class UserController {

	@Autowired
	UsrDAO usrDAO;
	private Path path;

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	@RequestMapping("/register")
	public String register() {
		return "register";
	}

	@RequestMapping("/register2")
	public ModelAndView registerUser2(@ModelAttribute("usr") Usr usr, @RequestParam(value = "id") String userID,
			@RequestParam(value = "password") String userPassword, HttpServletRequest request) {

/*		byte[] bytes;
		if (!usr.getProfilePicture().isEmpty()) {

			try {

				bytes = usr.getProfilePicture().getBytes();
				
				 * usr.setEnabled(true); usr.setRole("ROLE_USER");
				 * userService.addUser(usr); System.out.println("Data Inserted"
				 * );
				 
				// String path =
				// request.getSession().getServletContext().getRealPath("/resources/img/"
				// + u.getUserId() + ".jpg");

				MultipartFile userImage = usr.getProfilePicture();
				String rootDirectory = request.getSession().getServletContext().getRealPath("/");
				path = Paths.get(rootDirectory + "\\WEB-INF\\resources\\img\\" + usr.getId() + ".jpg");

				if (userImage != null && !userImage.isEmpty()) {
					try {
						userImage.transferTo(new File(path.toString()));
					} catch (Exception e) {
						e.printStackTrace();
						throw new RuntimeException("item image saving failed.", e);
					}
				}

			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}*/

		usr.setId(userID);
		usr.setPassword(userPassword);
		usrDAO.saveOrUpdate(usr);
		return new ModelAndView("/login");

	}
	
}
