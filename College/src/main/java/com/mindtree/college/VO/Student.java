package com.mindtree.college.VO;

public class Student {
	private long rollNo;
	private String name;
	private double salary;
	private String gender;
	private int age;
	private long clg_id;
	
	public long getrollNo() {
		return rollNo;
	}
	public void setId(long rollNo) {
		this.rollNo = rollNo;
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
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getClg_id() {
		return clg_id;
	}
	public void setDept_id(long dept_id) {
		clg_id = clg_id;
	}

	public Student(String name, String gender, int age,long clg_id) {
		super();
		this.name = name;
		//this.salary = salary;
		this.gender = gender;
		this.age = age;
		this.clg_id = clg_id;
	}
	public Student() {
		super();
	}
}
