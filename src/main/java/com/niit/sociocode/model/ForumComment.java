package com.niit.sociocode.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table
public class ForumComment {

	@Id
	private int forumCommentId;
	private int forumId;
	private String forumComment;
	private Date commentDate;
	private int userId;
	private String username;


	public int getForumCommentId() {
		return forumCommentId;
	}

	public void setForumCommentId(int forumCommentId) {
		this.forumCommentId = forumCommentId;
	}

	public int getForumId() {
		return forumId;
	}

	public void setForumId(int forumId) {
		this.forumId = forumId;
	}

	public String getForumComment() {
		return forumComment;
	}

	public void setForumComment(String forumComment) {
		this.forumComment = forumComment;
	}

	public Date getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
