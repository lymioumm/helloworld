package com.hit.demo9;

public class InterfaceDemo2 {
    public static void main(String[] args) {
//        创建对象
        Inter i = new InterImpl();
        System.out.println(i.num);
        System.out.println(i.num2);
//        i.num = 100;
//        i.num2 = 200;

    }
}
/*
* 接口成员特点：
* 成员变量只能是常量，并且是静态的
* ，默认修饰符：public static final（建议自己动手给出）
* 所有类都默认继承自一个类：object
* 类object是类层次结构的根类，每个类都使用object作为超类
*
* */