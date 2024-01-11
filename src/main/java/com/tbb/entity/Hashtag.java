package com.tbb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(schema="public", name="hashtag_groups")
public class Hashtag {
//The annotation @JoinColumn indicates that this entity is the owner of the 
//relationship (that is: the corresponding table has a column with a foreign key 
//		to the referenced table), whereas the attribute mappedBy indicates that the 
//entity in this side is the inverse of the relationship, and the owner resides in the 
//"other" entity. This also means that you can access the other table from the class which 
//you've annotated with "mappedBy" (fully bidirectional relationship).
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer hashtagsId;
	
	@Column
	private Integer postId;
	
	
//	@ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "postId", referencedColumnName="post_id", insertable=false,updatable=false)
//	private Post posts;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "postId", insertable=false,updatable=false)
//	private Post posts;
	
	@Column
	private String hashtagText;

	public Hashtag(String hashtagText) {
		super();
		this.hashtagText = hashtagText;
	}
	public Hashtag() {
		super();
		
	}

	public Integer getHashtagsId() {
		return hashtagsId;
	}

	public void setHashtagsId(Integer hashtagsId) {
		this.hashtagsId = hashtagsId;
	}

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public String getHashtagText() {
		return hashtagText;
	}

	public void setHashtagText(String hashtagText) {
		this.hashtagText = hashtagText;
	}
	@Override
	public String toString() {
		return "Hashtag [hashtagsId=" + hashtagsId + ", postId=" + postId + ", hashtagText=" + hashtagText + "]";
	}


	
	
	
	
	

	
	
	

	
	
	

}
