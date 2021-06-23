package com.company.LangPackage.objectclass;

import java.util.Objects;

public class Equals {
    public static void main(String[] args) {
        Vidyarathi vidyarathi1= new Vidyarathi(1,"Anshul");

        Vidyarathi vidyarathi2= new Vidyarathi(1,"Anshul");
        Vidyarathi vidyarathi3= new Vidyarathi(3,"Anshul");
        Vidyarathi vidyarathi4= new Vidyarathi(4,"Anshul");
        Vidyarathi vidyarathi5=vidyarathi1;

        System.out.println("USING ======");
        System.out.println(vidyarathi1==vidyarathi2);
        System.out.println(vidyarathi1==vidyarathi3);
        System.out.println(vidyarathi1==vidyarathi5);

        System.out.println("Using custom  equals()");
        System.out.println(vidyarathi1.equals(vidyarathi2));


        System.out.println(vidyarathi1.equals(vidyarathi3));
        System.out.println(vidyarathi5.equals(vidyarathi1));





    }

}

class Vidyarathi {

    int sid;
    String sname;

    public Vidyarathi(int sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Vidyarathi) {

            Vidyarathi vidyarathi = (Vidyarathi) object;

            return (this.sid == vidyarathi.sid && this.sname.equals(vidyarathi.sname));
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, sname);
    }
}
