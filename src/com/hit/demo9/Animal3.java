package com.hit.demo9;

abstract class Animal3 {
    public int num = 10;//变量
    public final int num2 = 20;//常量

    public Animal3() {

    }//无参构造方法

    public Animal3(String name, int age) {

    }//带参构造方法

    public abstract void show();//抽象方法

    public void method() {
        System.out.println("method");
    }//非抽象方法
}
