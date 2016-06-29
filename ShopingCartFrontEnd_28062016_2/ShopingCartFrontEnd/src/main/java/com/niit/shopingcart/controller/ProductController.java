package com.niit.shopingcart.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shopingcart.dao.ProductDAO;
import com.niit.shopingcart.model.Product;

@Controller
public class ProductController {
	@Autowired
	private ProductDAO productDAO;

	@RequestMapping("/addProduct")
	public ModelAndView addCategory(@ModelAttribute Product product) {
		productDAO.saveOrUpdate(product);
	  return new ModelAndView("/adminHome");
	 }
	
	@RequestMapping("/getAllProducts")
	public ModelAndView getAllCategories() {

		System.out.println("getAllProducts");
		
		List<Product> productList = productDAO.list();
		
		ModelAndView mv = new ModelAndView("/productList");
		mv.addObject("productList", productList);

		return mv;
	}
	@RequestMapping("/updateProducts")
	public ModelAndView updateProducts(@ModelAttribute("product") ArrayList<Product> products)
	{
		Product c =products.get(0);
		productDAO.saveOrUpdate(c);
		
		System.out.println("updating category");
		ModelAndView mv = new ModelAndView("/productList");
		
	    List<Product> productList = productDAO.list();
		mv.addObject("productList", productList);
		
		return mv;
	}

}
