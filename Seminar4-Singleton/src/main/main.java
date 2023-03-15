package main;

import clase.BazaDeDate;
import clase.Secretariat;

public class main {
    public static void main(String[] args) {
        Secretariat secretariat=Secretariat.getInstanta(2012,6);
        Secretariat secretariat2=Secretariat.getInstanta(2042,6);

        System.out.println(secretariat.toString());
        System.out.println(secretariat2.toString());


        BazaDeDate bd=BazaDeDate.getInstanta();
        BazaDeDate bd2=BazaDeDate.getInstanta();

        System.out.println(bd.toString());
        System.out.println(bd2.toString());

        bd.setDimensiuneDate(100);
        System.out.println(bd);
        System.out.println(bd2);
    }
}


