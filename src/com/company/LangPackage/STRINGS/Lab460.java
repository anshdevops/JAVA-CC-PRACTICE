package com.company.LangPackage.STRINGS;

import java.util.Scanner;

public class Lab460 {
    public static void main(String[] args) {
        String st1="JLC";
        Scanner scanner= new Scanner(System.in);
        System.out.println("ENTER JLC AS INPUT");
        String st3= scanner.nextLine();
        System.out.println("Retype JLC");
        String st4=scanner.nextLine();
        String st5=st3.intern();
        String st6=st4.intern();
        System.out.println(st3==st4);
        System.out.println(st5==st6);
        System.out.println(st1==st5);
    }
}
