package com.company.OOPS.innerclasses;

public class InstanceInnerClass {
    public static void main(String[] args) {
        Outer outer= new Outer();
        outer.m1();
        outer.m2();;

        Outer.Inner inner= new Outer().new Inner();
        Outer.Inner inner2= outer.new Inner();
        inner2.show();
        inner.show();

    }
}
class Outer{
    int a =10;
    static  int b=20;
    void m1(){
        System.out.println("Outer M1");
    }
    static void m2(){
        System.out.println("Outer M2");
    }
    class Inner{

        int x=11;
        void  show(){
            System.out.println("Inner Show");
            System.out.println(a);
            System.out.println(b);
            System.out.println(x);;
            m1();
            m2();
            System.out.println(Inner.this.x);
            System.out.println(Outer.this.a);


        }

    }
}
