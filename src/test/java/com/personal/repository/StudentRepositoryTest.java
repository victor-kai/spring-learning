package com.personal.repository;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.personal.Application;
import com.personal.domain.Student;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class StudentRepositoryTest {

	@Autowired
	private StudentRepository repository;

	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Test
	@Transactional
	public void saveOne() {
		Student stu = new Student();
		stu.setNo(4);
		stu.setName("may yu");
		stu.setAge(28);
		stu.setSex("female");
		stu.setCla(2);
		repository.save(stu);
		
		log.info("student record saved.");
	}
	
	@Test
	public void findOneTest(){
		Student stu = repository.findByNo(3);
		log.info("student found: " + stu.getName());
	}
	
	@Test
	public void listByNameTest(){
		List<Student> list = repository.findByName("victor huang");
		Assert.notEmpty(list, "can't find 'victor huang' from db.");
		log.info("list.size " + list.size());
	}
}
