package com.niit.shoppingcart;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.User;

public class UserTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static User user;

	@Autowired
	static UserDAO userDAO;

	@BeforeClass
	public static void init1() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();
		user = (User) context.getBean("user");
		userDAO = (UserDAO) context.getBean("userDAO");

	}

	/*@Test
	public void createUserTestCase() {
		user.setEmailid("nkambdur@gmail.com");
		user.setName("Niveditha");
		user.setAddress("Hadapsar Pune");
		user.setContact("9860410079");
		user.setPassword("pran0812");
		user.setRole("admin");		
		Boolean status = userDAO.save(user);
		Assert.assertEquals("create user test case", true, status);
	}
*/
	
	 /* @Test public void updateUserTestCase() 
	  { 
		  user.setEmailid("nkambdur@gmail.com");
		  user.setName("Niveditha Chikhle");
			user.setAddress("Hadapsar Pune");
			user.setContact("9860410079");
			user.setPassword("pran0812");
			user.setRole("admin");	
		  Boolean status=userDAO.update(user);
	 
	 Assert.assertEquals("create user test case",true,status);
	 }*/
	 
	/* @Test public void deleteUserTestCase() { user.setEmailid("SUP102");
	 Boolean status = userDAO.delete(user);
	  Assert.assertEquals("delete user test case", true,status); }
*/
	 /* @Test public void getUserTestCase() {
	  Assert.assertEquals("get user test case ",
	  null,userDAO.get("12345") );
	  } */
	 
	/*  @Test public void getAllUserTestCase() {
	  Assert.assertEquals("get all user test case",1,userDAO.list().size()); }
	*/
	 
}
