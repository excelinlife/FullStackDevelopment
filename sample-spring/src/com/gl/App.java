package com.gl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee.getName());
        System.out.println(employee.getAge());

        Student student = context.getBean("student", Student.class);
        System.out.println(student.getName());
        System.out.println(student.getFatherName());
    }
}
