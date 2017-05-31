package com.niit.sociocode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.niit.sociocode.dao.ForumCommentDAO;
import com.niit.sociocode.model.ForumComment;

@RestController
public class ForumCommentController {
	@Autowired
	ForumCommentDAO forumCommentDAO;
	@RequestMapping(value="/getForumComments",method=RequestMethod.GET)
	public ResponseEntity<List<ForumComment>> getAllForumCmments()
	{
		List<ForumComment> listforumComments=forumCommentDAO.list();
		return new ResponseEntity<List<ForumComment>>(listforumComments, HttpStatus.OK);
	}

}
