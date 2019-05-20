package com.hit.demo10;

public class Student2Test2 {
    public static void main(String[] args) {
//        需求：使用Student2类中的study（）方法
//        但是，这一次我的要求是，不要直接创建Student2的对象
//        让你使用StudentDemo2帮你创建对象
        StudentDemo2 sd = new StudentDemo2();
        Student2 s = sd.getStudent();
        s.study();
    }
}
