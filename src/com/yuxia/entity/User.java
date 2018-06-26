package com.yuxia.entity;

import java.util.Date;

public class User {
	private Integer id;
	private String userName;
	private String password;
	private String realName;
	private String sex;
	private String address;
	private String question;
	private String answer;
	private String email;
	private String favorate;
	private Integer score;
	private Date regDate;
	private Integer status;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFavorate() {
		return favorate;
	}
	public void setFavorate(String favorate) {
		this.favorate = favorate;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password="
				+ password + ", realName=" + realName + ", sex=" + sex
				+ ", address=" + address + ", question=" + question
				+ ", answer=" + answer + ", email=" + email + ", favorate="
				+ favorate + ", score=" + score + ", regDate=" + regDate
				+ ", status=" + status + "]";
	}
}
