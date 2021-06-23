package com.company.LangPackage.objectclass;



public class HashCode {
    public static void main(String[] args) {
        Student student1= new Student(1,1234);

        Student student2= new Student(2,1234);


        Student student3= new Student(5,1234);

        Student student4= new Student(4,1234);
        Student student5=student1;

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());
        System.out.println(student4.hashCode());
        System.out.println(student5.hashCode());

    }
}
class Student{
    int sid;
    int phone;
    Student(int sid,int phone){
        this.sid=sid;
        this.phone=phone;

    }


    @Override
    public int hashCode() {
        return (sid | phone);
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "sid=" + sid +
//                ", phone=" + phone +
//                '}';
//    }
}
