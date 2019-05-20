package com.hit.demo9;

public class InterfaceDemo {
    public static void main(String[] args) {
//        AnimalTrain是抽象的，无法实例化
//        AnimalTrain at=new AnimalTrain() ;
//        at.jump();
        AnimalTrain at = new CatInterface();
        at.jump();
    }
}
