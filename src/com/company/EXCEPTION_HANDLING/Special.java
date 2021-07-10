package com.company.EXCEPTION_HANDLING;

public class Special {
    public static void main(String[] args) throws CloneNotSupportedException {
        Special special=new Special();
        special.show();
        // special.show1();
    }
 void show() throws CloneNotSupportedException
 {
     try {
         this.clone();
     }catch (Exception e) {
         throw e;
     }
 }
    void show1() throws Exception
    {
        try {
            this.clone();
        }catch (CloneNotSupportedException e){
            throw e;
        }
    }


}
