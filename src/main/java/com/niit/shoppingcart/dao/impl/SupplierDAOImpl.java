package com.niit.shoppingcart.dao.impl;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Supplier;

@Repository("supplierDAO")
public class SupplierDAOImpl implements SupplierDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public SupplierDAOImpl(SessionFactory sessionFactory)
	{
		 this.sessionFactory=sessionFactory;
	}

	@Transactional
	public boolean save(Supplier supplier) {
		try
		{
			if(get(supplier.getId())!=null)
			{
				return false;
			}
		sessionFactory.getCurrentSession().save( supplier);
		
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	@Transactional

	public boolean update(Supplier supplier) {
		try {
			if(get(supplier.getId())==null)
			{
				
				return false;
			}
			sessionFactory.getCurrentSession().update(supplier);
			
			
		} catch (HibernateException e) {
			
			e.printStackTrace();
			return false;
		}		
		
		return true;
	}
	@Transactional
	public Supplier get(String id) {
		
		return sessionFactory.openSession().get(Supplier.class, id);//get correct or null
		

	}
	@Transactional
	public boolean delete(Supplier supplier) {
		try {
			if(get(supplier.getId())==null)
			{return false;
			}
			sessionFactory.getCurrentSession().delete(supplier);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
				return true;
	}
	@Transactional

	public List<Supplier> list() {
		String hql="from Supplier";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		
		return query.list();
	}



}
