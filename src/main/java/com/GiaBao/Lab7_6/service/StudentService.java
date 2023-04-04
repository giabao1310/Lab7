package com.GiaBao.Lab7_6.service;

import com.GiaBao.Lab7_6.model.Student;

public interface StudentService {
    public Iterable<Student> getAllStudent();

    public Iterable<Student> getCustomizedStudentList();

    public Student save(Student student);


}
