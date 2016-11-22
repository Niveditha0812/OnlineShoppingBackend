package com.niit.shoppingcart;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.niit.shoppingcart.config.ApplicationContextConfig;
import com.niit.shoppingcart.dao.OrderDAO;
import com.niit.shoppingcart.model.Order;



public class OrderTestCase {
	//ClassPathXmlApplicationContext
	

	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static Order order;
	
	@Autowired
	static OrderDAO orderDAO;
	

	
	@BeforeClass
	public static void  init()
	{
		
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();
		order =(Order)context.getBean("order");
		orderDAO =(OrderDAO)context.getBean("orderDAO");
		
	}
	
	//start writing JUnit test cases 
	//for each method in DAO
	
	
	
/*	
	@Test
	public void createOrderTestCase()
	{
		order.setId("ORD 01");
		order.setLine_of_id("LOI 01");
		order.setStatus("in shipping");
		order.setTotal(new Integer(2000));
		Boolean status= orderDAO.save(order);
		Assert.assertEquals("create order Test Case",true,status);
		
	}
	*/
/*	@Test
	public void deleteOrderTestCase()
	{
	
		order.setId("PRO 01");
		Boolean status= orderDAO.delete(order);
		Assert.assertEquals("delete Order Test Case",true,status);
		
	}*/
	
 /*@Test
	public void updateOrderTestCase()
	{
	 order.setId("ORD 01");
		order.setLine_of_id("LOI 01");
		order.setStatus("delivered");
		order.setTotal(new Integer(2000));
		Boolean status= orderDAO.update(order);
		Assert.assertEquals("update Order Test Case",true,status);
		
	}*/
	
	/* @Test
	public void getOrderTestCase()
	{
		
	//negative scenario
		Assert.assertEquals("get Order Test Case",null,orderDAO.get("ETH 078"));
		
	}
	*/
	/*@Test
	
	public void getAllOrderTestCase()
	{
		
		Assert.assertEquals("get all Order Test Case",1,orderDAO.list().size());
	}
	*/
	
}
