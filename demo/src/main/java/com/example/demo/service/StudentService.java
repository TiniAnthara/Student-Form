package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.StudentEntity;

public interface StudentService {
	public StudentEntity createStudent(StudentEntity student);
	public List getAll();
	public Optional<StudentEntity> findByStudentId(long studentId);
	public StudentEntity save(StudentEntity student);
	public void deleteStudent(StudentEntity student);

}
