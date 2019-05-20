package com.hit.demo8;

public class Fu {
    static{
        System.out.println("静态代码块Fu");
    }
    {
        System.out.println("构造代码块Fu");
    }

    public Fu() {
        System.out.println("构造方法Fu");
    }
}
