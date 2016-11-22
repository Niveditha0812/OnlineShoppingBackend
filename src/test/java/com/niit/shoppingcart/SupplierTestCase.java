package com.niit.shoppingcart;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Supplier;

public class SupplierTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static Supplier supplier;

	@Autowired
	static SupplierDAO supplierDAO;

	@BeforeClass
	public static void init1() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();
		supplier = (Supplier) context.getBean("supplier");
		supplierDAO = (SupplierDAO) context.getBean("supplierDAO");

	}

	/*@Test
	public void createSupplierTestCase() {
		supplier.setId("SUP104");
		supplier.setName("Chandrashekar Enterprises");
		supplier.setAddress("Rajajinagar Bangalore");
		Boolean status = supplierDAO.save(supplier);
		Assert.assertEquals("create supplier test case", true, status);
	}
*/
	
	/* @Test public void updateSupplierTestCase()
	 { 
		 supplier.setId("SUP101");
	  supplier.setName("Hari Enterprises"); 
	  supplier.setAddress("Basavanagudi Bangalore");
	  Boolean status=supplierDAO.update(supplier);
	  Assert.assertEquals("create supplier test case",true,status);
	  } */
	 
	/* @Test public void deleteSupplierTestCase() 
	 { 
		 supplier.setId("SUP103");
	 Boolean status = supplierDAO.delete(supplier);
	  Assert.assertEquals("delete supplier test case", true,status);
	  }
*/
	 /* @Test public void getSupplierTestCase()
	  *  {
	  Assert.assertEquals("get supplier test case ",null,supplierDAO.get("12345") );
	  } */
	 
	 /* @Test public void getAllSupplierTestCase()
	  {
	  Assert.assertEquals("get all supplier test case",4,supplierDAO.list().size()); 
	  }*/
	
	 
}
