package com.mindtree.student.VO;

import com.mindtree.student.VO.College;
import com.mindtree.student.entity.Student;

public class ResponseTemplate {

	
	private College college;
	private Student student;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public ResponseTemplate(Student stuudent, College college) {
		super();
		this.student = student;
		this.college = college;
	}
	public ResponseTemplate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}