package com.niit.sociocode.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.niit.sociocode.dao.BlogDAO;
import com.niit.sociocode.model.Blog;

@RestController
public class BlogController 
{
	@Autowired
	BlogDAO blogDAO;
	@RequestMapping(value="/getBlogs",method=RequestMethod.GET)
	public ResponseEntity<List<Blog>> getAllBlogs()
	{
		List<Blog> listblogs=blogDAO.list();
		return new ResponseEntity<List<Blog>>(listblogs, HttpStatus.OK);
	}
	
	//Inserting the Blog
	@RequestMapping(value="/insertBlog",method=RequestMethod.POST)
	public ResponseEntity<String> addBlog(@RequestBody Blog blog)
	{	
		blog.setCreateDate(new Date());
		blog.setLikes(0);
		blog.setUserid(1002);
		blog.setStatus("NA");
		
		blogDAO.insertBlog(blog);
		
		return new ResponseEntity<String>("Successfully Inserted",HttpStatus.OK);
	}
	
	@RequestMapping(value="/deleteBlog{blogid}",method=RequestMethod.DELETE)
	public ResponseEntity<String> deleteBlog(@PathVariable("blogid") int blogid)
	{
		return	new ResponseEntity<String>("Deleted Blog Successfully",HttpStatus.OK);
	}
	/*@RequestMapping(value="/updateBlog{blogid}",method=RequestMethod.DELETE)
	public ResponseEntity<Blog> updateBlog(@PathVariable("blogid") int blogid,@RequestBody Blog blog)
	{

		Blog curr_blog=blogDAO.getBlogById(id);
		blog.setBlogcontent(blog.getBlogcontent());
		blogDAO.insertBlog(curr_blog);
		return new ResponseEntity<Blog>(curr_blog,HttpStatus.OK);
		
	}*/
	

}
