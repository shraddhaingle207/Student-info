package com.example.demo;

import java.util.List;

public class StudentFileSystem {

	
	    private static final String FILE_NAME = "students.json";
	    
	    public List<Student> getAllStudents(List<Student> student) {
			return student;
	        // Read from file and return list of students
	    }
	    
	    public Student getStudentById(Long id, Student student) {
			return student ;
	        // Read from file and return student by id
	    }
	    
	    public Student createStudent(Student student) {
			return student;
	        // Write to file and return created student
	    }
	    
	    public Student updateStudent(Long id, Student student) {
			return student;
	        // Read from file, update student, and write back to file
	    }
	    
	    public void deleteStudent(Long id) {
	        // Read from file, delete student, and write back to file
	    }
	}


