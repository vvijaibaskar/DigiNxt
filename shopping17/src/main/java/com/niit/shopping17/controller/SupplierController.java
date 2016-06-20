package com.niit.shopping17.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shopping17.bean.Supplier;
import com.niit.shopping17.dao.SupplierDAO;

@Controller
public class SupplierController {
	
	@Autowired
	private SupplierDAO supplierDAO;
	
	@RequestMapping("/getAllSuppliers")
	public ModelAndView getAllSuppliers(){
		System.out.println("getAllSuppliers");

		List<Supplier> supplierList = supplierDAO.getAllSuppliers();
		ModelAndView mv = new ModelAndView("/SupplierList");
		mv.addObject("supplierList", supplierList);
		return mv;
				
		
	}

}
