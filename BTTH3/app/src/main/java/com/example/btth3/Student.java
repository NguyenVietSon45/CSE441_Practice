package com.example.btth3;

public class Student {
    private int id;
    private String name;
    private int age;

    // Constructor, getters and setters
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
