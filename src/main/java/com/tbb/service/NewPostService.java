package com.tbb.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tbb.dto.NewLinkPostDTO;
import com.tbb.dto.RegisterUserDTO;
import com.tbb.entity.Authorities;
import com.tbb.entity.Hashtag;
import com.tbb.entity.Post;
import com.tbb.entity.User;
import com.tbb.repository.HashtagRepository;
import com.tbb.repository.PostRepository;
import com.fasterxml.jackson.databind.*;
@Service
public class NewPostService {

	@Autowired
	PostRepository postRepository;
	@Autowired
	AshtrayService ashtrayService;
	@Autowired
	UserService userService;
	@Autowired
	HashtagRepository hashtagRepository;
	
	public List<Post> getAllPostsForSubscribedAshtrays(List<Integer> ashtrayIds){
		List<Post> posts = null;
		try {
			 posts = postRepository.findAllPostsByAshtrayIdList(ashtrayIds);
			System.out.println("posts from insde post service:" + posts.toString());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return posts;
	}
	public Post create(NewLinkPostDTO post) {
		
		Integer ashtrayId = ashtrayService.getAshtrayId(post.getAshtrayName());
		//Integer userId = userService.getUserId(post.getUsername());
		Integer userId = userService.getUserId("s");
//		String hashtagsAsArray[] = Arrays.asList(hashtags.substring(1, hashtags.length()-1)).toArray(new String[0]);
//		List<Hashtag> h = new ArrayList<Hashtag>();
//		String array[] = post.getHashtags();
//		int length = array.length;
//		for(int i = 0; i< length; i++) {
//			Hashtag hashtag =  new Hashtag(array[i]);
//			h.add(hashtag);
//		}
		String array = post.getHashtags();
		String[] newArray = array.split(",");
		List<Hashtag> h = new ArrayList<Hashtag>();
//		String array = post.getHashtags();
		int length = newArray.length;
		System.out.println("array length is "+ length);
		System.out.println("hasahtagArray is" + array.toString());
		for(int i = 0; i< length; i++) {
			Hashtag hashtag =  new Hashtag(newArray[i]);
			h.add(hashtag);
		}
		
		
//		
//		Hashtag h = new Hashtag(post.getHashtags());
		
		Post newPost = new Post(
				userId,
				post.getTitleText(),
				"",
				post.getIsNSFW()
				,post.getIsSpoiler(),
				1,
				post.getPostToProfile()
				,null//date time
				,1 //commentsId
				,post.getLinkText() // link text
				,"null" //imgPath
				,2); //postTypeId
		
		// insert into hashtags, get hashtag_group_id
		// insert into post, get post_id
		// update all hashtags with new post_id
		//
		
								// Have to insert the post to get postId
				
		Integer hashtagId;		// 	First store an entry in hashtagId/postId table
								// 			hashtagId is identity column (INSERT INTO hashtags_post_mapper values (post_id)
								//	hashtagRepository.saveAll() after converting all to Hashtag objects
								//		Then you just grab the hashgId and store that as an integer.
		
		Integer commentId;		//	hasRepository.saveAll() after converting all to Hashtag objects
								//		Then you just grab the hashgId and store that as an integer.
		
		
	
		newPost =  postRepository.save(newPost);
		for(Hashtag hashtag : h) {
			hashtag.setPostId(newPost.getPostId());
			hashtagRepository.save(hashtag);
		}
//		h = hashtagRepository.saveAll(h);
//		Integer hashtagsIdNew = h.get(0).getHashtagsId();
//		newPost.setHashtagsId(hashtagsIdNew);
				
		
		return newPost;
		
		// insert into comment table with null commenttext
		// get comment id
		// set comment id of new post
		// save newPost
	}
}