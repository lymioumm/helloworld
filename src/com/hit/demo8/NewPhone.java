package com.hit.demo8;

public class NewPhone extends Phone {
    public void call(String name) {
//        System.out.println("给"+name+"打电话");
       super.call(name);
        System.out.println("可以听天气预报了");
    }
}
