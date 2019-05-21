package com.hit.demo15;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo3 {
   /* public static void main(String[] args) {
        Collection c = new ArrayList();
//        添加元素
        c.add("Hello");//这个语句隐含有Object obj="Hello";向上转型
        c.add("world");
        c.add("java");

//        遍历
//        Object[] toArray():把集合转成数组，可以实现集合的遍历
        Object[] objs = c.toArray();
        for (int x = 0; x < objs.length; x++) {
            System.out.println(objs[x]);
//            知道元素是字符串，在获取到元素的同时，还想知道元素的长度
//            System.out.println(objs[x]+"---"+objs[x].length());//不能实现，因为Object中没有length（）方法
//            故需把元素还原成字符串
//            向下转型
            String s = (String) objs[x];
            System.out.println(s + "---" + s.length());
        }
    }*/
   public static void main(String[] args) {
       Collection c = new ArrayList();
       c.add("have");
       c.add("a");
       c.add("nice");
       c.add("day");

       Object[] objs = c.toArray();
       for (int x = 0; x < objs.length; x++) {
           System.out.println(objs[x]);
           String s = (String) objs[x];
           System.out.println(s+"==="+s.length());
       }
   }
}
