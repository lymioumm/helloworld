package com.hit.demo6;

public class PersonDemo {
    public static void main(String[] args) {
        Person p1 = new Person("邓丽君", 16, "中国");
        p1.show();
        Person p2 = new Person("梅艳芳", 22);
        p2.show();
        Person p3 = new Person("哥哥", 20);
        p3.show();
        p3.country = "美国";
        p3.show();
        p1.show();
        p2.show();
    }
}
