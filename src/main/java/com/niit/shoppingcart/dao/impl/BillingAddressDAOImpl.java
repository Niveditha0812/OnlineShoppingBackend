package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.BillingAddressDAO;
import com.niit.shoppingcart.model.BillingAddress;

@Repository("billingAddressDAO")
public class BillingAddressDAOImpl implements BillingAddressDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public BillingAddressDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}

	@Transactional
	public boolean save(BillingAddress billingAddress) {
		try {
			if(get(billingAddress.getId()) != null)
			{
				System.out.println("in if");
				return false;
			}
			System.out.println("in sucess");
			sessionFactory.getCurrentSession().save(billingAddress);
			return true;
		} catch (HibernateException e) {
			System.out.println("in exc");
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	
	@Transactional
	public boolean update(BillingAddress billingAddress) {
		try {
			if(get(billingAddress.getId())==null)
			{
				return false;
			}
			sessionFactory.getCurrentSession().update(billingAddress);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	
	@Transactional
	public boolean delete(BillingAddress billingAddress) {
		try {
			if(get(billingAddress.getId())==null)
			{
				return false;
			}
			sessionFactory.getCurrentSession().delete(billingAddress);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	
	@Transactional
	public BillingAddress get(String id) {
		return sessionFactory.openSession().get(BillingAddress.class,id);
		
	}

	@Transactional
	public List<BillingAddress> list() {
		String hql="from BillingAddress";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

}
