package com.company.OOPS.Interfaces;

public class Lab416 {
    public static void main(String[] args) {
        HelloImp h =new HelloImp();
        h.m1();
        System.out.println(h.b);


    }
}

interface Interface2{

    //int a=30;
    default String test(){
        return "Interface has a default method possible";
    }
    static  String staticTest(){
        return "Interface has a static method possible";

    }


    // Its a java 9+ feature
//    private static  String staticPrivateTest(){
//        return "Interface has a static method possible";
//
//    }


    // This one Also and this private Method should  be called from default Method
//    private String privateMethod(){
//        return "Interface has a  private  method possible";
//    }
    int b=30;
    void m1();
}
class HelloImp implements Interface2{

    @Override
    public void m1() {

        System.out.println(test());
        System.out.println(Interface2.staticTest());

    }
}
