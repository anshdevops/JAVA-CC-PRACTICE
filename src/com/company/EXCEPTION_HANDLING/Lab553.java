package com.company.EXCEPTION_HANDLING;

public class Lab553 {
    public static void main(String[] args) {
        System.out.println("Main Started");
        try {
            String data=args[0];
            int x=Integer.parseInt(data);
            int res=10/x;
            System.out.println("Result "+res);
        }catch (ArrayIndexOutOfBoundsException |ArithmeticException | NumberFormatException  e){
            System.out.println("Provide One Non Zero Int Value as CLA");
        }
        System.out.println("Main Completed");
    }
}
