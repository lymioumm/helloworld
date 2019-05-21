package com.hit.demo15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
//Iterator iterator():迭代器，集合的专用遍历方式
public class IteratorDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("hello");
        c.add("world");
        c.add("java");
        Iterator it = c.iterator();//实际返回的肯定是子类对象，这里是多态
        while (it.hasNext()) {
//            String s = (String) it.next();
//            System.out.println(s);
            System.out.println(it.next());
        }
    }
}
