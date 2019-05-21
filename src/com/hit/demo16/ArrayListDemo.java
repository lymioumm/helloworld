package com.hit.demo16;

import java.util.ArrayList;
import java.util.Iterator;
//1.ArrayList存储自定义对象并遍历

public class ArrayListDemo {
    public static void main(String[] args) {
//        创建集合对象
        ArrayList array = new ArrayList();

//        创建学生对象
        Student s1 = new Student("武松", 30);
        Student s2 = new Student("花和尚", 32);
        Student s3 = new Student("鲁智深", 35);
        Student s4 = new Student("林冲", 31);

//        添加元素
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
//        遍历
        Iterator it = array.iterator();
        while (it.hasNext()) {
            Student s = (Student) it.next();
            System.out.println(s.getName()+"--"+s.getAge());
        }
        System.out.println("---分割线------");
        for (int x = 0; x < array.size(); x++) {
            Student s = (Student) array.get(x);
            System.out.println(s.getName()+"--"+s.getAge());

        }
    }
}
