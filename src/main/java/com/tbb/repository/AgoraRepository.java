package com.tbb.repository;

import org.springframework.stereotype.Service;


public class AgoraRepository {
//	static String appId = "APP_ID";
//    static String appCertificate ="APP_CERIFICATE";
     static String appId = "195a1fb79f5f4544a6c2c906fa3d06fd";
     static String appCertificate = "ce630e3da85a4260a1ed9e24985e69bc";
    private String channelName="Hshsh";
    private int uid = 0; // By default 0
    private int expirationTimeInSeconds = 3600; // By default 3600
    private int role = 2; // By default subscriber
    
    
    
	public AgoraRepository(String channelName, int uid, int expirationTimeInSeconds, int role) {
		super();
		this.channelName = channelName;
		this.uid = uid;
		this.expirationTimeInSeconds = expirationTimeInSeconds;
		this.role = role;
	}
	public AgoraRepository() {
		super();
		
	}
	public static String getAppId() {
		return appId;
	}
	public static void setAppId(String appId) {
		AgoraRepository.appId = appId;
	}
	public static String getAppCertificate() {
		return appCertificate;
	}
	public static void setAppCertificate(String appCertificate) {
		AgoraRepository.appCertificate = appCertificate;
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
    
    
}
