package com.niit.shoppingcart;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.niit.shoppingcart.config.ApplicationContextConfig;
import com.niit.shoppingcart.dao.CartDAO;
import com.niit.shoppingcart.model.Cart;



public class CartTestCase {
	//ClassPathXmlApplicationContext
	

	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static Cart cart;
	
	@Autowired
	static CartDAO cartDAO;
	

	
	@BeforeClass
	public static void  init()
	{
		
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();
		cart =(Cart)context.getBean("cart");
		cartDAO =(CartDAO)context.getBean("cartDAO");
		
	}
	
	//start writing JUnit test cases 
	//for each method in DAO
	
	
	
	
	/*@Test
	public void createCartTestCase()
	{
		cart.setId("CAR 01");
		cart.setOrder_id("ORD 01");
		cart.setPayment_method_mode("cash on delivery");
		cart.setBilling_address_id("BIL 01");
		cart.setShipping_address_id("SHI 01");
		Boolean status= cartDAO.save(cart);
		Assert.assertEquals("create cart Test Case",true,status);
		
	}*/
	
/*@Test
	public void deleteCartTestCase()
	{
	
		cart.setId("CAR 01");
		Boolean status= cartDAO.delete(cart);
		Assert.assertEquals("delete Cart Test Case",true,status);
		
	}*/
	
/* @Test
	public void updateCartTestCase()
	{
	 
		cart.setId("CAR 01");
		cart.setOrder_id("ORD 01");
		cart.setPayment_method_mode("card");
		cart.setBilling_address_id("BIL 01");
		cart.setShipping_address_id("SHI 01");
		Boolean status= cartDAO.update(cart);
		Assert.assertEquals("update Cart Test Case",true,status);
		
	}*/
	
	/* @Test
	public void getCartTestCase()
	{
		
	//negative scenario
		Assert.assertEquals("get Cart Test Case",null,cartDAO.get("ETH 078"));
		
	}
	*/
	/*@Test
	
	public void getAllCartTestCase()
	{
		
		Assert.assertEquals("get all Cart Test Case",1,cartDAO.list().size());
	}*/
	
	
}
