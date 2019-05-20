package com.hit.demo9;

public class MultiStatesDemo {
    public static void main(String[] args) {
//        要有父类引用指向子类对象
        Fu f = new Zi();
        System.out.println(f.num);
//        找不到符号
//        System.out.println(f.num2);
        f.show();
//        找不到符号
//        f.method();
        f.function();
    }
}
/*
*
* 100
*show Zi//父类方法被子类所覆盖
*function Fu//父类的静态方法不会被子类的静态方法所覆盖
* */
/*
* 多态的好处：
* 1.提高了代码的维护性（继承保证）
* 2.提高了代码的扩展性（由多态保证）
* */