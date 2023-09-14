package com.cgi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SpringBootApplication
public class Lombokdemo {

    private String id;
    private String name;

}
