package com.niit.shoppingcart.dao.impl;
import java.util.List;

import org.hibernate.HibernateException;

import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.User;
@Service("userDAO")
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	public UserDAOImpl(SessionFactory sessionFactory)
	{
		 this.sessionFactory=sessionFactory;
	}

	@Transactional
	public boolean save(User user) {
		
		
		try
	{
			if(get(user.getEmailid())!=null)
			{
				return false;
			}
	sessionFactory.getCurrentSession().save(user);
	}
	catch(HibernateException e)
	{
		e.printStackTrace();
		return false;
	}
	return true;
}

@Transactional

public boolean update(User user) {
	try {
		if(get(user.getEmailid())==null)
		{
			return false;
		}
		sessionFactory.getCurrentSession().update(user);
	} catch (HibernateException e) {
		
		e.printStackTrace();
		return false;
	}		
	
	return true;
}
@Transactional
public User get(String id) {
	
	return sessionFactory.openSession().get(User.class, id);//get correct or null
	

}
@Transactional
public boolean delete(User user) {
	try {
		if(get(user.getEmailid())==null)
		{
			return false;
		}
		sessionFactory.getCurrentSession().delete(user);
	} catch (HibernateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
			return true;
}
@Transactional

public List<User> list() {
	String hql="from User";
	Query query=sessionFactory.getCurrentSession().createQuery(hql);
	
	return query.list();
}



	

}
