package com.hit.demo9;

public class Son extends Object implements Father, Mother {
    public void show() {
        System.out.println("show son");

    }

    public void show2() {
        System.out.printf("Show2 son");

    }
}
/*
* 多态的分类：
* 1.具体类多态
* class Fu{}
* class ZI extends Fu{}
* Fu f=new Zi();
* 2.抽象类多态
* abstract class Fu{}
* class Zi extends Fu{}
* Fu f= new Zi();
* 3.接口类多态
* interface Fu{}
* class Zi implements Fu{}
* Fu f=new Zi();
* */
/*
*
* */