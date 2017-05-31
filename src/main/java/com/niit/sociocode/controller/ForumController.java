package com.niit.sociocode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.niit.sociocode.dao.ForumDAO;
import com.niit.sociocode.model.Forum;

@RestController
public class ForumController 
{
	@Autowired
	ForumDAO forumDAO;
	@RequestMapping(value="/getForums",method=RequestMethod.GET)
	public ResponseEntity<List<Forum>> getAllForums()
	{
		List<Forum> listforums=forumDAO.list();
		return new ResponseEntity<List<Forum>>(listforums, HttpStatus.OK);
	}

}
