package com.greeting;

public class Greeting {

	private String fname;
	private String relation;
	private String message;


	public Greeting() {
		// TODO Auto-generated constructor stub
	
	}
	
	public Greeting(String fname, String relation, String message) {
		// TODO Auto-generated constructor stub
		this.fname = fname;
		this.relation = relation;
		this.message = message;
	}

	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
