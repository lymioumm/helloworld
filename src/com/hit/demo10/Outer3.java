package com.hit.demo10;

public class Outer3 {
    private int num = 10;
    private static int num2 = 200;

    //    内部类用静态修饰是因为内部类可以看出是外部类的成员
    public static class Inner3 {
        public void show() {
//            System.out.println(num);
            System.out.println(num2);

        }

        public static void show2() {
//            System.out.println(num);
            System.out.println(num2);
        }
    }
}
