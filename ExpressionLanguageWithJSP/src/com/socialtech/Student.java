package com.socialtech;

public class Student {
	private String name;
	private int studno;
	public Student(String name, int studno) {
		super();
		this.name = name;
		this.studno = studno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setStudno(int num) {
		this.studno = num;
	}
	public int getStudno() {
		return studno;
	}
}
