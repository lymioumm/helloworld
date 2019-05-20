package com.hit.demo10;

public class InnerClassDemo3 {
    public static void main(String[] args) {
//        使用内部类
//        限定的新静态类
//        Outer3.Inner3 oi = new Outer3().new Inner3();
//        oi.show();
//        oi.show2();
//        成员内部类被静态修饰后的访问方式是：
//        格式：外部类名.内部类名 对象名 = new 外部类名.内部类名（）；
        Outer3.Inner3 oi = new Outer3.Inner3();
        oi.show();
        oi.show2();
        Outer3.Inner3.show2();
    }
}
