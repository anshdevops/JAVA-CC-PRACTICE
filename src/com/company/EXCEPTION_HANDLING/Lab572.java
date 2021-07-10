package com.company.EXCEPTION_HANDLING;

public class Lab572 {
    public static void main(String[] args) {
        Student[] arr =new Student[5000];
        try {
            for(int i=0;i<arr.length;i++){
                arr[i]=new Student();
                System.out.println(i+1 +" object created");
            }
        }catch (Error e){
            System.out.println("Error occured");
           // e.printStackTrace();
        }
        System.out.println("After handling");

    //    Student student=new Student();
    }
}
class Student{
    long arr[]= new long[215833];
}
