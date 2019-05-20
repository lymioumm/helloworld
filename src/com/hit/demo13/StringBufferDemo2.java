package com.hit.demo13;

public class StringBufferDemo2 {
    public static void main(String[] args) {





//        String --- StringBuffer


//        方式1：通过构造方法（推荐）
        String s = "hello";
        StringBuffer sb = new StringBuffer(s);
        System.out.println(s);
        System.out.println(sb);


//        方式2：通过append（）方法
        StringBuffer sb2 = new StringBuffer();
        sb2 .append(s);
        System.out.println(s);
        System.out.println(sb2);




//        StringBuffer ---String
        StringBuffer buffer = new StringBuffer("java");
//        String(StringBuffer buffer)

//        方式1：通过构造方法
        String str = new String(buffer);
        System.out.println(str);

//        方式2：通过toString（）方法（推荐）
        String str2 = buffer.toString();
        System.out.println("str:"+str);
        System.out.println("str2:"+str2);

    }
}
