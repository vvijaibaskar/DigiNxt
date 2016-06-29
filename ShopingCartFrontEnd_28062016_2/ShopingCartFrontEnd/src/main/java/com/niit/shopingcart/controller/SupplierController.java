package com.niit.shopingcart.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shopingcart.dao.SupplierDAO;
import com.niit.shopingcart.model.Supplier;

@Controller
public class SupplierController {
	
	@Autowired
	private SupplierDAO supplierDAO;
	
	@RequestMapping("/addSupplier")
	public ModelAndView addSupplier(@ModelAttribute Supplier supplier) {
		supplierDAO.saveOrUpdate(supplier);
	  return new ModelAndView("/adminHome");
	 }

	@RequestMapping("/getAllSuppliers")
	public ModelAndView getAllSuppliers() {

		System.out.println("getAllSuppliers");
		
		List<Supplier> supplierList = supplierDAO.list();
		
		ModelAndView mv = new ModelAndView("/supplierList");
		mv.addObject("supplierList", supplierList);

		return mv;
	}
	
	@RequestMapping("/updateSuppliers")
	public ModelAndView updateSupplier(@ModelAttribute("supplier") ArrayList<Supplier> suppliers)
	{
		Supplier c =suppliers.get(0);
		supplierDAO.saveOrUpdate(c);
		
		System.out.println("updating supplier");
		ModelAndView mv = new ModelAndView("/supplierList");
		
	    List<Supplier> supplierList = supplierDAO.list();
		mv.addObject("supplierList", supplierList);
		
		return mv;
	}


}
