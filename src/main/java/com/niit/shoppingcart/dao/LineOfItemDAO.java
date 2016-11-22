package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.LineOfItem;

public interface LineOfItemDAO {

	//CRUD operations
	
		public boolean save(LineOfItem lineOfItem);
		public boolean update(LineOfItem lineOfItem);
		public  LineOfItem get(String id);
		public boolean delete(LineOfItem lineOfItem);
		public List <LineOfItem> list();
	
}
