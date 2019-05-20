package com.hit.demo9;

public class InterfaceDemo4 {
    public static void main(String[] args) {
//        创建对象
        Father f = new Son();
        f.show();
//        f.show2();//报错
        Mother m = new Son();
//        m.show();//报错
        m.show2();
    }
}
