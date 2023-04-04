package com.GiaBao.Lab7_6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.GiaBao.Lab7_6.model.Student;
import com.GiaBao.Lab7_6.repository.StudentRepository;

import java.util.List;

@Service
public class StudentServiceImplement implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Iterable<Student> getAllStudent() {
        return studentRepository.findAll(Sort.by("age").descending().and(Sort.by("ieltsScore")));
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Iterable<Student> getCustomizedStudentList(){
        Pageable sortedByAgeDescIeltsAsc = PageRequest.of(0 , 10 , Sort.by("age").descending().and(Sort.by("ieltsScore")));
        Page<Student> studentPage = studentRepository.findAll(sortedByAgeDescIeltsAsc);
        return studentPage.getContent().subList(4 , 7);
    }
}
