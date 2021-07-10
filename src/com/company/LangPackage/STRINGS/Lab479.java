package com.company.LangPackage.STRINGS;

public class Lab479 {
    public static void main(String[] args) {
        String str="Hai, Welcome To JLC";
        System.out.println(str.startsWith("Hai"));
        System.out.println(str.startsWith("Welcome"));
        System.out.println(str.startsWith("Welcome",5));
        System.out.println(str.endsWith("JLC"));
        System.out.println(str.startsWith(""));
        System.out.println(str.endsWith(""));;
        System.out.println(str.replace("e","J"));
        System.out.println(str);
        System.out.println(str.replaceFirst("Hai","Hello"));
        System.out.println(str);
    }
}
