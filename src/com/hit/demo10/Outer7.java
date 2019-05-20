package com.hit.demo10;

public class Outer7 {
    public void method() {
        /*new Inter7(){
            public void show() {
                System.out.println("show");
            }
        };*/
        new Inter7(){
            public void show() {
                System.out.println("show");
            }
        }.show();
    }
}
