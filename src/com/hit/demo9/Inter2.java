package com.hit.demo9;

public interface Inter2 {
    public int num = 10;
    public final int num2 = 20;
    public static final int num3 = 30;

    //错误：需要<标识符>
//    public Inter(){}
//接口方法不能带有主体
//    public void show(){};
//    abstract void show();//默认public
    public void show();//默认abstract
}
