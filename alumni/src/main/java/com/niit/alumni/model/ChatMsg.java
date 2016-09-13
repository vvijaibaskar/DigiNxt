package com.niit.alumni.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "CHAT")
@Component
public class ChatMsg {

	@Id
	@Column(name="id")
	private String id;
	private String usrId;
	private Date   chatDateTime;
	private String toUsrId;
	private String content;
	
	
	public Date getChatDateTime() {
		return chatDateTime;
	}
	public void setChatDateTime(Date chatDateTime) {
		this.chatDateTime = chatDateTime;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsrId() {
		return usrId;
	}
	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}

	
	

	public String getToUsrId() {
		return toUsrId;
	}
	public void setToUsrId(String toUsrId) {
		this.toUsrId = toUsrId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}


}
