package com.gl;

public class Employee {
    private String name;
    private Integer age;
    private float salary;

    public Employee() {
        this.name = "Vinay";
        this.age=30;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
