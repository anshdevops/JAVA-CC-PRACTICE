package com.company.OOPS.Interfaces;

public class Lab424 extends  Hi{
    public static void main(String[] args) {
        Hi hi= new Hi();
        hi.show();

       // System.out.println(super.AB);

    }

}
interface Test{
    int AB=20;
}
class Helloo{
    int AB=30;

}
class Hi extends Helloo implements Test {
    static {
        System.out.println("Executing SB");
    }

    {
        System.out.println("Executing IB");
    }
   void show(){
       System.out.println(super.AB);
       System.out.println(Test.AB);
   }

}
