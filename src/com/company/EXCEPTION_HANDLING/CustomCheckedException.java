package com.company.EXCEPTION_HANDLING;

public class CustomCheckedException {
    public static void main(String[] args) throws StudentNtFoundException {
      throw  new StudentNtFoundException("Hello");
    }
}
class StudentNtFoundException extends Exception{


    StudentNtFoundException(String msg){
        super(msg);
    }
//
//    @Override
//    public String getMessage() {
//      return  "Hey its Custom message";
//    }
}