package com.hit.demo6;

public class Teacher {
    public int num = 10;
    public static int num2 = 20;

    public void show() {
        System.out.println(num);//语句1，隐含的告诉你访问的是成员变量
        System.out.println(this.num);//语句2，明确的告诉你访问的是成员变量，与语句1效果相同
        System.out.println(num2);
       function();
       function2();
    }

    public static void method() {
//        无法从静态上下文中引用非静态变量num
//        System.out.println(num);
        System.out.println(num2);
//        无法从静态上下文中引用非静态 方法function()
//        function();
        function2();
    }

    public void function() {

    }
    public static void function2() {
    }
}
