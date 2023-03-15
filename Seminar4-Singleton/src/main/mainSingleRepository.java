package main;

import SingletonRegistry.InstitutiePublica;

public class mainSingleRepository {

    public static void main(String[] args) {
        InstitutiePublica politie = InstitutiePublica.getInstitutie("Politie");
        InstitutiePublica pompieri = InstitutiePublica.getInstitutie("Pompieri");
        InstitutiePublica politieLocala = InstitutiePublica.getInstitutie("Politie");


        politie.setNrAngajati(50);
        pompieri.setNrAngajati(100);


        System.out.println(politie.toString());
        System.out.println(pompieri.toString());
        System.out.println(politieLocala.toString());
    }




}
