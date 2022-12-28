package com.model;

public class Student {
	private String sid;
	private String sname;
	private String smob;
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSmob() {
		return smob;
	}
	public void setSmob(String smob) {
		this.smob = smob;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", smob=" + smob + "]";
	}
	
}
