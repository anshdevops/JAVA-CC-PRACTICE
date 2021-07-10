package com.company.LangPackage.STRINGS;

public class Lab465 {
    public static void main(String[] args) {
        String str1="JLC";
        String str2="INDIA";
        String str3=str1.concat(str2);
        System.out.println(str3);
        String str4="JLCINDIA";
        String str6="JLC"+"INDIA";
        System.out.println(str3==str4);
        System.out.println(str4==str6);
    }
}
