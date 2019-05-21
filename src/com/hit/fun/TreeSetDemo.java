package com.hit.fun;

import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TreeSetDemo {
    public static void main(String[] args) {

//        创建集合对象
        TreeSet<Student> ts = new TreeSet<Student>();
//        创建元素
        Student s1 = new Student("linqingxia", 27);
        Student s2 = new Student("antengying", 37);
        Student s3 = new Student("lindaiyu", 22);
        Student s4 = new Student("ljia ", 22);
        Student s5 = new Student("ly ", 17);
        Student s6 = new Student("last ", 23);
        Student s7 = new Student("so ", 13);
        Student s8 = new Student("nono ", 37);
//        添加元素
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        ts.add(s7);
        ts.add(s8);
//        遍历
        for (Student a : ts) {
            System.out.println(s1.getName()+"----"+ s1.getAge());
        }

        /*String s = "hello wo shi yi ming xue sheng ,nice to meet you";
        String regex = "\\b\\w{3}\\b";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println(m.group());
        }*/
    }
}
