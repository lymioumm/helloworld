package com.hit.demo9;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

public class WorkTeacher extends Teacher {
    public WorkTeacher() {

    }

    public WorkTeacher(String name, int age) {
        super(name, age);
    }

    public void teach() {
        System.out.println("就业班老师讲课");
    }
}
