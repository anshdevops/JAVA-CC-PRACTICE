package com.company.EXCEPTION_HANDLING;

public class Lab549 {
    public static void main(String[] args) {
        System.out.println("Main Started");
        try {
            int res=10/0;

        }catch (NumberFormatException e){
            System.out.println("Invalid Output");
        }
        System.out.println("Main Completed");
    }
}
