package com.niit.shoppingcart.dao;
import java.util.List;

import com.niit.shoppingcart.model.User;
public interface UserDAO {

	//CRUD operations
	
		public boolean save(User user);
		public boolean update(User user);
		public  User get(String id);
		public boolean delete(User user);
		public List <User> list();
}
