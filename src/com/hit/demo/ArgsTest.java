package com.hit.demo;

public class ArgsTest {
    public static void main(String[] args) {
//        形式参数是引用类型的调用
//        需求：我要调用StudentDemo类中的method()方法
        StudentDemo sd = new StudentDemo();
//        创建学生对象
        Student s = new Student();
        sd.method(s);//把s的地址给到了这里
    }
}
