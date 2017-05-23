package com.personal.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "stu_no")
	private Integer no;

	@Column(name = "stu_name")
	private String name;

	@Column(name="stu_class")
	private int cla;
	
	@Column(name="stu_sex")
	private String sex;

	@Column(name = "stu_age")
	private int age;

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCla() {
		return cla;
	}

	public void setCla(int cla) {
		this.cla = cla;
	}

}
