package com.hit.demo10;

public class Outer6 {
    private int num = 10;

    public void method() {

        int num2 = 20;
        class Inner6 {
            public void show() {
                System.out.println(num);
//                从内部类中访问本地变量num2,需要被声明为最终类型
                System.out.println(num2);
            }
        }
        Inner6 i = new Inner6();
        i.show();
    }
}
