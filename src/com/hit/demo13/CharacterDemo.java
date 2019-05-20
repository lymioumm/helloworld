package com.hit.demo13;

public class CharacterDemo {
    public static void main(String[] args) {
        Character ch = new Character('a');
        System.out.println("ch:" + ch);
        System.out.println("isUpperCase:" + Character.isUpperCase(ch));
        System.out.println("isLowerCase:" + Character.isLowerCase(ch));
        System.out.println("isDigit:"+Character.isDigit('0'));
        System.out.println(Character.toLowerCase('A'));
        System.out.println(Character.toLowerCase('a'));

    }
}
