package com.hit.demo9;

public class BasicTeacher extends Teacher {
    public BasicTeacher() {

    }

    public BasicTeacher(String name, int age) {
        super(name, age);
    }

    public void teach() {
        System.out.println("基础班老师讲课");
    }
}
