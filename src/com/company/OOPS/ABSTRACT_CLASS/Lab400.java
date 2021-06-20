package com.company.OOPS.ABSTRACT_CLASS;

public class Lab400 {
    public static void main(String[] args) {
        Square square= new Square();
        System.out.println(square.a);

    }
}
abstract class  Shape{
   final int a=50;

     abstract void area();
     void hello(){

     }

}
class Square extends Shape{

    @Override
    void area() {
        System.out.println("Square");

    }
}
