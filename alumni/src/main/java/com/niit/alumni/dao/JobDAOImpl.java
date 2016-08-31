package com.niit.alumni.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.alumni.model.Job;


@Repository("jobDAO")
public class JobDAOImpl implements JobDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public JobDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Transactional
	public List<Job> list() {
		
		List<Job> listJobs = (List<Job>) 
		          sessionFactory.getCurrentSession()
				.createCriteria(Job.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listJobs;
	}
	
	@Transactional
	public void saveOrUpdate(Job job) {
		sessionFactory.getCurrentSession().saveOrUpdate(job);
	}
	
	@Transactional
	public void delete(String id) {
		Job JobToDelete = new Job();
		JobToDelete.setId(id);
	
		sessionFactory.getCurrentSession().delete(JobToDelete);
	}
	@Transactional
	public Job get(String id) {
		String hql = "from Job where id=" + "'" + id +"'" ;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Job> listJob = (List<Job>) query.list();
		
		if (listJob != null && !listJob.isEmpty()) {
			return listJob.get(0);
		}
		
		return null;
	}
	@Transactional
	public Job getByName(String jobTitle) {
		String hql = "from Job where jobTitle=" + "'"+ jobTitle +"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Job> listJob = (List<Job>) query.list();
		
		if (listJob != null && !listJob.isEmpty()) {
			return listJob.get(0);
		}
		
		return null;
	}
}
