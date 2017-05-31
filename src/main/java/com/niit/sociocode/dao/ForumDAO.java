package com.niit.sociocode.dao;

import java.util.List;

import com.niit.sociocode.model.Forum;

public interface ForumDAO {
	
	public boolean insertForum(Forum forum);
	
	public List<Forum> list();
	
	public boolean deleteForum(String id);
	
	public Forum getForumById(String id);

}
