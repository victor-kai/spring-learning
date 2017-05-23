package com.personal.repo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.personal.domain.Student;
import com.personal.repository.StudentRepository;

@Component
public class StudentService {
	
	@Autowired
	private StudentRepository sturepo;
	
	public Student getByNo(int no){
		return sturepo.findByNo(no);
	}
	
	public List<Student> getByName(String name){
		return sturepo.findByName(name);
	}

	public List<Student> getByClass(int cla){
		return sturepo.findByCla(cla);
	}
}
