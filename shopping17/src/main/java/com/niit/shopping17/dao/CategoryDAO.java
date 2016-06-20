package com.niit.shopping17.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.shopping17.bean.Category;

@Repository
public class CategoryDAO {

	
		public List<Category> getAllCategories(){
			ArrayList<Category> list = new ArrayList<Category>();
		
		System.out.println("Inside CategoryDAO");
		Category c1= new Category();
		c1.setId("C_MOB_01");
		c1.setName("Mobile");
		c1.setDescription(" This is Mobile Category");
		
		list.add(c1);
		
		c1= new Category();
		c1.setId("C_TAB_01");
		c1.setName("Tabs");
		c1.setDescription(" This is Tab Category");
		list.add(c1);
		
		c1= new Category();
		c1.setId("C_M_Acc_01");
		c1.setName("Mobile_Charger");
		c1.setDescription(" This is Mobile Charger Category");
		list.add(c1);
		
		return list;
		
		
	}
	public int updateCategories(List<Category> categoryList)
	{
		System.out.println("Inside updateCategories");
		return 1;
	}
	
	
}