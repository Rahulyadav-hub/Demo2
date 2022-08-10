package com.mindtree.student.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.mindtree.student.VO.College;
import com.mindtree.student.VO.ResponseTemplate;
import com.mindtree.student.entity.Student;
import com.mindtree.student.repository.StudentRepository;
import com.mindtree.student.service.StudentService;

@Component
public class StudentImpl implements StudentService {

	@Autowired
	private StudentRepository stuRepo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public Student add(Student stu) {
		return stuRepo.save(stu);
	}

	@Override
	public List<Student> list() {
		return stuRepo.findAll();
	}

	@Override
	public Student searchById(long id) {
		return stuRepo.findById(id);
	}

	@Override
	public ResponseTemplate stuWithClg(long stuId) {
		ResponseTemplate RT = new ResponseTemplate();
		Student stu = stuRepo.findById(stuId);
		
		long clg_id = stu.getClg_id();
		College clg = restTemplate.getForObject("http://College-SERVICE/college/"+clg_id, College.class);
		RT.setCollege(clg);
		RT.setStudent(stu);
		return RT;
	}

	public Student assignCollege(long stuId, long clgId) {
		Student stu = stuRepo.findById(stuId);
		College clg = restTemplate.getForObject("http://COLLEGE-SERVICE/college/"+clgId, College.class);
		if(stu==null || clg==null)
		{
			return null;
		}
		stu.setClg_id(clgId);
		stuRepo.save(stu);
		return stu;
	}

	@Override
	public List<Student> getByClgId(long clg_id) {
		return stuRepo.getByClgId(clg_id);
	}

	@Override
	public List<Student> getStudentByCollegeWithDescAge(long clg_id) {
		return stuRepo.getStudentByCollegeWithDescAge(clg_id);
	}

	@Override
	public Student assignDepartment(long stuId, long clgId) {
		// TODO Auto-generated method stub
		return null;
	}
	

}