package com.company.OOPS.innerclasses;

public class AnonymousClass {
    public static void main(String[] args) {
        Person person= new Person() {
            @Override
            public void sleeping() {
                System.out.println("Sleeping inside anonymous class");
            }
        };
        person.sleeping();
    }
}

abstract class Person{
    public abstract void sleeping();
}
//class Student extends Person{
//
//    @Override
//    public void sleeping() {
//
//    }
//}