package com.niit.shopingcart.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.shopingcart.dao.CategoryDAO;
import com.niit.shopingcart.dao.ProductDAO;
import com.niit.shopingcart.dao.SupplierDAO;
import com.niit.shopingcart.model.Category;
import com.niit.shopingcart.model.Product;
import com.niit.shopingcart.model.Supplier;

@Controller
public class ProductController {
	
	@Autowired(required=true)
	private ProductDAO productDAO;

	@Autowired(required = true)
	private CategoryDAO categoryDAO;

	@Autowired(required = true)
	private SupplierDAO supplierDAO;

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public String listProducts(Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("category", new Category());
		model.addAttribute("supplier", new Supplier());
		model.addAttribute("productList", this.productDAO.list());
		model.addAttribute("categoryList", this.categoryDAO.list());
		model.addAttribute("supplierList", this.supplierDAO.list());
		return "product";
	}
	// For add and update product both
		@RequestMapping(value = "/product/add", method = RequestMethod.POST)
		public String addProduct(@ModelAttribute("product") Product product) {
			System.out.println(product.getCategory_id());
			System.out.println(product.getSupplier_id());
			productDAO.saveOrUpdate(product);

			Category category = categoryDAO.getByName(product.getCategory().getName());
			categoryDAO.saveOrUpdate(category);

			Supplier supplier = supplierDAO.getByName(product.getSupplier().getName());
			supplierDAO.saveOrUpdate(supplier);
			
			product.setCategory(category);
			product.setSupplier(supplier);
			
			return "redirect:/products";

		}
}
