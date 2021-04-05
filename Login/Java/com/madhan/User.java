package com.madhan;

public class User {
  private String name;
  private String pwd;
  private String mail;
public User(String name, String pwd, String mail) {
	super();
	this.name = name;
	this.pwd = pwd;
	this.mail = mail;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
}
