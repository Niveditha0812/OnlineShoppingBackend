package com.niit.shoppingcart;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.niit.shoppingcart.config.ApplicationContextConfig;
import com.niit.shoppingcart.dao.BillingAddressDAO;
import com.niit.shoppingcart.model.BillingAddress;



public class BillingAddressTestCase {
	//ClassPathXmlApplicationContext
	

	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static BillingAddress billingAddress;
	
	@Autowired
	static BillingAddressDAO billingAddressDAO;
	

	
	@BeforeClass
	public static void  init()
	{
		
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();
		billingAddress =(BillingAddress)context.getBean("billingAddress");
		billingAddressDAO =(BillingAddressDAO)context.getBean("billingAddressDAO");
		
	}
	
	//start writing JUnit test cases 
	//for each method in DAO
	
	
	
	
	/*@Test
	public void createBillingAddressTestCase()
	{
		billingAddress.setId("BIL 01");
		billingAddress.setCity("pune");
		billingAddress.setCountry("India");
		billingAddress.setHousenumber("C-29B");
		billingAddress.setPincode(new Integer(411028));
		billingAddress.setState("Maharashtra");
		billingAddress.setStreet("sade satra nalli road");
		Boolean status= billingAddressDAO.save(billingAddress);
		Assert.assertEquals("create billingAddress Test Case",true,status);
		
	}*/
	
	/*@Test
	public void deleteBillingAddressTestCase()
	{
	
		billingAddress.setId("BIL 01");
		Boolean status= billingAddressDAO.delete(billingAddress);
		Assert.assertEquals("delete BillingAddress Test Case",true,status);
		
	}*/
	
/* @Test
	public void updateBillingAddressTestCase()
	{
	 billingAddress.setId("BIL 01");
		billingAddress.setCity("pune");
		billingAddress.setCountry("India");
		billingAddress.setHousenumber("C-28B");
		billingAddress.setPincode(new Integer(411028));
		billingAddress.setState("Maharashtra");
		billingAddress.setStreet("sade satra nalli road");
		Boolean status= billingAddressDAO.update(billingAddress);
		Assert.assertEquals("update BillingAddress Test Case",true,status);
		
	}*/
	
	/* @Test
	public void getBillingAddressTestCase()
	{
		
	//negative scenario
		Assert.assertEquals("get BillingAddress Test Case",null,billingAddressDAO.get("ETH 078"));
		
	}
	*/
	/*@Test
	
	public void getAllBillingAddressTestCase()
	{
		
		Assert.assertEquals("get all BillingAddress Test Case",1,billingAddressDAO.list().size());
	}
	*/
	
}
