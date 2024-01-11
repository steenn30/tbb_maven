package com.tbb.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="public", name="comments")
public class Comment {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer commentId;
	
	@Column
	Integer postId;
	
	@Column
	String text;
	
	@Column 
	String replies;
	
	@Column
	Integer parentId;
	
	@Column
	Integer upvoteCount;
	
	@Column
	Integer downvoteCount;
	
	@Column
	Date dateTimeOfComment;

	public Integer getCommentId() {
		return commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getReplies() {
		return replies;
	}

	public void setReplies(String replies) {
		this.replies = replies;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getUpvoteCount() {
		return upvoteCount;
	}

	public void setUpvoteCount(Integer upvoteCount) {
		this.upvoteCount = upvoteCount;
	}

	public Integer getDownvoteCount() {
		return downvoteCount;
	}

	public void setDownvoteCount(Integer downvoteCount) {
		this.downvoteCount = downvoteCount;
	}

	public Date getDateTimeOfComment() {
		return dateTimeOfComment;
	}

	public void setDateTimeOfComment(Date dateTimeOfComment) {
		this.dateTimeOfComment = dateTimeOfComment;
	}

	public Comment(Integer commentId, Integer postId, String text, String replies, Integer parentId,
			Integer upvoteCount, Integer downvoteCount, Date dateTimeOfComment) {
		super();
		this.commentId = commentId;
		this.postId = postId;
		this.text = text;
		this.replies = replies;
		this.parentId = parentId;
		this.upvoteCount = upvoteCount;
		this.downvoteCount = downvoteCount;
		this.dateTimeOfComment = dateTimeOfComment;
	}
	
	public Comment() {
		super();
	}
	
	

}
