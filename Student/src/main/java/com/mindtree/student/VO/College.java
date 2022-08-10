package com.mindtree.student.VO;

public class College {

	private long id;
	private String name;
	private int totalStudents;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int gettotalStudents() {
		return totalStudents;
	}
	public void settotalStudents(int totalStudents) {
		this.totalStudents = totalStudents;
	}
	public College(long id,String name, int totalStudents) {
		super();
		this.id = id;
		this.name = name;
		this.totalStudents = totalStudents;
	}
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
}