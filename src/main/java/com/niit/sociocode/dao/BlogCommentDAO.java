package com.niit.sociocode.dao;

import java.util.List;

import com.niit.sociocode.model.Blog;
import com.niit.sociocode.model.BlogComment;

public interface BlogCommentDAO
{
    public boolean insertBlogComment(BlogComment blogComment);
	
	public List<BlogComment> list();
	
	public boolean deleteBlogComment(String id);
	
	public Blog getBlogCommentById(String id);

}
