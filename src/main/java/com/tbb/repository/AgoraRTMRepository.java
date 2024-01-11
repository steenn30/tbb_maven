package com.tbb.repository;

import org.springframework.stereotype.Service;


public class AgoraRTMRepository {
	 	private static String appId = "195a1fb79f5f4544a6c2c906fa3d06fd";
	    private static String appCertificate = "ce630e3da85a4260a1ed9e24985e69bc";
	    private String userId;
	    private int expireTimestamp = 0;
	    
		public static String getAppId() {
			return appId;
		}
		public static void setAppId(String appId) {
			AgoraRTMRepository.appId = appId;
		}
		public static String getAppCertificate() {
			return appCertificate;
		}
		public static void setAppCertificate(String appCertificate) {
			AgoraRTMRepository.appCertificate = appCertificate;
		}
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public int getExpireTimestamp() {
			return expireTimestamp;
		}
		public void setExpireTimestamp(int expireTimestamp) {
			this.expireTimestamp = expireTimestamp;
		}
	    
	    
}
