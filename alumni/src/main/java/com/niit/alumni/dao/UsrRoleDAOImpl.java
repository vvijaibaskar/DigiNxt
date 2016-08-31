package com.niit.alumni.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.alumni.model.UsrRole;


@Repository("usrRoleDAO")
public class UsrRoleDAOImpl {
	@Autowired
	private SessionFactory sessionFactory;
	
	public UsrRoleDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<UsrRole> list() {
		
		List<UsrRole> listUsrRoles = (List<UsrRole>) 
		          sessionFactory.getCurrentSession()
				.createCriteria(UsrRole.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listUsrRoles;
	}
	@Transactional
	public void saveOrUpdate(UsrRole usrRole) {
		sessionFactory.getCurrentSession().saveOrUpdate(usrRole);
	}
	
	@Transactional
	public void delete(String usrId) {
		UsrRole UsrRoleToDelete = new UsrRole();
		UsrRoleToDelete.setUsrId(usrId);
	
		sessionFactory.getCurrentSession().delete(UsrRoleToDelete);
	}
	@Transactional
	public UsrRole get(String usrId) {
		String hql = "from UsrRole where usrId=" + "'"+ usrId +"'" ;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<UsrRole> listUsrRole = (List<UsrRole>) query.list();
		
		if (listUsrRole != null && !listUsrRole.isEmpty()) {
			return listUsrRole.get(0);
		}
		
		return null;
	}
	
	}


