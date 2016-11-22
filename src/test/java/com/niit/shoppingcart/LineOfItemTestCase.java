package com.niit.shoppingcart;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.niit.shoppingcart.config.ApplicationContextConfig;
import com.niit.shoppingcart.dao.LineOfItemDAO;
import com.niit.shoppingcart.model.LineOfItem;

public class LineOfItemTestCase {
	// ClassPathXmlApplicationContext

	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static LineOfItem lineOfItem;

	@Autowired
	static LineOfItemDAO lineOfItemDAO;

	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();

		context.scan("com.niit.shoppingcart");

		context.refresh();

		lineOfItem = (LineOfItem) context.getBean("lineOfItem");

		lineOfItemDAO = (LineOfItemDAO) context.getBean("lineOfItemDAO");

	}

	
	/* @Test public void createLineOfItemTestCase() { 
		  lineOfItem.setId("LOI 01");
	  lineOfItem.setProduct_id("PRO 01");
	  lineOfItem.setQuantity(new Integer(2));
	  lineOfItem.setRate(new Integer(1000));
	  Boolean status= lineOfItemDAO.save(lineOfItem);
	  Assert.assertEquals("create LineOfItem Test Case",true,status);
	  
	  }
	 */

	
	/*  @Test public void deleteLineOfItemTestCase() {
	  
	  lineOfItem.setId("LOI 01"); Boolean status= lineOfItemDAO.delete(lineOfItem);
	  Assert.assertEquals("delete LineOfItem Test Case",true,status);
	  
	  }
	 */

/*	@Test
	public void updateLineOfItemTestCase() {
		// lineOfItem=new LineOfItem();
		lineOfItem.setId("LOI 01");
		  lineOfItem.setProduct_id("PRO 01");
		  lineOfItem.setQuantity(new Integer(3));
		  lineOfItem.setRate(new Integer(1000));
		Boolean status = lineOfItemDAO.update(lineOfItem);
		Assert.assertEquals("update LineOfItem Test Case", true, status);

	}*/

	
	 /* @Test public void getLineOfItemTestCase() {
	  
	  //negative scenario
	  Assert.assertEquals("get LineOfItem Test Case",null,lineOfItemDAO. get("ETH 078"));
	  
	  }
	
*/
	/*
	  @Test
	  
	 public void getAllLineOfItemTestCase() {
	 
	  Assert.assertEquals("get all LineOfItem Test Case",1,lineOfItemDAO.list().size());
	   }*/
	 

}
