package com.lisi.common.bean;

import java.util.Date;

public class Student {
	private String name;
	private int age;
	private String js;
	private Date date;



	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", js=" + js + ", date=" + date + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJs() {
		return js;
	}

	public void setJs(String js) {
		this.js = js;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, String js, Date date) {
		super();
		this.name = name;
		this.age = age;
		this.js = js;
		this.date = date;
	}

}
