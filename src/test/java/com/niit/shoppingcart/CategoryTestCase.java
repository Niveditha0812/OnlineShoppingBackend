package com.niit.shoppingcart;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.niit.shoppingcart.config.ApplicationContextConfig;
import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;

public class CategoryTestCase {
	// ClassPathXmlApplicationContext

	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static Category category;

	@Autowired
	static CategoryDAO categoryDAO;

	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();

		context.scan("com.niit.shoppingcart");

		context.refresh();

		category = (Category) context.getBean("category");

		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");

	}

	
	/*  @Test public void createCategoryTestCase() { 
		  category.setId("CAT 01");
	  category.setName("sarees");
	  category.setDescription("Kanchi sarees"); 
	  Boolean status= categoryDAO.save(category);
	  Assert.assertEquals("create Category Test Case",true,status);
	  
	  }
	 */

	/*
	  @Test public void deleteCategoryTestCase() {
	  
	  category.setId("ETH 07"); Boolean status= categoryDAO.delete(category);
	  Assert.assertEquals("delete Category Test Case",true,status);
	  
	  }
	 */

/*	@Test
	public void updateCategoryTestCase() {
		// category=new Category();
		category.setId("ETH 03");
		category.setName("waist coat");
		category.setDescription("designer");
		Boolean status = categoryDAO.update(category);
		Assert.assertEquals("update Category Test Case", true, status);

	}*/

	
	 /* @Test public void getCategoryTestCase() {
	  
	  //negative scenario
	  Assert.assertEquals("get Category Test Case",null,categoryDAO. get("ETH 078"));
	  
	  }*/
	

	
	 /* @Test
	  
	 public void getAllCategoryTestCase() {
	 
	  Assert.assertEquals("get all Category Test Case",2,categoryDAO.list().size()); }
	 
*/
}
