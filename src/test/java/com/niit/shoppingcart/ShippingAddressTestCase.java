package com.niit.shoppingcart;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.niit.shoppingcart.config.ApplicationContextConfig;
import com.niit.shoppingcart.dao.ShippingAddressDAO;
import com.niit.shoppingcart.model.ShippingAddress;



public class ShippingAddressTestCase {
	//ClassPathXmlApplicationContext
	

	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static ShippingAddress shippingAddress;
	
	@Autowired
	static ShippingAddressDAO shippingAddressDAO;
	

	
	@BeforeClass
	public static void  init()
	{
		
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();
		shippingAddress =(ShippingAddress)context.getBean("shippingAddress");
		shippingAddressDAO =(ShippingAddressDAO)context.getBean("shippingAddressDAO");
		
	}
	
	//start writing JUnit test cases 
	//for each method in DAO
	
	
	
	
	/*@Test
	public void createShippingAddressTestCase()
	{
		shippingAddress.setId("SHI 01");
		shippingAddress.setCity("pune");
		shippingAddress.setCountry("India");
		shippingAddress.setHousenumber("C-29B");
		shippingAddress.setPincode(new Integer(411028));
		shippingAddress.setState("Maharashtra");
		shippingAddress.setStreet("sade satra nalli road");
		Boolean status= shippingAddressDAO.save(shippingAddress);
		Assert.assertEquals("create shippingAddress Test Case",true,status);
		
	}
	*/
	/*@Test
	public void deleteShippingAddressTestCase()
	{
	
		shippingAddress.setId("SHI 01");
		Boolean status= shippingAddressDAO.delete(shippingAddress);
		Assert.assertEquals("delete ShippingAddress Test Case",true,status);
		
	}
	*/
/*@Test
	public void updateShippingAddressTestCase()
	{
	 shippingAddress.setId("SHI 01");
		shippingAddress.setCity("pune");
		shippingAddress.setCountry("India");
		shippingAddress.setHousenumber("C-28B");
		shippingAddress.setPincode(new Integer(411028));
		shippingAddress.setState("Maharashtra");
		shippingAddress.setStreet("sade satra nalli road");
		Boolean status= shippingAddressDAO.update(shippingAddress);
		Assert.assertEquals("update ShippingAddress Test Case",true,status);
		
	}*/
	/* @Test
	public void getShippingAddressTestCase()
	{
		
	//negative scenario
		Assert.assertEquals("get ShippingAddress Test Case",null,shippingAddressDAO.get("ETH 078"));
		
	}
	*/
	/*@Test
	
	public void getAllShippingAddressTestCase()
	{
		
		Assert.assertEquals("get all ShippingAddress Test Case",1,shippingAddressDAO.list().size());
	}*/
	
	
}
