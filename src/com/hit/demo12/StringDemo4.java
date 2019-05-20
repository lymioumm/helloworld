package com.hit.demo12;

public class StringDemo4 {
    public static void main(String[] args) {
        String s = "JavaSE";
//        byte[] getBytes ();//把字符串转换为字节数组
        byte[] bys = s.getBytes();
        for (int x = 0; x < bys.length; x++) {
            System.out.println(bys[x]);

        }

        System.out.println("----------------");
//        char[] toCharArray ();//把字符串转换为字符数组
        char[] chs = s.toCharArray();
        for (int x = 0; x < chs.length; x++) {
            System.out.print(chs[x]);
        }


        System.out.println("");
        System.out.println("---------------");
//        static String valueOf( char[] chs);把字符数组转换成字符串
        String ss = String.valueOf(chs);
        System.out.println(ss);


        System.out.println("------------------");
//        static String valueOf( int i)//吧int 类型的数据转换成字符串
        int i = 100;
        String sss = String.valueOf(i);
        System.out.println(sss);



//        String concat(String str)//把字符串拼接
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + s2;//常用
        String s4 = s1.concat(s2);//不常用
        System.out.println("s3:" + s3);
        System.out.println("s4:" + s4);


//        把一个字符串的首字母转成大写，其余为小写
//        定义一个字符串
        String st = "helloWORLD";
//        先获取第一个字符
        String st1 = st.substring(0, 1);
//        获取除了第一个字符以外的字符
        String st2 = st.substring(1);
//        把st1转换成大写
        String st3 = st1.toUpperCase();
//        把st2转换成小写
        String st4 = st2.toLowerCase();
//        st3拼接st4

        String st5 = st3 + st4;
//        String st5 = st3.concat(st4);
        System.out.println(st5);

//链式编程实现以上功能
        String LinkStr = "haveANiceDay";
        String result = LinkStr.substring(0, 1).toUpperCase().concat(LinkStr.substring(1).toLowerCase());
        System.out.println(result);


        //compareTo  按字典顺序比较两个字符串
//        比较时遇到第一个不同的字符时即确定最后结果
        System.out.println("-----比较------");

        String sc = "hello";
        String sc2 = "helloa";
        System.out.println(sc.compareTo(sc2));

    }
}
