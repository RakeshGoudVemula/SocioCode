package com.niit.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.sociocode.dao.BlogDAO;
import com.niit.sociocode.model.Blog;

public class BlogTestCase {
	
	@Autowired
	static AnnotationConfigApplicationContext context;
	@Autowired
	static BlogDAO blogDAO;
	@Autowired
	static Blog blog;

	@BeforeClass
	public static void initialize() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.sociocode");
		context.refresh();
		blogDAO = (BlogDAO) context.getBean("blogDAO");
		blog = (Blog) context.getBean("blog");
	}
	
	@Test
	public void createBlogTestCase() {
		blog.setBlogid(1011);
		blog.setBlogname("Enumeration1");
		blog.setBlogcontent("Enumeration has added in jdk 1.20 version");
		blog.setUserid(1013);
		blog.setLikes(12);
		blog.setCreateDate(new Date());
		boolean flag=blogDAO.insertBlog(blog);
		assertEquals("createBlogTestCase",flag,true);
		
	}
}
