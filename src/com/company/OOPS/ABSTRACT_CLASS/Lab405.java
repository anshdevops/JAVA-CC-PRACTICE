package com.company.OOPS.ABSTRACT_CLASS;

public  abstract class Lab405 {
    public static void main(String[] args) {
        CurrentStudent s= new CurrentStudent();
        s.sleeping();
        s.walking();
    }
}
abstract  class Person {
    int a;
    final int b;
    Person(){
        b=20;
        System.out.println("Person Constructor Init ");
        a=20;
        System.out.println("Value of A is :: "+a);
    }
    abstract void sleeping();
    abstract  void walking();
}
abstract  class Student extends Person{


    Student(){
        System.out.println("Student Constructor Init ");

    }
    static {
        System.out.println("Student SB ");
    }
    {
        System.out.println("Student IB ");
    }
    void sleeping(){
        System.out.println("Sleeping");
    }
    void walking() {
        System.out.println("Walking");
    }
}
class CurrentStudent extends Student{

//    @Override
//    void walking() {
//        System.out.println("Walking");
//    }

}
