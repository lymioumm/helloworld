package com.hit.demo15;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    /*public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("java");
        ListIterator lit = list.listIterator();
        while (lit.hasNext()) {
            String s = (String) lit.next();
            System.out.println(s);
        }
        System.out.println("----分割线------");
        while (lit.hasPrevious()) {
            String s = (String) lit.previous();
            System.out.println(s);
        }

    }*/

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("have");
        list.add("a");
        list.add("nice");
        list.add("day");
        ListIterator lit = list.listIterator();
        while (lit.hasNext()) {
            String s = (String) lit.next();
            System.out.println(s);
        }
        while (lit.hasPrevious()) {
            String s = (String) lit.previous();
            System.out.println(s);

        }
    }
}
