package com.company.EXCEPTION_HANDLING;

public class Lab555 {
    public static void main(String[] args) {
        System.out.println("Main Started");
        try {
            int res=10/0;
            System.out.println("result "+res);

        }catch (NumberFormatException e){
            System.out.println("Invalid Input");
        }
        finally {
            System.out.println("Finally Block");
        }
        System.out.println("Main Completed");
    }
}
