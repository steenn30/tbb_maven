package com.tbb.dto;

import java.sql.Date;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Id;

import com.tbb.entity.Comment;

public class NewTextPostDTO {
	
	private Integer postId;
	
	
	private String username;
	
	
	private String titleText;
	
	
	private String bodyText;
	
	
	private String[] hashtags;
	
	
	private Boolean isNSFW;
	
	
	private Boolean isSpoiler;
	
	
	private String ashtrayName;
	
	
	private Boolean postToProfile;
	
	


	public NewTextPostDTO(Integer postId, String username, String titleText, String bodyText, String[] hashtags,
			Boolean isNSFW, Boolean isSpoiler, String ashtrayName, Boolean postToProfile) {
		super();
		this.postId = postId;
		this.username = username;
		this.titleText = titleText;
		this.bodyText = bodyText;
		this.hashtags = hashtags;
		this.isNSFW = isNSFW;
		this.isSpoiler = isSpoiler;
		this.ashtrayName = ashtrayName;
		this.postToProfile = postToProfile;
	}
	
	public NewTextPostDTO() {
		super();
		
	}


	public Integer getPostId() {
		return postId;
	}


	public void setPostId(Integer postId) {
		this.postId = postId;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getTitleText() {
		return titleText;
	}


	public void setTitleText(String titleText) {
		this.titleText = titleText;
	}


	public String getBodyText() {
		return bodyText;
	}


	public void setBodyText(String bodyText) {
		this.bodyText = bodyText;
	}


	public String[] getHashtags() {
		return hashtags;
	}


	public void setHashtags(String[] hashtags) {
		this.hashtags = hashtags;
	}


	public Boolean getIsNSFW() {
		return isNSFW;
	}


	public void setIsNSFW(Boolean isNSFW) {
		this.isNSFW = isNSFW;
	}


	public Boolean getIsSpoiler() {
		return isSpoiler;
	}


	public void setIsSpoiler(Boolean isSpoiler) {
		this.isSpoiler = isSpoiler;
	}


	public String getAshtrayName() {
		return ashtrayName;
	}


	public void setAshtrayName(String ashtrayName) {
		this.ashtrayName = ashtrayName;
	}


	public Boolean getPostToProfile() {
		return postToProfile;
	}


	public void setPostToProfile(Boolean postToProfile) {
		this.postToProfile = postToProfile;
	}

	@Override
	public String toString() {
		return "NewTextPostDTO [postId=" + postId + ", username=" + username + ", titleText=" + titleText
				+ ", bodyText=" + bodyText + ", hashtags=" + Arrays.toString(hashtags) + ", isNSFW=" + isNSFW
				+ ", isSpoiler=" + isSpoiler + ", ashtrayName=" + ashtrayName + ", postToProfile=" + postToProfile
				+ "]";
	}
	
	
	
	
	
//	@Column
//	private Date dateTimeOfPost;
//	
//	@Column
//	private Comment[] comments;
//	
//	@Column
//	private String linkText;
//	
//	@Column
//	private String imgPath;
}
