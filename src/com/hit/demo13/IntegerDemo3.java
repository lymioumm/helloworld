package com.hit.demo13;

public class IntegerDemo3 {

//    int类型 --- String类型的相互转换
    public static void main(String[] args) {

//        int -- String
        int number = 100;

//        方式1
        String s1 = "" + number;
        System.out.println("s1:" + s1);

//        方式2
        String s2 = String.valueOf(number);
        System.out.println("s2:" + s2);

//        方式3
//        int -- Integer --String
        Integer i = new Integer(number);
        String s3 = i.toString();
        System.out.println("s3:" + s3);

//        方式4
        String s4 = Integer.toString(number);
        System.out.println("s4:" + s4);

//        String -- int
        String s = "100";

//        方式1
//        String -- Integer -- int
        Integer ii = new Integer(s);
        int x = ii.intValue();
        System.out.println("x:" + x);

//        方式2
//        public static int parseInt(String s)

    }
}
