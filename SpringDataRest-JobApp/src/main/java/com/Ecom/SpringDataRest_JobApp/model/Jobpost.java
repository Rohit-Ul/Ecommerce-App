package com.Ecom.SpringDataRest_JobApp.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;



@Data
@Component
@Scope("prototype")
@Entity
public class Jobpost {
	@Id
	int postId;
	String postProfile;
	String postDesc;
	int reqExperience;
	String postTechStack;
	
	
	public Jobpost(int postId, String postProfile, String postDesc, Integer reqExperience, String postTechStack) {
		
		this.postId=postId;
		this.postProfile=postProfile;
		this.postDesc=postDesc;
		this.reqExperience=reqExperience;
		this.postTechStack=postTechStack;
		
	}
	public Jobpost() {
		// TODO Auto-generated constructor stub
	}
	public void setPostId(int postId) {
		this.postId=postId;
	}
	public int getPostId() {
		return this.postId;
	}
	
	public void setPostProfile(String postProfile) {
		this.postProfile=postProfile;
	}
	public String getPostProfile() {
		return this.postProfile;
	}
	
	public void setPostDesc(String postDesc) {
		this.postDesc=postDesc;
	}
	public String getPostDesc() {
		return this.postDesc;
	}
	
	public void setReqExperience(Integer reqExperience) {
		this.reqExperience=reqExperience;
	}
	public Integer getReqExperience() {
		return this.reqExperience;
	}
	
	public void setPostTechStack(String postTechStack) {
		this.postTechStack=postTechStack;
	}
	public String getPostTechStack() {
		return this.postTechStack;
	}
	@Override 
	public String toString() {
		
		return "["+postId+","+postProfile+","+postDesc+","+reqExperience+","+postTechStack+"]";
	}
	
}
