package com.GiaBao.Lab7_6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GiaBao.Lab7_6.model.Student;



public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
