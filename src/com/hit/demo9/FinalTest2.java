package com.hit.demo9;

public class FinalTest2 {
    public static void main(String[] args) {
//        局部变量是基本数据类型
        int x = 10;
        x = 100;
        System.out.println(x);
        final int y = 10;
//        无法为最终变量y分配值
//        y=100;
        System.out.println(y);
        System.out.println("------");
//        局部变量是引用数据类型
        Student2 s = new Student2();
        System.out.println(s.age);
    }
}
