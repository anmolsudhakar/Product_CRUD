package com.cgi.springbeans.model;

import com.cgi.springbeans.model.Course;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Professor {

    private String name;
    private String designation;
    private String collegeName;
    private String department;

    public void displayProfessorInfo() {
        System.out.println("Professor name: " + name);
        System.out.println("Professor designation: " + designation);
        System.out.println("Professor collegeName: " + collegeName);
        System.out.println("Professor department: " + department);
    }
}