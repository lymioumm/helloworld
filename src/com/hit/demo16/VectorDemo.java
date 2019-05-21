package com.hit.demo16;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
//        创建集合对象
        Vector v = new Vector();
//        添加功能
        v.addElement("hello");
        v.addElement("world");
        v.addElement("java");
//        遍历
        for (int x = 0; x < v.size(); x++) {
            String s = (String) v.get(x);
            System.out.println(s);
        }
        System.out.println("----分割线------");
        Enumeration en = v.elements();//返回的是实现类的对象
        while (en.hasMoreElements()) {
            String s = (String) en.nextElement();
            System.out.println(s);
        }





    }
}
