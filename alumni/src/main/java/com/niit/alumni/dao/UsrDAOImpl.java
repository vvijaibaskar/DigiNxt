package com.niit.alumni.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.alumni.model.Usr;

@Repository("usrDAO")
public class UsrDAOImpl implements UsrDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public UsrDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Transactional
	public List<Usr> list() {
		
		List<Usr> listUsr = (List<Usr>) 
		          sessionFactory.getCurrentSession()
				.createCriteria(Usr.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listUsr;
	}
	@Transactional
	public void saveOrUpdate(Usr usr) {
		sessionFactory.getCurrentSession().saveOrUpdate(usr);
	}
	@Transactional
	public void delete(String id) {
		Usr UsrToDelete = new Usr();
		UsrToDelete.setId(id);
	
		sessionFactory.getCurrentSession().delete(UsrToDelete);
	}
	@Transactional
	public Usr get(String id) {
		String hql = "from Usr where id=" + "'"+id +"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Usr> listUsr = (List<Usr>) query.list();
		
		if (listUsr != null && !listUsr.isEmpty()) {
			return listUsr.get(0);
		}
		
		return null;
	}
	@Transactional
	public Usr getByName(String name) {
		String hql = "from Usr where name=" + "'"+ name +"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Usr> listUsr = (List<Usr>) query.list();
		
		if (listUsr != null && !listUsr.isEmpty()) {
			return listUsr.get(0);
		}
		
		return null;
	}

}
