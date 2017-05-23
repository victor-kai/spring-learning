package com.personal.schedule.task;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.personal.domain.Student;
import com.personal.repo.service.StudentService;

@Component
public class ListStu {
	
	@Autowired
	private StudentService stuService;
	
	private static final Logger log = LoggerFactory.getLogger(ListStu.class);
	
	@Scheduled(fixedRate = 5000, initialDelay=1000)
	public void listClass2(){
		
		List<Student> list = stuService.getByClass(2);
		
		for(Student stu: list){
			log.info(String.format("no.: %s, name: %s, class: %s, gender: %s, age: %s", stu.getNo(), stu.getName(), stu.getCla(), stu.getSex(), stu.getAge()));
		}
		
	}

}
