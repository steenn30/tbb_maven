package com.tbb.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="public", name="sesh")
public class Sesh {


	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer chatRoomId;
	
	@Column
	private String seshName;
	
	@Column
	private String hostName;
	
	@Column
	private Integer seatsFilled;
	
	@Column
	private Integer seatsAvailable;
	
	@Column
	private String startTime;
	
	@Column
	private Integer postId;
	
	@Column
	private Integer chatThreadId;

	public Sesh(String seshName, String hostName, Integer seatsFilled, Integer seatsAvailable,
			String startTime, Integer postId, Integer chatThreadId) {
		super();
		
		this.seshName = seshName;
		this.hostName = hostName;
		this.seatsFilled = seatsFilled;
		this.seatsAvailable = seatsAvailable;
		this.startTime = startTime;
		this.postId = postId;
		this.chatThreadId = chatThreadId;
	}
	
	public Sesh() {
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

	public Integer getChatThreadId() {
		return chatThreadId;
	}

	public void setChatThreadId(Integer chatThreadId) {
		this.chatThreadId = chatThreadId;
	}

	@Override
	public String toString() {
		return "Sesh [chatRoomId=" + chatRoomId + ", seshName=" + seshName + ", hostName=" + hostName + ", seatsFilled="
				+ seatsFilled + ", seatsAvailable=" + seatsAvailable + ", startTime=" + startTime + ", postId=" + postId
				+ ", chatThreadId=" + chatThreadId + "]";
	}

	 
	
	
	
	
	
}
