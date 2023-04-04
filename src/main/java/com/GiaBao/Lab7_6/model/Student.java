package com.GiaBao.Lab7_6.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private Double ieltsScore;

    public String toString(){
        String value = "Id = "+this.id+"\t"+"name = "+this.name+"\t"+"age = "+this.age+"\t"+"email = "+this.email+"\t"+"ielts = "+ieltsScore;
        return value;
    }
}
