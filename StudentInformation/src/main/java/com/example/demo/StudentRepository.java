package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public  interface StudentRepository  extends JpaRepository<Student, Long> {

	Optional<Student> findById(Long id);
    // Additional methods for specific queries if needed

	Student save(Student student);

	List<Student> findAll();

	void deleteById(Long id);
}

