package com.tbb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tbb.dto.AgoraRepositoryDTO;
import com.tbb.dto.NewSeshDTO;
import com.tbb.entity.Sesh;
import com.tbb.repository.AgoraRTMRepository;
import com.tbb.repository.AgoraRepository;

import io.agora.media.RtcTokenBuilder;
import io.agora.rtm.RtmTokenBuilder;
import io.agora.rtm.RtmTokenBuilder.Role;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.json.simple.JSONObject;

@RestController
public class AgoraTokenController {

//	@Autowired
//	AgoraRepository agoraRepository;
//	
//	@Autowired
//	AgoraRTMRepository agoraRTMRepository;
	
	@CrossOrigin(origins = "*")
	@PostMapping(value="/agora/token/rtc")//consumes = "application/json"
	public Object getRTCToken(@RequestBody AgoraRepositoryDTO agoraRepository2) {
		
		System.out.println("agoraRepsoitory:" + agoraRepository2.getChannelName().toString());
		
		RtcTokenBuilder token = new RtcTokenBuilder();
        String channelName = agoraRepository2.getChannelName();
        int expireTime = agoraRepository2.getExpirationTimeInSeconds();
        RtcTokenBuilder.Role role = RtcTokenBuilder.Role.Role_Subscriber;
        int uid = agoraRepository2.getUid();
        
     // check for null channelName
        if (channelName==null){
            JSONObject error=new JSONObject();
            error.put("error","Channel ID cannot be blank");
            return Response.status(Response.Status.BAD_REQUEST).entity(error).build();
        }

        if(expireTime==0){
            expireTime = 3600;
        }

        if(agoraRepository2.getRole()==1){
            role = RtcTokenBuilder.Role.Role_Publisher;
        }else if(agoraRepository2.getRole()==0){
            role = RtcTokenBuilder.Role.Role_Attendee;
        }
        
        int timestamp = (int)(System.currentTimeMillis() / 1000 + expireTime);


        String result = token.buildTokenWithUid(AgoraRepositoryDTO.getAppId(), AgoraRepositoryDTO.getAppCertificate(),
                channelName, uid, role, timestamp);
        System.out.print("controller:" + result);
        JSONObject jsondict = new JSONObject();
        jsondict.put("message",result);
        
        return jsondict;
	
	}
	@CrossOrigin(origins = "*")
	@PostMapping(value="/agora/token/rtm")//consumes = "application/json"
	public Object getRTMToken(@RequestBody AgoraRTMRepository agoraRTMRepository) throws Exception {
		
		 String userId = agoraRTMRepository.getUserId();

		    if (userId==null){
		        JSONObject error=new JSONObject();
		        error.put("error","User ID cannot be blank");
		        return Response.status(Response.Status.BAD_REQUEST).entity(error).build();
		    }

		    RtmTokenBuilder token = new RtmTokenBuilder();
		    String result = token.buildToken(AgoraRTMRepository.getAppId(), AgoraRTMRepository.getAppCertificate(), userId, Role.Rtm_User, agoraRTMRepository.getExpireTimestamp());
		    System.out.println(result);
		    JSONObject jsondict = new JSONObject();
		    jsondict.put("message",result);
		    return jsondict;
		
	}
}
