package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StudentService1 {

	
	    @Autowired
	    private StudentRepository Studentrepository;
	    
	    public List<Student> getAllStudents() {
	        return Studentrepository.findAll();
	    }
	    
	    public Student getStudentById(Long id) {
	        return ( Studentrepository.findById(id)).orElse(null);
	    }
	    
	    public Student createStudent(Student student) {
	        return Studentrepository.save(student);
	    }
	    
	    public Student updateStudent(Long id, Student student) {
	        Student existingStudent = ( Studentrepository.findById(id)).orElse(null);
	        if (existingStudent != null) {
	            existingStudent.setName(student.getName());
	            existingStudent.setEmail(student.getEmail());
	            existingStudent.setPhone(student.getPhone());
	            return Studentrepository.save(existingStudent);
	        }
	        return null;
	    }
	    
	    public void deleteStudent(Long id) {
	        Studentrepository.deleteById(id);
	    }
	}


