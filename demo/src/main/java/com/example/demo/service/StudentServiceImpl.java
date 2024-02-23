package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.StudentEntity;
import com.example.demo.repo.StudentRepository;


@Service
    public class StudentServiceImpl implements StudentService{
@Autowired
	private StudentRepository studentRepository;
@Override
	public StudentEntity createStudent(StudentEntity student) {
	return studentRepository.save(student);
	}
	public List getAll() {
		return studentRepository.findAll();
		}
	public Optional<StudentEntity> findByStudentId(long studentId){
		return studentRepository.findById(studentId);
		}
	public StudentEntity save(StudentEntity student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
		}
	public List < StudentEntity > findAll() {
        return studentRepository.findAll();
    }
  public void deleteStudent(StudentEntity student){

	  studentRepository.delete(student);

	  }
}
 