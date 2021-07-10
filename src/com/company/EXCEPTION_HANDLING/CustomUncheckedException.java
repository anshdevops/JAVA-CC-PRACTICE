package com.company.EXCEPTION_HANDLING;

public class CustomUncheckedException {
    public static void main(String[] args) {
        throw new StudentNotFoundException("Hey");



    }
}
class StudentNotFoundException extends RuntimeException{
    StudentNotFoundException(String msg){
        super(msg);
    }

//    @Override
//    public String getMessage() {
//        return "Yo its custom messAGE";
//    }
}
