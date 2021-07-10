package com.company.LangPackage.STRINGS;

public class Lab474 {
    public static void main(String[] args) {

      //  Student student=new Student(1);
        Student student=null;
        String st=String.valueOf(student);
        System.out.println(st);


   //     System.out.println(String.valueOf(null));

    }

}
class Student{
    public Student(int sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                '}';
    }

    int sid=10;

}