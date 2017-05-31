package com.niit.sociocode.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.sociocode.dao.BlogCommentDAO;
import com.niit.sociocode.model.Blog;
import com.niit.sociocode.model.BlogComment;

@Repository("blogCommentDAO")
@Transactional
public class BlogCommentDAOImpl implements BlogCommentDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public BlogCommentDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean insertBlogComment(BlogComment blogComment) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(blogComment);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@SuppressWarnings("unchecked")
	public List<BlogComment> list() {

		return sessionFactory.getCurrentSession().createQuery("from Blog").list();

	}

	public boolean deleteBlogComment(String id) {
		try {
			sessionFactory.getCurrentSession().delete(id);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public Blog getBlogCommentById(String id) {

		return (Blog) sessionFactory.getCurrentSession().get(Blog.class, id);
	}

}
