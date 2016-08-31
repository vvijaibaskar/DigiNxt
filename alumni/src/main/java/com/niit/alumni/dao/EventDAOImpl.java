package com.niit.alumni.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.alumni.model.Event;

@Repository("eventDAO")
public class EventDAOImpl implements EventDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public EventDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Transactional
	public List<Event> list() {
		
		List<Event> listEvent = (List<Event>) 
		          sessionFactory.getCurrentSession()
				.createCriteria(Event.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listEvent;
	}
	@Transactional
	public void saveOrUpdate(Event event) {
		sessionFactory.getCurrentSession().saveOrUpdate(event);
	}
	@Transactional
	public void delete(String id) {
		Event EventToDelete = new Event();
		EventToDelete.setId(id);
	
		sessionFactory.getCurrentSession().delete(EventToDelete);
	}
	@Transactional
	public Event get(String id) {
		String hql = "from Event where id=" + "'"+ id +"'" ;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Event> listEvent = (List<Event>) query.list();
		
		if (listEvent != null && !listEvent.isEmpty()) {
			return listEvent.get(0);
		}
		
		return null;
	}

}
