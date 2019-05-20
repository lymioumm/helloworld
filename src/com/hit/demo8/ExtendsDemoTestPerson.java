package com.hit.demo8;

public class ExtendsDemoTestPerson {
    public static void main(String[] args) {
        Student_Person s1 = new Student_Person();
        s1.setName("LL");
        s1.setAge(27);
        System.out.println(s1.getName()+"--"+s1.getAge());
        Student_Person s2 = new Student_Person("Lm", 23);
        System.out.println(s2.getName()+"----"+s2.getAge());
    }
}
