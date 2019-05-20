package com.hit.demo9;

public class AbstractDemo3 {
    public static void main(String[] args) {
//        创建对象
        Animal3 a = new Dog3();
        a.num = 100;
        System.out.println(a.num);
//        a.num2 = 200;
        System.out.println(a.num2);
        System.out.println("------");
        a.show();
        a.method();
    }
}
