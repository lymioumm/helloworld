package com.hit.demo9;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
//        a.lookDoor();
        Dog d = (Dog) a;
        d.eat();
        d.lookDoor();
        a = new Cat();
        a.eat();
//        a.playGame();
        Cat c=(Cat) a;
        c.eat();
        c.playGame();
//        Dog dd = (Dog) a;
    }
}
