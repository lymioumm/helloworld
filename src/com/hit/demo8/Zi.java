package com.hit.demo8;

public class Zi extends Fu {
    static{
        System.out.println("静态代码块Zi");
    }
    {
        System.out.println("构造代码块Zi");
    }

    public Zi() {
        System.out.println("构造方法Zi");
    }
}
