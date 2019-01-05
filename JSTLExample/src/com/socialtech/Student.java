package com.socialtech;

public class Student {
	int stno;
	public int getStno() {
		return stno;
	}
	public void setStno(int stno) {
		this.stno = stno;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	String stname;
	public Student(int stno, String stname) {
		super();
		this.stno = stno;
		this.stname = stname;
	}
	@Override
	public String toString() {
		return "Student [stno=" + stno + ", stname=" + stname + "]";
	}
	
	
}
