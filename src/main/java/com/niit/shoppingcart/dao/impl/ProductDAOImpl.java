package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.model.Product;

@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public ProductDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}

	@Transactional
	public boolean save(Product product) {
		try {
			if(get(product.getId()) != null)
			{
				System.out.println("in if");
				return false;
			}
			System.out.println("in sucess");
			sessionFactory.getCurrentSession().save(product);
			return true;
		} catch (HibernateException e) {
			System.out.println("in exc");
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	
	@Transactional
	public boolean update(Product product) {
		try {
			if(get(product.getId())==null)
			{
				return false;
			}
			sessionFactory.getCurrentSession().update(product);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	
	@Transactional
	public boolean delete(Product product) {
		try {
			if(get(product.getId())==null)
			{
				return false;
			}
			sessionFactory.getCurrentSession().delete(product);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	
	@Transactional
	public Product get(String id) {
		return sessionFactory.openSession().get(Product.class,id);
		
	}

	@Transactional
	public List<Product> list() {
		String hql="from Product";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

}
