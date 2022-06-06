package com.gl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee.getName());
        System.out.println(employee.getAge());

        Student student = context.getBean("random", Student.class);
        System.out.println(student.getName());
        System.out.println(student.getFatherName());
    }
}
