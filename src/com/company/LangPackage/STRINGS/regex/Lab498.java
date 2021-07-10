package com.company.LangPackage.STRINGS.regex;

public class Lab498 {
    public static void main(String[] args) {
        String str="[A-Z]";
        System.out.println(str);
        System.out.println("H".matches(str));
        System.out.println("S".matches(str));
        System.out.println("HI".matches(str));
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
        String str2="[A-Z]*";
        System.out.println("S".matches(str2));
        System.out.println("HI".matches(str2));
        System.out.println("ANSHUL".matches(str2));
        System.out.println("hi".matches(str2));
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        String str3="[A-Za-z0-9]*";
        System.out.println("S".matches(str3));
        System.out.println("HI".matches(str3));
        System.out.println("ANSHUL".matches(str3));
        System.out.println("hi".matches(str3));
        System.out.println("99India".matches(str3));
        System.out.println("India99AAA".matches(str3));
        System.out.println("::::::::::::::::::::::::::::::::::::::");
        String str4="^[A-Z][A-Za-z0-9]*";
        System.out.println("S".matches(str4));
        System.out.println("HI".matches(str4));
        System.out.println("ANSHUL".matches(str4));
        System.out.println("hi".matches(str4));
        System.out.println("99India".matches(str4));
        System.out.println("India99AAA".matches(str4));
        System.out.println("ABCDabcd1234".matches(str4));





    }
}
