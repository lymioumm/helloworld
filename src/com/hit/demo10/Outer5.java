package com.hit.demo10;

public class Outer5 {
    private int num = 10;
    public void method() {
        class Inner5 {
            public void show() {
                System.out.println(num);
            }
        }
            Inner5 i = new Inner5();
            i.show();
    }
}
