package com.mindtree.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.student.VO.ResponseTemplate;
import com.mindtree.student.entity.	Student;
import com.mindtree.student.service.StudentService; 

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService stuService;
	
	@PostMapping
	public Student add(@RequestBody Student stu)
	{
		return stuService.add(stu);
	}
	
	@GetMapping
	public List<Student> listStu(){
		return stuService.list();
	}
	
	@GetMapping("/{stuId}")
	public ResponseTemplate empWithDept(@PathVariable long stuId)
	{
		return stuService.stuWithClg(stuId);
	}
	
	@PutMapping("/{stuId}/{clgId}")
	public String updateCollege(@PathVariable long stuId,@PathVariable long clgId)
	{
		Student stu = stuService.assignCollege(stuId,clgId);
		if(stu!=null)
		{
			return stu.toString();
		}
		return "Sorry. College or Student Not Found";
	}
	
	@GetMapping("/student-with-ascname/{clg_id}")
	public List<Student> getByClgId(@PathVariable long clg_id)
	{
		return stuService.getByClgId(clg_id);
	}
	
	@GetMapping("/student-with-desc-age/{clg_id}")
	public List<Student> getStudentByCollegeWithDescAge(@PathVariable long clg_id)
	{
		return stuService.getStudentByCollegeWithDescAge(clg_id);
	}
}