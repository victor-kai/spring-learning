package com.personal.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.personal.domain.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

	Student findByNo(Integer no);
	
	List<Student> findByName(String name);
	
	List<Student> findByCla(int cla);
}
