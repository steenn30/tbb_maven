package com.tbb.dto;

import io.agora.media.RtcTokenBuilder;
import io.agora.media.RtcTokenBuilder.Role;

public class AgoraRepositoryDTO {
	
	static String appId = "195a1fb79f5f4544a6c2c906fa3d06fd";
	static String appCertificate = "ce630e3da85a4260a1ed9e24985e69bc";

	public String channelName;
	public int uid;
	public int expirationTimeInSeconds;
	public int role;
	
	
	public AgoraRepositoryDTO() {
		super();
	}
	
	public AgoraRepositoryDTO(String channelName, int uid, int expirationTimeInSeconds, int role) {
		super();
		this.channelName = channelName;
		this.uid = uid;
		this.expirationTimeInSeconds = expirationTimeInSeconds;
		this.role = role;
	}
	
	
	public static String getAppId() {
		return appId;
	}

	public static void setAppId(String appId) {
		AgoraRepositoryDTO.appId = appId;
	}

	public static String getAppCertificate() {
		return appCertificate;
	}

	public static void setAppCertificate(String appCertificate) {
		AgoraRepositoryDTO.appCertificate = appCertificate;
	}

	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getExpirationTimeInSeconds() {
		return expirationTimeInSeconds;
	}
	public void setExpirationTimeInSeconds(int expirationTimeInSeconds) {
		this.expirationTimeInSeconds = expirationTimeInSeconds;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "AgoraRepositoryDTO [channelName=" + channelName + ", uid=" + uid + ", expirationTimeInSeconds="
				+ expirationTimeInSeconds + ", role=" + role + "]";
	}
	
	

	
	

	
}
