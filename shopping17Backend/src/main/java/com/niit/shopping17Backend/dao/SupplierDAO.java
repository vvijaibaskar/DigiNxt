package com.niit.shopping17Backend.dao;

import java.util.List;

import com.niit.shopping17Backend.model.Supplier;


public interface SupplierDAO {


	public List<Supplier> list();

	public Supplier get(String id);

	public void saveOrUpdate(Supplier supplier);

	public void delete(String id);
	/* vijai */
	public Supplier getAllSuppliers(String id);

}