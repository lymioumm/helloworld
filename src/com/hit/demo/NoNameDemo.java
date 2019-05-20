package com.hit.demo;

public class NoNameDemo {
    public static void main(String[] args) {
//        带名字的调
//        虽然也在堆内存里，但是有s地址连接着new Student（），new Student（）不会这么快消失（只要s还存在）
        Student s = new Student();
        s.show();
//        同一个对象被调用两次
        s.show();
        System.out.println("-------");
//        匿名对象
//        new Student（）；
//        匿名对象调用方法
        new Student().show();
//        这里其实是重新创建了一个新的对象，因为这是在堆内存的，调用完就消失了
        new Student().show();
        System.out.println("--------");
//        匿名对象作为实际参数传递
        StudentDemo sd = new StudentDemo();
//        Student ss = new Student();
//        sd.method(ss);//这里的ss是一个实际参数
//        匿名对象
        sd.method(new Student());
        new StudentDemo().method(new Student());

    }
}
