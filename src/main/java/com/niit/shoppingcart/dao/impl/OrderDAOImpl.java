package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.OrderDAO;
import com.niit.shoppingcart.model.Order;

@Repository("orderDAO")
public class OrderDAOImpl implements OrderDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public OrderDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}

	@Transactional
	public boolean save(Order order) {
		try {
			if(get(order.getId()) != null)
			{
				System.out.println("in if");
				return false;
			}
			System.out.println("in sucess");
			sessionFactory.getCurrentSession().save(order);
			return true;
		} catch (HibernateException e) {
			System.out.println("in exc");
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	
	@Transactional
	public boolean update(Order order) {
		try {
			if(get(order.getId())==null)
			{
				return false;
			}
			sessionFactory.getCurrentSession().update(order);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	
	@Transactional
	public boolean delete(Order order) {
		try {
			if(get(order.getId())==null)
			{
				return false;
			}
			sessionFactory.getCurrentSession().delete(order);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	
	@Transactional
	public Order get(String id) {
		return sessionFactory.openSession().get(Order.class,id);
		
	}

	@Transactional
	public List<Order> list() {
		String hql="from Order";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

}
