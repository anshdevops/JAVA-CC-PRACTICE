package com.company.LangPackage.objectclass;

public class GetClass {
    public static void main(String[] args) {
        showClassInfo("Anshul");
        showClassInfo(new Studentt());
        showClassInfo(new Object());

    }
    static  void showClassInfo(Object object){
        Class cls= object.getClass();
        System.out.println("Class Name is  :: "+cls.getName());
        Class scls=cls.getSuperclass();
        if(scls!=null){
            System.out.println("Super Class is :: "+scls.getName() );

        }else {
            System.out.println("No Super class");
        }



    }
}
class Personn{}
class Studentt extends Personn{}