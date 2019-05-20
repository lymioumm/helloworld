package com.hit.demo9;

public class MultiStatesDemo2 {
    public static void main(String[] args) {
//        测试
        Fu f = new Zi();
        f.show();
//        f.method();
        Zi z = (Zi) f;//强制类型转换
        z.show();
        z.method();
    }


}
/*
show Zi
show Zi
method Zi
* */