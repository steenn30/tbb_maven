package com.tbb.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.tbb.dto.NewLinkPostDTO;
import com.tbb.dto.NewTextPostDTO;
import com.tbb.entity.Comment;
import com.tbb.entity.Post;
import com.tbb.entity.User;
import com.tbb.service.AshtrayService;
import com.tbb.service.ImageFromLinkService;
import com.tbb.service.NewPostService;
import com.tbb.service.UserService;

@RestController
public class NewPostController {

	@Autowired
	AshtrayService ashtrayService;
	
	@Autowired
	UserService userService;
	
	@Autowired
	NewPostService newPostService;
	
	@Autowired
	ImageFromLinkService imageFromLinkService;
	
	@CrossOrigin(origins = "*")
	@GetMapping(value="/feed/main/posts/{username}")
	public List<Post> getPostsForMainFeedByUsername(@PathVariable("username") String username) {
		List<Post> postsForFeedByUsername = new ArrayList<Post>();
		System.out.println("feed/main/posts hit username is" + username);
		System.out.println(userService.getUserId(username));
		Integer userId = userService.getUserId(username);
		List<Integer> subscribedAshtrayIds = ashtrayService.getSubscribedAshtrayIds(userId);
		postsForFeedByUsername = newPostService.getAllPostsForSubscribedAshtrays(subscribedAshtrayIds);
		//send to userService to get user Id
		// use userId to get all subscribed ashtrays.
		// query Post for all posts from subscribed ashtrays
		
		System.out.println(postsForFeedByUsername);
		
		return postsForFeedByUsername;
	}
	
//	@CrossOrigin(origins = "*")
//	@PostMapping(value="/new/post/text")//consumes = "application/json"
//	public Post newTextPost(@RequestBody NewTextPostDTO post) {
//		
//		Integer ashtrayId = ashtrayService.getAshtrayId(post.getAshtrayName());
//		Integer userId;
//		Integer hashtagId;
//		Integer commentId;
//		
//		// Steps:
//		//		1. insert hashtags one by one into database, use postId to identify
//		//		2. insert commentId entry into postId/commentId 1-to-1 column to get a commentId
//		// 		3. maybe convert to userId when we make that table
//		//		4. post to user profile (or just say if postToProfile is true in a query)
//		//		5. figure out a nice date format
//		
//		//-------------------old^^-----------------------------------------------
//		
////		Make NewLinkPostDTO into Post Object:
////			1.Convert username into userId
////			2.Convert ashtray_name into ashtray_id
////			3.Convert hashtags array into a hashtagID
////				3a. Insert hashtags into hashtag table
////			4.Get commentId from backend
//		
////		Post newPost = new Post(
////				null,post.getUsername(),post.getTitleText()
////				,post.getBodyText(),post.getHashtags(),post.getIsNSFW()
////				,post.getIsSpoiler(),ashtrayId,post.getPostToProfile()
////				,null //date time
////				,null //comments
////				,null // link text
////				,null //imgPath
////				,1); //postTypeId
//		
////		Convert backend Post representation into front end:
////		1. Get username from userId
////		2. Get ashtrayName from ashtray_id
//		
//		String usernameForFrontEnd;
//		String ashtrayNameForFrontEnd;
//		
//		Post newPost = new Post(
//				1,post.getUsername(),post.getTitleText()
//				,post.getBodyText(),1,post.getIsNSFW()
//				,post.getIsSpoiler(),ashtrayId,post.getPostToProfile()
//				,null //date time
//				,null //comments
//				,null // link text
//				,null //imgPath
//				,1); //postTypeId
//		
//		return newPostService.create(newPost);
//	}
	
	@CrossOrigin(origins = "*")
	@PostMapping(value="/new/post/link")//consumes = "application/json"
	public Post newLinkPost(@RequestBody NewLinkPostDTO post) {
		System.out.println("/new/post/link hit post is:" + post.toString());
//		Make NewLinkPostDTO into Post Object:
//			1.Convert username into userId
//			2.Convert ashtray_name into ashtray_id
//			3.Convert hashtags array into a hashtagID
//				3a. Insert hashtags into hashtag table
//			4.Get commentId from backend
//		System.out.println(post.getAshtrayName());
//		System.out.println(post.toString());
//		Integer ashtrayId = ashtrayService.getAshtrayId(post.getAshtrayName());
//		Integer userId = userService.getUserId(post.getUsername());
//		Integer hashtagId;
//		Integer commentId;
		//String imageUrl = imageFromLinkService.getAllImagesOnPage(post.getLinkText());
		
		//create a list of known urls to create embedded views 
		//(youtube, soundcloud, imgur, maybe a news site or something)
//		Post newPost = new Post(
//				null,post.getUsername(),post.getTitleText()
//				,null,post.getHashtags(),post.getIsNSFW()
//				,post.getIsSpoiler(),ashtrayId,post.getPostToProfile()
//				,null //date time
//				,null //commentsId
//				,post.getLinkText() // link text
//				,null //imgPath
//				,2); //postTypeId
		
		
//		Convert backend Post representation into front end:
//			1. Get username from userId
//			2. Get ashtrayName from ashtray_id

		
		String usernameForFrontEnd;
		String ashtrayNameForFrontEnd;
		
//		Post newPost = new Post(
//				1,post.getUsername(),post.getTitleText()
//				,null,1,post.getIsNSFW()
//				,post.getIsSpoiler(),ashtrayId,post.getPostToProfile()
//				,null //date time
//				,1 //commentsId
//				,post.getLinkText() // link text
//				,null //imgPath
//				,2); //postTypeId
		
		return newPostService.create(post);
	}

}
