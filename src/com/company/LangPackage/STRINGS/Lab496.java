package com.company.LangPackage.STRINGS;

public class Lab496 {
    public static void main(String[] args) {
        String str="Welcome to JLC, Java Learning Center, No 1 in Java Training and Placement. Java Is Popular Language";
        // limit here tell how many times to split.  but limit 0 splits as many times it finds pattern and is same to plain split()

        String[] res=str.split("Java",2);

        System.out.println("No of String are :: "+res.length);
        for (String x: res){
            System.out.println(x);
        }
    }
}
