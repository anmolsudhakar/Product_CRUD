package com.cgi.springbeans.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Student {

    private String name;
    private int rollNo;
    private String standard;

    private Course course;
    private Professor professor;


    public void displayStudentInfo() {
        System.out.println("Student name: " + name);
        System.out.println("Student rollNo: " + rollNo);
        System.out.println("Student standard: " + standard);
        course.displayCourseInfo();
        professor.displayProfessorInfo();
    }

}