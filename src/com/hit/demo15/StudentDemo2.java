package com.hit.demo15;

import java.util.ArrayList;
import java.util.Collection;

public class StudentDemo2 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        Student2 s1 = new Student2("凌青霞", 27);
        Student2 s2 = new Student2("令狐冲", 30);
        Student2 s3 = new Student2("风清扬", 33);
        Student2 s4 = new Student2("任银银", 22);
        c.add(s1);
        c.add(s2);
        c.add(s3);
        c.add(s4);
        Object[] objs = c.toArray();
        for (int x = 0; x < objs.length; x++) {
            Student2 s = (Student2) objs[x];
            System.out.println(s.getName()+"---"+s.getAge());
        }
    }
}
