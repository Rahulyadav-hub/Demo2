package com.mindtree.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.student.VO.ResponseTemplate;
import com.mindtree.student.entity.Student;

@Service
public interface StudentService {
	
	Student add(Student stu);
	List<Student> list();
	Student searchById(long id);
	ResponseTemplate stuWithClg(long stuId);
	Student assignDepartment(long stuId, long clgId);
	List<Student> getByClgId(long clg_id);
	List<Student> getStudentByCollegeWithDescAge(long clg_id);
	Student assignCollege(long stuId, long clgId);
}
