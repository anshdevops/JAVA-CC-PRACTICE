package com.company.LangPackage.STRINGS;

public class Test {


    public static void main(String[] args) {
        String y= "Hey man";
        String z= y.intern();

        String x= "Hey"+" "+"man";
        System.out.println(y==x);
        System.out.println(x==z);

    }
}
