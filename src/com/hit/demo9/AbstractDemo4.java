package com.hit.demo9;

public class AbstractDemo4 {
    public static void main(String[] args) {
//        测试（多态）
//        基础班老师
        Teacher t = new BasicTeacher();
        t.setName("ll");
        t.setAge(30);
        System.out.println(t.getName()+"---"+t.getAge());
        t.teach();
        System.out.println("----");
        t = new BasicTeacher("zl", 24);
        System.out.println(t.getName()+"---"+t.getAge());
        t.teach();
        System.out.println("-------");
//        就业班老师
        t = new WorkTeacher();
        t.setName("ll2");
        t.setAge(23);
        System.out.println(t.getName()+"---"+t.getAge());
        t.teach();
        System.out.println("-----------");
        t = new WorkTeacher("zl2", 24);
        System.out.println(t.getName()+"----"+t.getAge());
        t.teach();
    }
}
//上述程序的t被多次使用做很多用途，体现了一个t的多态