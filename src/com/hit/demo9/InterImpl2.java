package com.hit.demo9;
//接口名+Implements这种格式是接口的实现类格式
/*public class InterImpl2 implements Inter2 {
    public InterImpl2() {
        super();
    }
}*/
//所有类都默认继承自一个类：Object
public class InterImpl2 extends Object implements Inter2 {
    public InterImpl2() {
        super();
     }

    public void show() {

    }
}

/*
* 类与类，类与接口，接口与接口的关系
* 类与类：继承关系，只能单继承，可以多层继承，层与层之间还是单继承
* 类与接口：实现关系，可以单实现，也可以多实现，并且还可以在继承一个类的同时实现多个接口
* 接口与接口：继承关系，可以单继承，也可以多继承（也即，java的类只能单继承，但java的接口可以多继承）
* */