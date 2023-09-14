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
public class Course {

    private String courseName;
    private String courseCode;
    private String courseDescription;


    public void displayCourseInfo() {
        System.out.println("Course name: " + courseName);
        System.out.println("Course code: " + courseCode);
        System.out.println("Course description: " + courseDescription);
    }
}