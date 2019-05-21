package com.hit.demo14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo2 {
    public static void main(String[] args) throws ParseException {


//        1.日期转字符串

        System.out.println("----日期转字符串-----");
        Date d = new Date();

//        给定模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s = sdf.format(d);//format意为格式化
        System.out.println(s);

//        2.字符串转日期
        System.out.println("-----字符串转日期-----");
        String str = "2008-08-08 12:12:12";
//        在把一个字符串解析为日期的时候，请注意格式必须和给定的字符串格式匹配
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd = sdf2.parse(str);//parse意为解析
        System.out.println("dd:"+dd);

    }

}
