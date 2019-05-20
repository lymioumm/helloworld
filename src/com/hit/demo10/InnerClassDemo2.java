package com.hit.demo10;

public class InnerClassDemo2 {
    public static void main(String[] args) {
//        需求：访问Inner2类的show（）方法
//        Inner2 i = new Inner2();
//        i.show();
        Outer2.Inner2 oi = new Outer2().new Inner2();
        oi.show();
    }
}
