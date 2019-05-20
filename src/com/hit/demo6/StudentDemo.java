package com.hit.demo6;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.num);
        System.out.println(Student.num2);//类名调用静态变量
        System.out.println(s.num2);//对象名调用静态变量
    }
}
