package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.ShippingAddressDAO;
import com.niit.shoppingcart.model.ShippingAddress;

@Repository("shippingAddressDAO")
public class ShippingAddressDAOImpl implements ShippingAddressDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public ShippingAddressDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}

	@Transactional
	public boolean save(ShippingAddress shippingAddress) {
		try {
			if(get(shippingAddress.getId()) != null)
			{
				System.out.println("in if");
				return false;
			}
			System.out.println("in sucess");
			sessionFactory.getCurrentSession().save(shippingAddress);
			return true;
		} catch (HibernateException e) {
			System.out.println("in exc");
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	
	@Transactional
	public boolean update(ShippingAddress shippingAddress) {
		try {
			if(get(shippingAddress.getId())==null)
			{
				return false;
			}
			sessionFactory.getCurrentSession().update(shippingAddress);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	
	@Transactional
	public boolean delete(ShippingAddress shippingAddress) {
		try {
			if(get(shippingAddress.getId())==null)
			{
				return false;
			}
			sessionFactory.getCurrentSession().delete(shippingAddress);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	
	@Transactional
	public ShippingAddress get(String id) {
		return sessionFactory.openSession().get(ShippingAddress.class,id);
		
	}

	@Transactional
	public List<ShippingAddress> list() {
		String hql="from ShippingAddress";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

}
