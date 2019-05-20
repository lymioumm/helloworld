package com.hit.demo6;
/*
* static 的特点：（它可以修饰成员变量，还可以修饰成员方法）
* A:随着类的加载而加载
* 回想main方法
* B:优先于对象存在
* C:被类的所有对象共享
* eg：咱们班级的学生应该共用同一个班级编号
* 其实这个特点也是在告诉我们什么时候使用静态，
* 如果某个成员变量是被所有对象共享的，那么它就应该定义为静态的
* eg：饮水机（用静态修饰）（饮水机可以多人共享使用）
* 水杯（不能用静态修饰）（水杯只能自己一个人使用，原则上不可以共享，每个人都有一个）
* D:可以通过类名调用，也可以通过对象名调用（推荐使用类名）
*
* */
public class Person {
    String name;
    int age;
    static String country;

    public Person() {

    }

    public Person(String name, int age) {

    }

    public Person(String name, int age, String country) {

    }
    public void show() {
        System.out.println(name + "---" + age + "----" + country);
    }
}
