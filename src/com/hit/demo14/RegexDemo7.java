package com.hit.demo14;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo7 {
   /* public static void main(String[] args) {

//        定义字符串
        String s = "da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?";

//        规则
        String regex = "\\b\\w{3}\\b";

//        把规则译成模式对象
        Pattern p = Pattern.compile(regex);
//        通过模式对象得到匹配器对象
        Matcher m = p.matcher(s);
//        调用匹配器对象的功能
//        通过find方法就是查找有没有满足条件的子串
//        public boolean find()
        boolean flag = m.find();
        System.out.println(flag);
//        如何得到值呢？
//        public String group()
        String ss = m.group();
        System.out.println(ss);
        while (m.find()) {
            System.out.println(m.group());
        }*/
/*
//        注意：一定要先find（），然后才能group（）
        String sss = m.group();
        System.out.println(sss);
*/

//    }
/*public static void main(String[] args) {
    String s = "Everyone,have a nice day !Today we will have a rest,because of raining.";
    String regex = "\\b\\w{4}\\b";
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(s);
    while (m.find()) {
        System.out.println(m.group());
    }
}*/
/*public static void main(String[] args) {
    String s = "hello,everybody,today is a special day,so let us play a game,so ready go";
    String regex = "\\b\\w{5}\\b";
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(s);
    while (m.find()) {
        System.out.println(m.group());
    }
}*/
public static void main(String[] args) {
    String s = "lala,wo shi mai bao de xiao hang jia,fighting,have a nice day";
    String regex = "\\b\\w{4}\\b";
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(s);
    while (m.find()) {
        System.out.println(m.group());
    }
}
}


