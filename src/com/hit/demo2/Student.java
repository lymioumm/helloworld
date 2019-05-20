package com.hit.demo2;

public class Student {
    /*String name;
    private int age;
//写一个方法对数据进行校验
    public void setAge(int a) {
        if (a < 0 || age > 120) {
            System.out.println("你的年龄有问题");
        } else {
            age = a;
        }
    }
//show()方法，显示所有成员变量值
    public void show() {
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);

    }*/

//    封装和private的引用
//    A:把成员变量用private修饰
//    B:提高对应的getXxx()和setXxx()方法
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }
}

