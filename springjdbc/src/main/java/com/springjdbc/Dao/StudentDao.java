package com.springjdbc.Dao;

import java.util.List;

import com.springjdbc.entities.Student;

public interface StudentDao {

	public int insert(Student student);
	
	public int update(Student student);
	
	public Student getStudent(int studentId);
	
	public List<Student> getStudentList();
}
