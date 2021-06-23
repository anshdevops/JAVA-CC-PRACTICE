package com.company.OOPS.innerclasses;

public class LocalInnerClass2 {
    public static void main(String[] args) {
        Outerrr outer= new Outerrr();
        outer.show();

    }
}

class Outerrr {
    int a = 10;
    static int b = 20;

    void show() {
        System.out.println("Outer show() begin");
        class Inner {

            void m1() {
                System.out.println("Inner m1");

                System.out.println(a);
                System.out.println(b);
            }
        }
        new Inner().m1();
        System.out.println("Outer show() ends");
    }
}
