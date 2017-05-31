package com.niit.sociocode.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.sociocode.dao.ForumDAO;
import com.niit.sociocode.model.Forum;

@Repository("forumDAO")
@Transactional
public class ForumDAOImpl implements ForumDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public ForumDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean insertForum(Forum forum) {

		try {
			sessionFactory.getCurrentSession().saveOrUpdate(forum);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;

	}

	@SuppressWarnings("unchecked")
	public List<Forum> list() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Forum").list();
	}

	public boolean deleteForum(String id) {
		try {
			sessionFactory.getCurrentSession().delete(id);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public Forum getForumById(String id) {
		// TODO Auto-generated method stub
		return (Forum) sessionFactory.getCurrentSession().get(Forum.class, id);
	}

}
