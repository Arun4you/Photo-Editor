package com.greeting;

public class Greeting {

	private String fname;
	private String relation;
	private String messageSummary;
	private String messageChildhood;
	private String messageCareer;
	private String messageAwards;


	public Greeting() {
		// TODO Auto-generated constructor stub
	
	}
	
	public Greeting(String fname, String relation, String messageSummary, String messageChildhood, 
			String messageCareer, String messageAwards) {
		// TODO Auto-generated constructor stub
		this.fname = fname;
		this.relation = relation;
		this.messageSummary = messageSummary;
		this.messageChildhood = fname;
		this.messageCareer = relation;
		this.messageAwards = messageSummary;	
	}

	public String getMessageSummary() {
		return messageSummary;
	}

	public void setMessageSummary(String messageSummary) {
		this.messageSummary = messageSummary;
	}

	public String getMessageChildhood() {
		return messageChildhood;
	}

	public void setMessageChildhood(String messageChildhood) {
		this.messageChildhood = messageChildhood;
	}

	public String getMessageCareer() {
		return messageCareer;
	}

	public void setMessageCareer(String messageCareer) {
		this.messageCareer = messageCareer;
	}

	public String getMessageAwards() {
		return messageAwards;
	}

	public void setMessageAwards(String messageAwards) {
		this.messageAwards = messageAwards;
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
	
}
