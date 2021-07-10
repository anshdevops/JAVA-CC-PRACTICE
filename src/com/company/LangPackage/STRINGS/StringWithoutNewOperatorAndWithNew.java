package com.company.LangPackage.STRINGS;

public class StringWithoutNewOperatorAndWithNew {
    public static void main(String[] args) {
        String a = "Anshul";
        String b = "Anshul";
        String c = new String("Hello");
        String d = "Hello";
        String e = c.intern();
        System.out.println(a == b);
        System.out.println(c == d);
        System.out.println(e == d);
        String f="OK".intern();
        String g= "OK";
        System.out.println(f==g);
        // if content is equal then hashcode will be same in string
        System.out.println(f.hashCode()==g.hashCode());
    }
}
