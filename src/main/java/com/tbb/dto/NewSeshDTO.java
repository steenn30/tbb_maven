package com.tbb.dto;

import java.util.Arrays;

import com.tbb.entity.Comment;

public class NewSeshDTO {

	
	private Integer chatRoomId;
	
	private String seshName;
	
	private String hostName;
	
	private Integer seatsFilled;
	
	private Integer seatsAvailable;
	
	private String startTime;
	
	private Integer postId;
	
	private Comment[] comments;
	
	
	public NewSeshDTO(Integer chatRoomId, String seshName, String hostName, Integer seatsFilled,
			Integer seatsAvailable, String startTime, Integer postId, Comment[] comments) {
		super();
		this.chatRoomId = chatRoomId;
		this.seshName = seshName;
		this.hostName = hostName;
		this.seatsFilled = seatsFilled;
		this.seatsAvailable = seatsAvailable;
		this.startTime = startTime;
		this.postId = postId;
		this.comments = comments;
	}
	
	public NewSeshDTO() {
		super();
		
	}

	public Integer getChatRoomId() {
		return chatRoomId;
	}

	public void setChatRoomId(Integer chatRoomId) {
		this.chatRoomId = chatRoomId;
	}

	public String getSeshName() {
		return seshName;
	}

	public void setSeshName(String seshName) {
		this.seshName = seshName;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public Integer getSeatsFilled() {
		return seatsFilled;
	}

	public void setSeatsFilled(Integer seatsFilled) {
		this.seatsFilled = seatsFilled;
	}

	public Integer getSeatsAvailable() {
		return seatsAvailable;
	}

	public void setSeatsAvailable(Integer seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public Comment[] getComments() {
		return comments;
	}

	public void setComments(Comment[] comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "NewSeshDTO [chatRoomId=" + chatRoomId + ", seshName=" + seshName + ", hostName=" + hostName
				+ ", seatsFilled=" + seatsFilled + ", seatsAvailable=" + seatsAvailable + ", startTime=" + startTime
				+ ", postId=" + postId + ", comments=" + Arrays.toString(comments) + "]";
	}
	
	
		
		
}
