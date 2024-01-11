package com.tbb.dto;

import java.util.Arrays;

import org.json.simple.JSONArray;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class NewLinkPostDTO {
	private String username;
	
	private String titleText;
	
	private String hashtags;
	
	//private String[] hashtagsArray;
	
	private Boolean isNSFW;
	
	private Boolean isSpoiler;
	
	private String ashtrayName;
	
	private Boolean postToProfile;
	
	private String linkText;
	
	private String imgPath;

	public NewLinkPostDTO(String username, String titleText, String hashtags, Boolean isNSFW,
			Boolean isSpoiler, String ashtrayName, Boolean postToProfile, String linkText, String imgPath) {
		super();
		//String hashtagsAsArray[] = Arrays.asList(hashtags.substring(1, hashtags.length()-1)).toArray(new String[0]);
		this.hashtags = hashtags;
		this.username = username;
		this.titleText = titleText;
	
		this.isNSFW = isNSFW;
		this.isSpoiler = isSpoiler;
		this.ashtrayName = ashtrayName;
		this.postToProfile = postToProfile;
		this.linkText = linkText;
		this.imgPath = imgPath;
	}

	public NewLinkPostDTO() {
		super();
		
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

	public String getHashtags() {
		return hashtags;
	}

	public void setHashtags(String hashtags) {
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

	@Override
	public String toString() {
		return "NewLinkPostDTO [username=" + username + ", titleText=" + titleText 
				+ ", hashtags=" + hashtags + ", isNSFW=" + isNSFW + ", isSpoiler=" + isSpoiler
				+ ", ashtrayName=" + ashtrayName + ", postToProfile=" + postToProfile + ", linkText=" + linkText
				+ ", imgPath=" + imgPath + "]";
	}
	
	
	
	
	
}
