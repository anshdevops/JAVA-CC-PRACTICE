package com.company.LangPackage.STRINGS;

public class Lab463 {
    public static void main(String[] args) {
        String st1="JLC99";
        final String st2="JLC";
        final int a= 99;
        String st3=st2+a;

        System.out.println(st1==st3);
        String st4="JLC"+99;
        System.out.println(st4==st1);
        System.out.println(st4==st3);;
    }
}
