package com.tbb.entity;

import java.util.Date;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.repository.Temporal;

@Entity
@Table(schema="public", name="posts")
public class Post {
	@Id
	@Column(name="post_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer postId;
	
	@Column
	private Integer userId;
	
	@Column
	private String titleText;
	
	@Column
	private String bodyText;
	
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "postId")
//	private List<Hashtag> hashtagGroups;
//	
//	@Column
//	private Integer hashtagsId;
	
	@Column
	private Boolean isNsfw;
	
	@Column
	private Boolean isSpoiler;
	
	@Column 
	private Integer ashtrayId;
	
	@Column
	private Boolean postToProfile;
	
	@Column
	private String dateTimeOfPost;
	
	@Column
	private Integer commentId;
	
	@Column
	private String linkText;
	
	@Column
	private String imgPath;
	
	@Column
	private Integer postTypeId;

	

	public Post( Integer userId, String titleText, String bodyText, Boolean isNsfw, Boolean isSpoiler,
			Integer ashtrayId, Boolean postToProfile, String dateTimeOfPost, Integer commentId, String linkText,
			String imgPath, Integer postTypeId) {
		super();
		
		this.userId = userId;
		this.titleText = titleText;
		this.bodyText = bodyText;
		this.isNsfw = isNsfw;
		this.isSpoiler = isSpoiler;
		this.ashtrayId = ashtrayId;
		this.postToProfile = postToProfile;
		this.dateTimeOfPost = dateTimeOfPost;
		this.commentId = commentId;
		this.linkText = linkText;
		this.imgPath = imgPath;
		this.postTypeId = postTypeId;
	}





	public Post() {
		super();
		
	}
	
	

	

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

//	public List<Hashtag> getHashtagGroups() {
//		return hashtagGroups;
//	}
//
//	public void setHashtagGroups(List<Hashtag> hashtagGroups) {
//		this.hashtagGroups = hashtagGroups;
//	}

	public Boolean getIsNsfw() {
		return isNsfw;
	}

	public void setIsNsfw(Boolean isNsfw) {
		this.isNsfw = isNsfw;
	}

	public Boolean getIsSpoiler() {
		return isSpoiler;
	}

	public void setIsSpoiler(Boolean isSpoiler) {
		this.isSpoiler = isSpoiler;
	}

	public Integer getAshtrayId() {
		return ashtrayId;
	}

	public void setAshtrayId(Integer ashtrayId) {
		this.ashtrayId = ashtrayId;
	}

	public Boolean getPostToProfile() {
		return postToProfile;
	}

	public void setPostToProfile(Boolean postToProfile) {
		this.postToProfile = postToProfile;
	}

	public String getDateTimeOfPost() {
		return dateTimeOfPost;
	}

	public void setDateTimeOfPost(String dateTimeOfPost) {
		this.dateTimeOfPost = dateTimeOfPost;
	}

	public Integer getCommentId() {
		return commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public String getLinkText() {
		return linkText;
	}

	public void setLinkText(String linkText) {
		this.linkText = linkText;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public Integer getPostTypeId() {
		return postTypeId;
	}

	public void setPostTypeId(Integer postTypeId) {
		this.postTypeId = postTypeId;
	}





	@Override
	public String toString() {
		return "Post [postId=" + postId + ", userId=" + userId + ", titleText=" + titleText + ", bodyText=" + bodyText
				+ ", isNsfw=" + isNsfw + ", isSpoiler=" + isSpoiler + ", ashtrayId=" + ashtrayId + ", postToProfile="
				+ postToProfile + ", dateTimeOfPost=" + dateTimeOfPost + ", commentId=" + commentId + ", linkText="
				+ linkText + ", imgPath=" + imgPath + ", postTypeId=" + postTypeId + "]";
	}

	
	
	
	
	
	
	

	
}
	
	
	
	
	


	
	
	

	
	
	
	
	
	
//	username: string | undefined;
//titleText: string | undefined;
//bodyText: string | undefined;
//hashtags: string[] | undefined;
//isNSFW: boolean | undefined;
//isSpoiler: boolean | undefined;
//ashtrayName: string | undefined;
//postToProfile: boolean | undefined;
//dateTimeOfPost: Date;
//comments: Comment[];
//	linkText: string | undefined;
//	  imgPath: string | undefined;


