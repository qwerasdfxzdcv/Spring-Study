package com.example.demo;

public class Student {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public Student() {
        this.name = "이현숙";
        this.age = 3;
    }
}
