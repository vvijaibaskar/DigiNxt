package com.niit.shopping17.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shopping17Backend.dao.CategoryDAO;
import com.niit.shopping17Backend.model.Category;


@Controller
public class CategoryController {

	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping("/addCategory")
	public ModelAndView addCategory(@RequestParam(value = "categoryName") String categoryName,
			@RequestParam(value = "categoryDescription") String categoryDescription) {
		String message = "Category Successfully Created";
		ModelAndView mv = new ModelAndView("/success");
		mv.addObject("message", message);
		return mv;
	}
/*
	@RequestMapping("/getAllCategories")
	public ModelAndView getAllCategories() {

		System.out.println("before categoryDAO.AllCategories");

		List<Category> categoryList = categoryDAO.getAllCategories();
		System.out.println("before ModelAndView-CategoryList");

		ModelAndView mv = new ModelAndView("/categoryList");
		mv.addObject("categoryList", categoryList);

		return mv;
	}
	
	*/
	/*

	@RequestMapping("/updateCategories")
	public ModelAndView updateCategory(@ModelAttribute("category") ArrayList<Category> categories) {
		int count = categoryDAO.updateCategories(categories);

		System.out.println("updating category");
		ModelAndView mv = new ModelAndView("/categoryList");

		String message = count + " record(s) are updated";

		List<Category> categoryList = categoryDAO.getAllCategories();
		mv.addObject("message", message);
		mv.addObject("categoryList", categoryList);

		return mv;
	}
	*/
}
