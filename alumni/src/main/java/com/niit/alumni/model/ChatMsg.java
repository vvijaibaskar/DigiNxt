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
	private String fromUsr;
	private String toUsr;
	private Date dateAndTime;
	
	public Date getDateAndTime() {
		return dateAndTime;
	}
	public void setDateAndTime(Date dateAndTime) {
		this.dateAndTime = dateAndTime;
	}
	private String title;
	private String content;
	private Boolean approved;
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
	public String getFromUsr() {
		return fromUsr;
	}
	public void setFromUsr(String fromUsr) {
		this.fromUsr = fromUsr;
	}
	public String getToUsr() {
		return toUsr;
	}
	public void setToUsr(String toUsr) {
		this.toUsr = toUsr;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Boolean getApproved() {
		return approved;
	}
	public void setApproved(Boolean approved) {
		this.approved = approved;
	}
	

}
