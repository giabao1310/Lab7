package com.GiaBao.Lab7_6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.GiaBao.Lab7_6.model.Student;
import com.GiaBao.Lab7_6.service.StudentServiceImplement;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Lab76Application implements CommandLineRunner {
    @Autowired
    private StudentServiceImplement studentService;
    
    public static void main(String[] args) {
        SpringApplication.run(Lab76Application.class, args);
    }

    private void showStudentList(List<Student> studentList) {
        if (studentList == null) return;
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void run(String... args) throws Exception {
		List<Student> students = new ArrayList<Student>();

        students.add(new Student(1L , "Bao" , 18 , "0@gmail.com" , 7.5));
        students.add(new Student(2L , "Huy" , 19 , "1@gmail.com" , 7.4));
        students.add(new Student(3L , "Duc" , 20 , "2@gmail.com" , 7.3));
        students.add(new Student(4L , "Anh" , 19 , "3@gmail.com" , 7.5));
        students.add(new Student(5L , "Vu" , 21 , "4@gmail.com" , 7.6));
        students.add(new Student(6L , "Hoang" , 23 , "5@gmail.com" , 7.7));
        students.add(new Student(7L , "Quoc" , 22 , "6@gmail.com" , 7.9));
        students.add(new Student(8L , "Quang" , 22 , "7@gmail.com" , 8.0));
        students.add(new Student(9L , "Gia" , 18 , "8@gmail.com" , 7.1));
        students.add(new Student(10L , "Tran" , 20 , "9@gmail.com" , 7.2));
        students.add(new Student(11L , "Vo" , 18 , "10@gmail.com" , 7.8));

		for(Student student : students){
			studentService.save(student);
		}

		System.out.println("The customized list of student: ");
		List<Student> customizeStudentList = (List<Student>) studentService.getCustomizedStudentList();
		showStudentList(customizeStudentList);
        
    }
}
