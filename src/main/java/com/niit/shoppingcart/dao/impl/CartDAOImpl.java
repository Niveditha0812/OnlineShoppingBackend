package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.CartDAO;
import com.niit.shoppingcart.model.Cart;

@Repository("cartDAO")
public class CartDAOImpl implements CartDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public CartDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}

	@Transactional
	public boolean save(Cart cart) {
		try {
			if(get(cart.getId()) != null)
			{
				System.out.println("in if");
				return false;
			}
			System.out.println("in sucess");
			sessionFactory.getCurrentSession().save(cart);
			return true;
		} catch (HibernateException e) {
			System.out.println("in exc");
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	
	@Transactional
	public boolean update(Cart cart) {
		try {
			if(get(cart.getId())==null)
			{
				return false;
			}
			sessionFactory.getCurrentSession().update(cart);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	
	@Transactional
	public boolean delete(Cart cart) {
		try {
			if(get(cart.getId())==null)
			{
				return false;
			}
			sessionFactory.getCurrentSession().delete(cart);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	
	@Transactional
	public Cart get(String id) {
		return sessionFactory.openSession().get(Cart.class,id);
		
	}

	@Transactional
	public List<Cart> list() {
		String hql="from Cart";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

}
