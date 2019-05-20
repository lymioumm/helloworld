package com.hit.demo9;

public class InterfaceDemo3 {
    public static void main(String[] args) {
//        创建对象
        Inter2 i = new InterImpl2();
        System.out.println(i.num);
        System.out.println(i.num2);
//        i.num = 100;
//        i.num2 = 200;
        System.out.println(Inter2.num);
        System.out.println(Inter2.num2);

    }
}
