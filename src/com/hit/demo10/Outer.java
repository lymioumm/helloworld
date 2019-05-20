package com.hit.demo10;

public class Outer {
    private int num = 10;

    class Inner {
        public void show() {
            System.out.println(num);
        }
    }

    public void method() {
//        show();//找不到符号
        Inner i = new Inner();
        i.show();
    }
}
