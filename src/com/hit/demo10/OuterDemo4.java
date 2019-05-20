package com.hit.demo10;

public class OuterDemo4 {
    public static void main(String[] args) {
        Outer4.Inner4 oi = new Outer4().new Inner4();
        oi.show();
    }
}
