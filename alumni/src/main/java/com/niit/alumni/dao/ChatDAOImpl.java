package com.niit.alumni.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.alumni.model.ChatMsg;


@Repository("chatDAO")
public class ChatDAOImpl implements ChatDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	public ChatDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Transactional
	public List<ChatMsg> list() {
		
		List<ChatMsg> listChatMsg = (List<ChatMsg>) 
		          sessionFactory.getCurrentSession()
				.createCriteria(ChatMsg.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listChatMsg;
	}
	@Transactional
	public void saveOrUpdate(ChatMsg chatMsg) {
		sessionFactory.getCurrentSession().saveOrUpdate(chatMsg);
	}
	@Transactional
	public void delete(String id) {
		ChatMsg ChatMsgToDelete = new ChatMsg();
		ChatMsgToDelete.setId(id);
	
		sessionFactory.getCurrentSession().delete(ChatMsgToDelete);
	}
	@Transactional
	public ChatMsg get(String id) {
		String hql = "from ChatMsg where id=" + "'"+id +"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<ChatMsg> listChatMsg = (List<ChatMsg>) query.list();
		
		if (listChatMsg != null && !listChatMsg.isEmpty()) {
			return listChatMsg.get(0);
		}
		
		return null;
	}
}
