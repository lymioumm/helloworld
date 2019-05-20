package com.hit.demo8;

public class Son2 extends Father2 {
    public int num = 20;

    public void show() {
        int num = 30;//就近原则
        System.out.println(num);
        System.out.println(this.num);//本类中的num=20
        System.out.println(super.num);
    }
}

