package com.company.LangPackage.STRINGS;

public class Lab461 {
    public static void main(String[] args) {
        String st1 = "JLC";
        String st2 = "INDIA";
//        final String st1 = "JLC";
//        final  String st2 = "INDIA";
        String st3 = st1 + st2;
        String st4 = st1 + "INDIA";
        String st5 = "JLC" + st2;
        String st6="JLC"+"INDIA";
        String st7="JLCINDIA";
        System.out.println(st3==st4);
        System.out.println(st3==st5);
        System.out.println(st4==st5);
        System.out.println(st7==st6);
    }
}
