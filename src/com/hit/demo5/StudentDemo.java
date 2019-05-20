package com.hit.demo5;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s);
    }
}
/*
* Student s = new Student();做了哪些事
* A:把Student.class文件加载到内存
* B:在栈内存给s变量开辟一个空间
* C:在堆内存为学生对象申请一个空间
* D:给成员变量进行默认初始化，null，0
* E:给成员变量进行显示初始化，林青霞，27
* F:通过构造方法给成员变量进行初始化，刘易，30
* G:数据初始化完毕，然后把堆内存的地址值赋值给栈内存的s变量
*
* */