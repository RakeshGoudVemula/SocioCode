package com.niit.sociocode.dao;

import java.util.List;

import com.niit.sociocode.model.Blog;

public interface BlogDAO
{
	
	public boolean insertBlog(Blog blog);
	
	public List<Blog> list();
	
	public boolean deleteBlog(String id);
	
	public Blog getBlogById(String id);

}
