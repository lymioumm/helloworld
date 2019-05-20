package com.hit.demo10;

public class Outer8 {
    public void method() {
//        两个方法时
//        方法1
        /*new Inter7(){
            public void show() {
                System.out.println("show");
            }

            public void show2() {
                System.out.println("show2");
            }
        }.show();
        new Inter7(){
            public void show() {
                System.out.println("show");
            }
            public void show2(){
                System.out.println("show2");
            }
        }.show2();*/
//方法2
        Inter8 i = new Inter8() {
            public void show() {
                System.out.println("show");
            }

            public void show2() {
                System.out.println("show2");
            }
        };
        i.show();
        i.show2();
    }
}
