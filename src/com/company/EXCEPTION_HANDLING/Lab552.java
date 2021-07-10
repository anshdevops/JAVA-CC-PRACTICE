package com.company.EXCEPTION_HANDLING;

public class Lab552 {

    public static void main(String[] args) {
        System.out.println("Main Started");
        String data=null;

        try {
         data=args[0];

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Provide one value as CLA");
        }
        int x=0;
        try {
            x=Integer.parseInt(data);
        }catch (NumberFormatException e){
            System.out.println("Provide Int value as CLA");
        }
        try {
            int res=10/x;

        }catch (ArithmeticException e){
            System.out.println("Provide Non Zero value as CLA");
        }
        System.out.println("Main Completed");
    }
}
