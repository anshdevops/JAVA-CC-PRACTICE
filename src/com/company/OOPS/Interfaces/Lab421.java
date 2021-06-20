package com.company.OOPS.Interfaces;

public class Lab421 {
    public static void main(String[] args) {

        C b= new C();
        b.glow();
        b.show();
    }

}
interface Interr1{
    void show();
    void glow();

}
abstract class A{
    public void show(){
        System.out.println("Show");
    }
}
class B extends A{
    public void glow(){
        System.out.println("GLow");
    }
}
class  C extends B implements  Interr1{

}