package com.hit.demo16;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
//        创建集合对象
        LinkedList link = new LinkedList();
//        添加元素
        link.add("hello");
        link.add("world");
        link.addLast("android");
        link.addFirst("java");
        System.out.println("link:"+link);
    }
}
