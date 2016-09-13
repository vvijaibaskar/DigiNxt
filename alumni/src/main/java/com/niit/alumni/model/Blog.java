package com.niit.alumni.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "BLOG")
@Component
public class Blog {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="BLOGID")
	private int id;
	
	private Date blogDate;
	
	public int getId() {
		return id;
	}
	public Date getBlogDate() {
		return blogDate;
	}
	public void setBlogDate(Date blogDate) {
		this.blogDate = blogDate;
	}
	public void setId(int id) {
		this.id = id;
	}
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "UsrId")
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getBlogName() {
		return blogName;
	}
	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	private String userId;
	@Column(unique = true)
	private String blogName;
	private String contents;
	private char status;
	private String reason;

	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	
}
