package com.company.LangPackage.STRINGS;

public class Lab462 {
    public static void main(String[] args) {
        String st1="JLCINDIA";
        String st2="JLC"+"INDIA";
        System.out.println(st1==st2);
        final String st3="JLC";
        final String st4="INDIA";
        String st5=st3+st4;
        System.out.println(st1==st5);
    }
}
