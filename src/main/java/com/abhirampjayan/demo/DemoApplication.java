package com.abhirampjayan.demo;

import com.abhirampjayan.demo.models.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
        Student student = ctx.getBean(Student.class);
		student.setMarks(100);
		student.setName("Abhiram");
		student.setRollNol(1);
    }

}
