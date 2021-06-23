package com.company.OOPS.casting;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.show();
        // this will give definietly clsss
        //cast exception because it contains only parent object but if we initially
        // supply child class object into parent Reference and then typecast to
        // child ref Var then it will not throw Exception
//        B b= (B) new A(); //invalid it will give class cast
//
//        b.show();

        A ab= new B();
        B ba= (B) ab ; // valid typecasting
        ba.show();


    }
}
class A{
    void  show(){
        System.out.println("Show");
    }

}
class  B extends  A{

}
