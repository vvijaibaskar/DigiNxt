package com.niit.shopping17Backend.dao;

import java.util.List;

import com.niit.shopping17Backend.model.Category;


public interface CategoryDAO {


	public List<Category> list();

	public Category get(String id);

	public void saveOrUpdate(Category category);

	public void delete(String id);


}
