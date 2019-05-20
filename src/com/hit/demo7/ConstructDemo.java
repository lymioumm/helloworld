package com.hit.demo7;
/*
* Student s=new Student();在内存中做了哪些事情？
* 1.加载Student.class文件进内存
* 2.在栈内存为s开辟空间
* 3.在堆内存为学生对象开辟空间
* 4.对学生对象的成员变量进行默认初始化
* 5.对学生对象的成员变量进行显示初始化
* 6.通过构造方法对学生对象的成员变量赋值
* 7.学生对象初始化完毕，把对象地址赋值给s变量
* */
public class ConstructDemo {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s);
    }
}
