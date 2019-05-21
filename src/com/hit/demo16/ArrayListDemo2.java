package com.hit.demo16;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
   /* public static void main(String[] args) {
//        创建集合对象
        ArrayList array = new ArrayList();
//        添加多个字符串元素（包含内容相同的）
        array.add("hello");
        array.add("world");
        array.add("java");
        array.add("world");
        array.add("world");
        array.add("world");
        array.add("world");
        array.add("java");
        array.add("world");
//        创建新集合
        ArrayList newArray = new ArrayList();
//        遍历旧集合，获取得到的每一个元素
        Iterator it = array.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
//            拿着个元素到新集合去找，看有没有
            if (!newArray.contains(s)) {
                newArray.add(s);
            }
        }
//        遍历新集合
        for (int x = 0; x < newArray.size(); x++) {
            String s = (String) newArray.get(x);
            System.out.println(s);
        }
    }*/
  /* public static void main(String[] args) {
//       创建集合对象
       ArrayList array = new ArrayList();
       array.add("hello");
       array.add("world");
       array.add("java");
       array.add("world");
       array.add("world");
       array.add("world");
       array.add("world");
       array.add("java");
       array.add("world");
//       创建新集合
       ArrayList newArray = new ArrayList();
//       Iterator it = array.iterator();
       for (int x = 0; x < array.size(); x++) {
           String s = (String) array.get(x);
           if (!newArray.contains(s)) {
               newArray.add(s);
           }
       }
//       for (int x = 0; x < newArray.size(); x++) {
//           String s = (String) newArray.get(x);
//           System.out.println(s);
//       }
       Iterator nit = newArray.iterator();
       while (nit.hasNext()) {
           String s = (String) nit.next();
           System.out.println(s);
       }
   }*/


//  要求不能创建新集合实现上述功能

    public static void main(String[] args) {
//        创建集合对象
        ArrayList array = new ArrayList();

//        添加多个字符串元素（包含内容相同的）
        array.add("hello");
        array.add("world");
        array.add("java");
        array.add("world");
        array.add("world");
        array.add("world");
        array.add("world");
        array.add("java");
        array.add("world");
//        由选择排序思想引入
//        用0索引的以此和后面的比较，有就去掉
//        同理，用1索引的......
        for (int x = 0; x < array.size(); x++) {
            for (int y = x + 1; y < array.size(); y++) {
                if (array.get(x).equals(array.get(y))) {
                    array.remove(y);
                    y--;
                }
            }
        }
//        遍历集合
        Iterator it = array.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }
    }

}
