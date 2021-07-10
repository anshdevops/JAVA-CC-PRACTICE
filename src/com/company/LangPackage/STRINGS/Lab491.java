package com.company.LangPackage.STRINGS;

public class Lab491 {
    public static void main(String[] args) {
        String str = "JLCINDIA";

        char[] chars = str
                .toCharArray();
        for(int i =0;i<chars.length;i++){
            System.out.println(chars[i]);
        }
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        byte[] bArr=str.getBytes();
        for(byte b:bArr){
            System.out.println(b);
        }


        char[] x={'J','L','C','I','N','D','I','A'};
        byte [] b={65,66,67,97,98,99,49,50};
        String st1=new String(x);
        String st2=new String(b);
        System.out.println(st1);
        System.out.println(st2);
        String st4=new String(x,3,5);
        String st5=new String(b,3,5);
        System.out.println("ST4 :: "+st4);
        System.out.println("ST5 :: "+st5);

    }
}
