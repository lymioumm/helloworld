package com.hit.demo13;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb2 = sb.append("hello");
        System.out.println("sb:" + sb);
        System.out.println("sb2:" + sb2);
        System.out.println(sb.equals(sb2));
        System.out.println("---------");
        sb.append("world");
        System.out.println(sb);
        StringBuffer sb3 = new StringBuffer();
//        链式编程
        sb3.append("hello").append(123).append("java");
        System.out.println(sb3);
//        System.out.println("sb.capacity():" + sb.capacity());
//        System.out.println("sb.length():" + sb.length());


        System.out.println("----实现删除功能-----");
        sb.delete(0,2);
        System.out.println(sb);
        sb.deleteCharAt(2);
        System.out.println(sb);


//        举例

//        创建字符串缓冲区
        StringBuffer sa = new StringBuffer();

//        添加元素
        System.out.println("---添加元素到sa-----");
        sa.append("hello").append("world").append("java");
        System.out.println(sa);

//        截取功能
//        public String substring(int start)
        System.out.println("----截取功能-----");
        String s = sa.substring(5);
        System.out.println("s:" + s);
        System.out.println("sa:" + sa);

//        public String substring(int start,int end)
        String ss = sa.substring(5, 10);
        System.out.println("ss:"+ss);
        System.out.println("sa:"+sa);


    }
}
