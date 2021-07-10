package com.company.LangPackage.STRINGS;

public class Lab482 {
    public static void main(String[] args) {
        String str="Welcome to JLC, Java Learning Center, No 1 in Java Training and Placement";
        System.out.println(str.indexOf(97));
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf('J',11));
        System.out.println(str.indexOf('J',18));
        System.out.println(str.indexOf('J',2));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.indexOf("Java",17));
        System.out.println("::::::::::::::::::::::::::::::::::");
        System.out.println(str.lastIndexOf('t'));
        System.out.println(str.lastIndexOf("Java"));
        System.out.println(str.lastIndexOf("Java",16));

        System.out.println(str.lastIndexOf("Toto",16));

        System.out.println(":::::::::::::::::::::::::::::::::::::::::;");
        System.out.println(str.substring(0));
        System.out.println(str.substring(9));
        System.out.println(str.substring(0,5));
        String s="JLCINDIA";

      //  System.out.println(s.substring(3,9));

    }
}
