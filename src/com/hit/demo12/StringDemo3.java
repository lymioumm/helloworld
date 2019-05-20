package com.hit.demo12;

public class StringDemo3 {
    public static void main(String[] args) {
//        定义一个字符串
        String s = "Hello123123World";
//        定义三个统计变量
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
//        遍历字符串，得到每一个字符
        for (int x = 0; x < s.length(); x++) {
            char ch = s.charAt(x);//获取指定索引位置的字符
            if (ch > 'a' && ch < 'z') {
                smallCount++;
            } else if (ch > 'A' && ch < 'Z') {
                bigCount++;
            } else if (ch >= '0' && ch <= '9') {
                numberCount++;
            }
        }
        System.out.println("大写字母：" + bigCount);
        System.out.println("小写字母：" + smallCount);
        System.out.println("数字：" + numberCount);

    }
}
