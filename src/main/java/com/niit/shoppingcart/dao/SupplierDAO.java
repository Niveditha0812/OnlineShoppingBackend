package com.niit.shoppingcart.dao;

import java.util.List;
import com.niit.shoppingcart.model.Supplier;

public interface SupplierDAO {
	//CRUD operations
	
		public boolean save(Supplier supplier);
		public boolean update(Supplier supplier);
		public  Supplier get(String id);
		public boolean delete(Supplier supplier);
		public List <Supplier> list();

}
