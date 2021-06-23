package com.company.OOPS.innerclasses;

public class StaticInnerClass {
    public static void main(String[] args) {
        Outerr   outerr= new Outerr();
        outerr.m1();
        outerr.m2();
        Outerr.Innerr innerr= new Outerr.Innerr();
        innerr.show();
        innerr.m3();


    }
}
class Outerr{

    int a =10;
    static  int b=20;
    void m1(){
        System.out.println("Outer M1");
    }
    static void m2(){
        System.out.println("Outer M2");
    }
    static class Innerr{

        int x=11;
        int y=22;
        void  show(){
            System.out.println("Inner Show");
           // System.out.println(a);
            System.out.println(b);
            System.out.println(x);;
            System.out.println(y);
            //m1();
            m2();
            System.out.println(Outerr.Innerr.this.x);


        }
        static void m3(){
            System.out.println("Inner M3");
        }

    }
}
