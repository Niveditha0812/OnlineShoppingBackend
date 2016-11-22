package com.niit.shoppingcart;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.niit.shoppingcart.config.ApplicationContextConfig;
import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.model.Product;



public class ProductTestCase {
	//ClassPathXmlApplicationContext
	

	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static Product product;
	
	@Autowired
	static ProductDAO productDAO;
	

	
	@BeforeClass
	public static void  init()
	{
		
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();
		product =(Product)context.getBean("product");
		productDAO =(ProductDAO)context.getBean("productDAO");
		
	}
	
	//start writing JUnit test cases 
	//for each method in DAO
	
	
	
	
	/*@Test
	public void createProductTestCase()
	{
		product.setId("PRO 01");
		product.setName("salwar suit");
		product.setDescription("manish malhotra");
		product.setRate(new Integer(1000));
		product.setCategory_id("ETH 03");
		product.setSupplier_id("SUP101");
		Boolean status= productDAO.save(product);
		Assert.assertEquals("create product Test Case",true,status);
		
	}*/
	
	/*@Test
	public void deleteProductTestCase()
	{
	
		product.setId("PRO 01");
		Boolean status= productDAO.delete(product);
		Assert.assertEquals("delete Product Test Case",true,status);
		
	}*/
	
/* @Test
	public void updateProductTestCase()
	{
		product.setId("PRO 01");
		product.setName("saree");
		product.setDescription("manish malhotra");
		product.setRate(new Integer(2000));
		product.setCategory_id("ETH 03");
		product.setSupplier_id("SUP101");
		Boolean status= productDAO.update(product);
		Assert.assertEquals("update Product Test Case",true,status);
		
	}
	*/
	/* @Test
	public void getProductTestCase()
	{
		
	//negative scenario
		Assert.assertEquals("get Product Test Case",null,productDAO.get("ETH 078"));
		
	}*/
	
	/*@Test
	
	public void getAllProductTestCase()
	{
		
		Assert.assertEquals("get all Product Test Case",1,productDAO.list().size());
	}
	*/
	
}
