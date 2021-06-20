package com.company.OOPS.Interfaces;

public class Lab415 {
    public static void main(String[] args) {
        Inter1 inter=new Hai();
        inter.m1();;
        inter.m2();
    }

}
interface Inter1{
     int A=10;
     void m1();
    public abstract void m2();
}
abstract class Hello implements Inter1{

    @Override
    public void m1() {
        System.out.println("M1");

    }


}
class Hai extends Hello{

    @Override
    public void m2() {
        System.out.println("M2");
    }
}
