package com.hit.demo9;

public class FinalTest {
    public static void main(String[] args) {
        int x = 10;
        x = 100;
        System.out.println(x);
        final int y = 10;
//        y = 100;
        System.out.println(y);
    }
}
/*
* final:最终的意思，常见的是它可以修饰类，方法，变量
* 特点：final可以修饰类，该类不能被继承
* final可以修饰方法，该方法不能被重写
* final可以修饰变量，该变量不能被重新赋值，因为这个变量其实是常量
* */