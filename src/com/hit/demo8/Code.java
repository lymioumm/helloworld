package com.hit.demo8;

/*
public class Code {
//    构造代码块

{
//    注意这一段外面不加大括号会报错，加大括号就不报错
    int x = 100;
    System.out.println(x);

}

    public void Try_out() {
        System.out.println("test");

    }
    {

        int m = 2;
        System.out.println("m=" + m);
    }
    public Code() {
        System.out.println("code");//这个打印语句在第三个也就是最火一个才输出
    }
    {
        int y = 200;
        System.out.println(y);
    }
    {
        System.out.println("test");

    }
}
*/
public class Code {
//    静态代码块
    static{
    int a = 1000;
    System.out.println(a);
    }
//    构造代码块
{
    int x = 10;
    System.out.println(x);

}
//静态代码块
static{
    int b = 2000;
    System.out.println(b);
}
}