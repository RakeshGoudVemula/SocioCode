package com.niit.sociocode.dao;

import java.util.List;

import com.niit.sociocode.model.Forum;
import com.niit.sociocode.model.ForumComment;

public interface ForumCommentDAO 
{
	
public boolean insertForumComment(ForumComment forumComment);
	
	public List<ForumComment> list();
	
	public boolean deleteForumComment(String id);
	
	public Forum getForumCommentById(String id);

}
