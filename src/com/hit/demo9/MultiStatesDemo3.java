package com.hit.demo9;

public class MultiStatesDemo3 {
    public static void main(String[] args) {
//        测试
//        南方人
        Person p = new SouthPerson();
        p.eat();
        System.out.println("------");
//        转换成南方人
        SouthPerson sp = (SouthPerson) p;
        sp.eat();
        sp.DoBusiness();
        System.out.println("-------");
//        北方人
        p = new NorthPerson();
        p.eat();
        System.out.println("--------");
//        转换成北方人
        NorthPerson np = (NorthPerson) p;
        np.eat();
        np.Study();
    }
}
