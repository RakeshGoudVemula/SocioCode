package com.niit.sociocode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.niit.sociocode.dao.BlogCommentDAO;
import com.niit.sociocode.model.BlogComment;

@RestController
public class BlogCommentController {
	@Autowired
	BlogCommentDAO blogCommentDAO;
	@RequestMapping(value="/getBlogComments",method=RequestMethod.GET)
	public ResponseEntity<List<BlogComment>> getAllBlogCmments()
	{
		List<BlogComment> listblogComments=blogCommentDAO.list();
		return new ResponseEntity<List<BlogComment>>(listblogComments, HttpStatus.OK);
	}

}
