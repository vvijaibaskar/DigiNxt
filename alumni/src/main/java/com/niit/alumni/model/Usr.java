package com.niit.alumni.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;


@Entity
@Table(name = "USR")
@Component
public class Usr {

	@Id
/*	@Column(name="UsrId")
*/
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	private String password;
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public int getYearOfJoin() {
		return yearOfJoin;
	}
	public void setYearOfJoin(int yearOfJoin) {
		this.yearOfJoin = yearOfJoin;
	}
	public String getNiitRollNo() {
		return niitRollNo;
	}
	public void setNiitRollNo(String niitRollNo) {
		this.niitRollNo = niitRollNo;
	}
	private String name;
	private String email;
	private String phone;
	private char status;
	private int yearOfJoin;
	private String niitRollNo;
	
	/*@Transient
	private MultipartFile profilePicture;
	
	public MultipartFile getProfilePicture() {
		return profilePicture;
	}
	public void setProfilePicture(MultipartFile profilePicture) {
		this.profilePicture = profilePicture;
	}
*/
}
