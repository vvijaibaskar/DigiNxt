package com.niit.shopping17Backend.test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shopping17Backend.dao.CategoryDAO;
import com.niit.shopping17Backend.model.Category;

public class TestCategory {
	static AnnotationConfigApplicationContext context;
	
	public TestCategory()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shopping17Backend");
		context.refresh();
	}
	
	
	public static void createCategory(Category category)
	{
		CategoryDAO  categoryDAO =  (CategoryDAO) context.getBean("categoryDAO");
		categoryDAO.saveOrUpdate(category);
	}
	
	public static void deleteCategory(String id)
	{
		CategoryDAO  categoryDAO =  (CategoryDAO) context.getBean("categoryDAO");
		categoryDAO.delete(id);
	}
/*	
	public static void updateCategory(String id,String desc)
	{
		CategoryDAO  categoryDAO =  (CategoryDAO) context.getBean("categoryDAO");
		Category category = (Category) context.getBean("category");
		category = (Category)categoryDAO.get(id);
	    category.setDescription(desc);
		categoryDAO.saveOrUpdate(category);

	}
*/	
	public static void main(String[] args) {
		TestCategory tc = new TestCategory();
		Category category = (Category) context.getBean("category");
	    category.setId("MOB_001");
	    category.setName("Mobile");
	    category.setDescription("Samsung Mobile Phone");
	    tc.createCategory(category);
	    category.setId("MOB_002");
	    category.setName("Mobile");
	    category.setDescription("MotoG4 Mobile Phone");
	    tc.createCategory(category);
	    category.setId("TAB_001");
	    category.setName("Tablet");
	    category.setDescription("LG Tablet");
	    tc.createCategory(category);
	    tc.deleteCategory("MOB_002");
	    category.setId("MOB_003");
	    category.setName("Mobile");
	    category.setDescription("Apple iphone Mobile Phone");
	    tc.createCategory(category);
/* 	    tc.updateCategory("TAB_001","Samsung Tablet"); */
		
	}

	private static void display(List<Category> list) {
		for( Category c : list)
		{
			System.out.print(c.getId() + ":"+ c.getName() +":"+  c.getDescription()) ;
		}

	}
}
