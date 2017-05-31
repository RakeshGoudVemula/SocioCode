package com.niit.sociocode.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.sociocode.dao.ForumCommentDAO;
import com.niit.sociocode.model.Forum;
import com.niit.sociocode.model.ForumComment;

@Repository("forumCommentDAO")
@Transactional
public class ForumCommentDAOImpl implements ForumCommentDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public ForumCommentDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean insertForumComment(ForumComment forumComment) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(forumComment);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@SuppressWarnings("unchecked")
	public List<ForumComment> list() {

		return sessionFactory.getCurrentSession().createQuery("from Forum").list();

	}

	public boolean deleteForumComment(String id) {
		try {
			sessionFactory.getCurrentSession().delete(id);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public Forum getForumCommentById(String id) {

		return (Forum) sessionFactory.getCurrentSession().get(Forum.class, id);
	}

}
