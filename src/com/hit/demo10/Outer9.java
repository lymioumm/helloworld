package com.hit.demo10;

public class Outer9 {
    public static Inter9 method() {
        return new Inter9() {
            public void show() {
                System.out.println("HelloWorld");
            }
        };
    }
}
