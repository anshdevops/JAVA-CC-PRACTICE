package com.company.EXCEPTION_HANDLING;

public class Lab545 {
    public static void main(String[] args) {
        System.out.println("Main Started");
        try {
            String data=args[0];
            int x= Integer.parseInt(data);
            int res=10/x;

        }
        catch (Exception e){
            System.out.println("Enter Correct Value");
        }

        System.out.println("Main Completed");
    }
}
