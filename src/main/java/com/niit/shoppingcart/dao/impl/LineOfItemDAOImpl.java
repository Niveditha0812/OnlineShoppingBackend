package com.niit.shoppingcart.dao.impl;

import java.util.List;
import org.hibernate.HibernateException;
//import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.hibernate.Session;
//import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.LineOfItemDAO;
import com.niit.shoppingcart.model.LineOfItem;


 @Repository ("lineOfItemDAO")
public class LineOfItemDAOImpl implements LineOfItemDAO{
	 
	
	 
	 private SessionFactory sessionFactory;
	 
	 @Autowired
   public LineOfItemDAOImpl(SessionFactory sessionFactory)
	{
		
		 this.sessionFactory=sessionFactory;
	}

	@Transactional
	public boolean save(LineOfItem lineOfItem) {
		try
		{
			if(get(lineOfItem.getId())!=null)
			{
				return false;
			}
		sessionFactory.getCurrentSession().save(lineOfItem);
		
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	@Transactional

	public boolean update(LineOfItem lineOfItem) {
		try {
			if(get(lineOfItem.getId())==null)
			{
				return false;
			}
			
			sessionFactory.getCurrentSession().update(lineOfItem);
			
					
		} catch (HibernateException e) {
			
			e.printStackTrace();
			return false;
		}		
		
		return true;
	}
	@Transactional
	public LineOfItem get(String id) {
		
		return sessionFactory.openSession().get(LineOfItem.class, id);//get correct or null
		

	}
	@Transactional
	public boolean delete(LineOfItem lineOfItem) {
		try {
			if(get(lineOfItem.getId())==null)
			{return false;
			}
			
			sessionFactory.getCurrentSession().delete(lineOfItem);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
				return true;
	}
	@Transactional

	public List<LineOfItem> list() {
		String hql="from LineOfItem";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		
		return query.list();
	}

}
