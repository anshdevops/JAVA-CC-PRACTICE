package com.company.EXCEPTION_HANDLING;

public class Lab558 {
    public static void main(String[] args) {
        System.out.println("Main Started");
        int r= new Hello().show();
        System.out.println("main "+r);
        System.out.println("Main Completed");

    }
}
class Hello{
    int show(){
        int a=0;
        try {
            System.out.println("Try Block Begins");
            a=10/4;

            System.out.println("Try block ends");
           // System.exit(0);
            return a;

        }catch (ArithmeticException e){
            a=20;
            System.out.println("Catch block "+a);
            return  a;
        }
        finally {
            System.out.println("Finally Block");
        }
    }
}
