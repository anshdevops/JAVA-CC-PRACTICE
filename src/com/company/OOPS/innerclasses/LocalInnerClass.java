package com.company.OOPS.innerclasses;

public class LocalInnerClass {
    public static void main(String[] args) {
        System.out.println("Hello Guys");
        Hello hello= new Hello();
        hello.m1();

    }

}
class  Hello{
    {
        System.out.println("IB HELLO");
        class Inner{}

    }
    static {
        System.out.println("SB HELLO");
        class Inner{}

    }
    Hello(){
        System.out.println("DC HELLO");
        class Inner{}
    }

    void  m1(){
        System.out.println("M1 HELLO");
        class Inner{}
    }

}
